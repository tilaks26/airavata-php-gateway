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
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
#ifndef user_resource_profile_model_TYPES_H
#define user_resource_profile_model_TYPES_H

#include <iosfwd>

#include <thrift/Thrift.h>
#include <thrift/TApplicationException.h>
#include <thrift/protocol/TProtocol.h>
#include <thrift/transport/TTransport.h>

#include <thrift/cxxfunctional.h>
#include "compute_resource_model_types.h"
#include "data_movement_models_types.h"
#include "user_profile_model_types.h"


namespace apache { namespace airavata { namespace model { namespace appcatalog { namespace userresourceprofile {

class UserComputeResourcePreference;

class UserStoragePreference;

class UserResourceProfile;

typedef struct _UserComputeResourcePreference__isset {
  _UserComputeResourcePreference__isset() : loginUserName(false), preferredBatchQueue(false), scratchLocation(false), allocationProjectNumber(false), resourceSpecificCredentialStoreToken(false), qualityOfService(false), reservation(false), reservationStartTime(false), reservationEndTime(false) {}
  bool loginUserName :1;
  bool preferredBatchQueue :1;
  bool scratchLocation :1;
  bool allocationProjectNumber :1;
  bool resourceSpecificCredentialStoreToken :1;
  bool qualityOfService :1;
  bool reservation :1;
  bool reservationStartTime :1;
  bool reservationEndTime :1;
} _UserComputeResourcePreference__isset;

class UserComputeResourcePreference {
 public:

  UserComputeResourcePreference(const UserComputeResourcePreference&);
  UserComputeResourcePreference& operator=(const UserComputeResourcePreference&);
  UserComputeResourcePreference() : computeResourceId(), loginUserName(), preferredBatchQueue(), scratchLocation(), allocationProjectNumber(), resourceSpecificCredentialStoreToken(), qualityOfService(), reservation(), reservationStartTime(0), reservationEndTime(0) {
  }

  virtual ~UserComputeResourcePreference() throw();
  std::string computeResourceId;
  std::string loginUserName;
  std::string preferredBatchQueue;
  std::string scratchLocation;
  std::string allocationProjectNumber;
  std::string resourceSpecificCredentialStoreToken;
  std::string qualityOfService;
  std::string reservation;
  int64_t reservationStartTime;
  int64_t reservationEndTime;

  _UserComputeResourcePreference__isset __isset;

  void __set_computeResourceId(const std::string& val);

  void __set_loginUserName(const std::string& val);

  void __set_preferredBatchQueue(const std::string& val);

  void __set_scratchLocation(const std::string& val);

  void __set_allocationProjectNumber(const std::string& val);

  void __set_resourceSpecificCredentialStoreToken(const std::string& val);

  void __set_qualityOfService(const std::string& val);

  void __set_reservation(const std::string& val);

  void __set_reservationStartTime(const int64_t val);

  void __set_reservationEndTime(const int64_t val);

  bool operator == (const UserComputeResourcePreference & rhs) const
  {
    if (!(computeResourceId == rhs.computeResourceId))
      return false;
    if (__isset.loginUserName != rhs.__isset.loginUserName)
      return false;
    else if (__isset.loginUserName && !(loginUserName == rhs.loginUserName))
      return false;
    if (__isset.preferredBatchQueue != rhs.__isset.preferredBatchQueue)
      return false;
    else if (__isset.preferredBatchQueue && !(preferredBatchQueue == rhs.preferredBatchQueue))
      return false;
    if (__isset.scratchLocation != rhs.__isset.scratchLocation)
      return false;
    else if (__isset.scratchLocation && !(scratchLocation == rhs.scratchLocation))
      return false;
    if (__isset.allocationProjectNumber != rhs.__isset.allocationProjectNumber)
      return false;
    else if (__isset.allocationProjectNumber && !(allocationProjectNumber == rhs.allocationProjectNumber))
      return false;
    if (__isset.resourceSpecificCredentialStoreToken != rhs.__isset.resourceSpecificCredentialStoreToken)
      return false;
    else if (__isset.resourceSpecificCredentialStoreToken && !(resourceSpecificCredentialStoreToken == rhs.resourceSpecificCredentialStoreToken))
      return false;
    if (__isset.qualityOfService != rhs.__isset.qualityOfService)
      return false;
    else if (__isset.qualityOfService && !(qualityOfService == rhs.qualityOfService))
      return false;
    if (__isset.reservation != rhs.__isset.reservation)
      return false;
    else if (__isset.reservation && !(reservation == rhs.reservation))
      return false;
    if (__isset.reservationStartTime != rhs.__isset.reservationStartTime)
      return false;
    else if (__isset.reservationStartTime && !(reservationStartTime == rhs.reservationStartTime))
      return false;
    if (__isset.reservationEndTime != rhs.__isset.reservationEndTime)
      return false;
    else if (__isset.reservationEndTime && !(reservationEndTime == rhs.reservationEndTime))
      return false;
    return true;
  }
  bool operator != (const UserComputeResourcePreference &rhs) const {
    return !(*this == rhs);
  }

  bool operator < (const UserComputeResourcePreference & ) const;

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot);
  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const;

  virtual void printTo(std::ostream& out) const;
};

void swap(UserComputeResourcePreference &a, UserComputeResourcePreference &b);

inline std::ostream& operator<<(std::ostream& out, const UserComputeResourcePreference& obj)
{
  obj.printTo(out);
  return out;
}

typedef struct _UserStoragePreference__isset {
  _UserStoragePreference__isset() : loginUserName(false), fileSystemRootLocation(false), resourceSpecificCredentialStoreToken(false) {}
  bool loginUserName :1;
  bool fileSystemRootLocation :1;
  bool resourceSpecificCredentialStoreToken :1;
} _UserStoragePreference__isset;

class UserStoragePreference {
 public:

