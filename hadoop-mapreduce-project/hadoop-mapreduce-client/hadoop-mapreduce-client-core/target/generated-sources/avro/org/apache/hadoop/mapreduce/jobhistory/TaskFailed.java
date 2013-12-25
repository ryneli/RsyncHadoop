/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.apache.hadoop.mapreduce.jobhistory;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class TaskFailed extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"TaskFailed\",\"namespace\":\"org.apache.hadoop.mapreduce.jobhistory\",\"fields\":[{\"name\":\"taskid\",\"type\":\"string\"},{\"name\":\"taskType\",\"type\":\"string\"},{\"name\":\"finishTime\",\"type\":\"long\"},{\"name\":\"error\",\"type\":\"string\"},{\"name\":\"failedDueToAttempt\",\"type\":[\"null\",\"string\"]},{\"name\":\"status\",\"type\":\"string\"},{\"name\":\"counters\",\"type\":{\"type\":\"record\",\"name\":\"JhCounters\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"groups\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"JhCounterGroup\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"displayName\",\"type\":\"string\"},{\"name\":\"counts\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"JhCounter\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"displayName\",\"type\":\"string\"},{\"name\":\"value\",\"type\":\"long\"}]}}}]}}}]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence taskid;
  @Deprecated public java.lang.CharSequence taskType;
  @Deprecated public long finishTime;
  @Deprecated public java.lang.CharSequence error;
  @Deprecated public java.lang.CharSequence failedDueToAttempt;
  @Deprecated public java.lang.CharSequence status;
  @Deprecated public org.apache.hadoop.mapreduce.jobhistory.JhCounters counters;

  /**
   * Default constructor.
   */
  public TaskFailed() {}

  /**
   * All-args constructor.
   */
  public TaskFailed(java.lang.CharSequence taskid, java.lang.CharSequence taskType, java.lang.Long finishTime, java.lang.CharSequence error, java.lang.CharSequence failedDueToAttempt, java.lang.CharSequence status, org.apache.hadoop.mapreduce.jobhistory.JhCounters counters) {
    this.taskid = taskid;
    this.taskType = taskType;
    this.finishTime = finishTime;
    this.error = error;
    this.failedDueToAttempt = failedDueToAttempt;
    this.status = status;
    this.counters = counters;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return taskid;
    case 1: return taskType;
    case 2: return finishTime;
    case 3: return error;
    case 4: return failedDueToAttempt;
    case 5: return status;
    case 6: return counters;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: taskid = (java.lang.CharSequence)value$; break;
    case 1: taskType = (java.lang.CharSequence)value$; break;
    case 2: finishTime = (java.lang.Long)value$; break;
    case 3: error = (java.lang.CharSequence)value$; break;
    case 4: failedDueToAttempt = (java.lang.CharSequence)value$; break;
    case 5: status = (java.lang.CharSequence)value$; break;
    case 6: counters = (org.apache.hadoop.mapreduce.jobhistory.JhCounters)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'taskid' field.
   */
  public java.lang.CharSequence getTaskid() {
    return taskid;
  }

  /**
   * Sets the value of the 'taskid' field.
   * @param value the value to set.
   */
  public void setTaskid(java.lang.CharSequence value) {
    this.taskid = value;
  }

  /**
   * Gets the value of the 'taskType' field.
   */
  public java.lang.CharSequence getTaskType() {
    return taskType;
  }

  /**
   * Sets the value of the 'taskType' field.
   * @param value the value to set.
   */
  public void setTaskType(java.lang.CharSequence value) {
    this.taskType = value;
  }

  /**
   * Gets the value of the 'finishTime' field.
   */
  public java.lang.Long getFinishTime() {
    return finishTime;
  }

  /**
   * Sets the value of the 'finishTime' field.
   * @param value the value to set.
   */
  public void setFinishTime(java.lang.Long value) {
    this.finishTime = value;
  }

  /**
   * Gets the value of the 'error' field.
   */
  public java.lang.CharSequence getError() {
    return error;
  }

  /**
   * Sets the value of the 'error' field.
   * @param value the value to set.
   */
  public void setError(java.lang.CharSequence value) {
    this.error = value;
  }

  /**
   * Gets the value of the 'failedDueToAttempt' field.
   */
  public java.lang.CharSequence getFailedDueToAttempt() {
    return failedDueToAttempt;
  }

  /**
   * Sets the value of the 'failedDueToAttempt' field.
   * @param value the value to set.
   */
  public void setFailedDueToAttempt(java.lang.CharSequence value) {
    this.failedDueToAttempt = value;
  }

  /**
   * Gets the value of the 'status' field.
   */
  public java.lang.CharSequence getStatus() {
    return status;
  }

  /**
   * Sets the value of the 'status' field.
   * @param value the value to set.
   */
  public void setStatus(java.lang.CharSequence value) {
    this.status = value;
  }

  /**
   * Gets the value of the 'counters' field.
   */
  public org.apache.hadoop.mapreduce.jobhistory.JhCounters getCounters() {
    return counters;
  }

  /**
   * Sets the value of the 'counters' field.
   * @param value the value to set.
   */
  public void setCounters(org.apache.hadoop.mapreduce.jobhistory.JhCounters value) {
    this.counters = value;
  }

  /** Creates a new TaskFailed RecordBuilder */
  public static org.apache.hadoop.mapreduce.jobhistory.TaskFailed.Builder newBuilder() {
    return new org.apache.hadoop.mapreduce.jobhistory.TaskFailed.Builder();
  }
  
  /** Creates a new TaskFailed RecordBuilder by copying an existing Builder */
  public static org.apache.hadoop.mapreduce.jobhistory.TaskFailed.Builder newBuilder(org.apache.hadoop.mapreduce.jobhistory.TaskFailed.Builder other) {
    return new org.apache.hadoop.mapreduce.jobhistory.TaskFailed.Builder(other);
  }
  
  /** Creates a new TaskFailed RecordBuilder by copying an existing TaskFailed instance */
  public static org.apache.hadoop.mapreduce.jobhistory.TaskFailed.Builder newBuilder(org.apache.hadoop.mapreduce.jobhistory.TaskFailed other) {
    return new org.apache.hadoop.mapreduce.jobhistory.TaskFailed.Builder(other);
  }
  
  /**
   * RecordBuilder for TaskFailed instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<TaskFailed>
    implements org.apache.avro.data.RecordBuilder<TaskFailed> {

    private java.lang.CharSequence taskid;
    private java.lang.CharSequence taskType;
    private long finishTime;
    private java.lang.CharSequence error;
    private java.lang.CharSequence failedDueToAttempt;
    private java.lang.CharSequence status;
    private org.apache.hadoop.mapreduce.jobhistory.JhCounters counters;

    /** Creates a new Builder */
    private Builder() {
      super(org.apache.hadoop.mapreduce.jobhistory.TaskFailed.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.apache.hadoop.mapreduce.jobhistory.TaskFailed.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing TaskFailed instance */
    private Builder(org.apache.hadoop.mapreduce.jobhistory.TaskFailed other) {
            super(org.apache.hadoop.mapreduce.jobhistory.TaskFailed.SCHEMA$);
      if (isValidValue(fields()[0], other.taskid)) {
        this.taskid = data().deepCopy(fields()[0].schema(), other.taskid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.taskType)) {
        this.taskType = data().deepCopy(fields()[1].schema(), other.taskType);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.finishTime)) {
        this.finishTime = data().deepCopy(fields()[2].schema(), other.finishTime);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.error)) {
        this.error = data().deepCopy(fields()[3].schema(), other.error);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.failedDueToAttempt)) {
        this.failedDueToAttempt = data().deepCopy(fields()[4].schema(), other.failedDueToAttempt);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.status)) {
        this.status = data().deepCopy(fields()[5].schema(), other.status);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.counters)) {
        this.counters = data().deepCopy(fields()[6].schema(), other.counters);
        fieldSetFlags()[6] = true;
      }
    }

    /** Gets the value of the 'taskid' field */
    public java.lang.CharSequence getTaskid() {
      return taskid;
    }
    
    /** Sets the value of the 'taskid' field */
    public org.apache.hadoop.mapreduce.jobhistory.TaskFailed.Builder setTaskid(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.taskid = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'taskid' field has been set */
    public boolean hasTaskid() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'taskid' field */
    public org.apache.hadoop.mapreduce.jobhistory.TaskFailed.Builder clearTaskid() {
      taskid = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'taskType' field */
    public java.lang.CharSequence getTaskType() {
      return taskType;
    }
    
    /** Sets the value of the 'taskType' field */
    public org.apache.hadoop.mapreduce.jobhistory.TaskFailed.Builder setTaskType(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.taskType = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'taskType' field has been set */
    public boolean hasTaskType() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'taskType' field */
    public org.apache.hadoop.mapreduce.jobhistory.TaskFailed.Builder clearTaskType() {
      taskType = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'finishTime' field */
    public java.lang.Long getFinishTime() {
      return finishTime;
    }
    
    /** Sets the value of the 'finishTime' field */
    public org.apache.hadoop.mapreduce.jobhistory.TaskFailed.Builder setFinishTime(long value) {
      validate(fields()[2], value);
      this.finishTime = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'finishTime' field has been set */
    public boolean hasFinishTime() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'finishTime' field */
    public org.apache.hadoop.mapreduce.jobhistory.TaskFailed.Builder clearFinishTime() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'error' field */
    public java.lang.CharSequence getError() {
      return error;
    }
    
    /** Sets the value of the 'error' field */
    public org.apache.hadoop.mapreduce.jobhistory.TaskFailed.Builder setError(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.error = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'error' field has been set */
    public boolean hasError() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'error' field */
    public org.apache.hadoop.mapreduce.jobhistory.TaskFailed.Builder clearError() {
      error = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'failedDueToAttempt' field */
    public java.lang.CharSequence getFailedDueToAttempt() {
      return failedDueToAttempt;
    }
    
    /** Sets the value of the 'failedDueToAttempt' field */
    public org.apache.hadoop.mapreduce.jobhistory.TaskFailed.Builder setFailedDueToAttempt(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.failedDueToAttempt = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'failedDueToAttempt' field has been set */
    public boolean hasFailedDueToAttempt() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'failedDueToAttempt' field */
    public org.apache.hadoop.mapreduce.jobhistory.TaskFailed.Builder clearFailedDueToAttempt() {
      failedDueToAttempt = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'status' field */
    public java.lang.CharSequence getStatus() {
      return status;
    }
    
    /** Sets the value of the 'status' field */
    public org.apache.hadoop.mapreduce.jobhistory.TaskFailed.Builder setStatus(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.status = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'status' field has been set */
    public boolean hasStatus() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'status' field */
    public org.apache.hadoop.mapreduce.jobhistory.TaskFailed.Builder clearStatus() {
      status = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'counters' field */
    public org.apache.hadoop.mapreduce.jobhistory.JhCounters getCounters() {
      return counters;
    }
    
    /** Sets the value of the 'counters' field */
    public org.apache.hadoop.mapreduce.jobhistory.TaskFailed.Builder setCounters(org.apache.hadoop.mapreduce.jobhistory.JhCounters value) {
      validate(fields()[6], value);
      this.counters = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'counters' field has been set */
    public boolean hasCounters() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'counters' field */
    public org.apache.hadoop.mapreduce.jobhistory.TaskFailed.Builder clearCounters() {
      counters = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    @Override
    public TaskFailed build() {
      try {
        TaskFailed record = new TaskFailed();
        record.taskid = fieldSetFlags()[0] ? this.taskid : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.taskType = fieldSetFlags()[1] ? this.taskType : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.finishTime = fieldSetFlags()[2] ? this.finishTime : (java.lang.Long) defaultValue(fields()[2]);
        record.error = fieldSetFlags()[3] ? this.error : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.failedDueToAttempt = fieldSetFlags()[4] ? this.failedDueToAttempt : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.status = fieldSetFlags()[5] ? this.status : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.counters = fieldSetFlags()[6] ? this.counters : (org.apache.hadoop.mapreduce.jobhistory.JhCounters) defaultValue(fields()[6]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
