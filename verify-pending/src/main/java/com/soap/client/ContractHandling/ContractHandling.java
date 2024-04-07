/**
 * ContractHandling.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soap.client.ContractHandling;

public interface ContractHandling extends java.rmi.Remote {
    public RetrieveServicesResponse retrieveServices(RetrieveServicesRequest retrieveServicesRequest) throws java.rmi.RemoteException, UnexpectedErrorFault;
    public EntityResponse takeOver(TakeOverRequest takeOverRequest) throws java.rmi.RemoteException, UnexpectedErrorFault;
    public CallsHistoryResponse getCallsHistory(HistoryRequest callHistoryRequest) throws java.rmi.RemoteException, UnexpectedErrorFault;
    public ContractListResponse getContractList(CustomerReference customer) throws java.rmi.RemoteException, UnexpectedErrorFault;
    public OperationResponse updateContract(UpdateContractRequest updateContractRequest) throws java.rmi.RemoteException, UnexpectedErrorFault;
    public InvoicesResponse getInvoices(InvoicesRequest invoicesReq) throws java.rmi.RemoteException, UnexpectedErrorFault;
    public OperationResponse moveContract(MoveContractRequest moveContractRequest) throws java.rmi.RemoteException, UnexpectedErrorFault;
    public InfoConsoResponse getInfoConso(InfoConsoRequest infoConsoRequest) throws java.rmi.RemoteException, UnexpectedErrorFault;
    public InvoiceFileResponse getInvoiceFile(InvoiceFileRequest getInvoiceFileRequest) throws java.rmi.RemoteException, UnexpectedErrorFault;
    public DetailedInvoicesResponse getDetailedInvoices(DetailedInvoicesRequest getDetailedInvoicesRequest) throws java.rmi.RemoteException, UnexpectedErrorFault;
    public DetInvoicesByInvResponse getDetInvoicesByInv(DetInvoicesByInvRequest detInvoicesByInvRequest) throws java.rmi.RemoteException, UnexpectedErrorFault;
    public ConsoDataHistoryResponse getConsoDataHistory(HistoryRequest consoDataHistoryRequest) throws java.rmi.RemoteException, UnexpectedErrorFault;
    public DetailedInvoiceFileResponse getDetailedInvoiceFile(DetailedInvoiceFileRequest getDetailedInvoiceFileRequest) throws java.rmi.RemoteException, UnexpectedErrorFault;
    public OperationResponse deactivateService(DeactivateServiceRequest request) throws java.rmi.RemoteException, UnexpectedErrorFault;
    public RechargeHistoryResponse getCreditRechargeHistory(HistoryRequest rechargeHistoryRequest) throws java.rmi.RemoteException, UnexpectedErrorFault;
    public ContractDetailsResponse getContractDetails(ContractReference contractReference) throws java.rmi.RemoteException, UnexpectedErrorFault;
    public CheckRateplanResponse checkRateplan(CheckRateplanRequest checkRateplanRequest) throws java.rmi.RemoteException, UnexpectedErrorFault;
    public OperationResponse changeRateplan(ChangeRateplanRequest changeRateplanRequest) throws java.rmi.RemoteException, UnexpectedErrorFault;
}
