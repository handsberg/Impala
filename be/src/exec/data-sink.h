// Copyright 2012 Cloudera Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.


#ifndef IMPALA_EXEC_DATA_SINK_H
#define IMPALA_EXEC_DATA_SINK_H

#include <boost/scoped_ptr.hpp>
#include <vector>

#include "common/status.h"
#include "runtime/runtime-state.h"
#include "gen-cpp/DataSinks_types.h"
#include "gen-cpp/Exprs_types.h"

namespace impala {

class ObjectPool;
class RowBatch;
class RuntimeProfile;
class RuntimeState;
class TPlanExecRequest;
class TPlanExecParams;
class TPlanFragmentExecParams;
class RowDescriptor;

// Superclass of all data sinks.
class DataSink {
 public:
  DataSink() : closed_(false) { }
  virtual ~DataSink() {}

  // Setup. Call before Send(), Open(), or Close().
  virtual Status Prepare(RuntimeState* state) = 0;

  // Call before Send() or Close().
  virtual Status Open(RuntimeState* state) = 0;

  // Send a row batch into this sink.
  // eos should be true when the last batch is passed to Send()
  virtual Status Send(RuntimeState* state, RowBatch* batch, bool eos) = 0;

  // Releases all resources that were allocated in Prepare()/Send().
  // Further Send() calls are illegal after calling Close().
  // It must be okay to call this multiple times. Subsequent calls should
  // be ignored.
  virtual void Close(RuntimeState* state) = 0;

  // Creates a new data sink from thrift_sink. A pointer to the
  // new sink is written to *sink, and is owned by the caller.
  static Status CreateDataSink(ObjectPool* pool,
    const TDataSink& thrift_sink, const std::vector<TExpr>& output_exprs,
    const TPlanFragmentExecParams& params,
    const RowDescriptor& row_desc, boost::scoped_ptr<DataSink>* sink);

  // Returns the runtime profile for the sink.
  virtual RuntimeProfile* profile() = 0;

  // Merges two sets of partition stats. dst will be updated to contain all partitions
  // in src. Partitions that are in both will have the stats added together.
  static void MergeInsertStats(const PartitionInsertStats& src,
      PartitionInsertStats* dst);

  // Outputs the insert stats to a string
  static std::string OutputInsertStats(const PartitionInsertStats& stats,
      const std::string& prefix = "");

 protected:
  // Set to true after Close() has been called. Subclasses should check and set this in
  // Close().
  bool closed_;

};

}  // namespace impala
#endif
