package com.soap.client.alu;

public class APCHandlingProxy implements APCHandling {
  private String _endpoint = null;
  private APCHandling aPCHandling = null;
  
  public APCHandlingProxy() {
    _initAPCHandlingProxy();
  }
  
  public APCHandlingProxy(String endpoint) {
    _endpoint = endpoint;
    _initAPCHandlingProxy();
  }
  
  private void _initAPCHandlingProxy() {
    try {
      aPCHandling = (new APCHandlingServiceLocator()).getAPCHandling();
      if (aPCHandling != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)aPCHandling)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)aPCHandling)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (aPCHandling != null)
      ((javax.xml.rpc.Stub)aPCHandling)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public APCHandling getAPCHandling() {
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling;
  }
  
  public GetTypeResponse getType(GetTypeRequest getTypeRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.getType(getTypeRequest);
  }
  
  public ChangeRatePlanResponse changeRateplan(ChangeRatePlanRequest changeRatePlanRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.changeRateplan(changeRatePlanRequest);
  }
  
  public GetCUGResponse getCUG(CoIdRequest getCUGRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.getCUG(getCUGRequest);
  }
  
  public ProrateResponse calculateProrata(CoIdRequest calculateProrataRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.calculateProrata(calculateProrataRequest);
  }
  
  public GetCategoryResponse getCatMigration(GetCategoryRequest getCatMigrationRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.getCatMigration(getCatMigrationRequest);
  }
  
  public PrixMigrationResponse getMigrationPrix(GetMigrationRequest getMigrationPrixRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.getMigrationPrix(getMigrationPrixRequest);
  }
  
  public GetEligebilityResponse getEligebility(CoIdRequest getEligebilityRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.getEligebility(getEligebilityRequest);
  }
  
  public NbreMigrationResponse getNbreMigration(CoIdRequest getNbreMigrationRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.getNbreMigration(getNbreMigrationRequest);
  }
  
  public GetMigrationTypeResponse getMigrationtype(GetMigrationRequest getMigrationTypeRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.getMigrationtype(getMigrationTypeRequest);
  }
  
  public CheckRateplanResponse checkRateplan(CheckRateplanRequest checkRateplanRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.checkRateplan(checkRateplanRequest);
  }
  
  public OCCResponse setOCC(OCCRequest setOCCRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.setOCC(setOCCRequest);
  }
  
  public GetOffreResponse getOffreSource(GetOffreRequest getOffreSourceRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.getOffreSource(getOffreSourceRequest);
  }
  
  public AddTicklerResponse addTickler(AddTicklerRequest addTicklerRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.addTickler(addTicklerRequest);
  }
  
  public UserHasRightResponse userHasRight(UserHasRightRequest userHasRightRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.userHasRight(userHasRightRequest);
  }
  
  public UserGroupResponse userGroup(UserGroupRequest userGroupRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.userGroup(userGroupRequest);
  }
  
  public OperationResponse activateContract(CoIdRequest activateContractRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.activateContract(activateContractRequest);
  }
  
  public CreateContractResponse createContract(CreateContractRequest createContractRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.createContract(createContractRequest);
  }
  
  public GetDateFactureResponse getDateFacture(CustomerRequest getDateFactureRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.getDateFacture(getDateFactureRequest);
  }
  
  public OperationResponse updateAdvCharge(UpdateAdvChargeRequest updateAdvChargeRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.updateAdvCharge(updateAdvChargeRequest);
  }
  
  public GetConfigBalanceResponse getconfigBalance(GetConfigBalanceRequest getconfigBalanceRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.getconfigBalance(getconfigBalanceRequest);
  }
  
  public OperationResponse addCugContract(AddCugRequest addCugRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.addCugContract(addCugRequest);
  }
  
  public GetListTemplateRequestResponse getListTemplate(GetListTemplateRequest getListTemplateRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.getListTemplate(getListTemplateRequest);
  }
  
  public OperationResponse insertApcCugHist(ApcCugHistRequest apcCugHistRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.insertApcCugHist(apcCugHistRequest);
  }
  
  public CalculateAccelerationResponse calculateAcceleration(CalculateAccelerationRequest calculateAccelerationRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.calculateAcceleration(calculateAccelerationRequest);
  }
  
  public GetCategoryResponse getMigrationCategory(GetCategoryRequest getMigrationCategoryRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.getMigrationCategory(getMigrationCategoryRequest);
  }
  
  public OperationDateResponse updateOperationDate(OperationDateRequest updateOperationDateRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.updateOperationDate(updateOperationDateRequest);
  }
  
  public GetOptionalServicesResponse getOptionalServices(GetServiceRequest getOptionalServicesRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.getOptionalServices(getOptionalServicesRequest);
  }
  
  public HasPendingRequestResponse hasPendingRequest(CoIdRequest hasPendingrequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.hasPendingRequest(hasPendingrequest);
  }
  
  public GetMsisdnFromCoIdResponse getMsisdnFromCoId(CoIdRequest getMsisdnFromCoIdRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.getMsisdnFromCoId(getMsisdnFromCoIdRequest);
  }
  
  public DesactivateServicesResponse desactivateServices(DesactivateServicesRequest desactivateServicesRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.desactivateServices(desactivateServicesRequest);
  }
  
  public GetCustomerStatisticsResponse getCustomerStatistics(CustomerRequest getCustomerStatisticsRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.getCustomerStatistics(getCustomerStatisticsRequest);
  }
  
  public OperationResponse desactivateContract(CoIdRequest desactivateContractRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.desactivateContract(desactivateContractRequest);
  }
  
  public GetContractListForCustomerResponse getContractListForCustomer(GetContractListForCustomerRequest getContractListeForCustomerRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.getContractListForCustomer(getContractListeForCustomerRequest);
  }
  
  public ActivateServiceParamterResponse activateAndSetParameterServices(ActivateServiceParamter activateAndSetParameterServicesRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.activateAndSetParameterServices(activateAndSetParameterServicesRequest);
  }
  
  public MontantFactureResponse getMontantFacture(CustomerRequest getMontantFactureRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.getMontantFacture(getMontantFactureRequest);
  }
  
  public GetContractFromMsisdnResponse getContractFromMsisdn(GetCoIdRequest getContractFromMsisdnRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.getContractFromMsisdn(getContractFromMsisdnRequest);
  }
  
  public GetEngagementStatusResponse getEngagementStatus(CoIdRequest getEngagementStatusRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.getEngagementStatus(getEngagementStatusRequest);
  }
  
  public BalanceResponse getBalancesContractHist(GetBalancesRequest getBalancesRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.getBalancesContractHist(getBalancesRequest);
  }
  
  public EligibilityTemplateResponse getEligebilityTemplate(CoIdRequest getEligebilityTemplateRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.getEligebilityTemplate(getEligebilityTemplateRequest);
  }
  
  public DifferentServiceTemplateResponse getDifferentsServiceTemplate(DifferentServiceTemplateRequest getDifferentsServiceTemplateRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.getDifferentsServiceTemplate(getDifferentsServiceTemplateRequest);
  }
  
  public OperationResponse activateOnHoldService(CoIdRequest coIdRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.activateOnHoldService(coIdRequest);
  }
  
  public OperationResponse insertBalanceHist(BalanceHistRequest insertBalanceHistRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.insertBalanceHist(insertBalanceHistRequest);
  }
  
  public GetMigrationIntervalResponse getMigrationInterval(GetMigrationIntervalRequest getMigrationIntervalRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.getMigrationInterval(getMigrationIntervalRequest);
  }
  
  public OperationResponse insertFafNumberHist(ApcFafNumberHistRequest apcFafNumberHistRequest) throws java.rmi.RemoteException, UnexpectedErrorFault {
    if (aPCHandling == null)
      _initAPCHandlingProxy();
    return aPCHandling.insertFafNumberHist(apcFafNumberHistRequest);
  }
  
  
}