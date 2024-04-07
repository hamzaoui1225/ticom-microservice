/**
 * Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soap.client.ContractHandling;

public class Service  extends BaseSOIBean implements java.io.Serializable {
    private Double advanceAccessOvw;

    private Integer advanceAccessOvwPrd;

    private String advanceAccessOvwType;

    private BsgConfiguration[] bsgConfiguration;

    private Double cosAccfeeOvw;

    private Integer cosAccfeeOvwPrd;

    private String cosAccfeeOvwType;

    private DateBean cosActivationDate;

    private Integer cosPendingStatus;

    private DateBean cosPendingStatusDate;

    private Integer cosQuantity;

    private Integer cosStatus;

    private Double cosSubfeeOvw;

    private String cosSubfeeOvwType;

    private Long cosTemplId;

    private DateBean cosTrialEndDate;

    private Integer csPaymentConditionUsgInd;

    private Long csPrepaidTpId;

    private String csPrepaidTpIdPub;

    private String cugAction;

    private CugMembership[] cugMemberships;

    private DirectoryNumber[] directoryNumbers;

    private Long extServiceId;

    private String extServiceIdPub;

    private boolean isNewService;

    private String opAssistedAction;

    private ParamValue[] paramValues;

    private Port[] ports;

    private Long profileId;

    private String snDes;

    private Long sncode;

    private String sncodePub;

    private String spDes;

    private Long spcode;

    private String spcodePub;

    private Long userReason;

    public Service() {
    }

    public Service(
           Double advanceAccessOvw,
           Integer advanceAccessOvwPrd,
           String advanceAccessOvwType,
           BsgConfiguration[] bsgConfiguration,
           Double cosAccfeeOvw,
           Integer cosAccfeeOvwPrd,
           String cosAccfeeOvwType,
           DateBean cosActivationDate,
           Integer cosPendingStatus,
           DateBean cosPendingStatusDate,
           Integer cosQuantity,
           Integer cosStatus,
           Double cosSubfeeOvw,
           String cosSubfeeOvwType,
           Long cosTemplId,
           DateBean cosTrialEndDate,
           Integer csPaymentConditionUsgInd,
           Long csPrepaidTpId,
           String csPrepaidTpIdPub,
           String cugAction,
           CugMembership[] cugMemberships,
           DirectoryNumber[] directoryNumbers,
           Long extServiceId,
           String extServiceIdPub,
           boolean isNewService,
           String opAssistedAction,
           ParamValue[] paramValues,
           Port[] ports,
           Long profileId,
           String snDes,
           Long sncode,
           String sncodePub,
           String spDes,
           Long spcode,
           String spcodePub,
           Long userReason) {
        this.advanceAccessOvw = advanceAccessOvw;
        this.advanceAccessOvwPrd = advanceAccessOvwPrd;
        this.advanceAccessOvwType = advanceAccessOvwType;
        this.bsgConfiguration = bsgConfiguration;
        this.cosAccfeeOvw = cosAccfeeOvw;
        this.cosAccfeeOvwPrd = cosAccfeeOvwPrd;
        this.cosAccfeeOvwType = cosAccfeeOvwType;
        this.cosActivationDate = cosActivationDate;
        this.cosPendingStatus = cosPendingStatus;
        this.cosPendingStatusDate = cosPendingStatusDate;
        this.cosQuantity = cosQuantity;
        this.cosStatus = cosStatus;
        this.cosSubfeeOvw = cosSubfeeOvw;
        this.cosSubfeeOvwType = cosSubfeeOvwType;
        this.cosTemplId = cosTemplId;
        this.cosTrialEndDate = cosTrialEndDate;
        this.csPaymentConditionUsgInd = csPaymentConditionUsgInd;
        this.csPrepaidTpId = csPrepaidTpId;
        this.csPrepaidTpIdPub = csPrepaidTpIdPub;
        this.cugAction = cugAction;
        this.cugMemberships = cugMemberships;
        this.directoryNumbers = directoryNumbers;
        this.extServiceId = extServiceId;
        this.extServiceIdPub = extServiceIdPub;
        this.isNewService = isNewService;
        this.opAssistedAction = opAssistedAction;
        this.paramValues = paramValues;
        this.ports = ports;
        this.profileId = profileId;
        this.snDes = snDes;
        this.sncode = sncode;
        this.sncodePub = sncodePub;
        this.spDes = spDes;
        this.spcode = spcode;
        this.spcodePub = spcodePub;
        this.userReason = userReason;
    }


    /**
     * Gets the advanceAccessOvw value for this Service.
     * 
     * @return advanceAccessOvw
     */
    public Double getAdvanceAccessOvw() {
        return advanceAccessOvw;
    }


    /**
     * Sets the advanceAccessOvw value for this Service.
     * 
     * @param advanceAccessOvw
     */
    public void setAdvanceAccessOvw(Double advanceAccessOvw) {
        this.advanceAccessOvw = advanceAccessOvw;
    }


    /**
     * Gets the advanceAccessOvwPrd value for this Service.
     * 
     * @return advanceAccessOvwPrd
     */
    public Integer getAdvanceAccessOvwPrd() {
        return advanceAccessOvwPrd;
    }


    /**
     * Sets the advanceAccessOvwPrd value for this Service.
     * 
     * @param advanceAccessOvwPrd
     */
    public void setAdvanceAccessOvwPrd(Integer advanceAccessOvwPrd) {
        this.advanceAccessOvwPrd = advanceAccessOvwPrd;
    }


    /**
     * Gets the advanceAccessOvwType value for this Service.
     * 
     * @return advanceAccessOvwType
     */
    public String getAdvanceAccessOvwType() {
        return advanceAccessOvwType;
    }


    /**
     * Sets the advanceAccessOvwType value for this Service.
     * 
     * @param advanceAccessOvwType
     */
    public void setAdvanceAccessOvwType(String advanceAccessOvwType) {
        this.advanceAccessOvwType = advanceAccessOvwType;
    }


    /**
     * Gets the bsgConfiguration value for this Service.
     * 
     * @return bsgConfiguration
     */
    public BsgConfiguration[] getBsgConfiguration() {
        return bsgConfiguration;
    }


    /**
     * Sets the bsgConfiguration value for this Service.
     * 
     * @param bsgConfiguration
     */
    public void setBsgConfiguration(BsgConfiguration[] bsgConfiguration) {
        this.bsgConfiguration = bsgConfiguration;
    }


    /**
     * Gets the cosAccfeeOvw value for this Service.
     * 
     * @return cosAccfeeOvw
     */
    public Double getCosAccfeeOvw() {
        return cosAccfeeOvw;
    }


    /**
     * Sets the cosAccfeeOvw value for this Service.
     * 
     * @param cosAccfeeOvw
     */
    public void setCosAccfeeOvw(Double cosAccfeeOvw) {
        this.cosAccfeeOvw = cosAccfeeOvw;
    }


    /**
     * Gets the cosAccfeeOvwPrd value for this Service.
     * 
     * @return cosAccfeeOvwPrd
     */
    public Integer getCosAccfeeOvwPrd() {
        return cosAccfeeOvwPrd;
    }


    /**
     * Sets the cosAccfeeOvwPrd value for this Service.
     * 
     * @param cosAccfeeOvwPrd
     */
    public void setCosAccfeeOvwPrd(Integer cosAccfeeOvwPrd) {
        this.cosAccfeeOvwPrd = cosAccfeeOvwPrd;
    }


    /**
     * Gets the cosAccfeeOvwType value for this Service.
     * 
     * @return cosAccfeeOvwType
     */
    public String getCosAccfeeOvwType() {
        return cosAccfeeOvwType;
    }


    /**
     * Sets the cosAccfeeOvwType value for this Service.
     * 
     * @param cosAccfeeOvwType
     */
    public void setCosAccfeeOvwType(String cosAccfeeOvwType) {
        this.cosAccfeeOvwType = cosAccfeeOvwType;
    }


    /**
     * Gets the cosActivationDate value for this Service.
     * 
     * @return cosActivationDate
     */
    public DateBean getCosActivationDate() {
        return cosActivationDate;
    }


    /**
     * Sets the cosActivationDate value for this Service.
     * 
     * @param cosActivationDate
     */
    public void setCosActivationDate(DateBean cosActivationDate) {
        this.cosActivationDate = cosActivationDate;
    }


    /**
     * Gets the cosPendingStatus value for this Service.
     * 
     * @return cosPendingStatus
     */
    public Integer getCosPendingStatus() {
        return cosPendingStatus;
    }


    /**
     * Sets the cosPendingStatus value for this Service.
     * 
     * @param cosPendingStatus
     */
    public void setCosPendingStatus(Integer cosPendingStatus) {
        this.cosPendingStatus = cosPendingStatus;
    }


    /**
     * Gets the cosPendingStatusDate value for this Service.
     * 
     * @return cosPendingStatusDate
     */
    public DateBean getCosPendingStatusDate() {
        return cosPendingStatusDate;
    }


    /**
     * Sets the cosPendingStatusDate value for this Service.
     * 
     * @param cosPendingStatusDate
     */
    public void setCosPendingStatusDate(DateBean cosPendingStatusDate) {
        this.cosPendingStatusDate = cosPendingStatusDate;
    }


    /**
     * Gets the cosQuantity value for this Service.
     * 
     * @return cosQuantity
     */
    public Integer getCosQuantity() {
        return cosQuantity;
    }


    /**
     * Sets the cosQuantity value for this Service.
     * 
     * @param cosQuantity
     */
    public void setCosQuantity(Integer cosQuantity) {
        this.cosQuantity = cosQuantity;
    }


    /**
     * Gets the cosStatus value for this Service.
     * 
     * @return cosStatus
     */
    public Integer getCosStatus() {
        return cosStatus;
    }


    /**
     * Sets the cosStatus value for this Service.
     * 
     * @param cosStatus
     */
    public void setCosStatus(Integer cosStatus) {
        this.cosStatus = cosStatus;
    }


    /**
     * Gets the cosSubfeeOvw value for this Service.
     * 
     * @return cosSubfeeOvw
     */
    public Double getCosSubfeeOvw() {
        return cosSubfeeOvw;
    }


    /**
     * Sets the cosSubfeeOvw value for this Service.
     * 
     * @param cosSubfeeOvw
     */
    public void setCosSubfeeOvw(Double cosSubfeeOvw) {
        this.cosSubfeeOvw = cosSubfeeOvw;
    }


    /**
     * Gets the cosSubfeeOvwType value for this Service.
     * 
     * @return cosSubfeeOvwType
     */
    public String getCosSubfeeOvwType() {
        return cosSubfeeOvwType;
    }


    /**
     * Sets the cosSubfeeOvwType value for this Service.
     * 
     * @param cosSubfeeOvwType
     */
    public void setCosSubfeeOvwType(String cosSubfeeOvwType) {
        this.cosSubfeeOvwType = cosSubfeeOvwType;
    }


    /**
     * Gets the cosTemplId value for this Service.
     * 
     * @return cosTemplId
     */
    public Long getCosTemplId() {
        return cosTemplId;
    }


    /**
     * Sets the cosTemplId value for this Service.
     * 
     * @param cosTemplId
     */
    public void setCosTemplId(Long cosTemplId) {
        this.cosTemplId = cosTemplId;
    }


    /**
     * Gets the cosTrialEndDate value for this Service.
     * 
     * @return cosTrialEndDate
     */
    public DateBean getCosTrialEndDate() {
        return cosTrialEndDate;
    }


    /**
     * Sets the cosTrialEndDate value for this Service.
     * 
     * @param cosTrialEndDate
     */
    public void setCosTrialEndDate(DateBean cosTrialEndDate) {
        this.cosTrialEndDate = cosTrialEndDate;
    }


    /**
     * Gets the csPaymentConditionUsgInd value for this Service.
     * 
     * @return csPaymentConditionUsgInd
     */
    public Integer getCsPaymentConditionUsgInd() {
        return csPaymentConditionUsgInd;
    }


    /**
     * Sets the csPaymentConditionUsgInd value for this Service.
     * 
     * @param csPaymentConditionUsgInd
     */
    public void setCsPaymentConditionUsgInd(Integer csPaymentConditionUsgInd) {
        this.csPaymentConditionUsgInd = csPaymentConditionUsgInd;
    }


    /**
     * Gets the csPrepaidTpId value for this Service.
     * 
     * @return csPrepaidTpId
     */
    public Long getCsPrepaidTpId() {
        return csPrepaidTpId;
    }


    /**
     * Sets the csPrepaidTpId value for this Service.
     * 
     * @param csPrepaidTpId
     */
    public void setCsPrepaidTpId(Long csPrepaidTpId) {
        this.csPrepaidTpId = csPrepaidTpId;
    }


    /**
     * Gets the csPrepaidTpIdPub value for this Service.
     * 
     * @return csPrepaidTpIdPub
     */
    public String getCsPrepaidTpIdPub() {
        return csPrepaidTpIdPub;
    }


    /**
     * Sets the csPrepaidTpIdPub value for this Service.
     * 
     * @param csPrepaidTpIdPub
     */
    public void setCsPrepaidTpIdPub(String csPrepaidTpIdPub) {
        this.csPrepaidTpIdPub = csPrepaidTpIdPub;
    }


    /**
     * Gets the cugAction value for this Service.
     * 
     * @return cugAction
     */
    public String getCugAction() {
        return cugAction;
    }


    /**
     * Sets the cugAction value for this Service.
     * 
     * @param cugAction
     */
    public void setCugAction(String cugAction) {
        this.cugAction = cugAction;
    }


    /**
     * Gets the cugMemberships value for this Service.
     * 
     * @return cugMemberships
     */
    public CugMembership[] getCugMemberships() {
        return cugMemberships;
    }


    /**
     * Sets the cugMemberships value for this Service.
     * 
     * @param cugMemberships
     */
    public void setCugMemberships(CugMembership[] cugMemberships) {
        this.cugMemberships = cugMemberships;
    }


    /**
     * Gets the directoryNumbers value for this Service.
     * 
     * @return directoryNumbers
     */
    public DirectoryNumber[] getDirectoryNumbers() {
        return directoryNumbers;
    }


    /**
     * Sets the directoryNumbers value for this Service.
     * 
     * @param directoryNumbers
     */
    public void setDirectoryNumbers(DirectoryNumber[] directoryNumbers) {
        this.directoryNumbers = directoryNumbers;
    }


    /**
     * Gets the extServiceId value for this Service.
     * 
     * @return extServiceId
     */
    public Long getExtServiceId() {
        return extServiceId;
    }


    /**
     * Sets the extServiceId value for this Service.
     * 
     * @param extServiceId
     */
    public void setExtServiceId(Long extServiceId) {
        this.extServiceId = extServiceId;
    }


    /**
     * Gets the extServiceIdPub value for this Service.
     * 
     * @return extServiceIdPub
     */
    public String getExtServiceIdPub() {
        return extServiceIdPub;
    }


    /**
     * Sets the extServiceIdPub value for this Service.
     * 
     * @param extServiceIdPub
     */
    public void setExtServiceIdPub(String extServiceIdPub) {
        this.extServiceIdPub = extServiceIdPub;
    }


    /**
     * Gets the isNewService value for this Service.
     * 
     * @return isNewService
     */
    public boolean isIsNewService() {
        return isNewService;
    }


    /**
     * Sets the isNewService value for this Service.
     * 
     * @param isNewService
     */
    public void setIsNewService(boolean isNewService) {
        this.isNewService = isNewService;
    }


    /**
     * Gets the opAssistedAction value for this Service.
     * 
     * @return opAssistedAction
     */
    public String getOpAssistedAction() {
        return opAssistedAction;
    }


    /**
     * Sets the opAssistedAction value for this Service.
     * 
     * @param opAssistedAction
     */
    public void setOpAssistedAction(String opAssistedAction) {
        this.opAssistedAction = opAssistedAction;
    }


    /**
     * Gets the paramValues value for this Service.
     * 
     * @return paramValues
     */
    public ParamValue[] getParamValues() {
        return paramValues;
    }


    /**
     * Sets the paramValues value for this Service.
     * 
     * @param paramValues
     */
    public void setParamValues(ParamValue[] paramValues) {
        this.paramValues = paramValues;
    }


    /**
     * Gets the ports value for this Service.
     * 
     * @return ports
     */
    public Port[] getPorts() {
        return ports;
    }


    /**
     * Sets the ports value for this Service.
     * 
     * @param ports
     */
    public void setPorts(Port[] ports) {
        this.ports = ports;
    }


    /**
     * Gets the profileId value for this Service.
     * 
     * @return profileId
     */
    public Long getProfileId() {
        return profileId;
    }


    /**
     * Sets the profileId value for this Service.
     * 
     * @param profileId
     */
    public void setProfileId(Long profileId) {
        this.profileId = profileId;
    }


    /**
     * Gets the snDes value for this Service.
     * 
     * @return snDes
     */
    public String getSnDes() {
        return snDes;
    }


    /**
     * Sets the snDes value for this Service.
     * 
     * @param snDes
     */
    public void setSnDes(String snDes) {
        this.snDes = snDes;
    }


    /**
     * Gets the sncode value for this Service.
     * 
     * @return sncode
     */
    public Long getSncode() {
        return sncode;
    }


    /**
     * Sets the sncode value for this Service.
     * 
     * @param sncode
     */
    public void setSncode(Long sncode) {
        this.sncode = sncode;
    }


    /**
     * Gets the sncodePub value for this Service.
     * 
     * @return sncodePub
     */
    public String getSncodePub() {
        return sncodePub;
    }


    /**
     * Sets the sncodePub value for this Service.
     * 
     * @param sncodePub
     */
    public void setSncodePub(String sncodePub) {
        this.sncodePub = sncodePub;
    }


    /**
     * Gets the spDes value for this Service.
     * 
     * @return spDes
     */
    public String getSpDes() {
        return spDes;
    }


    /**
     * Sets the spDes value for this Service.
     * 
     * @param spDes
     */
    public void setSpDes(String spDes) {
        this.spDes = spDes;
    }


    /**
     * Gets the spcode value for this Service.
     * 
     * @return spcode
     */
    public Long getSpcode() {
        return spcode;
    }


    /**
     * Sets the spcode value for this Service.
     * 
     * @param spcode
     */
    public void setSpcode(Long spcode) {
        this.spcode = spcode;
    }


    /**
     * Gets the spcodePub value for this Service.
     * 
     * @return spcodePub
     */
    public String getSpcodePub() {
        return spcodePub;
    }


    /**
     * Sets the spcodePub value for this Service.
     * 
     * @param spcodePub
     */
    public void setSpcodePub(String spcodePub) {
        this.spcodePub = spcodePub;
    }


    /**
     * Gets the userReason value for this Service.
     * 
     * @return userReason
     */
    public Long getUserReason() {
        return userReason;
    }


    /**
     * Sets the userReason value for this Service.
     * 
     * @param userReason
     */
    public void setUserReason(Long userReason) {
        this.userReason = userReason;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof Service)) return false;
        Service other = (Service) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.advanceAccessOvw==null && other.getAdvanceAccessOvw()==null) || 
             (this.advanceAccessOvw!=null &&
              this.advanceAccessOvw.equals(other.getAdvanceAccessOvw()))) &&
            ((this.advanceAccessOvwPrd==null && other.getAdvanceAccessOvwPrd()==null) || 
             (this.advanceAccessOvwPrd!=null &&
              this.advanceAccessOvwPrd.equals(other.getAdvanceAccessOvwPrd()))) &&
            ((this.advanceAccessOvwType==null && other.getAdvanceAccessOvwType()==null) || 
             (this.advanceAccessOvwType!=null &&
              this.advanceAccessOvwType.equals(other.getAdvanceAccessOvwType()))) &&
            ((this.bsgConfiguration==null && other.getBsgConfiguration()==null) || 
             (this.bsgConfiguration!=null &&
              java.util.Arrays.equals(this.bsgConfiguration, other.getBsgConfiguration()))) &&
            ((this.cosAccfeeOvw==null && other.getCosAccfeeOvw()==null) || 
             (this.cosAccfeeOvw!=null &&
              this.cosAccfeeOvw.equals(other.getCosAccfeeOvw()))) &&
            ((this.cosAccfeeOvwPrd==null && other.getCosAccfeeOvwPrd()==null) || 
             (this.cosAccfeeOvwPrd!=null &&
              this.cosAccfeeOvwPrd.equals(other.getCosAccfeeOvwPrd()))) &&
            ((this.cosAccfeeOvwType==null && other.getCosAccfeeOvwType()==null) || 
             (this.cosAccfeeOvwType!=null &&
              this.cosAccfeeOvwType.equals(other.getCosAccfeeOvwType()))) &&
            ((this.cosActivationDate==null && other.getCosActivationDate()==null) || 
             (this.cosActivationDate!=null &&
              this.cosActivationDate.equals(other.getCosActivationDate()))) &&
            ((this.cosPendingStatus==null && other.getCosPendingStatus()==null) || 
             (this.cosPendingStatus!=null &&
              this.cosPendingStatus.equals(other.getCosPendingStatus()))) &&
            ((this.cosPendingStatusDate==null && other.getCosPendingStatusDate()==null) || 
             (this.cosPendingStatusDate!=null &&
              this.cosPendingStatusDate.equals(other.getCosPendingStatusDate()))) &&
            ((this.cosQuantity==null && other.getCosQuantity()==null) || 
             (this.cosQuantity!=null &&
              this.cosQuantity.equals(other.getCosQuantity()))) &&
            ((this.cosStatus==null && other.getCosStatus()==null) || 
             (this.cosStatus!=null &&
              this.cosStatus.equals(other.getCosStatus()))) &&
            ((this.cosSubfeeOvw==null && other.getCosSubfeeOvw()==null) || 
             (this.cosSubfeeOvw!=null &&
              this.cosSubfeeOvw.equals(other.getCosSubfeeOvw()))) &&
            ((this.cosSubfeeOvwType==null && other.getCosSubfeeOvwType()==null) || 
             (this.cosSubfeeOvwType!=null &&
              this.cosSubfeeOvwType.equals(other.getCosSubfeeOvwType()))) &&
            ((this.cosTemplId==null && other.getCosTemplId()==null) || 
             (this.cosTemplId!=null &&
              this.cosTemplId.equals(other.getCosTemplId()))) &&
            ((this.cosTrialEndDate==null && other.getCosTrialEndDate()==null) || 
             (this.cosTrialEndDate!=null &&
              this.cosTrialEndDate.equals(other.getCosTrialEndDate()))) &&
            ((this.csPaymentConditionUsgInd==null && other.getCsPaymentConditionUsgInd()==null) || 
             (this.csPaymentConditionUsgInd!=null &&
              this.csPaymentConditionUsgInd.equals(other.getCsPaymentConditionUsgInd()))) &&
            ((this.csPrepaidTpId==null && other.getCsPrepaidTpId()==null) || 
             (this.csPrepaidTpId!=null &&
              this.csPrepaidTpId.equals(other.getCsPrepaidTpId()))) &&
            ((this.csPrepaidTpIdPub==null && other.getCsPrepaidTpIdPub()==null) || 
             (this.csPrepaidTpIdPub!=null &&
              this.csPrepaidTpIdPub.equals(other.getCsPrepaidTpIdPub()))) &&
            ((this.cugAction==null && other.getCugAction()==null) || 
             (this.cugAction!=null &&
              this.cugAction.equals(other.getCugAction()))) &&
            ((this.cugMemberships==null && other.getCugMemberships()==null) || 
             (this.cugMemberships!=null &&
              java.util.Arrays.equals(this.cugMemberships, other.getCugMemberships()))) &&
            ((this.directoryNumbers==null && other.getDirectoryNumbers()==null) || 
             (this.directoryNumbers!=null &&
              java.util.Arrays.equals(this.directoryNumbers, other.getDirectoryNumbers()))) &&
            ((this.extServiceId==null && other.getExtServiceId()==null) || 
             (this.extServiceId!=null &&
              this.extServiceId.equals(other.getExtServiceId()))) &&
            ((this.extServiceIdPub==null && other.getExtServiceIdPub()==null) || 
             (this.extServiceIdPub!=null &&
              this.extServiceIdPub.equals(other.getExtServiceIdPub()))) &&
            this.isNewService == other.isIsNewService() &&
            ((this.opAssistedAction==null && other.getOpAssistedAction()==null) || 
             (this.opAssistedAction!=null &&
              this.opAssistedAction.equals(other.getOpAssistedAction()))) &&
            ((this.paramValues==null && other.getParamValues()==null) || 
             (this.paramValues!=null &&
              java.util.Arrays.equals(this.paramValues, other.getParamValues()))) &&
            ((this.ports==null && other.getPorts()==null) || 
             (this.ports!=null &&
              java.util.Arrays.equals(this.ports, other.getPorts()))) &&
            ((this.profileId==null && other.getProfileId()==null) || 
             (this.profileId!=null &&
              this.profileId.equals(other.getProfileId()))) &&
            ((this.snDes==null && other.getSnDes()==null) || 
             (this.snDes!=null &&
              this.snDes.equals(other.getSnDes()))) &&
            ((this.sncode==null && other.getSncode()==null) || 
             (this.sncode!=null &&
              this.sncode.equals(other.getSncode()))) &&
            ((this.sncodePub==null && other.getSncodePub()==null) || 
             (this.sncodePub!=null &&
              this.sncodePub.equals(other.getSncodePub()))) &&
            ((this.spDes==null && other.getSpDes()==null) || 
             (this.spDes!=null &&
              this.spDes.equals(other.getSpDes()))) &&
            ((this.spcode==null && other.getSpcode()==null) || 
             (this.spcode!=null &&
              this.spcode.equals(other.getSpcode()))) &&
            ((this.spcodePub==null && other.getSpcodePub()==null) || 
             (this.spcodePub!=null &&
              this.spcodePub.equals(other.getSpcodePub()))) &&
            ((this.userReason==null && other.getUserReason()==null) || 
             (this.userReason!=null &&
              this.userReason.equals(other.getUserReason())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getAdvanceAccessOvw() != null) {
            _hashCode += getAdvanceAccessOvw().hashCode();
        }
        if (getAdvanceAccessOvwPrd() != null) {
            _hashCode += getAdvanceAccessOvwPrd().hashCode();
        }
        if (getAdvanceAccessOvwType() != null) {
            _hashCode += getAdvanceAccessOvwType().hashCode();
        }
        if (getBsgConfiguration() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBsgConfiguration());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getBsgConfiguration(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCosAccfeeOvw() != null) {
            _hashCode += getCosAccfeeOvw().hashCode();
        }
        if (getCosAccfeeOvwPrd() != null) {
            _hashCode += getCosAccfeeOvwPrd().hashCode();
        }
        if (getCosAccfeeOvwType() != null) {
            _hashCode += getCosAccfeeOvwType().hashCode();
        }
        if (getCosActivationDate() != null) {
            _hashCode += getCosActivationDate().hashCode();
        }
        if (getCosPendingStatus() != null) {
            _hashCode += getCosPendingStatus().hashCode();
        }
        if (getCosPendingStatusDate() != null) {
            _hashCode += getCosPendingStatusDate().hashCode();
        }
        if (getCosQuantity() != null) {
            _hashCode += getCosQuantity().hashCode();
        }
        if (getCosStatus() != null) {
            _hashCode += getCosStatus().hashCode();
        }
        if (getCosSubfeeOvw() != null) {
            _hashCode += getCosSubfeeOvw().hashCode();
        }
        if (getCosSubfeeOvwType() != null) {
            _hashCode += getCosSubfeeOvwType().hashCode();
        }
        if (getCosTemplId() != null) {
            _hashCode += getCosTemplId().hashCode();
        }
        if (getCosTrialEndDate() != null) {
            _hashCode += getCosTrialEndDate().hashCode();
        }
        if (getCsPaymentConditionUsgInd() != null) {
            _hashCode += getCsPaymentConditionUsgInd().hashCode();
        }
        if (getCsPrepaidTpId() != null) {
            _hashCode += getCsPrepaidTpId().hashCode();
        }
        if (getCsPrepaidTpIdPub() != null) {
            _hashCode += getCsPrepaidTpIdPub().hashCode();
        }
        if (getCugAction() != null) {
            _hashCode += getCugAction().hashCode();
        }
        if (getCugMemberships() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCugMemberships());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getCugMemberships(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDirectoryNumbers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDirectoryNumbers());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getDirectoryNumbers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExtServiceId() != null) {
            _hashCode += getExtServiceId().hashCode();
        }
        if (getExtServiceIdPub() != null) {
            _hashCode += getExtServiceIdPub().hashCode();
        }
        _hashCode += (isIsNewService() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getOpAssistedAction() != null) {
            _hashCode += getOpAssistedAction().hashCode();
        }
        if (getParamValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParamValues());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getParamValues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPorts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPorts());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getPorts(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProfileId() != null) {
            _hashCode += getProfileId().hashCode();
        }
        if (getSnDes() != null) {
            _hashCode += getSnDes().hashCode();
        }
        if (getSncode() != null) {
            _hashCode += getSncode().hashCode();
        }
        if (getSncodePub() != null) {
            _hashCode += getSncodePub().hashCode();
        }
        if (getSpDes() != null) {
            _hashCode += getSpDes().hashCode();
        }
        if (getSpcode() != null) {
            _hashCode += getSpcode().hashCode();
        }
        if (getSpcodePub() != null) {
            _hashCode += getSpcodePub().hashCode();
        }
        if (getUserReason() != null) {
            _hashCode += getUserReason().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Service.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "Service"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advanceAccessOvw");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "advanceAccessOvw"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advanceAccessOvwPrd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "advanceAccessOvwPrd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advanceAccessOvwType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "advanceAccessOvwType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bsgConfiguration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "bsgConfiguration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "BsgConfiguration"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cosAccfeeOvw");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "cosAccfeeOvw"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cosAccfeeOvwPrd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "cosAccfeeOvwPrd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cosAccfeeOvwType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "cosAccfeeOvwType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cosActivationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "cosActivationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "DateBean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cosPendingStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "cosPendingStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cosPendingStatusDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "cosPendingStatusDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "DateBean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cosQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "cosQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cosStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "cosStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cosSubfeeOvw");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "cosSubfeeOvw"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cosSubfeeOvwType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "cosSubfeeOvwType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cosTemplId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "cosTemplId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cosTrialEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "cosTrialEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "DateBean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("csPaymentConditionUsgInd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "csPaymentConditionUsgInd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("csPrepaidTpId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "csPrepaidTpId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("csPrepaidTpIdPub");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "csPrepaidTpIdPub"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cugAction");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "cugAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cugMemberships");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "cugMemberships"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CugMembership"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("directoryNumbers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "directoryNumbers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "DirectoryNumber"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extServiceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "extServiceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extServiceIdPub");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "extServiceIdPub"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isNewService");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "isNewService"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opAssistedAction");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "opAssistedAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paramValues");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "paramValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ParamValue"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ports");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ports"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "Port"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profileId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "profileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("snDes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "snDes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sncode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "sncode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sncodePub");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "sncodePub"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spDes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "spDes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "spcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spcodePub");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "spcodePub"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userReason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "userReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
