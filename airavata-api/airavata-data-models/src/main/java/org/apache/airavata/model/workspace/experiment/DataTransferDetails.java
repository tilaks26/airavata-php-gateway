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
package org.apache.airavata.model.workspace.experiment;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-6-11")
public class DataTransferDetails implements org.apache.thrift.TBase<DataTransferDetails, DataTransferDetails._Fields>, java.io.Serializable, Cloneable, Comparable<DataTransferDetails> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DataTransferDetails");

  private static final org.apache.thrift.protocol.TField TRANSFER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("transferID", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField CREATION_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("creationTime", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField TRANSFER_DESCRIPTION_FIELD_DESC = new org.apache.thrift.protocol.TField("transferDescription", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField TRANSFER_STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("transferStatus", org.apache.thrift.protocol.TType.STRUCT, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DataTransferDetailsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new DataTransferDetailsTupleSchemeFactory());
  }

  private String transferID; // required
  private long creationTime; // optional
  private String transferDescription; // required
  private TransferStatus transferStatus; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TRANSFER_ID((short)1, "transferID"),
    CREATION_TIME((short)2, "creationTime"),
    TRANSFER_DESCRIPTION((short)3, "transferDescription"),
    TRANSFER_STATUS((short)4, "transferStatus");

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
        case 1: // TRANSFER_ID
          return TRANSFER_ID;
        case 2: // CREATION_TIME
          return CREATION_TIME;
        case 3: // TRANSFER_DESCRIPTION
          return TRANSFER_DESCRIPTION;
        case 4: // TRANSFER_STATUS
          return TRANSFER_STATUS;
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
  private static final int __CREATIONTIME_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.CREATION_TIME,_Fields.TRANSFER_STATUS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TRANSFER_ID, new org.apache.thrift.meta_data.FieldMetaData("transferID", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CREATION_TIME, new org.apache.thrift.meta_data.FieldMetaData("creationTime", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.TRANSFER_DESCRIPTION, new org.apache.thrift.meta_data.FieldMetaData("transferDescription", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TRANSFER_STATUS, new org.apache.thrift.meta_data.FieldMetaData("transferStatus", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TransferStatus.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DataTransferDetails.class, metaDataMap);
  }

  public DataTransferDetails() {
    this.transferID = "DO_NOT_SET_AT_CLIENTS";

  }

  public DataTransferDetails(
    String transferID,
    String transferDescription)
  {
    this();
    this.transferID = transferID;
    this.transferDescription = transferDescription;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DataTransferDetails(DataTransferDetails other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetTransferID()) {
      this.transferID = other.transferID;
    }
    this.creationTime = other.creationTime;
    if (other.isSetTransferDescription()) {
      this.transferDescription = other.transferDescription;
    }
    if (other.isSetTransferStatus()) {
      this.transferStatus = new TransferStatus(other.transferStatus);
    }
  }

  public DataTransferDetails deepCopy() {
    return new DataTransferDetails(this);
  }

  @Override
  public void clear() {
    this.transferID = "DO_NOT_SET_AT_CLIENTS";

    setCreationTimeIsSet(false);
    this.creationTime = 0;
    this.transferDescription = null;
    this.transferStatus = null;
  }

  public String getTransferID() {
    return this.transferID;
  }

  public void setTransferID(String transferID) {
    this.transferID = transferID;
  }

  public void unsetTransferID() {
    this.transferID = null;
  }

  /** Returns true if field transferID is set (has been assigned a value) and false otherwise */
  public boolean isSetTransferID() {
    return this.transferID != null;
  }

  public void setTransferIDIsSet(boolean value) {
    if (!value) {
      this.transferID = null;
    }
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

  public String getTransferDescription() {
    return this.transferDescription;
  }

  public void setTransferDescription(String transferDescription) {
    this.transferDescription = transferDescription;
  }

  public void unsetTransferDescription() {
    this.transferDescription = null;
  }

  /** Returns true if field transferDescription is set (has been assigned a value) and false otherwise */
  public boolean isSetTransferDescription() {
    return this.transferDescription != null;
  }

  public void setTransferDescriptionIsSet(boolean value) {
    if (!value) {
      this.transferDescription = null;
    }
  }

  public TransferStatus getTransferStatus() {
    return this.transferStatus;
  }

  public void setTransferStatus(TransferStatus transferStatus) {
    this.transferStatus = transferStatus;
  }

  public void unsetTransferStatus() {
    this.transferStatus = null;
  }

  /** Returns true if field transferStatus is set (has been assigned a value) and false otherwise */
  public boolean isSetTransferStatus() {
    return this.transferStatus != null;
  }

  public void setTransferStatusIsSet(boolean value) {
    if (!value) {
      this.transferStatus = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TRANSFER_ID:
      if (value == null) {
        unsetTransferID();
      } else {
        setTransferID((String)value);
      }
      break;

    case CREATION_TIME:
      if (value == null) {
        unsetCreationTime();
      } else {
        setCreationTime((Long)value);
      }
      break;

    case TRANSFER_DESCRIPTION:
      if (value == null) {
        unsetTransferDescription();
      } else {
        setTransferDescription((String)value);
      }
      break;

    case TRANSFER_STATUS:
      if (value == null) {
        unsetTransferStatus();
      } else {
        setTransferStatus((TransferStatus)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TRANSFER_ID:
      return getTransferID();

    case CREATION_TIME:
      return Long.valueOf(getCreationTime());

    case TRANSFER_DESCRIPTION:
      return getTransferDescription();

    case TRANSFER_STATUS:
      return getTransferStatus();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TRANSFER_ID:
      return isSetTransferID();
    case CREATION_TIME:
      return isSetCreationTime();
    case TRANSFER_DESCRIPTION:
      return isSetTransferDescription();
    case TRANSFER_STATUS:
      return isSetTransferStatus();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof DataTransferDetails)
      return this.equals((DataTransferDetails)that);
    return false;
  }

  public boolean equals(DataTransferDetails that) {
    if (that == null)
      return false;

    boolean this_present_transferID = true && this.isSetTransferID();
    boolean that_present_transferID = true && that.isSetTransferID();
    if (this_present_transferID || that_present_transferID) {
      if (!(this_present_transferID && that_present_transferID))
        return false;
      if (!this.transferID.equals(that.transferID))
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

    boolean this_present_transferDescription = true && this.isSetTransferDescription();
    boolean that_present_transferDescription = true && that.isSetTransferDescription();
    if (this_present_transferDescription || that_present_transferDescription) {
      if (!(this_present_transferDescription && that_present_transferDescription))
        return false;
      if (!this.transferDescription.equals(that.transferDescription))
        return false;
    }

    boolean this_present_transferStatus = true && this.isSetTransferStatus();
    boolean that_present_transferStatus = true && that.isSetTransferStatus();
    if (this_present_transferStatus || that_present_transferStatus) {
      if (!(this_present_transferStatus && that_present_transferStatus))
        return false;
      if (!this.transferStatus.equals(that.transferStatus))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_transferID = true && (isSetTransferID());
    list.add(present_transferID);
    if (present_transferID)
      list.add(transferID);

    boolean present_creationTime = true && (isSetCreationTime());
    list.add(present_creationTime);
    if (present_creationTime)
      list.add(creationTime);

    boolean present_transferDescription = true && (isSetTransferDescription());
    list.add(present_transferDescription);
    if (present_transferDescription)
      list.add(transferDescription);

    boolean present_transferStatus = true && (isSetTransferStatus());
    list.add(present_transferStatus);
    if (present_transferStatus)
      list.add(transferStatus);

    return list.hashCode();
  }

  @Override
  public int compareTo(DataTransferDetails other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTransferID()).compareTo(other.isSetTransferID());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTransferID()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.transferID, other.transferID);
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
    lastComparison = Boolean.valueOf(isSetTransferDescription()).compareTo(other.isSetTransferDescription());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTransferDescription()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.transferDescription, other.transferDescription);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTransferStatus()).compareTo(other.isSetTransferStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTransferStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.transferStatus, other.transferStatus);
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
    StringBuilder sb = new StringBuilder("DataTransferDetails(");
    boolean first = true;

    sb.append("transferID:");
    if (this.transferID == null) {
      sb.append("null");
    } else {
      sb.append(this.transferID);
    }
    first = false;
    if (isSetCreationTime()) {
      if (!first) sb.append(", ");
      sb.append("creationTime:");
      sb.append(this.creationTime);
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("transferDescription:");
    if (this.transferDescription == null) {
      sb.append("null");
    } else {
      sb.append(this.transferDescription);
    }
    first = false;
    if (isSetTransferStatus()) {
      if (!first) sb.append(", ");
      sb.append("transferStatus:");
      if (this.transferStatus == null) {
        sb.append("null");
      } else {
        sb.append(this.transferStatus);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetTransferID()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'transferID' is unset! Struct:" + toString());
    }

    if (!isSetTransferDescription()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'transferDescription' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
    if (transferStatus != null) {
      transferStatus.validate();
    }
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

  private static class DataTransferDetailsStandardSchemeFactory implements SchemeFactory {
    public DataTransferDetailsStandardScheme getScheme() {
      return new DataTransferDetailsStandardScheme();
    }
  }

  private static class DataTransferDetailsStandardScheme extends StandardScheme<DataTransferDetails> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, DataTransferDetails struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TRANSFER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.transferID = iprot.readString();
              struct.setTransferIDIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CREATION_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.creationTime = iprot.readI64();
              struct.setCreationTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TRANSFER_DESCRIPTION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.transferDescription = iprot.readString();
              struct.setTransferDescriptionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TRANSFER_STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.transferStatus = new TransferStatus();
              struct.transferStatus.read(iprot);
              struct.setTransferStatusIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, DataTransferDetails struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.transferID != null) {
        oprot.writeFieldBegin(TRANSFER_ID_FIELD_DESC);
        oprot.writeString(struct.transferID);
        oprot.writeFieldEnd();
      }
      if (struct.isSetCreationTime()) {
        oprot.writeFieldBegin(CREATION_TIME_FIELD_DESC);
        oprot.writeI64(struct.creationTime);
        oprot.writeFieldEnd();
      }
      if (struct.transferDescription != null) {
        oprot.writeFieldBegin(TRANSFER_DESCRIPTION_FIELD_DESC);
        oprot.writeString(struct.transferDescription);
        oprot.writeFieldEnd();
      }
      if (struct.transferStatus != null) {
        if (struct.isSetTransferStatus()) {
          oprot.writeFieldBegin(TRANSFER_STATUS_FIELD_DESC);
          struct.transferStatus.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DataTransferDetailsTupleSchemeFactory implements SchemeFactory {
    public DataTransferDetailsTupleScheme getScheme() {
      return new DataTransferDetailsTupleScheme();
    }
  }

  private static class DataTransferDetailsTupleScheme extends TupleScheme<DataTransferDetails> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, DataTransferDetails struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.transferID);
      oprot.writeString(struct.transferDescription);
      BitSet optionals = new BitSet();
      if (struct.isSetCreationTime()) {
        optionals.set(0);
      }
      if (struct.isSetTransferStatus()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetCreationTime()) {
        oprot.writeI64(struct.creationTime);
      }
      if (struct.isSetTransferStatus()) {
        struct.transferStatus.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, DataTransferDetails struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.transferID = iprot.readString();
      struct.setTransferIDIsSet(true);
      struct.transferDescription = iprot.readString();
      struct.setTransferDescriptionIsSet(true);
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.creationTime = iprot.readI64();
        struct.setCreationTimeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.transferStatus = new TransferStatus();
        struct.transferStatus.read(iprot);
        struct.setTransferStatusIsSet(true);
      }
    }
  }

}

