package com.soap.client.ContractHandling;

public class ContractHandlingProxy implements ContractHandling {
  private String _endpoint = null;
  private ContractHandling contractHandling = null;
  
  public ContractHandlingProxy() {
    _initContractHandlingProxy();
  }
  
  public ContractHandlingProxy(String endpoint) {
    _endpoint = endpoint;
    _initContractHandlingProxy();
  }
  
  private void _initContractHandlingProxy() {
    try {
      contractHandling = (new ContractHandlingServiceLocator()).getContractHandling();
      if (contractHandling != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)contractHandling)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)contractHandling)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (contractHandling != null)
      ((javax.xml.rpc.Stub)contractHandling)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public ContractHandling getContractHandling() {
    if (contractHandling == null)
      _initContractHandlingProxy();
    return contractHandling;
  }
  
  public RetrieveServicesResponse retrieveServices(RetrieveServicesRequest retrieveServicesRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
    if (contractHandling == null)
      _initContractHandlingProxy();
    return contractHandling.retrieveServices(retrieveServicesRequest);
  }
  
  public EntityResponse takeOver(TakeOverRequest takeOverRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
    if (contractHandling == null)
      _initContractHandlingProxy();
    return contractHandling.takeOver(takeOverRequest);
  }
  
  public CallsHistoryResponse getCallsHistory(HistoryRequest callHistoryRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
    if (contractHandling == null)
      _initContractHandlingProxy();
    return contractHandling.getCallsHistory(callHistoryRequest);
  }
  
  public ContractListResponse getContractList(CustomerReference customer) throws java.rmi.RemoteException, UnexpectedErrorFault {
    if (contractHandling == null)
      _initContractHandlingProxy();
    return contractHandling.getContractList(customer);
  }
  
  public OperationResponse updateContract(UpdateContractRequest updateContractRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
    if (contractHandling == null)
      _initContractHandlingProxy();
    return contractHandling.updateContract(updateContractRequest);
  }
  
  public InvoicesResponse getInvoices(InvoicesRequest invoicesReq) throws java.rmi.RemoteException, UnexpectedErrorFault {
    if (contractHandling == null)
      _initContractHandlingProxy();
    return contractHandling.getInvoices(invoicesReq);
  }
  
  public OperationResponse moveContract(MoveContractRequest moveContractRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
    if (contractHandling == null)
      _initContractHandlingProxy();
    return contractHandling.moveContract(moveContractRequest);
  }
  
  public InfoConsoResponse getInfoConso(InfoConsoRequest infoConsoRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
    if (contractHandling == null)
      _initContractHandlingProxy();
    return contractHandling.getInfoConso(infoConsoRequest);
  }
  
  public InvoiceFileResponse getInvoiceFile(InvoiceFileRequest getInvoiceFileRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
    if (contractHandling == null)
      _initContractHandlingProxy();
    return contractHandling.getInvoiceFile(getInvoiceFileRequest);
  }
  
  public DetailedInvoicesResponse getDetailedInvoices(DetailedInvoicesRequest getDetailedInvoicesRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
    if (contractHandling == null)
      _initContractHandlingProxy();
    return contractHandling.getDetailedInvoices(getDetailedInvoicesRequest);
  }
  
  public DetInvoicesByInvResponse getDetInvoicesByInv(DetInvoicesByInvRequest detInvoicesByInvRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
    if (contractHandling == null)
      _initContractHandlingProxy();
    return contractHandling.getDetInvoicesByInv(detInvoicesByInvRequest);
  }
  
  public ConsoDataHistoryResponse getConsoDataHistory(HistoryRequest consoDataHistoryRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
    if (contractHandling == null)
      _initContractHandlingProxy();
    return contractHandling.getConsoDataHistory(consoDataHistoryRequest);
  }
  
  public DetailedInvoiceFileResponse getDetailedInvoiceFile(DetailedInvoiceFileRequest getDetailedInvoiceFileRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
    if (contractHandling == null)
      _initContractHandlingProxy();
    return contractHandling.getDetailedInvoiceFile(getDetailedInvoiceFileRequest);
  }
  
  public OperationResponse deactivateService(DeactivateServiceRequest request) throws java.rmi.RemoteException, UnexpectedErrorFault {
    if (contractHandling == null)
      _initContractHandlingProxy();
    return contractHandling.deactivateService(request);
  }
  
  public RechargeHistoryResponse getCreditRechargeHistory(HistoryRequest rechargeHistoryRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
    if (contractHandling == null)
      _initContractHandlingProxy();
    return contractHandling.getCreditRechargeHistory(rechargeHistoryRequest);
  }
  
  public ContractDetailsResponse getContractDetails(ContractReference contractReference) throws java.rmi.RemoteException, UnexpectedErrorFault {
    if (contractHandling == null)
      _initContractHandlingProxy();
    return contractHandling.getContractDetails(contractReference);
  }
  
  public CheckRateplanResponse checkRateplan(CheckRateplanRequest checkRateplanRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
    if (contractHandling == null)
      _initContractHandlingProxy();
    return contractHandling.checkRateplan(checkRateplanRequest);
  }
  
  public OperationResponse changeRateplan(ChangeRateplanRequest changeRateplanRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
    if (contractHandling == null)
      _initContractHandlingProxy();
    return contractHandling.changeRateplan(changeRateplanRequest);
  }
  
  
}