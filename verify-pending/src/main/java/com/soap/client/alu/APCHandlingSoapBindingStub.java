/**
 * APCHandlingSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soap.client.alu;


import com.soap.client.lhs.ws.beans.v2.contract_service_cug_parameters_read.NumParamsBeanOut;
import com.soap.client.lhs.ws.beans.v2.contract_service_cug_parameters_read.num_params.MultValuesBeanOut;
import com.soap.client.lhs.ws.beans.v2.contract_services_read.services.CugMembershipsBeanOut;
import com.soap.client.lhs.ws.beans.v2.contract_services_read.services.cug_memberships.BasicserviceBeanOut;

public class APCHandlingSoapBindingStub extends org.apache.axis.client.Stub implements APCHandling {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[44];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getType");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getTypeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetTypeRequest"), GetTypeRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetTypeResponse"));
        oper.setReturnClass( GetTypeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getTypeReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("changeRateplan");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "changeRatePlanRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ChangeRatePlanRequest"), ChangeRatePlanRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ChangeRatePlanResponse"));
        oper.setReturnClass( ChangeRatePlanResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "changeRateplanReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCUG");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getCUGRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CoIdRequest"), CoIdRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetCUGResponse"));
        oper.setReturnClass( GetCUGResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getCUGReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("calculateProrata");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "calculateProrataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CoIdRequest"), CoIdRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ProrateResponse"));
        oper.setReturnClass( ProrateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "calculateProrataReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCatMigration");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getCatMigrationRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetCategoryRequest"), GetCategoryRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetCategoryResponse"));
        oper.setReturnClass( GetCategoryResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getCatMigrationReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMigrationPrix");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getMigrationPrixRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetMigrationRequest"), GetMigrationRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "PrixMigrationResponse"));
        oper.setReturnClass( PrixMigrationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getMigrationPrixReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getEligebility");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getEligebilityRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CoIdRequest"), CoIdRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetEligebilityResponse"));
        oper.setReturnClass( GetEligebilityResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getEligebilityReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getNbreMigration");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getNbreMigrationRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CoIdRequest"), CoIdRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "NbreMigrationResponse"));
        oper.setReturnClass( NbreMigrationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getNbreMigrationReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMigrationtype");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getMigrationTypeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetMigrationRequest"), GetMigrationRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetMigrationTypeResponse"));
        oper.setReturnClass( GetMigrationTypeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getMigrationtypeReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("checkRateplan");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "checkRateplanRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CheckRateplanRequest"), CheckRateplanRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CheckRateplanResponse"));
        oper.setReturnClass( CheckRateplanResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "checkRateplanReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setOCC");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "setOCCRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "OCCRequest"), OCCRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "OCCResponse"));
        oper.setReturnClass( OCCResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "setOCCReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getOffreSource");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getOffreSourceRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetOffreRequest"), GetOffreRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetOffreResponse"));
        oper.setReturnClass( GetOffreResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getOffreSourceReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addTickler");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "addTicklerRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "AddTicklerRequest"), AddTicklerRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "AddTicklerResponse"));
        oper.setReturnClass( AddTicklerResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "addTicklerReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("userHasRight");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "userHasRightRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UserHasRightRequest"), UserHasRightRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UserHasRightResponse"));
        oper.setReturnClass( UserHasRightResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "userHasRightReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("userGroup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "userGroupRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UserGroupRequest"), UserGroupRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UserGroupResponse"));
        oper.setReturnClass( UserGroupResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "userGroupReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("activateContract");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "activateContractRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CoIdRequest"), CoIdRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "OperationResponse"));
        oper.setReturnClass( OperationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "activateContractReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createContract");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "createContractRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CreateContractRequest"), CreateContractRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CreateContractResponse"));
        oper.setReturnClass( CreateContractResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "createContractReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDateFacture");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getDateFactureRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CustomerRequest"), CustomerRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetDateFactureResponse"));
        oper.setReturnClass( GetDateFactureResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getDateFactureReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateAdvCharge");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "updateAdvChargeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UpdateAdvChargeRequest"), UpdateAdvChargeRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "OperationResponse"));
        oper.setReturnClass( OperationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "updateAdvChargeReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getconfigBalance");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getconfigBalanceRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetConfigBalanceRequest"), GetConfigBalanceRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetConfigBalanceResponse"));
        oper.setReturnClass( GetConfigBalanceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getconfigBalanceReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addCugContract");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "addCugRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "AddCugRequest"), AddCugRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "OperationResponse"));
        oper.setReturnClass( OperationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "addCugContractReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getListTemplate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getListTemplateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetListTemplateRequest"), GetListTemplateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetListTemplateRequestResponse"));
        oper.setReturnClass( GetListTemplateRequestResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getListTemplateReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("insertApcCugHist");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "apcCugHistRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ApcCugHistRequest"), ApcCugHistRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "OperationResponse"));
        oper.setReturnClass( OperationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "insertApcCugHistReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("calculateAcceleration");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "calculateAccelerationRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CalculateAccelerationRequest"), CalculateAccelerationRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CalculateAccelerationResponse"));
        oper.setReturnClass( CalculateAccelerationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "calculateAccelerationReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMigrationCategory");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getMigrationCategoryRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetCategoryRequest"), GetCategoryRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetCategoryResponse"));
        oper.setReturnClass( GetCategoryResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getMigrationCategoryReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateOperationDate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "updateOperationDateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "OperationDateRequest"), OperationDateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "OperationDateResponse"));
        oper.setReturnClass( OperationDateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "updateOperationDateReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getOptionalServices");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getOptionalServicesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetServiceRequest"), GetServiceRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetOptionalServicesResponse"));
        oper.setReturnClass( GetOptionalServicesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getOptionalServicesReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("hasPendingRequest");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "hasPendingrequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CoIdRequest"), CoIdRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "HasPendingRequestResponse"));
        oper.setReturnClass( HasPendingRequestResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "hasPendingRequestReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMsisdnFromCoId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getMsisdnFromCoIdRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CoIdRequest"), CoIdRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetMsisdnFromCoIdResponse"));
        oper.setReturnClass( GetMsisdnFromCoIdResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getMsisdnFromCoIdReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("desactivateServices");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "desactivateServicesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "DesactivateServicesRequest"), DesactivateServicesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "DesactivateServicesResponse"));
        oper.setReturnClass( DesactivateServicesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "desactivateServicesReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCustomerStatistics");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getCustomerStatisticsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CustomerRequest"), CustomerRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetCustomerStatisticsResponse"));
        oper.setReturnClass( GetCustomerStatisticsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getCustomerStatisticsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("desactivateContract");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "desactivateContractRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CoIdRequest"), CoIdRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "OperationResponse"));
        oper.setReturnClass( OperationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "desactivateContractReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getContractListForCustomer");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getContractListeForCustomerRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetContractListForCustomerRequest"), GetContractListForCustomerRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetContractListForCustomerResponse"));
        oper.setReturnClass( GetContractListForCustomerResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getContractListForCustomerReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("activateAndSetParameterServices");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "activateAndSetParameterServicesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ActivateServiceParamter"), ActivateServiceParamter.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ActivateServiceParamterResponse"));
        oper.setReturnClass( ActivateServiceParamterResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "activateAndSetParameterServicesReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMontantFacture");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getMontantFactureRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CustomerRequest"), CustomerRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "MontantFactureResponse"));
        oper.setReturnClass( MontantFactureResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getMontantFactureReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getContractFromMsisdn");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getContractFromMsisdnRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetCoIdRequest"), GetCoIdRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetContractFromMsisdnResponse"));
        oper.setReturnClass( GetContractFromMsisdnResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getContractFromMsisdnReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getEngagementStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getEngagementStatusRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CoIdRequest"), CoIdRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetEngagementStatusResponse"));
        oper.setReturnClass( GetEngagementStatusResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getEngagementStatusReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getBalancesContractHist");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getBalancesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetBalancesRequest"), GetBalancesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "BalanceResponse"));
        oper.setReturnClass( BalanceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getBalancesContractHistReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getEligebilityTemplate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getEligebilityTemplateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CoIdRequest"), CoIdRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "EligibilityTemplateResponse"));
        oper.setReturnClass( EligibilityTemplateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getEligebilityTemplateReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDifferentsServiceTemplate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getDifferentsServiceTemplateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "DifferentServiceTemplateRequest"), DifferentServiceTemplateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "DifferentServiceTemplateResponse"));
        oper.setReturnClass( DifferentServiceTemplateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getDifferentsServiceTemplateReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("activateOnHoldService");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "coIdRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CoIdRequest"), CoIdRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "OperationResponse"));
        oper.setReturnClass( OperationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "activateOnHoldServiceReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("insertBalanceHist");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "insertBalanceHistRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "BalanceHistRequest"), BalanceHistRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "OperationResponse"));
        oper.setReturnClass( OperationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "insertBalanceHistReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMigrationInterval");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getMigrationIntervalRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetMigrationIntervalRequest"), GetMigrationIntervalRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetMigrationIntervalResponse"));
        oper.setReturnClass( GetMigrationIntervalResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "getMigrationIntervalReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("insertFafNumberHist");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "apcFafNumberHistRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ApcFafNumberHistRequest"), ApcFafNumberHistRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "OperationResponse"));
        oper.setReturnClass( OperationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "insertFafNumberHistReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"),
                      "com.lhs.ws.services.alu.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[43] = oper;

    }

    public APCHandlingSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public APCHandlingSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public APCHandlingSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ActivateServiceParamter");
            cachedSerQNames.add(qName);
            cls = ActivateServiceParamter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ActivateServiceParamterResponse");
            cachedSerQNames.add(qName);
            cls = ActivateServiceParamterResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "AddCugRequest");
            cachedSerQNames.add(qName);
            cls = AddCugRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "AddTicklerRequest");
            cachedSerQNames.add(qName);
            cls = AddTicklerRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "AddTicklerResponse");
            cachedSerQNames.add(qName);
            cls = AddTicklerResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ApcCugHistRequest");
            cachedSerQNames.add(qName);
            cls = ApcCugHistRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ApcFafNumberHistRequest");
            cachedSerQNames.add(qName);
            cls = ApcFafNumberHistRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ArrayOf_tns2_CugMembershipsBeanOut");
            cachedSerQNames.add(qName);
            cls = CugMembershipsBeanOut[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://services.contract_services_read.v2.beans.ws.lhs.com", "CugMembershipsBeanOut");
            qName2 = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ArrayOf_tns3_BasicservicegroupassigmentsBeanOut");
            cachedSerQNames.add(qName);
            cls = BasicserviceBeanOut[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://cug_memberships.services.contract_services_read.v2.beans.ws.lhs.com", "BasicservicegroupassigmentsBeanOut");
            qName2 = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ArrayOf_tns4_NumParamsBeanOut");
            cachedSerQNames.add(qName);
            cls = NumParamsBeanOut[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://contract_service_cug_parameters_read.v2.beans.ws.lhs.com", "NumParamsBeanOut");
            qName2 = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ArrayOf_tns5_MultValuesBeanOut");
            cachedSerQNames.add(qName);
            cls = MultValuesBeanOut[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://num_params.contract_service_cug_parameters_read.v2.beans.ws.lhs.com", "MultValuesBeanOut");
            qName2 = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ArrayOf_xsd_long");
            cachedSerQNames.add(qName);
            cls = long[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long");
            qName2 = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ArrayOfBalance");
            cachedSerQNames.add(qName);
            cls = Balance[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "Balance");
            qName2 = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ArrayOfContractBean");
            cachedSerQNames.add(qName);
            cls = ContractBean[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ContractBean");
            qName2 = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ArrayOfCUGBean");
            cachedSerQNames.add(qName);
            cls = CUGBean[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CUGBean");
            qName2 = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ArrayOfGetContractListForCustomerBean");
            cachedSerQNames.add(qName);
            cls = GetContractListForCustomerBean[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetContractListForCustomerBean");
            qName2 = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ArrayOfGetCustomerStatisticsBean");
            cachedSerQNames.add(qName);
            cls = GetCustomerStatisticsBean[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetCustomerStatisticsBean");
            qName2 = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ArrayOfParameter");
            cachedSerQNames.add(qName);
            cls = Parameter[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "Parameter");
            qName2 = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ArrayOfRateplan");
            cachedSerQNames.add(qName);
            cls = Rateplan[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "Rateplan");
            qName2 = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ArrayOfService");
            cachedSerQNames.add(qName);
            cls = Service[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "Service");
            qName2 = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ArrayOfTemplate");
            cachedSerQNames.add(qName);
            cls = Template[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "Template");
            qName2 = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "Balance");
            cachedSerQNames.add(qName);
            cls = Balance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "BalanceHistRequest");
            cachedSerQNames.add(qName);
            cls = BalanceHistRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "BalanceResponse");
            cachedSerQNames.add(qName);
            cls = BalanceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "BaseSOIBean");
            cachedSerQNames.add(qName);
            cls = BaseSOIBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CalculateAccelerationRequest");
            cachedSerQNames.add(qName);
            cls = CalculateAccelerationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CalculateAccelerationResponse");
            cachedSerQNames.add(qName);
            cls = CalculateAccelerationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ChangeRatePlanRequest");
            cachedSerQNames.add(qName);
            cls = ChangeRatePlanRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ChangeRatePlanResponse");
            cachedSerQNames.add(qName);
            cls = ChangeRatePlanResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CheckRateplanRequest");
            cachedSerQNames.add(qName);
            cls = CheckRateplanRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CheckRateplanResponse");
            cachedSerQNames.add(qName);
            cls = CheckRateplanResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CoIdRequest");
            cachedSerQNames.add(qName);
            cls = CoIdRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ContractBean");
            cachedSerQNames.add(qName);
            cls = ContractBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CreateContractRequest");
            cachedSerQNames.add(qName);
            cls = CreateContractRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CreateContractResponse");
            cachedSerQNames.add(qName);
            cls = CreateContractResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CUGBean");
            cachedSerQNames.add(qName);
            cls = CUGBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CustomerRequest");
            cachedSerQNames.add(qName);
            cls = CustomerRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "DateBean");
            cachedSerQNames.add(qName);
            cls = DateBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "DesactivateServicesRequest");
            cachedSerQNames.add(qName);
            cls = DesactivateServicesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "DesactivateServicesResponse");
            cachedSerQNames.add(qName);
            cls = DesactivateServicesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "DifferentServiceTemplateRequest");
            cachedSerQNames.add(qName);
            cls = DifferentServiceTemplateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "DifferentServiceTemplateResponse");
            cachedSerQNames.add(qName);
            cls = DifferentServiceTemplateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "EligibilityTemplateResponse");
            cachedSerQNames.add(qName);
            cls = EligibilityTemplateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetBalancesRequest");
            cachedSerQNames.add(qName);
            cls = GetBalancesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetCategoryRequest");
            cachedSerQNames.add(qName);
            cls = GetCategoryRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetCategoryResponse");
            cachedSerQNames.add(qName);
            cls = GetCategoryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetCoIdRequest");
            cachedSerQNames.add(qName);
            cls = GetCoIdRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetConfigBalanceRequest");
            cachedSerQNames.add(qName);
            cls = GetConfigBalanceRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetConfigBalanceResponse");
            cachedSerQNames.add(qName);
            cls = GetConfigBalanceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetContractFromMsisdnResponse");
            cachedSerQNames.add(qName);
            cls = GetContractFromMsisdnResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetContractListForCustomerBean");
            cachedSerQNames.add(qName);
            cls = GetContractListForCustomerBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetContractListForCustomerRequest");
            cachedSerQNames.add(qName);
            cls = GetContractListForCustomerRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetContractListForCustomerResponse");
            cachedSerQNames.add(qName);
            cls = GetContractListForCustomerResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetCUGResponse");
            cachedSerQNames.add(qName);
            cls = GetCUGResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetCustomerStatisticsBean");
            cachedSerQNames.add(qName);
            cls = GetCustomerStatisticsBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetCustomerStatisticsResponse");
            cachedSerQNames.add(qName);
            cls = GetCustomerStatisticsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetDateFactureResponse");
            cachedSerQNames.add(qName);
            cls = GetDateFactureResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetEligebilityResponse");
            cachedSerQNames.add(qName);
            cls = GetEligebilityResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetEngagementStatusResponse");
            cachedSerQNames.add(qName);
            cls = GetEngagementStatusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetListTemplateRequest");
            cachedSerQNames.add(qName);
            cls = GetListTemplateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetListTemplateRequestResponse");
            cachedSerQNames.add(qName);
            cls = GetListTemplateRequestResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetMigrationIntervalRequest");
            cachedSerQNames.add(qName);
            cls = GetMigrationIntervalRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetMigrationIntervalResponse");
            cachedSerQNames.add(qName);
            cls = GetMigrationIntervalResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetMigrationRequest");
            cachedSerQNames.add(qName);
            cls = GetMigrationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetMigrationTypeResponse");
            cachedSerQNames.add(qName);
            cls = GetMigrationTypeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetMsisdnFromCoIdResponse");
            cachedSerQNames.add(qName);
            cls = GetMsisdnFromCoIdResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetOffreRequest");
            cachedSerQNames.add(qName);
            cls = GetOffreRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetOffreResponse");
            cachedSerQNames.add(qName);
            cls = GetOffreResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetOptionalServicesResponse");
            cachedSerQNames.add(qName);
            cls = GetOptionalServicesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetServiceRequest");
            cachedSerQNames.add(qName);
            cls = GetServiceRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetTypeRequest");
            cachedSerQNames.add(qName);
            cls = GetTypeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetTypeResponse");
            cachedSerQNames.add(qName);
            cls = GetTypeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "HasPendingRequestResponse");
            cachedSerQNames.add(qName);
            cls = HasPendingRequestResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "MoneyBean");
            cachedSerQNames.add(qName);
            cls = MoneyBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "MontantFactureResponse");
            cachedSerQNames.add(qName);
            cls = MontantFactureResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "NbreMigrationResponse");
            cachedSerQNames.add(qName);
            cls = NbreMigrationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "OCCRequest");
            cachedSerQNames.add(qName);
            cls = OCCRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "OCCResponse");
            cachedSerQNames.add(qName);
            cls = OCCResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "OperationDateRequest");
            cachedSerQNames.add(qName);
            cls = OperationDateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "OperationDateResponse");
            cachedSerQNames.add(qName);
            cls = OperationDateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "OperationResponse");
            cachedSerQNames.add(qName);
            cls = OperationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "Parameter");
            cachedSerQNames.add(qName);
            cls = Parameter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "PrixMigrationResponse");
            cachedSerQNames.add(qName);
            cls = PrixMigrationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ProrateResponse");
            cachedSerQNames.add(qName);
            cls = ProrateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "Rateplan");
            cachedSerQNames.add(qName);
            cls = Rateplan.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "Service");
            cachedSerQNames.add(qName);
            cls = Service.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "Template");
            cachedSerQNames.add(qName);
            cls = Template.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UnexpectedErrorFault");
            cachedSerQNames.add(qName);
            cls = UnexpectedErrorFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UpdateAdvChargeRequest");
            cachedSerQNames.add(qName);
            cls = UpdateAdvChargeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UserGroupRequest");
            cachedSerQNames.add(qName);
            cls = UserGroupRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UserGroupResponse");
            cachedSerQNames.add(qName);
            cls = UserGroupResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UserHasRightRequest");
            cachedSerQNames.add(qName);
            cls = UserHasRightRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UserHasRightResponse");
            cachedSerQNames.add(qName);
            cls = UserHasRightResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://contract_service_cug_parameters_read.v2.beans.ws.lhs.com", "NumParamsBeanOut");
            cachedSerQNames.add(qName);
            cls = NumParamsBeanOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://cug_memberships.services.contract_services_read.v2.beans.ws.lhs.com", "BasicservicegroupassigmentsBeanOut");
            cachedSerQNames.add(qName);
            cls = BasicserviceBeanOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://num_params.contract_service_cug_parameters_read.v2.beans.ws.lhs.com", "MultValuesBeanOut");
            cachedSerQNames.add(qName);
            cls = MultValuesBeanOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.contract_services_read.v2.beans.ws.lhs.com", "CugMembershipsBeanOut");
            cachedSerQNames.add(qName);
            cls = CugMembershipsBeanOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                String key = (String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        Class cls = (Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            Class sf = (Class)
                                 cachedSerFactories.get(i);
                            Class df = (Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public GetTypeResponse getType(GetTypeRequest getTypeRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getType"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {getTypeRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (GetTypeResponse) _resp;
            } catch (Exception _exception) {
                return (GetTypeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, GetTypeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UnexpectedErrorFault ) {
              throw (UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public ChangeRatePlanResponse changeRateplan(ChangeRatePlanRequest changeRatePlanRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "changeRateplan"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {changeRatePlanRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ChangeRatePlanResponse) _resp;
            } catch (Exception _exception) {
                return (ChangeRatePlanResponse) org.apache.axis.utils.JavaUtils.convert(_resp, ChangeRatePlanResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UnexpectedErrorFault ) {
              throw (UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public GetCUGResponse getCUG(CoIdRequest getCUGRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getCUG"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {getCUGRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (GetCUGResponse) _resp;
            } catch (Exception _exception) {
                return (GetCUGResponse) org.apache.axis.utils.JavaUtils.convert(_resp, GetCUGResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UnexpectedErrorFault ) {
              throw (UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public ProrateResponse calculateProrata(CoIdRequest calculateProrataRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "calculateProrata"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {calculateProrataRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ProrateResponse) _resp;
            } catch (Exception _exception) {
                return (ProrateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, ProrateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UnexpectedErrorFault ) {
              throw (UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public GetCategoryResponse getCatMigration(GetCategoryRequest getCatMigrationRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getCatMigration"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {getCatMigrationRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (GetCategoryResponse) _resp;
            } catch (Exception _exception) {
                return (GetCategoryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, GetCategoryResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UnexpectedErrorFault ) {
              throw (UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public PrixMigrationResponse getMigrationPrix(GetMigrationRequest getMigrationPrixRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getMigrationPrix"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {getMigrationPrixRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (PrixMigrationResponse) _resp;
            } catch (Exception _exception) {
                return (PrixMigrationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, PrixMigrationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UnexpectedErrorFault ) {
              throw (UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public GetEligebilityResponse getEligebility(CoIdRequest getEligebilityRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getEligebility"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {getEligebilityRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (GetEligebilityResponse) _resp;
            } catch (Exception _exception) {
                return (GetEligebilityResponse) org.apache.axis.utils.JavaUtils.convert(_resp, GetEligebilityResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UnexpectedErrorFault ) {
              throw (UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public NbreMigrationResponse getNbreMigration(CoIdRequest getNbreMigrationRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getNbreMigration"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {getNbreMigrationRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (NbreMigrationResponse) _resp;
            } catch (Exception _exception) {
                return (NbreMigrationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, NbreMigrationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UnexpectedErrorFault ) {
              throw (UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public GetMigrationTypeResponse getMigrationtype(GetMigrationRequest getMigrationTypeRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getMigrationtype"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {getMigrationTypeRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (GetMigrationTypeResponse) _resp;
            } catch (Exception _exception) {
                return (GetMigrationTypeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, GetMigrationTypeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UnexpectedErrorFault ) {
              throw (UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public CheckRateplanResponse checkRateplan(CheckRateplanRequest checkRateplanRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "checkRateplan"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {checkRateplanRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (CheckRateplanResponse) _resp;
            } catch (Exception _exception) {
                return (CheckRateplanResponse) org.apache.axis.utils.JavaUtils.convert(_resp, CheckRateplanResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UnexpectedErrorFault ) {
              throw (UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public OCCResponse setOCC(OCCRequest setOCCRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "setOCC"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {setOCCRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (OCCResponse) _resp;
            } catch (Exception _exception) {
                return (OCCResponse) org.apache.axis.utils.JavaUtils.convert(_resp, OCCResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UnexpectedErrorFault ) {
              throw (UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public GetOffreResponse getOffreSource(GetOffreRequest getOffreSourceRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getOffreSource"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {getOffreSourceRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (GetOffreResponse) _resp;
            } catch (Exception _exception) {
                return (GetOffreResponse) org.apache.axis.utils.JavaUtils.convert(_resp, GetOffreResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UnexpectedErrorFault ) {
              throw (UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public AddTicklerResponse addTickler(AddTicklerRequest addTicklerRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "addTickler"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {addTicklerRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (AddTicklerResponse) _resp;
            } catch (Exception _exception) {
                return (AddTicklerResponse) org.apache.axis.utils.JavaUtils.convert(_resp, AddTicklerResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UnexpectedErrorFault ) {
              throw (UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public UserHasRightResponse userHasRight(UserHasRightRequest userHasRightRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "userHasRight"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {userHasRightRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (UserHasRightResponse) _resp;
            } catch (Exception _exception) {
                return (UserHasRightResponse) org.apache.axis.utils.JavaUtils.convert(_resp, UserHasRightResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UnexpectedErrorFault ) {
              throw (UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public UserGroupResponse userGroup(UserGroupRequest userGroupRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "userGroup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {userGroupRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (UserGroupResponse) _resp;
            } catch (Exception _exception) {
                return (UserGroupResponse) org.apache.axis.utils.JavaUtils.convert(_resp, UserGroupResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UnexpectedErrorFault ) {
              throw (UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public OperationResponse activateContract(CoIdRequest activateContractRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "activateContract"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {activateContractRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (OperationResponse) _resp;
            } catch (Exception _exception) {
                return (OperationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, OperationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UnexpectedErrorFault ) {
              throw (UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public CreateContractResponse createContract(CreateContractRequest createContractRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "createContract"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {createContractRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (CreateContractResponse) _resp;
            } catch (Exception _exception) {
                return (CreateContractResponse) org.apache.axis.utils.JavaUtils.convert(_resp, CreateContractResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UnexpectedErrorFault ) {
              throw (UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public GetDateFactureResponse getDateFacture(CustomerRequest getDateFactureRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getDateFacture"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {getDateFactureRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (GetDateFactureResponse) _resp;
            } catch (Exception _exception) {
                return (GetDateFactureResponse) org.apache.axis.utils.JavaUtils.convert(_resp, GetDateFactureResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UnexpectedErrorFault ) {
              throw (UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public OperationResponse updateAdvCharge(UpdateAdvChargeRequest updateAdvChargeRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "updateAdvCharge"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {updateAdvChargeRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (OperationResponse) _resp;
            } catch (Exception _exception) {
                return (OperationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, OperationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UnexpectedErrorFault ) {
              throw (UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public GetConfigBalanceResponse getconfigBalance(GetConfigBalanceRequest getconfigBalanceRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getconfigBalance"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {getconfigBalanceRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (GetConfigBalanceResponse) _resp;
            } catch (Exception _exception) {
                return (GetConfigBalanceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, GetConfigBalanceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UnexpectedErrorFault ) {
              throw (UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public OperationResponse addCugContract(AddCugRequest addCugRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "addCugContract"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {addCugRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (OperationResponse) _resp;
            } catch (Exception _exception) {
                return (OperationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, OperationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UnexpectedErrorFault ) {
              throw (UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public GetListTemplateRequestResponse getListTemplate(GetListTemplateRequest getListTemplateRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getListTemplate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {getListTemplateRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (GetListTemplateRequestResponse) _resp;
            } catch (Exception _exception) {
                return (GetListTemplateRequestResponse) org.apache.axis.utils.JavaUtils.convert(_resp, GetListTemplateRequestResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UnexpectedErrorFault ) {
              throw (UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public OperationResponse insertApcCugHist(ApcCugHistRequest apcCugHistRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "insertApcCugHist"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {apcCugHistRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (OperationResponse) _resp;
            } catch (Exception _exception) {
                return (OperationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, OperationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UnexpectedErrorFault ) {
              throw (UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public CalculateAccelerationResponse calculateAcceleration(CalculateAccelerationRequest calculateAccelerationRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "calculateAcceleration"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {calculateAccelerationRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (CalculateAccelerationResponse) _resp;
            } catch (Exception _exception) {
                return (CalculateAccelerationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, CalculateAccelerationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UnexpectedErrorFault ) {
              throw (UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public GetCategoryResponse getMigrationCategory(GetCategoryRequest getMigrationCategoryRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getMigrationCategory"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {getMigrationCategoryRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (GetCategoryResponse) _resp;
            } catch (Exception _exception) {
                return (GetCategoryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, GetCategoryResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UnexpectedErrorFault ) {
              throw (UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public OperationDateResponse updateOperationDate(OperationDateRequest updateOperationDateRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "updateOperationDate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {updateOperationDateRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (OperationDateResponse) _resp;
            } catch (Exception _exception) {
                return (OperationDateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, OperationDateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UnexpectedErrorFault ) {
              throw (UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public GetOptionalServicesResponse getOptionalServices(GetServiceRequest getOptionalServicesRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getOptionalServices"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {getOptionalServicesRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (GetOptionalServicesResponse) _resp;
            } catch (Exception _exception) {
                return (GetOptionalServicesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, GetOptionalServicesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UnexpectedErrorFault ) {
              throw (UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public HasPendingRequestResponse hasPendingRequest(CoIdRequest hasPendingrequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "hasPendingRequest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {hasPendingrequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (HasPendingRequestResponse) _resp;
            } catch (Exception _exception) {
                return (HasPendingRequestResponse) org.apache.axis.utils.JavaUtils.convert(_resp, HasPendingRequestResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UnexpectedErrorFault ) {
              throw (UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public GetMsisdnFromCoIdResponse getMsisdnFromCoId(CoIdRequest getMsisdnFromCoIdRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getMsisdnFromCoId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {getMsisdnFromCoIdRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (GetMsisdnFromCoIdResponse) _resp;
            } catch (Exception _exception) {
                return (GetMsisdnFromCoIdResponse) org.apache.axis.utils.JavaUtils.convert(_resp, GetMsisdnFromCoIdResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UnexpectedErrorFault ) {
              throw (UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public DesactivateServicesResponse desactivateServices(DesactivateServicesRequest desactivateServicesRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "desactivateServices"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {desactivateServicesRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DesactivateServicesResponse) _resp;
            } catch (Exception _exception) {
                return (DesactivateServicesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DesactivateServicesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UnexpectedErrorFault ) {
              throw (UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public GetCustomerStatisticsResponse getCustomerStatistics(CustomerRequest getCustomerStatisticsRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getCustomerStatistics"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {getCustomerStatisticsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (GetCustomerStatisticsResponse) _resp;
            } catch (Exception _exception) {
                return (GetCustomerStatisticsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, GetCustomerStatisticsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UnexpectedErrorFault ) {
              throw (UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public OperationResponse desactivateContract(CoIdRequest desactivateContractRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "desactivateContract"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {desactivateContractRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (OperationResponse) _resp;
            } catch (Exception _exception) {
                return (OperationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, OperationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UnexpectedErrorFault ) {
              throw (UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public GetContractListForCustomerResponse getContractListForCustomer(GetContractListForCustomerRequest getContractListeForCustomerRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getContractListForCustomer"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {getContractListeForCustomerRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (GetContractListForCustomerResponse) _resp;
            } catch (Exception _exception) {
                return (GetContractListForCustomerResponse) org.apache.axis.utils.JavaUtils.convert(_resp, GetContractListForCustomerResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UnexpectedErrorFault ) {
              throw (UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public ActivateServiceParamterResponse activateAndSetParameterServices(ActivateServiceParamter activateAndSetParameterServicesRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "activateAndSetParameterServices"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {activateAndSetParameterServicesRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ActivateServiceParamterResponse) _resp;
            } catch (Exception _exception) {
                return (ActivateServiceParamterResponse) org.apache.axis.utils.JavaUtils.convert(_resp, ActivateServiceParamterResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UnexpectedErrorFault ) {
              throw (UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public MontantFactureResponse getMontantFacture(CustomerRequest getMontantFactureRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getMontantFacture"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {getMontantFactureRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (MontantFactureResponse) _resp;
            } catch (Exception _exception) {
                return (MontantFactureResponse) org.apache.axis.utils.JavaUtils.convert(_resp, MontantFactureResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UnexpectedErrorFault ) {
              throw (UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public GetContractFromMsisdnResponse getContractFromMsisdn(GetCoIdRequest getContractFromMsisdnRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getContractFromMsisdn"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {getContractFromMsisdnRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (GetContractFromMsisdnResponse) _resp;
            } catch (Exception _exception) {
                return (GetContractFromMsisdnResponse) org.apache.axis.utils.JavaUtils.convert(_resp, GetContractFromMsisdnResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UnexpectedErrorFault ) {
              throw (UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public GetEngagementStatusResponse getEngagementStatus(CoIdRequest getEngagementStatusRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getEngagementStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {getEngagementStatusRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (GetEngagementStatusResponse) _resp;
            } catch (Exception _exception) {
                return (GetEngagementStatusResponse) org.apache.axis.utils.JavaUtils.convert(_resp, GetEngagementStatusResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UnexpectedErrorFault ) {
              throw (UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public BalanceResponse getBalancesContractHist(GetBalancesRequest getBalancesRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getBalancesContractHist"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {getBalancesRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (BalanceResponse) _resp;
            } catch (Exception _exception) {
                return (BalanceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, BalanceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UnexpectedErrorFault ) {
              throw (UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public EligibilityTemplateResponse getEligebilityTemplate(CoIdRequest getEligebilityTemplateRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getEligebilityTemplate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {getEligebilityTemplateRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (EligibilityTemplateResponse) _resp;
            } catch (Exception _exception) {
                return (EligibilityTemplateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, EligibilityTemplateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UnexpectedErrorFault ) {
              throw (UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public DifferentServiceTemplateResponse getDifferentsServiceTemplate(DifferentServiceTemplateRequest getDifferentsServiceTemplateRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getDifferentsServiceTemplate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {getDifferentsServiceTemplateRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DifferentServiceTemplateResponse) _resp;
            } catch (Exception _exception) {
                return (DifferentServiceTemplateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DifferentServiceTemplateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UnexpectedErrorFault ) {
              throw (UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public OperationResponse activateOnHoldService(CoIdRequest coIdRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "activateOnHoldService"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {coIdRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (OperationResponse) _resp;
            } catch (Exception _exception) {
                return (OperationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, OperationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UnexpectedErrorFault ) {
              throw (UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public OperationResponse insertBalanceHist(BalanceHistRequest insertBalanceHistRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "insertBalanceHist"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {insertBalanceHistRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (OperationResponse) _resp;
            } catch (Exception _exception) {
                return (OperationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, OperationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UnexpectedErrorFault ) {
              throw (UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public GetMigrationIntervalResponse getMigrationInterval(GetMigrationIntervalRequest getMigrationIntervalRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getMigrationInterval"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {getMigrationIntervalRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (GetMigrationIntervalResponse) _resp;
            } catch (Exception _exception) {
                return (GetMigrationIntervalResponse) org.apache.axis.utils.JavaUtils.convert(_resp, GetMigrationIntervalResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UnexpectedErrorFault ) {
              throw (UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public OperationResponse insertFafNumberHist(ApcFafNumberHistRequest apcFafNumberHistRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "insertFafNumberHist"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {apcFafNumberHistRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (OperationResponse) _resp;
            } catch (Exception _exception) {
                return (OperationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, OperationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UnexpectedErrorFault ) {
              throw (UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
