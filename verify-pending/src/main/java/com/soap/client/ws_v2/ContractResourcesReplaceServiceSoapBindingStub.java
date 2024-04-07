/**
 * ContractResourcesReplaceServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soap.client.ws_v2;

public class ContractResourcesReplaceServiceSoapBindingStub extends org.apache.axis.client.Stub implements ContractResourcesReplaceService_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[1];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("execute");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "in0"), In0.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "ContractResourcesReplaceBeanOut"));
        oper.setReturnClass(ContractResourcesReplaceBeanOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "executeReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "UnexpectedErrorFault"),
                      "com.lhsgroup.www.ws_v2.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[0] = oper;

    }

    public ContractResourcesReplaceServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ContractResourcesReplaceServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ContractResourcesReplaceServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "ArrayOfcom.lhs.ws.beans.v2.contract_resources_replace.DirectoryNumbersBeanIn");
            cachedSerQNames.add(qName);
            cls = ComLhsWsBeansV2Contract_resources_replaceDirectoryNumbersBeanIn[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "com.lhs.ws.beans.v2.contract_resources_replace.DirectoryNumbersBeanIn");
            qName2 = new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "ArrayOfcom.lhs.ws.beans.v2.contract_resources_replace.DirectoryNumbersBeanOut");
            cachedSerQNames.add(qName);
            cls = ComLhsWsBeansV2Contract_resources_replaceDirectoryNumbersBeanOut[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "com.lhs.ws.beans.v2.contract_resources_replace.DirectoryNumbersBeanOut");
            qName2 = new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "ArrayOfcom.lhs.ws.beans.v2.contract_resources_replace.PortsBeanIn");
            cachedSerQNames.add(qName);
            cls = ComLhsWsBeansV2Contract_resources_replacePortsBeanIn[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "com.lhs.ws.beans.v2.contract_resources_replace.PortsBeanIn");
            qName2 = new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "ArrayOfcom.lhs.ws.beans.v2.contract_resources_replace.PortsBeanOut");
            cachedSerQNames.add(qName);
            cls = ComLhsWsBeansV2Contract_resources_replacePortsBeanOut[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "com.lhs.ws.beans.v2.contract_resources_replace.PortsBeanOut");
            qName2 = new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "ArrayOfcom.lhs.ws.beans.v2.session_change.ValuesBeanIn");
            cachedSerQNames.add(qName);
            cls = ComLhsWsBeansV2Session_changeValuesBeanIn[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "com.lhs.ws.beans.v2.session_change.ValuesBeanIn");
            qName2 = new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "BaseSOIBean");
            cachedSerQNames.add(qName);
            cls = BaseSOIBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "com.lhs.ws.beans.v2.contract_resources_replace.DirectoryNumbersBeanIn");
            cachedSerQNames.add(qName);
            cls = ComLhsWsBeansV2Contract_resources_replaceDirectoryNumbersBeanIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "com.lhs.ws.beans.v2.contract_resources_replace.DirectoryNumbersBeanOut");
            cachedSerQNames.add(qName);
            cls = ComLhsWsBeansV2Contract_resources_replaceDirectoryNumbersBeanOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "com.lhs.ws.beans.v2.contract_resources_replace.PortsBeanIn");
            cachedSerQNames.add(qName);
            cls = ComLhsWsBeansV2Contract_resources_replacePortsBeanIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "com.lhs.ws.beans.v2.contract_resources_replace.PortsBeanOut");
            cachedSerQNames.add(qName);
            cls = ComLhsWsBeansV2Contract_resources_replacePortsBeanOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "com.lhs.ws.beans.v2.session_change.ValuesBeanIn");
            cachedSerQNames.add(qName);
            cls = ComLhsWsBeansV2Session_changeValuesBeanIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "ContractResourcesReplaceBeanIn");
            cachedSerQNames.add(qName);
            cls = ContractResourcesReplaceBeanIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "ContractResourcesReplaceBeanOut");
            cachedSerQNames.add(qName);
            cls = ContractResourcesReplaceBeanOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "DateTimeBean");
            cachedSerQNames.add(qName);
            cls = DateTimeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "in0");
            cachedSerQNames.add(qName);
            cls = In0.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "SessionChangeBeanIn");
            cachedSerQNames.add(qName);
            cls = SessionChangeBeanIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "UnexpectedErrorFault");
            cachedSerQNames.add(qName);
            cls = UnexpectedErrorFault.class;
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

    public ContractResourcesReplaceBeanOut execute(In0 in0) throws java.rmi.RemoteException, UnexpectedErrorFault {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "execute"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ContractResourcesReplaceBeanOut) _resp;
            } catch (Exception _exception) {
                return (ContractResourcesReplaceBeanOut) org.apache.axis.utils.JavaUtils.convert(_resp, ContractResourcesReplaceBeanOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UnexpectedErrorFault) {
              throw (UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
