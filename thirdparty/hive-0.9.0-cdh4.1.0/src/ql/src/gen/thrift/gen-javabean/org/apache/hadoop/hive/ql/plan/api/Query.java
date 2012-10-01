/**
 * Autogenerated by Thrift Compiler (0.7.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.apache.hadoop.hive.ql.plan.api;

import org.apache.commons.lang.builder.HashCodeBuilder;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Query implements org.apache.thrift.TBase<Query, Query._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Query");

  private static final org.apache.thrift.protocol.TField QUERY_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("queryId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField QUERY_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("queryType", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField QUERY_ATTRIBUTES_FIELD_DESC = new org.apache.thrift.protocol.TField("queryAttributes", org.apache.thrift.protocol.TType.MAP, (short)3);
  private static final org.apache.thrift.protocol.TField QUERY_COUNTERS_FIELD_DESC = new org.apache.thrift.protocol.TField("queryCounters", org.apache.thrift.protocol.TType.MAP, (short)4);
  private static final org.apache.thrift.protocol.TField STAGE_GRAPH_FIELD_DESC = new org.apache.thrift.protocol.TField("stageGraph", org.apache.thrift.protocol.TType.STRUCT, (short)5);
  private static final org.apache.thrift.protocol.TField STAGE_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("stageList", org.apache.thrift.protocol.TType.LIST, (short)6);
  private static final org.apache.thrift.protocol.TField DONE_FIELD_DESC = new org.apache.thrift.protocol.TField("done", org.apache.thrift.protocol.TType.BOOL, (short)7);
  private static final org.apache.thrift.protocol.TField STARTED_FIELD_DESC = new org.apache.thrift.protocol.TField("started", org.apache.thrift.protocol.TType.BOOL, (short)8);

  private String queryId; // required
  private String queryType; // required
  private Map<String,String> queryAttributes; // required
  private Map<String,Long> queryCounters; // required
  private Graph stageGraph; // required
  private List<Stage> stageList; // required
  private boolean done; // required
  private boolean started; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    QUERY_ID((short)1, "queryId"),
    QUERY_TYPE((short)2, "queryType"),
    QUERY_ATTRIBUTES((short)3, "queryAttributes"),
    QUERY_COUNTERS((short)4, "queryCounters"),
    STAGE_GRAPH((short)5, "stageGraph"),
    STAGE_LIST((short)6, "stageList"),
    DONE((short)7, "done"),
    STARTED((short)8, "started");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // QUERY_ID
          return QUERY_ID;
        case 2: // QUERY_TYPE
          return QUERY_TYPE;
        case 3: // QUERY_ATTRIBUTES
          return QUERY_ATTRIBUTES;
        case 4: // QUERY_COUNTERS
          return QUERY_COUNTERS;
        case 5: // STAGE_GRAPH
          return STAGE_GRAPH;
        case 6: // STAGE_LIST
          return STAGE_LIST;
        case 7: // DONE
          return DONE;
        case 8: // STARTED
          return STARTED;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __DONE_ISSET_ID = 0;
  private static final int __STARTED_ISSET_ID = 1;
  private BitSet __isset_bit_vector = new BitSet(2);

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.QUERY_ID, new org.apache.thrift.meta_data.FieldMetaData("queryId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.QUERY_TYPE, new org.apache.thrift.meta_data.FieldMetaData("queryType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.QUERY_ATTRIBUTES, new org.apache.thrift.meta_data.FieldMetaData("queryAttributes", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.QUERY_COUNTERS, new org.apache.thrift.meta_data.FieldMetaData("queryCounters", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64))));
    tmpMap.put(_Fields.STAGE_GRAPH, new org.apache.thrift.meta_data.FieldMetaData("stageGraph", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Graph.class)));
    tmpMap.put(_Fields.STAGE_LIST, new org.apache.thrift.meta_data.FieldMetaData("stageList", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Stage.class))));
    tmpMap.put(_Fields.DONE, new org.apache.thrift.meta_data.FieldMetaData("done", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.STARTED, new org.apache.thrift.meta_data.FieldMetaData("started", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Query.class, metaDataMap);
  }

  public Query() {
  }

  public Query(
    String queryId,
    String queryType,
    Map<String,String> queryAttributes,
    Map<String,Long> queryCounters,
    Graph stageGraph,
    List<Stage> stageList,
    boolean done,
    boolean started)
  {
    this();
    this.queryId = queryId;
    this.queryType = queryType;
    this.queryAttributes = queryAttributes;
    this.queryCounters = queryCounters;
    this.stageGraph = stageGraph;
    this.stageList = stageList;
    this.done = done;
    setDoneIsSet(true);
    this.started = started;
    setStartedIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Query(Query other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetQueryId()) {
      this.queryId = other.queryId;
    }
    if (other.isSetQueryType()) {
      this.queryType = other.queryType;
    }
    if (other.isSetQueryAttributes()) {
      Map<String,String> __this__queryAttributes = new HashMap<String,String>();
      for (Map.Entry<String, String> other_element : other.queryAttributes.entrySet()) {

        String other_element_key = other_element.getKey();
        String other_element_value = other_element.getValue();

        String __this__queryAttributes_copy_key = other_element_key;

        String __this__queryAttributes_copy_value = other_element_value;

        __this__queryAttributes.put(__this__queryAttributes_copy_key, __this__queryAttributes_copy_value);
      }
      this.queryAttributes = __this__queryAttributes;
    }
    if (other.isSetQueryCounters()) {
      Map<String,Long> __this__queryCounters = new HashMap<String,Long>();
      for (Map.Entry<String, Long> other_element : other.queryCounters.entrySet()) {

        String other_element_key = other_element.getKey();
        Long other_element_value = other_element.getValue();

        String __this__queryCounters_copy_key = other_element_key;

        Long __this__queryCounters_copy_value = other_element_value;

        __this__queryCounters.put(__this__queryCounters_copy_key, __this__queryCounters_copy_value);
      }
      this.queryCounters = __this__queryCounters;
    }
    if (other.isSetStageGraph()) {
      this.stageGraph = new Graph(other.stageGraph);
    }
    if (other.isSetStageList()) {
      List<Stage> __this__stageList = new ArrayList<Stage>();
      for (Stage other_element : other.stageList) {
        __this__stageList.add(new Stage(other_element));
      }
      this.stageList = __this__stageList;
    }
    this.done = other.done;
    this.started = other.started;
  }

  public Query deepCopy() {
    return new Query(this);
  }

  @Override
  public void clear() {
    this.queryId = null;
    this.queryType = null;
    this.queryAttributes = null;
    this.queryCounters = null;
    this.stageGraph = null;
    this.stageList = null;
    setDoneIsSet(false);
    this.done = false;
    setStartedIsSet(false);
    this.started = false;
  }

  public String getQueryId() {
    return this.queryId;
  }

  public void setQueryId(String queryId) {
    this.queryId = queryId;
  }

  public void unsetQueryId() {
    this.queryId = null;
  }

  /** Returns true if field queryId is set (has been assigned a value) and false otherwise */
  public boolean isSetQueryId() {
    return this.queryId != null;
  }

  public void setQueryIdIsSet(boolean value) {
    if (!value) {
      this.queryId = null;
    }
  }

  public String getQueryType() {
    return this.queryType;
  }

  public void setQueryType(String queryType) {
    this.queryType = queryType;
  }

  public void unsetQueryType() {
    this.queryType = null;
  }

  /** Returns true if field queryType is set (has been assigned a value) and false otherwise */
  public boolean isSetQueryType() {
    return this.queryType != null;
  }

  public void setQueryTypeIsSet(boolean value) {
    if (!value) {
      this.queryType = null;
    }
  }

  public int getQueryAttributesSize() {
    return (this.queryAttributes == null) ? 0 : this.queryAttributes.size();
  }

  public void putToQueryAttributes(String key, String val) {
    if (this.queryAttributes == null) {
      this.queryAttributes = new HashMap<String,String>();
    }
    this.queryAttributes.put(key, val);
  }

  public Map<String,String> getQueryAttributes() {
    return this.queryAttributes;
  }

  public void setQueryAttributes(Map<String,String> queryAttributes) {
    this.queryAttributes = queryAttributes;
  }

  public void unsetQueryAttributes() {
    this.queryAttributes = null;
  }

  /** Returns true if field queryAttributes is set (has been assigned a value) and false otherwise */
  public boolean isSetQueryAttributes() {
    return this.queryAttributes != null;
  }

  public void setQueryAttributesIsSet(boolean value) {
    if (!value) {
      this.queryAttributes = null;
    }
  }

  public int getQueryCountersSize() {
    return (this.queryCounters == null) ? 0 : this.queryCounters.size();
  }

  public void putToQueryCounters(String key, long val) {
    if (this.queryCounters == null) {
      this.queryCounters = new HashMap<String,Long>();
    }
    this.queryCounters.put(key, val);
  }

  public Map<String,Long> getQueryCounters() {
    return this.queryCounters;
  }

  public void setQueryCounters(Map<String,Long> queryCounters) {
    this.queryCounters = queryCounters;
  }

  public void unsetQueryCounters() {
    this.queryCounters = null;
  }

  /** Returns true if field queryCounters is set (has been assigned a value) and false otherwise */
  public boolean isSetQueryCounters() {
    return this.queryCounters != null;
  }

  public void setQueryCountersIsSet(boolean value) {
    if (!value) {
      this.queryCounters = null;
    }
  }

  public Graph getStageGraph() {
    return this.stageGraph;
  }

  public void setStageGraph(Graph stageGraph) {
    this.stageGraph = stageGraph;
  }

  public void unsetStageGraph() {
    this.stageGraph = null;
  }

  /** Returns true if field stageGraph is set (has been assigned a value) and false otherwise */
  public boolean isSetStageGraph() {
    return this.stageGraph != null;
  }

  public void setStageGraphIsSet(boolean value) {
    if (!value) {
      this.stageGraph = null;
    }
  }

  public int getStageListSize() {
    return (this.stageList == null) ? 0 : this.stageList.size();
  }

  public java.util.Iterator<Stage> getStageListIterator() {
    return (this.stageList == null) ? null : this.stageList.iterator();
  }

  public void addToStageList(Stage elem) {
    if (this.stageList == null) {
      this.stageList = new ArrayList<Stage>();
    }
    this.stageList.add(elem);
  }

  public List<Stage> getStageList() {
    return this.stageList;
  }

  public void setStageList(List<Stage> stageList) {
    this.stageList = stageList;
  }

  public void unsetStageList() {
    this.stageList = null;
  }

  /** Returns true if field stageList is set (has been assigned a value) and false otherwise */
  public boolean isSetStageList() {
    return this.stageList != null;
  }

  public void setStageListIsSet(boolean value) {
    if (!value) {
      this.stageList = null;
    }
  }

  public boolean isDone() {
    return this.done;
  }

  public void setDone(boolean done) {
    this.done = done;
    setDoneIsSet(true);
  }

  public void unsetDone() {
    __isset_bit_vector.clear(__DONE_ISSET_ID);
  }

  /** Returns true if field done is set (has been assigned a value) and false otherwise */
  public boolean isSetDone() {
    return __isset_bit_vector.get(__DONE_ISSET_ID);
  }

  public void setDoneIsSet(boolean value) {
    __isset_bit_vector.set(__DONE_ISSET_ID, value);
  }

  public boolean isStarted() {
    return this.started;
  }

  public void setStarted(boolean started) {
    this.started = started;
    setStartedIsSet(true);
  }

  public void unsetStarted() {
    __isset_bit_vector.clear(__STARTED_ISSET_ID);
  }

  /** Returns true if field started is set (has been assigned a value) and false otherwise */
  public boolean isSetStarted() {
    return __isset_bit_vector.get(__STARTED_ISSET_ID);
  }

  public void setStartedIsSet(boolean value) {
    __isset_bit_vector.set(__STARTED_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case QUERY_ID:
      if (value == null) {
        unsetQueryId();
      } else {
        setQueryId((String)value);
      }
      break;

    case QUERY_TYPE:
      if (value == null) {
        unsetQueryType();
      } else {
        setQueryType((String)value);
      }
      break;

    case QUERY_ATTRIBUTES:
      if (value == null) {
        unsetQueryAttributes();
      } else {
        setQueryAttributes((Map<String,String>)value);
      }
      break;

    case QUERY_COUNTERS:
      if (value == null) {
        unsetQueryCounters();
      } else {
        setQueryCounters((Map<String,Long>)value);
      }
      break;

    case STAGE_GRAPH:
      if (value == null) {
        unsetStageGraph();
      } else {
        setStageGraph((Graph)value);
      }
      break;

    case STAGE_LIST:
      if (value == null) {
        unsetStageList();
      } else {
        setStageList((List<Stage>)value);
      }
      break;

    case DONE:
      if (value == null) {
        unsetDone();
      } else {
        setDone((Boolean)value);
      }
      break;

    case STARTED:
      if (value == null) {
        unsetStarted();
      } else {
        setStarted((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case QUERY_ID:
      return getQueryId();

    case QUERY_TYPE:
      return getQueryType();

    case QUERY_ATTRIBUTES:
      return getQueryAttributes();

    case QUERY_COUNTERS:
      return getQueryCounters();

    case STAGE_GRAPH:
      return getStageGraph();

    case STAGE_LIST:
      return getStageList();

    case DONE:
      return Boolean.valueOf(isDone());

    case STARTED:
      return Boolean.valueOf(isStarted());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case QUERY_ID:
      return isSetQueryId();
    case QUERY_TYPE:
      return isSetQueryType();
    case QUERY_ATTRIBUTES:
      return isSetQueryAttributes();
    case QUERY_COUNTERS:
      return isSetQueryCounters();
    case STAGE_GRAPH:
      return isSetStageGraph();
    case STAGE_LIST:
      return isSetStageList();
    case DONE:
      return isSetDone();
    case STARTED:
      return isSetStarted();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Query)
      return this.equals((Query)that);
    return false;
  }

  public boolean equals(Query that) {
    if (that == null)
      return false;

    boolean this_present_queryId = true && this.isSetQueryId();
    boolean that_present_queryId = true && that.isSetQueryId();
    if (this_present_queryId || that_present_queryId) {
      if (!(this_present_queryId && that_present_queryId))
        return false;
      if (!this.queryId.equals(that.queryId))
        return false;
    }

    boolean this_present_queryType = true && this.isSetQueryType();
    boolean that_present_queryType = true && that.isSetQueryType();
    if (this_present_queryType || that_present_queryType) {
      if (!(this_present_queryType && that_present_queryType))
        return false;
      if (!this.queryType.equals(that.queryType))
        return false;
    }

    boolean this_present_queryAttributes = true && this.isSetQueryAttributes();
    boolean that_present_queryAttributes = true && that.isSetQueryAttributes();
    if (this_present_queryAttributes || that_present_queryAttributes) {
      if (!(this_present_queryAttributes && that_present_queryAttributes))
        return false;
      if (!this.queryAttributes.equals(that.queryAttributes))
        return false;
    }

    boolean this_present_queryCounters = true && this.isSetQueryCounters();
    boolean that_present_queryCounters = true && that.isSetQueryCounters();
    if (this_present_queryCounters || that_present_queryCounters) {
      if (!(this_present_queryCounters && that_present_queryCounters))
        return false;
      if (!this.queryCounters.equals(that.queryCounters))
        return false;
    }

    boolean this_present_stageGraph = true && this.isSetStageGraph();
    boolean that_present_stageGraph = true && that.isSetStageGraph();
    if (this_present_stageGraph || that_present_stageGraph) {
      if (!(this_present_stageGraph && that_present_stageGraph))
        return false;
      if (!this.stageGraph.equals(that.stageGraph))
        return false;
    }

    boolean this_present_stageList = true && this.isSetStageList();
    boolean that_present_stageList = true && that.isSetStageList();
    if (this_present_stageList || that_present_stageList) {
      if (!(this_present_stageList && that_present_stageList))
        return false;
      if (!this.stageList.equals(that.stageList))
        return false;
    }

    boolean this_present_done = true;
    boolean that_present_done = true;
    if (this_present_done || that_present_done) {
      if (!(this_present_done && that_present_done))
        return false;
      if (this.done != that.done)
        return false;
    }

    boolean this_present_started = true;
    boolean that_present_started = true;
    if (this_present_started || that_present_started) {
      if (!(this_present_started && that_present_started))
        return false;
      if (this.started != that.started)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_queryId = true && (isSetQueryId());
    builder.append(present_queryId);
    if (present_queryId)
      builder.append(queryId);

    boolean present_queryType = true && (isSetQueryType());
    builder.append(present_queryType);
    if (present_queryType)
      builder.append(queryType);

    boolean present_queryAttributes = true && (isSetQueryAttributes());
    builder.append(present_queryAttributes);
    if (present_queryAttributes)
      builder.append(queryAttributes);

    boolean present_queryCounters = true && (isSetQueryCounters());
    builder.append(present_queryCounters);
    if (present_queryCounters)
      builder.append(queryCounters);

    boolean present_stageGraph = true && (isSetStageGraph());
    builder.append(present_stageGraph);
    if (present_stageGraph)
      builder.append(stageGraph);

    boolean present_stageList = true && (isSetStageList());
    builder.append(present_stageList);
    if (present_stageList)
      builder.append(stageList);

    boolean present_done = true;
    builder.append(present_done);
    if (present_done)
      builder.append(done);

    boolean present_started = true;
    builder.append(present_started);
    if (present_started)
      builder.append(started);

    return builder.toHashCode();
  }

  public int compareTo(Query other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    Query typedOther = (Query)other;

    lastComparison = Boolean.valueOf(isSetQueryId()).compareTo(typedOther.isSetQueryId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQueryId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.queryId, typedOther.queryId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetQueryType()).compareTo(typedOther.isSetQueryType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQueryType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.queryType, typedOther.queryType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetQueryAttributes()).compareTo(typedOther.isSetQueryAttributes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQueryAttributes()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.queryAttributes, typedOther.queryAttributes);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetQueryCounters()).compareTo(typedOther.isSetQueryCounters());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQueryCounters()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.queryCounters, typedOther.queryCounters);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStageGraph()).compareTo(typedOther.isSetStageGraph());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStageGraph()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.stageGraph, typedOther.stageGraph);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStageList()).compareTo(typedOther.isSetStageList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStageList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.stageList, typedOther.stageList);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDone()).compareTo(typedOther.isSetDone());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDone()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.done, typedOther.done);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStarted()).compareTo(typedOther.isSetStarted());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStarted()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.started, typedOther.started);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    org.apache.thrift.protocol.TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == org.apache.thrift.protocol.TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // QUERY_ID
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.queryId = iprot.readString();
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // QUERY_TYPE
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.queryType = iprot.readString();
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // QUERY_ATTRIBUTES
          if (field.type == org.apache.thrift.protocol.TType.MAP) {
            {
              org.apache.thrift.protocol.TMap _map50 = iprot.readMapBegin();
              this.queryAttributes = new HashMap<String,String>(2*_map50.size);
              for (int _i51 = 0; _i51 < _map50.size; ++_i51)
              {
                String _key52; // required
                String _val53; // required
                _key52 = iprot.readString();
                _val53 = iprot.readString();
                this.queryAttributes.put(_key52, _val53);
              }
              iprot.readMapEnd();
            }
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // QUERY_COUNTERS
          if (field.type == org.apache.thrift.protocol.TType.MAP) {
            {
              org.apache.thrift.protocol.TMap _map54 = iprot.readMapBegin();
              this.queryCounters = new HashMap<String,Long>(2*_map54.size);
              for (int _i55 = 0; _i55 < _map54.size; ++_i55)
              {
                String _key56; // required
                long _val57; // required
                _key56 = iprot.readString();
                _val57 = iprot.readI64();
                this.queryCounters.put(_key56, _val57);
              }
              iprot.readMapEnd();
            }
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // STAGE_GRAPH
          if (field.type == org.apache.thrift.protocol.TType.STRUCT) {
            this.stageGraph = new Graph();
            this.stageGraph.read(iprot);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 6: // STAGE_LIST
          if (field.type == org.apache.thrift.protocol.TType.LIST) {
            {
              org.apache.thrift.protocol.TList _list58 = iprot.readListBegin();
              this.stageList = new ArrayList<Stage>(_list58.size);
              for (int _i59 = 0; _i59 < _list58.size; ++_i59)
              {
                Stage _elem60; // required
                _elem60 = new Stage();
                _elem60.read(iprot);
                this.stageList.add(_elem60);
              }
              iprot.readListEnd();
            }
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 7: // DONE
          if (field.type == org.apache.thrift.protocol.TType.BOOL) {
            this.done = iprot.readBool();
            setDoneIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 8: // STARTED
          if (field.type == org.apache.thrift.protocol.TType.BOOL) {
            this.started = iprot.readBool();
            setStartedIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();
    validate();
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.queryId != null) {
      oprot.writeFieldBegin(QUERY_ID_FIELD_DESC);
      oprot.writeString(this.queryId);
      oprot.writeFieldEnd();
    }
    if (this.queryType != null) {
      oprot.writeFieldBegin(QUERY_TYPE_FIELD_DESC);
      oprot.writeString(this.queryType);
      oprot.writeFieldEnd();
    }
    if (this.queryAttributes != null) {
      oprot.writeFieldBegin(QUERY_ATTRIBUTES_FIELD_DESC);
      {
        oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, this.queryAttributes.size()));
        for (Map.Entry<String, String> _iter61 : this.queryAttributes.entrySet())
        {
          oprot.writeString(_iter61.getKey());
          oprot.writeString(_iter61.getValue());
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.queryCounters != null) {
      oprot.writeFieldBegin(QUERY_COUNTERS_FIELD_DESC);
      {
        oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.I64, this.queryCounters.size()));
        for (Map.Entry<String, Long> _iter62 : this.queryCounters.entrySet())
        {
          oprot.writeString(_iter62.getKey());
          oprot.writeI64(_iter62.getValue());
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.stageGraph != null) {
      oprot.writeFieldBegin(STAGE_GRAPH_FIELD_DESC);
      this.stageGraph.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.stageList != null) {
      oprot.writeFieldBegin(STAGE_LIST_FIELD_DESC);
      {
        oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, this.stageList.size()));
        for (Stage _iter63 : this.stageList)
        {
          _iter63.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(DONE_FIELD_DESC);
    oprot.writeBool(this.done);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(STARTED_FIELD_DESC);
    oprot.writeBool(this.started);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Query(");
    boolean first = true;

    sb.append("queryId:");
    if (this.queryId == null) {
      sb.append("null");
    } else {
      sb.append(this.queryId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("queryType:");
    if (this.queryType == null) {
      sb.append("null");
    } else {
      sb.append(this.queryType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("queryAttributes:");
    if (this.queryAttributes == null) {
      sb.append("null");
    } else {
      sb.append(this.queryAttributes);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("queryCounters:");
    if (this.queryCounters == null) {
      sb.append("null");
    } else {
      sb.append(this.queryCounters);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("stageGraph:");
    if (this.stageGraph == null) {
      sb.append("null");
    } else {
      sb.append(this.stageGraph);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("stageList:");
    if (this.stageList == null) {
      sb.append("null");
    } else {
      sb.append(this.stageList);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("done:");
    sb.append(this.done);
    first = false;
    if (!first) sb.append(", ");
    sb.append("started:");
    sb.append(this.started);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

}
