/**
 * ContractResourcesReplaceService_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soap.client.ws_v2;

public class ContractResourcesReplaceService_ServiceLocator extends org.apache.axis.client.Service implements ContractResourcesReplaceService_Service {

    public ContractResourcesReplaceService_ServiceLocator() {
    }


    public ContractResourcesReplaceService_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ContractResourcesReplaceService_ServiceLocator(String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ContractResourcesReplaceService
    private String ContractResourcesReplaceService_address = "http://192.168.1.11:8080/BscsWs/services/ContractResourcesReplace";

    public String getContractResourcesReplaceServiceAddress() {
        return ContractResourcesReplaceService_address;
    }

    // The WSDD service name defaults to the port name.
    private String ContractResourcesReplaceServiceWSDDServiceName = "ContractResourcesReplaceService";

    public String getContractResourcesReplaceServiceWSDDServiceName() {
        return ContractResourcesReplaceServiceWSDDServiceName;
    }

    public void setContractResourcesReplaceServiceWSDDServiceName(String name) {
        ContractResourcesReplaceServiceWSDDServiceName = name;
    }

    public ContractResourcesReplaceService_PortType getContractResourcesReplaceService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ContractResourcesReplaceService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getContractResourcesReplaceService(endpoint);
    }

    public ContractResourcesReplaceService_PortType getContractResourcesReplaceService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ContractResourcesReplaceServiceSoapBindingStub _stub = new ContractResourcesReplaceServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getContractResourcesReplaceServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setContractResourcesReplaceServiceEndpointAddress(String address) {
        ContractResourcesReplaceService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (ContractResourcesReplaceService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                ContractResourcesReplaceServiceSoapBindingStub _stub = new ContractResourcesReplaceServiceSoapBindingStub(new java.net.URL(ContractResourcesReplaceService_address), this);
                _stub.setPortName(getContractResourcesReplaceServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        String inputPortName = portName.getLocalPart();
        if ("ContractResourcesReplaceService".equals(inputPortName)) {
            return getContractResourcesReplaceService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "ContractResourcesReplaceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "ContractResourcesReplaceService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(String portName, String address) throws javax.xml.rpc.ServiceException {
        
if ("ContractResourcesReplaceService".equals(portName)) {
            setContractResourcesReplaceServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