  UserStoragePreference(const UserStoragePreference&);
  UserStoragePreference& operator=(const UserStoragePreference&);
  UserStoragePreference() : storageResourceId(), loginUserName(), fileSystemRootLocation(), resourceSpecificCredentialStoreToken() {
  }

  virtual ~UserStoragePreference() throw();
  std::string storageResourceId;
  std::string loginUserName;
  std::string fileSystemRootLocation;
  std::string resourceSpecificCredentialStoreToken;

  _UserStoragePreference__isset __isset;

  void __set_storageResourceId(const std::string& val);

  void __set_loginUserName(const std::string& val);

  void __set_fileSystemRootLocation(const std::string& val);

  void __set_resourceSpecificCredentialStoreToken(const std::string& val);

  bool operator == (const UserStoragePreference & rhs) const
  {
    if (!(storageResourceId == rhs.storageResourceId))
      return false;
    if (__isset.loginUserName != rhs.__isset.loginUserName)
      return false;
    else if (__isset.loginUserName && !(loginUserName == rhs.loginUserName))
      return false;
    if (__isset.fileSystemRootLocation != rhs.__isset.fileSystemRootLocation)
      return false;
    else if (__isset.fileSystemRootLocation && !(fileSystemRootLocation == rhs.fileSystemRootLocation))
      return false;
    if (__isset.resourceSpecificCredentialStoreToken != rhs.__isset.resourceSpecificCredentialStoreToken)
      return false;
    else if (__isset.resourceSpecificCredentialStoreToken && !(resourceSpecificCredentialStoreToken == rhs.resourceSpecificCredentialStoreToken))
      return false;
    return true;
  }
  bool operator != (const UserStoragePreference &rhs) const {
    return !(*this == rhs);
  }

  bool operator < (const UserStoragePreference & ) const;

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot);
  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const;

  virtual void printTo(std::ostream& out) const;
};

void swap(UserStoragePreference &a, UserStoragePreference &b);

inline std::ostream& operator<<(std::ostream& out, const UserStoragePreference& obj)
{
  obj.printTo(out);
  return out;
}

typedef struct _UserResourceProfile__isset {
  _UserResourceProfile__isset() : credentialStoreToken(false), userComputeResourcePreferences(false), userStoragePreferences(false), identityServerTenant(false), identityServerPwdCredToken(false) {}
  bool credentialStoreToken :1;
  bool userComputeResourcePreferences :1;
  bool userStoragePreferences :1;
  bool identityServerTenant :1;
  bool identityServerPwdCredToken :1;
} _UserResourceProfile__isset;

class UserResourceProfile {
 public:

  UserResourceProfile(const UserResourceProfile&);
  UserResourceProfile& operator=(const UserResourceProfile&);
  UserResourceProfile() : userId(), gatewayID(), credentialStoreToken(), identityServerTenant(), identityServerPwdCredToken() {
  }

  virtual ~UserResourceProfile() throw();
  std::string userId;
  std::string gatewayID;
  std::string credentialStoreToken;
  std::vector<UserComputeResourcePreference>  userComputeResourcePreferences;
  std::vector<UserStoragePreference>  userStoragePreferences;
  std::string identityServerTenant;
  std::string identityServerPwdCredToken;

  _UserResourceProfile__isset __isset;

  void __set_userId(const std::string& val);

  void __set_gatewayID(const std::string& val);

  void __set_credentialStoreToken(const std::string& val);

  void __set_userComputeResourcePreferences(const std::vector<UserComputeResourcePreference> & val);

  void __set_userStoragePreferences(const std::vector<UserStoragePreference> & val);

  void __set_identityServerTenant(const std::string& val);

  void __set_identityServerPwdCredToken(const std::string& val);

  bool operator == (const UserResourceProfile & rhs) const
  {
    if (!(userId == rhs.userId))
      return false;
    if (!(gatewayID == rhs.gatewayID))
      return false;
    if (__isset.credentialStoreToken != rhs.__isset.credentialStoreToken)
      return false;
    else if (__isset.credentialStoreToken && !(credentialStoreToken == rhs.credentialStoreToken))
      return false;
    if (__isset.userComputeResourcePreferences != rhs.__isset.userComputeResourcePreferences)
      return false;
    else if (__isset.userComputeResourcePreferences && !(userComputeResourcePreferences == rhs.userComputeResourcePreferences))
      return false;
    if (__isset.userStoragePreferences != rhs.__isset.userStoragePreferences)
      return false;
    else if (__isset.userStoragePreferences && !(userStoragePreferences == rhs.userStoragePreferences))
      return false;
    if (__isset.identityServerTenant != rhs.__isset.identityServerTenant)
      return false;
    else if (__isset.identityServerTenant && !(identityServerTenant == rhs.identityServerTenant))
      return false;
    if (__isset.identityServerPwdCredToken != rhs.__isset.identityServerPwdCredToken)
      return false;
    else if (__isset.identityServerPwdCredToken && !(identityServerPwdCredToken == rhs.identityServerPwdCredToken))
      return false;
    return true;
  }
  bool operator != (const UserResourceProfile &rhs) const {
    return !(*this == rhs);
  }

  bool operator < (const UserResourceProfile & ) const;

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot);
  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const;

  virtual void printTo(std::ostream& out) const;
};

void swap(UserResourceProfile &a, UserResourceProfile &b);

inline std::ostream& operator<<(std::ostream& out, const UserResourceProfile& obj)
{
  obj.printTo(out);
  return out;
}

}}}}} // namespace

#endif
