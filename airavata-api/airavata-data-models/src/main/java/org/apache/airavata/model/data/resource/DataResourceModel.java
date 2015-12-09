/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.airavata.model.data.resource;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
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
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-12-4")
public class DataResourceModel implements org.apache.thrift.TBase<DataResourceModel, DataResourceModel._Fields>, java.io.Serializable, Cloneable, Comparable<DataResourceModel> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DataResourceModel");

  private static final org.apache.thrift.protocol.TField RESOURCE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("resourceId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField RESOURCE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("resourceName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField RESOURCE_DESCRIPTION_FIELD_DESC = new org.apache.thrift.protocol.TField("resourceDescription", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField OWNER_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("ownerName", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField RESOURCE_SIZE_FIELD_DESC = new org.apache.thrift.protocol.TField("resourceSize", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField CREATION_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("creationTime", org.apache.thrift.protocol.TType.I64, (short)6);
  private static final org.apache.thrift.protocol.TField LAST_MODIFIED_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("lastModifiedTime", org.apache.thrift.protocol.TType.I64, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DataResourceModelStandardSchemeFactory());
    schemes.put(TupleScheme.class, new DataResourceModelTupleSchemeFactory());
  }

  private String resourceId; // optional
  private String resourceName; // optional
  private String resourceDescription; // optional
  private String ownerName; // optional
  private int resourceSize; // optional
  private long creationTime; // optional
  private long lastModifiedTime; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    RESOURCE_ID((short)1, "resourceId"),
    RESOURCE_NAME((short)2, "resourceName"),
    RESOURCE_DESCRIPTION((short)3, "resourceDescription"),
    OWNER_NAME((short)4, "ownerName"),
    RESOURCE_SIZE((short)5, "resourceSize"),
    CREATION_TIME((short)6, "creationTime"),
    LAST_MODIFIED_TIME((short)7, "lastModifiedTime");

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
        case 1: // RESOURCE_ID
          return RESOURCE_ID;
        case 2: // RESOURCE_NAME
          return RESOURCE_NAME;
        case 3: // RESOURCE_DESCRIPTION
          return RESOURCE_DESCRIPTION;
        case 4: // OWNER_NAME
          return OWNER_NAME;
        case 5: // RESOURCE_SIZE
          return RESOURCE_SIZE;
        case 6: // CREATION_TIME
          return CREATION_TIME;
        case 7: // LAST_MODIFIED_TIME
          return LAST_MODIFIED_TIME;
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
  private static final int __RESOURCESIZE_ISSET_ID = 0;
  private static final int __CREATIONTIME_ISSET_ID = 1;
  private static final int __LASTMODIFIEDTIME_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.RESOURCE_ID,_Fields.RESOURCE_NAME,_Fields.RESOURCE_DESCRIPTION,_Fields.OWNER_NAME,_Fields.RESOURCE_SIZE,_Fields.CREATION_TIME,_Fields.LAST_MODIFIED_TIME};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.RESOURCE_ID, new org.apache.thrift.meta_data.FieldMetaData("resourceId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.RESOURCE_NAME, new org.apache.thrift.meta_data.FieldMetaData("resourceName", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.RESOURCE_DESCRIPTION, new org.apache.thrift.meta_data.FieldMetaData("resourceDescription", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.OWNER_NAME, new org.apache.thrift.meta_data.FieldMetaData("ownerName", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.RESOURCE_SIZE, new org.apache.thrift.meta_data.FieldMetaData("resourceSize", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.CREATION_TIME, new org.apache.thrift.meta_data.FieldMetaData("creationTime", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.LAST_MODIFIED_TIME, new org.apache.thrift.meta_data.FieldMetaData("lastModifiedTime", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DataResourceModel.class, metaDataMap);
  }

  public DataResourceModel() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DataResourceModel(DataResourceModel other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetResourceId()) {
      this.resourceId = other.resourceId;
    }
    if (other.isSetResourceName()) {
      this.resourceName = other.resourceName;
    }
    if (other.isSetResourceDescription()) {
      this.resourceDescription = other.resourceDescription;
    }
    if (other.isSetOwnerName()) {
      this.ownerName = other.ownerName;
    }
    this.resourceSize = other.resourceSize;
    this.creationTime = other.creationTime;
    this.lastModifiedTime = other.lastModifiedTime;
  }

  public DataResourceModel deepCopy() {
    return new DataResourceModel(this);
  }

  @Override
  public void clear() {
    this.resourceId = null;
    this.resourceName = null;
    this.resourceDescription = null;
    this.ownerName = null;
    setResourceSizeIsSet(false);
    this.resourceSize = 0;
    setCreationTimeIsSet(false);
    this.creationTime = 0;
    setLastModifiedTimeIsSet(false);
    this.lastModifiedTime = 0;
  }

  public String getResourceId() {
    return this.resourceId;
  }

  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }

  public void unsetResourceId() {
    this.resourceId = null;
  }

  /** Returns true if field resourceId is set (has been assigned a value) and false otherwise */
  public boolean isSetResourceId() {
    return this.resourceId != null;
  }

  public void setResourceIdIsSet(boolean value) {
    if (!value) {
      this.resourceId = null;
    }
  }

  public String getResourceName() {
    return this.resourceName;
  }

  public void setResourceName(String resourceName) {
    this.resourceName = resourceName;
  }

  public void unsetResourceName() {
    this.resourceName = null;
  }

  /** Returns true if field resourceName is set (has been assigned a value) and false otherwise */
  public boolean isSetResourceName() {
    return this.resourceName != null;
  }

  public void setResourceNameIsSet(boolean value) {
    if (!value) {
      this.resourceName = null;
    }
  }

  public String getResourceDescription() {
    return this.resourceDescription;
  }

  public void setResourceDescription(String resourceDescription) {
    this.resourceDescription = resourceDescription;
  }

  public void unsetResourceDescription() {
    this.resourceDescription = null;
  }

  /** Returns true if field resourceDescription is set (has been assigned a value) and false otherwise */
  public boolean isSetResourceDescription() {
    return this.resourceDescription != null;
  }

  public void setResourceDescriptionIsSet(boolean value) {
    if (!value) {
      this.resourceDescription = null;
    }
  }

  public String getOwnerName() {
    return this.ownerName;
  }

  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }

  public void unsetOwnerName() {
    this.ownerName = null;
  }

  /** Returns true if field ownerName is set (has been assigned a value) and false otherwise */
  public boolean isSetOwnerName() {
    return this.ownerName != null;
  }

  public void setOwnerNameIsSet(boolean value) {
    if (!value) {
      this.ownerName = null;
    }
  }

  public int getResourceSize() {
    return this.resourceSize;
  }

  public void setResourceSize(int resourceSize) {
    this.resourceSize = resourceSize;
    setResourceSizeIsSet(true);
  }

  public void unsetResourceSize() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __RESOURCESIZE_ISSET_ID);
  }

  /** Returns true if field resourceSize is set (has been assigned a value) and false otherwise */
  public boolean isSetResourceSize() {
    return EncodingUtils.testBit(__isset_bitfield, __RESOURCESIZE_ISSET_ID);
  }

  public void setResourceSizeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __RESOURCESIZE_ISSET_ID, value);
  }

  public long getCreationTime() {
    return this.creationTime;
  }

  public void setCreationTime(long creationTime) {
    this.creationTime = creationTime;
    setCreationTimeIsSet(true);
  }

  public void unsetCreationTime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CREATIONTIME_ISSET_ID);
  }

  /** Returns true if field creationTime is set (has been assigned a value) and false otherwise */
  public boolean isSetCreationTime() {
    return EncodingUtils.testBit(__isset_bitfield, __CREATIONTIME_ISSET_ID);
  }

  public void setCreationTimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CREATIONTIME_ISSET_ID, value);
  }

  public long getLastModifiedTime() {
    return this.lastModifiedTime;
  }

  public void setLastModifiedTime(long lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
    setLastModifiedTimeIsSet(true);
  }

  public void unsetLastModifiedTime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __LASTMODIFIEDTIME_ISSET_ID);
  }

  /** Returns true if field lastModifiedTime is set (has been assigned a value) and false otherwise */
  public boolean isSetLastModifiedTime() {
    return EncodingUtils.testBit(__isset_bitfield, __LASTMODIFIEDTIME_ISSET_ID);
  }

  public void setLastModifiedTimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __LASTMODIFIEDTIME_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case RESOURCE_ID:
      if (value == null) {
        unsetResourceId();
      } else {
        setResourceId((String)value);
      }
      break;

    case RESOURCE_NAME:
      if (value == null) {
        unsetResourceName();
      } else {
        setResourceName((String)value);
      }
      break;

    case RESOURCE_DESCRIPTION:
      if (value == null) {
        unsetResourceDescription();
      } else {
        setResourceDescription((String)value);
      }
      break;

    case OWNER_NAME:
      if (value == null) {
        unsetOwnerName();
      } else {
        setOwnerName((String)value);
      }
      break;

    case RESOURCE_SIZE:
      if (value == null) {
        unsetResourceSize();
      } else {
        setResourceSize((Integer)value);
      }
      break;

    case CREATION_TIME:
      if (value == null) {
        unsetCreationTime();
      } else {
        setCreationTime((Long)value);
      }
      break;

    case LAST_MODIFIED_TIME:
      if (value == null) {
        unsetLastModifiedTime();
      } else {
        setLastModifiedTime((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case RESOURCE_ID:
      return getResourceId();

    case RESOURCE_NAME:
      return getResourceName();

    case RESOURCE_DESCRIPTION:
      return getResourceDescription();

    case OWNER_NAME:
      return getOwnerName();

    case RESOURCE_SIZE:
      return Integer.valueOf(getResourceSize());

    case CREATION_TIME:
      return Long.valueOf(getCreationTime());

    case LAST_MODIFIED_TIME:
      return Long.valueOf(getLastModifiedTime());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case RESOURCE_ID:
      return isSetResourceId();
    case RESOURCE_NAME:
      return isSetResourceName();
    case RESOURCE_DESCRIPTION:
      return isSetResourceDescription();
    case OWNER_NAME:
      return isSetOwnerName();
    case RESOURCE_SIZE:
      return isSetResourceSize();
    case CREATION_TIME:
      return isSetCreationTime();
    case LAST_MODIFIED_TIME:
      return isSetLastModifiedTime();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof DataResourceModel)
      return this.equals((DataResourceModel)that);
    return false;
  }

  public boolean equals(DataResourceModel that) {
    if (that == null)
      return false;

    boolean this_present_resourceId = true && this.isSetResourceId();
    boolean that_present_resourceId = true && that.isSetResourceId();
    if (this_present_resourceId || that_present_resourceId) {
      if (!(this_present_resourceId && that_present_resourceId))
        return false;
      if (!this.resourceId.equals(that.resourceId))
        return false;
    }

    boolean this_present_resourceName = true && this.isSetResourceName();
    boolean that_present_resourceName = true && that.isSetResourceName();
    if (this_present_resourceName || that_present_resourceName) {
      if (!(this_present_resourceName && that_present_resourceName))
        return false;
      if (!this.resourceName.equals(that.resourceName))
        return false;
    }

    boolean this_present_resourceDescription = true && this.isSetResourceDescription();
    boolean that_present_resourceDescription = true && that.isSetResourceDescription();
    if (this_present_resourceDescription || that_present_resourceDescription) {
      if (!(this_present_resourceDescription && that_present_resourceDescription))
        return false;
      if (!this.resourceDescription.equals(that.resourceDescription))
        return false;
    }

    boolean this_present_ownerName = true && this.isSetOwnerName();
    boolean that_present_ownerName = true && that.isSetOwnerName();
    if (this_present_ownerName || that_present_ownerName) {
      if (!(this_present_ownerName && that_present_ownerName))
        return false;
      if (!this.ownerName.equals(that.ownerName))
        return false;
    }

    boolean this_present_resourceSize = true && this.isSetResourceSize();
    boolean that_present_resourceSize = true && that.isSetResourceSize();
    if (this_present_resourceSize || that_present_resourceSize) {
      if (!(this_present_resourceSize && that_present_resourceSize))
        return false;
      if (this.resourceSize != that.resourceSize)
        return false;
    }

    boolean this_present_creationTime = true && this.isSetCreationTime();
    boolean that_present_creationTime = true && that.isSetCreationTime();
    if (this_present_creationTime || that_present_creationTime) {
      if (!(this_present_creationTime && that_present_creationTime))
        return false;
      if (this.creationTime != that.creationTime)
        return false;
    }

    boolean this_present_lastModifiedTime = true && this.isSetLastModifiedTime();
    boolean that_present_lastModifiedTime = true && that.isSetLastModifiedTime();
    if (this_present_lastModifiedTime || that_present_lastModifiedTime) {
      if (!(this_present_lastModifiedTime && that_present_lastModifiedTime))
        return false;
      if (this.lastModifiedTime != that.lastModifiedTime)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_resourceId = true && (isSetResourceId());
    list.add(present_resourceId);
    if (present_resourceId)
      list.add(resourceId);

    boolean present_resourceName = true && (isSetResourceName());
    list.add(present_resourceName);
    if (present_resourceName)
      list.add(resourceName);

    boolean present_resourceDescription = true && (isSetResourceDescription());
    list.add(present_resourceDescription);
    if (present_resourceDescription)
      list.add(resourceDescription);

    boolean present_ownerName = true && (isSetOwnerName());
    list.add(present_ownerName);
    if (present_ownerName)
      list.add(ownerName);

    boolean present_resourceSize = true && (isSetResourceSize());
    list.add(present_resourceSize);
    if (present_resourceSize)
      list.add(resourceSize);

    boolean present_creationTime = true && (isSetCreationTime());
    list.add(present_creationTime);
    if (present_creationTime)
      list.add(creationTime);

    boolean present_lastModifiedTime = true && (isSetLastModifiedTime());
    list.add(present_lastModifiedTime);
    if (present_lastModifiedTime)
      list.add(lastModifiedTime);

    return list.hashCode();
  }

  @Override
  public int compareTo(DataResourceModel other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetResourceId()).compareTo(other.isSetResourceId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResourceId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.resourceId, other.resourceId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetResourceName()).compareTo(other.isSetResourceName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResourceName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.resourceName, other.resourceName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetResourceDescription()).compareTo(other.isSetResourceDescription());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResourceDescription()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.resourceDescription, other.resourceDescription);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOwnerName()).compareTo(other.isSetOwnerName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOwnerName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ownerName, other.ownerName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetResourceSize()).compareTo(other.isSetResourceSize());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResourceSize()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.resourceSize, other.resourceSize);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCreationTime()).compareTo(other.isSetCreationTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCreationTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.creationTime, other.creationTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLastModifiedTime()).compareTo(other.isSetLastModifiedTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLastModifiedTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.lastModifiedTime, other.lastModifiedTime);
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
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("DataResourceModel(");
    boolean first = true;

    if (isSetResourceId()) {
      sb.append("resourceId:");
      if (this.resourceId == null) {
        sb.append("null");
      } else {
        sb.append(this.resourceId);
      }
      first = false;
    }
    if (isSetResourceName()) {
      if (!first) sb.append(", ");
      sb.append("resourceName:");
      if (this.resourceName == null) {
        sb.append("null");
      } else {
        sb.append(this.resourceName);
      }
      first = false;
    }
    if (isSetResourceDescription()) {
      if (!first) sb.append(", ");
      sb.append("resourceDescription:");
      if (this.resourceDescription == null) {
        sb.append("null");
      } else {
        sb.append(this.resourceDescription);
      }
      first = false;
    }
    if (isSetOwnerName()) {
      if (!first) sb.append(", ");
      sb.append("ownerName:");
      if (this.ownerName == null) {
        sb.append("null");
      } else {
        sb.append(this.ownerName);
      }
      first = false;
    }
    if (isSetResourceSize()) {
      if (!first) sb.append(", ");
      sb.append("resourceSize:");
      sb.append(this.resourceSize);
      first = false;
    }
    if (isSetCreationTime()) {
      if (!first) sb.append(", ");
      sb.append("creationTime:");
      sb.append(this.creationTime);
      first = false;
    }
    if (isSetLastModifiedTime()) {
      if (!first) sb.append(", ");
      sb.append("lastModifiedTime:");
      sb.append(this.lastModifiedTime);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
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
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class DataResourceModelStandardSchemeFactory implements SchemeFactory {
    public DataResourceModelStandardScheme getScheme() {
      return new DataResourceModelStandardScheme();
    }
  }

  private static class DataResourceModelStandardScheme extends StandardScheme<DataResourceModel> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, DataResourceModel struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // RESOURCE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.resourceId = iprot.readString();
              struct.setResourceIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // RESOURCE_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.resourceName = iprot.readString();
              struct.setResourceNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // RESOURCE_DESCRIPTION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.resourceDescription = iprot.readString();
              struct.setResourceDescriptionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // OWNER_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.ownerName = iprot.readString();
              struct.setOwnerNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // RESOURCE_SIZE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.resourceSize = iprot.readI32();
              struct.setResourceSizeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // CREATION_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.creationTime = iprot.readI64();
              struct.setCreationTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // LAST_MODIFIED_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.lastModifiedTime = iprot.readI64();
              struct.setLastModifiedTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, DataResourceModel struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.resourceId != null) {
        if (struct.isSetResourceId()) {
          oprot.writeFieldBegin(RESOURCE_ID_FIELD_DESC);
          oprot.writeString(struct.resourceId);
          oprot.writeFieldEnd();
        }
      }
      if (struct.resourceName != null) {
        if (struct.isSetResourceName()) {
          oprot.writeFieldBegin(RESOURCE_NAME_FIELD_DESC);
          oprot.writeString(struct.resourceName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.resourceDescription != null) {
        if (struct.isSetResourceDescription()) {
          oprot.writeFieldBegin(RESOURCE_DESCRIPTION_FIELD_DESC);
          oprot.writeString(struct.resourceDescription);
          oprot.writeFieldEnd();
        }
      }
      if (struct.ownerName != null) {
        if (struct.isSetOwnerName()) {
          oprot.writeFieldBegin(OWNER_NAME_FIELD_DESC);
          oprot.writeString(struct.ownerName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetResourceSize()) {
        oprot.writeFieldBegin(RESOURCE_SIZE_FIELD_DESC);
        oprot.writeI32(struct.resourceSize);
        oprot.writeFieldEnd();
      }
      if (struct.isSetCreationTime()) {
        oprot.writeFieldBegin(CREATION_TIME_FIELD_DESC);
        oprot.writeI64(struct.creationTime);
        oprot.writeFieldEnd();
      }
      if (struct.isSetLastModifiedTime()) {
        oprot.writeFieldBegin(LAST_MODIFIED_TIME_FIELD_DESC);
        oprot.writeI64(struct.lastModifiedTime);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DataResourceModelTupleSchemeFactory implements SchemeFactory {
    public DataResourceModelTupleScheme getScheme() {
      return new DataResourceModelTupleScheme();
    }
  }

  private static class DataResourceModelTupleScheme extends TupleScheme<DataResourceModel> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, DataResourceModel struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetResourceId()) {
        optionals.set(0);
      }
      if (struct.isSetResourceName()) {
        optionals.set(1);
      }
      if (struct.isSetResourceDescription()) {
        optionals.set(2);
      }
      if (struct.isSetOwnerName()) {
        optionals.set(3);
      }
      if (struct.isSetResourceSize()) {
        optionals.set(4);
      }
      if (struct.isSetCreationTime()) {
        optionals.set(5);
      }
      if (struct.isSetLastModifiedTime()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetResourceId()) {
        oprot.writeString(struct.resourceId);
      }
      if (struct.isSetResourceName()) {
        oprot.writeString(struct.resourceName);
      }
      if (struct.isSetResourceDescription()) {
        oprot.writeString(struct.resourceDescription);
      }
      if (struct.isSetOwnerName()) {
        oprot.writeString(struct.ownerName);
      }
      if (struct.isSetResourceSize()) {
        oprot.writeI32(struct.resourceSize);
      }
      if (struct.isSetCreationTime()) {
        oprot.writeI64(struct.creationTime);
      }
      if (struct.isSetLastModifiedTime()) {
        oprot.writeI64(struct.lastModifiedTime);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, DataResourceModel struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.resourceId = iprot.readString();
        struct.setResourceIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.resourceName = iprot.readString();
        struct.setResourceNameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.resourceDescription = iprot.readString();
        struct.setResourceDescriptionIsSet(true);
      }
      if (incoming.get(3)) {
        struct.ownerName = iprot.readString();
        struct.setOwnerNameIsSet(true);
      }
      if (incoming.get(4)) {
        struct.resourceSize = iprot.readI32();
        struct.setResourceSizeIsSet(true);
      }
      if (incoming.get(5)) {
        struct.creationTime = iprot.readI64();
        struct.setCreationTimeIsSet(true);
      }
      if (incoming.get(6)) {
        struct.lastModifiedTime = iprot.readI64();
        struct.setLastModifiedTimeIsSet(true);
      }
    }
  }

}

