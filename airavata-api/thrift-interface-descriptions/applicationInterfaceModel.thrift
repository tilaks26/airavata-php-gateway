/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 */

/**
 * This file describes the definitions of the Data Structures of Application interfaces. These interfaces are mapped
 *  to application mapping on various resources.
 *
*/

namespace java org.apache.airavata.model.appcatalog.appinterface
namespace php Airavata.Model.AppCatalog.AppInterface
namespace cpp apache.airavata.model.appcatalog.appinterface

const string DEFAULT_ID = "DO_NOT_SET_AT_CLIENTS"

/**
 * Data Types supported in Airavata. The primitive data types
 *
*/
enum DataType{
	STRING,
	INTEGER,
	FLOAT,
	URI
}

/**
 * Application Inputs. The paramters describe how inputs are passed to the application.
 *
 * name:
 *   Name of the parameter.
 *
 * value:
 *   Value of the parameter. A default value could be set during registration.
 *
 * type:
 *   Data type of the parameter
 *
 * applicationArguement:
 *   The argument flag sent to the application. Such as -p pressure.
 *
 * standardInput:
 *   When this value is set, the parameter is sent as standard input rather than a parameter.
 *   Typically this is passed using redirection operator ">".
 *
 * userFriendlyDescription:
 *   Description to be displayed at the user interface.
 *
 * metaData:
 *   Any metadat. This is typically ignore by Airavata and is used by gateways for application configuration.
 *
*/
struct InputDataObjectType {
//    1: required bool isEmpty = 0,
    1: required string name,
    2: optional string value,
    3: optional DataType type,
    4: optional string applicationArgument,
    5: optional bool standardInput = 0,
    6: optional string userFriendlyDescription,
    7: optional string metaData
}

/**
 * Application Outputs. The paramters describe how outputs generated by the application.
 *
 * name:
 *   Name of the parameter.
 *
 * value:
 *   Value of the parameter.
 *
 * type:
 *   Data type of the parameter
 *
 * applicationArguement:
 *   The argument flag sent to the application. Such as -p pressure.
 *
 * standardInput:
 *   When this value is set, the parameter is sent as standard input rather than a parameter.
 *   Typically this is passed using redirection operator ">".
 *
 * userFriendlyDescription:
 *   Description to be displayed at the user interface.
 *
 * metaData:
 *   Any metadat. This is typically ignore by Airavata and is used by gateways for application configuration.
 *
*/
struct OutputDataObjectType {
//    1: required bool isEmpty = 0,
    1: required string name,
    2: optional string value,
    3: optional DataType type
}

/**
 * Application Interface Description
 *
 * applicationModules:
 *   Associate all application modules with versions which interface is applicable to.
 *
 * applicationInputs:
 *   Inputs to be passed to the application
 *
 * applicationOutputs:
 *   Outputs generated from the application
 *
*/
struct ApplicationInterfaceDescription {
//    1: required bool isEmpty = 0,
    1: required string applicationInterfaceId = DEFAULT_ID,
    2: required string applicationName,
    3: optional string applicationDesription,
    4: optional list<string> applicationModules,
    5: optional list<InputDataObjectType> applicationInputs,
    6: optional list<OutputDataObjectType> applicationOutputs
}