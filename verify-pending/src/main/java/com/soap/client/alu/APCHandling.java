/**
 * APCHandling.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soap.client.alu;

public interface APCHandling extends java.rmi.Remote {
    public GetTypeResponse getType(GetTypeRequest getTypeRequest) throws java.rmi.RemoteException, UnexpectedErrorFault;
    public ChangeRatePlanResponse changeRateplan(ChangeRatePlanRequest changeRatePlanRequest) throws java.rmi.RemoteException, UnexpectedErrorFault;
    public GetCUGResponse getCUG(CoIdRequest getCUGRequest) throws java.rmi.RemoteException, UnexpectedErrorFault;
    public ProrateResponse calculateProrata(CoIdRequest calculateProrataRequest) throws java.rmi.RemoteException, UnexpectedErrorFault;
    public GetCategoryResponse getCatMigration(GetCategoryRequest getCatMigrationRequest) throws java.rmi.RemoteException, UnexpectedErrorFault;
    public PrixMigrationResponse getMigrationPrix(GetMigrationRequest getMigrationPrixRequest) throws java.rmi.RemoteException, UnexpectedErrorFault;
    public GetEligebilityResponse getEligebility(CoIdRequest getEligebilityRequest) throws java.rmi.RemoteException, UnexpectedErrorFault;
    public NbreMigrationResponse getNbreMigration(CoIdRequest getNbreMigrationRequest) throws java.rmi.RemoteException, UnexpectedErrorFault;
    public GetMigrationTypeResponse getMigrationtype(GetMigrationRequest getMigrationTypeRequest) throws java.rmi.RemoteException, UnexpectedErrorFault;
    public CheckRateplanResponse checkRateplan(CheckRateplanRequest checkRateplanRequest) throws java.rmi.RemoteException, UnexpectedErrorFault;
    public OCCResponse setOCC(OCCRequest setOCCRequest) throws java.rmi.RemoteException, UnexpectedErrorFault;
    public GetOffreResponse getOffreSource(GetOffreRequest getOffreSourceRequest) throws java.rmi.RemoteException, UnexpectedErrorFault;
    public AddTicklerResponse addTickler(AddTicklerRequest addTicklerRequest) throws java.rmi.RemoteException, UnexpectedErrorFault;
    public UserHasRightResponse userHasRight(UserHasRightRequest userHasRightRequest) throws java.rmi.RemoteException, UnexpectedErrorFault;
    public UserGroupResponse userGroup(UserGroupRequest userGroupRequest) throws java.rmi.RemoteException, UnexpectedErrorFault;
    public OperationResponse activateContract(CoIdRequest activateContractRequest) throws java.rmi.RemoteException, UnexpectedErrorFault;
    public CreateContractResponse createContract(CreateContractRequest createContractRequest) throws java.rmi.RemoteException, UnexpectedErrorFault;
    public GetDateFactureResponse getDateFacture(CustomerRequest getDateFactureRequest) throws java.rmi.RemoteException, UnexpectedErrorFault;
    public OperationResponse updateAdvCharge(UpdateAdvChargeRequest updateAdvChargeRequest) throws java.rmi.RemoteException, UnexpectedErrorFault;
    public GetConfigBalanceResponse getconfigBalance(GetConfigBalanceRequest getconfigBalanceRequest) throws java.rmi.RemoteException, UnexpectedErrorFault;
    public OperationResponse addCugContract(AddCugRequest addCugRequest) throws java.rmi.RemoteException, UnexpectedErrorFault;
    public GetListTemplateRequestResponse getListTemplate(GetListTemplateRequest getListTemplateRequest) throws java.rmi.RemoteException, UnexpectedErrorFault;
    public OperationResponse insertApcCugHist(ApcCugHistRequest apcCugHistRequest) throws java.rmi.RemoteException, UnexpectedErrorFault;
    public CalculateAccelerationResponse calculateAcceleration(CalculateAccelerationRequest calculateAccelerationRequest) throws java.rmi.RemoteException, UnexpectedErrorFault;
    public GetCategoryResponse getMigrationCategory(GetCategoryRequest getMigrationCategoryRequest) throws java.rmi.RemoteException, UnexpectedErrorFault;
    public OperationDateResponse updateOperationDate(OperationDateRequest updateOperationDateRequest) throws java.rmi.RemoteException, UnexpectedErrorFault;
    public GetOptionalServicesResponse getOptionalServices(GetServiceRequest getOptionalServicesRequest) throws java.rmi.RemoteException, UnexpectedErrorFault;
    public HasPendingRequestResponse hasPendingRequest(CoIdRequest hasPendingrequest) throws java.rmi.RemoteException, UnexpectedErrorFault;
    public GetMsisdnFromCoIdResponse getMsisdnFromCoId(CoIdRequest getMsisdnFromCoIdRequest) throws java.rmi.RemoteException, UnexpectedErrorFault;
    public DesactivateServicesResponse desactivateServices(DesactivateServicesRequest desactivateServicesRequest) throws java.rmi.RemoteException, UnexpectedErrorFault;
    public GetCustomerStatisticsResponse getCustomerStatistics(CustomerRequest getCustomerStatisticsRequest) throws java.rmi.RemoteException, UnexpectedErrorFault;
    public OperationResponse desactivateContract(CoIdRequest desactivateContractRequest) throws java.rmi.RemoteException, UnexpectedErrorFault;
    public GetContractListForCustomerResponse getContractListForCustomer(GetContractListForCustomerRequest getContractListeForCustomerRequest) throws java.rmi.RemoteException, UnexpectedErrorFault;
    public ActivateServiceParamterResponse activateAndSetParameterServices(ActivateServiceParamter activateAndSetParameterServicesRequest) throws java.rmi.RemoteException, UnexpectedErrorFault;
    public MontantFactureResponse getMontantFacture(CustomerRequest getMontantFactureRequest) throws java.rmi.RemoteException, UnexpectedErrorFault;
    public GetContractFromMsisdnResponse getContractFromMsisdn(GetCoIdRequest getContractFromMsisdnRequest) throws java.rmi.RemoteException, UnexpectedErrorFault;
    public GetEngagementStatusResponse getEngagementStatus(CoIdRequest getEngagementStatusRequest) throws java.rmi.RemoteException, UnexpectedErrorFault;
    public BalanceResponse getBalancesContractHist(GetBalancesRequest getBalancesRequest) throws java.rmi.RemoteException, UnexpectedErrorFault;
    public EligibilityTemplateResponse getEligebilityTemplate(CoIdRequest getEligebilityTemplateRequest) throws java.rmi.RemoteException, UnexpectedErrorFault;
    public DifferentServiceTemplateResponse getDifferentsServiceTemplate(DifferentServiceTemplateRequest getDifferentsServiceTemplateRequest) throws java.rmi.RemoteException, UnexpectedErrorFault;
    public OperationResponse activateOnHoldService(CoIdRequest coIdRequest) throws java.rmi.RemoteException, UnexpectedErrorFault;
    public OperationResponse insertBalanceHist(BalanceHistRequest insertBalanceHistRequest) throws java.rmi.RemoteException, UnexpectedErrorFault;
    public GetMigrationIntervalResponse getMigrationInterval(GetMigrationIntervalRequest getMigrationIntervalRequest) throws java.rmi.RemoteException, UnexpectedErrorFault;
    public OperationResponse insertFafNumberHist(ApcFafNumberHistRequest apcFafNumberHistRequest) throws java.rmi.RemoteException, UnexpectedErrorFault;
}
