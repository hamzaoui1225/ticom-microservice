package com.soap.client.ws_v2;

public class ContractResourcesReplaceServiceProxy implements ContractResourcesReplaceService_PortType {
  private String _endpoint = null;
  private ContractResourcesReplaceService_PortType contractResourcesReplaceService_PortType = null;
  
  public ContractResourcesReplaceServiceProxy() {
    _initContractResourcesReplaceServiceProxy();
  }
  
  public ContractResourcesReplaceServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initContractResourcesReplaceServiceProxy();
  }
  
  private void _initContractResourcesReplaceServiceProxy() {
    try {
      contractResourcesReplaceService_PortType = (new ContractResourcesReplaceService_ServiceLocator()).getContractResourcesReplaceService();
      if (contractResourcesReplaceService_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)contractResourcesReplaceService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)contractResourcesReplaceService_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (contractResourcesReplaceService_PortType != null)
      ((javax.xml.rpc.Stub)contractResourcesReplaceService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public ContractResourcesReplaceService_PortType getContractResourcesReplaceService_PortType() {
    if (contractResourcesReplaceService_PortType == null)
      _initContractResourcesReplaceServiceProxy();
    return contractResourcesReplaceService_PortType;
  }
  
  public ContractResourcesReplaceBeanOut execute(In0 in0) throws java.rmi.RemoteException, UnexpectedErrorFault {
    if (contractResourcesReplaceService_PortType == null)
      _initContractResourcesReplaceServiceProxy();
    return contractResourcesReplaceService_PortType.execute(in0);
  }
  
  
}