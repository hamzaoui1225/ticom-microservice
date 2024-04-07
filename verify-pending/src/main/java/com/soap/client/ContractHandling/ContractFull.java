/**
 * ContractFull.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soap.client.ContractHandling;

public class ContractFull  extends Contract implements java.io.Serializable {
    private Long altRpcode;

    private String altRpcodePub;

    private DateTimeBean coActivated;

    private Long coLastReason;

    private DateBean coSignedDate;

    private Integer coStatus;

    private Long coStmedDealerId;

    private String coStmedDealerIdPub;

    private String coStmedno;

    private Long contractTypeId;

    private Long csId;

    private String csIdPub;

    private String description;

    private String pin;

    private String pin2;

    private String puk;

    private String puk2;

    private String rpDes;

    private String rpDesc;

    private Long rpcode;

    private String rpcodePub;

    private Long sccode;

    private String sccodePub;

    private DateTimeBean smModdate;

    private Long submId;

    private String submIdPub;

    public ContractFull() {
    }

    public ContractFull(
           Long coId,
           String coIdPub,
           Service[] services,
           Long altRpcode,
           String altRpcodePub,
           DateTimeBean coActivated,
           Long coLastReason,
           DateBean coSignedDate,
           Integer coStatus,
           Long coStmedDealerId,
           String coStmedDealerIdPub,
           String coStmedno,
           Long contractTypeId,
           Long csId,
           String csIdPub,
           String description,
           String pin,
           String pin2,
           String puk,
           String puk2,
           String rpDes,
           String rpDesc,
           Long rpcode,
           String rpcodePub,
           Long sccode,
           String sccodePub,
           DateTimeBean smModdate,
           Long submId,
           String submIdPub) {
        super(
            coId,
            coIdPub,
            services);
        this.altRpcode = altRpcode;
        this.altRpcodePub = altRpcodePub;
        this.coActivated = coActivated;
        this.coLastReason = coLastReason;
        this.coSignedDate = coSignedDate;
        this.coStatus = coStatus;
        this.coStmedDealerId = coStmedDealerId;
        this.coStmedDealerIdPub = coStmedDealerIdPub;
        this.coStmedno = coStmedno;
        this.contractTypeId = contractTypeId;
        this.csId = csId;
        this.csIdPub = csIdPub;
        this.description = description;
        this.pin = pin;
        this.pin2 = pin2;
        this.puk = puk;
        this.puk2 = puk2;
        this.rpDes = rpDes;
        this.rpDesc = rpDesc;
        this.rpcode = rpcode;
        this.rpcodePub = rpcodePub;
        this.sccode = sccode;
        this.sccodePub = sccodePub;
        this.smModdate = smModdate;
        this.submId = submId;
        this.submIdPub = submIdPub;
    }


    /**
     * Gets the altRpcode value for this ContractFull.
     * 
     * @return altRpcode
     */
    public Long getAltRpcode() {
        return altRpcode;
    }


    /**
     * Sets the altRpcode value for this ContractFull.
     * 
     * @param altRpcode
     */
    public void setAltRpcode(Long altRpcode) {
        this.altRpcode = altRpcode;
    }


    /**
     * Gets the altRpcodePub value for this ContractFull.
     * 
     * @return altRpcodePub
     */
    public String getAltRpcodePub() {
        return altRpcodePub;
    }


    /**
     * Sets the altRpcodePub value for this ContractFull.
     * 
     * @param altRpcodePub
     */
    public void setAltRpcodePub(String altRpcodePub) {
        this.altRpcodePub = altRpcodePub;
    }


    /**
     * Gets the coActivated value for this ContractFull.
     * 
     * @return coActivated
     */
    public DateTimeBean getCoActivated() {
        return coActivated;
    }


    /**
     * Sets the coActivated value for this ContractFull.
     * 
     * @param coActivated
     */
    public void setCoActivated(DateTimeBean coActivated) {
        this.coActivated = coActivated;
    }


    /**
     * Gets the coLastReason value for this ContractFull.
     * 
     * @return coLastReason
     */
    public Long getCoLastReason() {
        return coLastReason;
    }


    /**
     * Sets the coLastReason value for this ContractFull.
     * 
     * @param coLastReason
     */
    public void setCoLastReason(Long coLastReason) {
        this.coLastReason = coLastReason;
    }


    /**
     * Gets the coSignedDate value for this ContractFull.
     * 
     * @return coSignedDate
     */
    public DateBean getCoSignedDate() {
        return coSignedDate;
    }


    /**
     * Sets the coSignedDate value for this ContractFull.
     * 
     * @param coSignedDate
     */
    public void setCoSignedDate(DateBean coSignedDate) {
        this.coSignedDate = coSignedDate;
    }


    /**
     * Gets the coStatus value for this ContractFull.
     * 
     * @return coStatus
     */
    public Integer getCoStatus() {
        return coStatus;
    }


    /**
     * Sets the coStatus value for this ContractFull.
     * 
     * @param coStatus
     */
    public void setCoStatus(Integer coStatus) {
        this.coStatus = coStatus;
    }


    /**
     * Gets the coStmedDealerId value for this ContractFull.
     * 
     * @return coStmedDealerId
     */
    public Long getCoStmedDealerId() {
        return coStmedDealerId;
    }


    /**
     * Sets the coStmedDealerId value for this ContractFull.
     * 
     * @param coStmedDealerId
     */
    public void setCoStmedDealerId(Long coStmedDealerId) {
        this.coStmedDealerId = coStmedDealerId;
    }


    /**
     * Gets the coStmedDealerIdPub value for this ContractFull.
     * 
     * @return coStmedDealerIdPub
     */
    public String getCoStmedDealerIdPub() {
        return coStmedDealerIdPub;
    }


    /**
     * Sets the coStmedDealerIdPub value for this ContractFull.
     * 
     * @param coStmedDealerIdPub
     */
    public void setCoStmedDealerIdPub(String coStmedDealerIdPub) {
        this.coStmedDealerIdPub = coStmedDealerIdPub;
    }


    /**
     * Gets the coStmedno value for this ContractFull.
     * 
     * @return coStmedno
     */
    public String getCoStmedno() {
        return coStmedno;
    }


    /**
     * Sets the coStmedno value for this ContractFull.
     * 
     * @param coStmedno
     */
    public void setCoStmedno(String coStmedno) {
        this.coStmedno = coStmedno;
    }


    /**
     * Gets the contractTypeId value for this ContractFull.
     * 
     * @return contractTypeId
     */
    public Long getContractTypeId() {
        return contractTypeId;
    }


    /**
     * Sets the contractTypeId value for this ContractFull.
     * 
     * @param contractTypeId
     */
    public void setContractTypeId(Long contractTypeId) {
        this.contractTypeId = contractTypeId;
    }


    /**
     * Gets the csId value for this ContractFull.
     * 
     * @return csId
     */
    public Long getCsId() {
        return csId;
    }


    /**
     * Sets the csId value for this ContractFull.
     * 
     * @param csId
     */
    public void setCsId(Long csId) {
        this.csId = csId;
    }


    /**
     * Gets the csIdPub value for this ContractFull.
     * 
     * @return csIdPub
     */
    public String getCsIdPub() {
        return csIdPub;
    }


    /**
     * Sets the csIdPub value for this ContractFull.
     * 
     * @param csIdPub
     */
    public void setCsIdPub(String csIdPub) {
        this.csIdPub = csIdPub;
    }


    /**
     * Gets the description value for this ContractFull.
     * 
     * @return description
     */
    public String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ContractFull.
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * Gets the pin value for this ContractFull.
     * 
     * @return pin
     */
    public String getPin() {
        return pin;
    }


    /**
     * Sets the pin value for this ContractFull.
     * 
     * @param pin
     */
    public void setPin(String pin) {
        this.pin = pin;
    }


    /**
     * Gets the pin2 value for this ContractFull.
     * 
     * @return pin2
     */
    public String getPin2() {
        return pin2;
    }


    /**
     * Sets the pin2 value for this ContractFull.
     * 
     * @param pin2
     */
    public void setPin2(String pin2) {
        this.pin2 = pin2;
    }


    /**
     * Gets the puk value for this ContractFull.
     * 
     * @return puk
     */
    public String getPuk() {
        return puk;
    }


    /**
     * Sets the puk value for this ContractFull.
     * 
     * @param puk
     */
    public void setPuk(String puk) {
        this.puk = puk;
    }


    /**
     * Gets the puk2 value for this ContractFull.
     * 
     * @return puk2
     */
    public String getPuk2() {
        return puk2;
    }


    /**
     * Sets the puk2 value for this ContractFull.
     * 
     * @param puk2
     */
    public void setPuk2(String puk2) {
        this.puk2 = puk2;
    }


    /**
     * Gets the rpDes value for this ContractFull.
     * 
     * @return rpDes
     */
    public String getRpDes() {
        return rpDes;
    }


    /**
     * Sets the rpDes value for this ContractFull.
     * 
     * @param rpDes
     */
    public void setRpDes(String rpDes) {
        this.rpDes = rpDes;
    }


    /**
     * Gets the rpDesc value for this ContractFull.
     * 
     * @return rpDesc
     */
    public String getRpDesc() {
        return rpDesc;
    }


    /**
     * Sets the rpDesc value for this ContractFull.
     * 
     * @param rpDesc
     */
    public void setRpDesc(String rpDesc) {
        this.rpDesc = rpDesc;
    }


    /**
     * Gets the rpcode value for this ContractFull.
     * 
     * @return rpcode
     */
    public Long getRpcode() {
        return rpcode;
    }


    /**
     * Sets the rpcode value for this ContractFull.
     * 
     * @param rpcode
     */
    public void setRpcode(Long rpcode) {
        this.rpcode = rpcode;
    }


    /**
     * Gets the rpcodePub value for this ContractFull.
     * 
     * @return rpcodePub
     */
    public String getRpcodePub() {
        return rpcodePub;
    }


    /**
     * Sets the rpcodePub value for this ContractFull.
     * 
     * @param rpcodePub
     */
    public void setRpcodePub(String rpcodePub) {
        this.rpcodePub = rpcodePub;
    }


    /**
     * Gets the sccode value for this ContractFull.
     * 
     * @return sccode
     */
    public Long getSccode() {
        return sccode;
    }


    /**
     * Sets the sccode value for this ContractFull.
     * 
     * @param sccode
     */
    public void setSccode(Long sccode) {
        this.sccode = sccode;
    }


    /**
     * Gets the sccodePub value for this ContractFull.
     * 
     * @return sccodePub
     */
    public String getSccodePub() {
        return sccodePub;
    }


    /**
     * Sets the sccodePub value for this ContractFull.
     * 
     * @param sccodePub
     */
    public void setSccodePub(String sccodePub) {
        this.sccodePub = sccodePub;
    }


    /**
     * Gets the smModdate value for this ContractFull.
     * 
     * @return smModdate
     */
    public DateTimeBean getSmModdate() {
        return smModdate;
    }


    /**
     * Sets the smModdate value for this ContractFull.
     * 
     * @param smModdate
     */
    public void setSmModdate(DateTimeBean smModdate) {
        this.smModdate = smModdate;
    }


    /**
     * Gets the submId value for this ContractFull.
     * 
     * @return submId
     */
    public Long getSubmId() {
        return submId;
    }


    /**
     * Sets the submId value for this ContractFull.
     * 
     * @param submId
     */
    public void setSubmId(Long submId) {
        this.submId = submId;
    }


    /**
     * Gets the submIdPub value for this ContractFull.
     * 
     * @return submIdPub
     */
    public String getSubmIdPub() {
        return submIdPub;
    }


    /**
     * Sets the submIdPub value for this ContractFull.
     * 
     * @param submIdPub
     */
    public void setSubmIdPub(String submIdPub) {
        this.submIdPub = submIdPub;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ContractFull)) return false;
        ContractFull other = (ContractFull) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.altRpcode==null && other.getAltRpcode()==null) || 
             (this.altRpcode!=null &&
              this.altRpcode.equals(other.getAltRpcode()))) &&
            ((this.altRpcodePub==null && other.getAltRpcodePub()==null) || 
             (this.altRpcodePub!=null &&
              this.altRpcodePub.equals(other.getAltRpcodePub()))) &&
            ((this.coActivated==null && other.getCoActivated()==null) || 
             (this.coActivated!=null &&
              this.coActivated.equals(other.getCoActivated()))) &&
            ((this.coLastReason==null && other.getCoLastReason()==null) || 
             (this.coLastReason!=null &&
              this.coLastReason.equals(other.getCoLastReason()))) &&
            ((this.coSignedDate==null && other.getCoSignedDate()==null) || 
             (this.coSignedDate!=null &&
              this.coSignedDate.equals(other.getCoSignedDate()))) &&
            ((this.coStatus==null && other.getCoStatus()==null) || 
             (this.coStatus!=null &&
              this.coStatus.equals(other.getCoStatus()))) &&
            ((this.coStmedDealerId==null && other.getCoStmedDealerId()==null) || 
             (this.coStmedDealerId!=null &&
              this.coStmedDealerId.equals(other.getCoStmedDealerId()))) &&
            ((this.coStmedDealerIdPub==null && other.getCoStmedDealerIdPub()==null) || 
             (this.coStmedDealerIdPub!=null &&
              this.coStmedDealerIdPub.equals(other.getCoStmedDealerIdPub()))) &&
            ((this.coStmedno==null && other.getCoStmedno()==null) || 
             (this.coStmedno!=null &&
              this.coStmedno.equals(other.getCoStmedno()))) &&
            ((this.contractTypeId==null && other.getContractTypeId()==null) || 
             (this.contractTypeId!=null &&
              this.contractTypeId.equals(other.getContractTypeId()))) &&
            ((this.csId==null && other.getCsId()==null) || 
             (this.csId!=null &&
              this.csId.equals(other.getCsId()))) &&
            ((this.csIdPub==null && other.getCsIdPub()==null) || 
             (this.csIdPub!=null &&
              this.csIdPub.equals(other.getCsIdPub()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.pin==null && other.getPin()==null) || 
             (this.pin!=null &&
              this.pin.equals(other.getPin()))) &&
            ((this.pin2==null && other.getPin2()==null) || 
             (this.pin2!=null &&
              this.pin2.equals(other.getPin2()))) &&
            ((this.puk==null && other.getPuk()==null) || 
             (this.puk!=null &&
              this.puk.equals(other.getPuk()))) &&
            ((this.puk2==null && other.getPuk2()==null) || 
             (this.puk2!=null &&
              this.puk2.equals(other.getPuk2()))) &&
            ((this.rpDes==null && other.getRpDes()==null) || 
             (this.rpDes!=null &&
              this.rpDes.equals(other.getRpDes()))) &&
            ((this.rpDesc==null && other.getRpDesc()==null) || 
             (this.rpDesc!=null &&
              this.rpDesc.equals(other.getRpDesc()))) &&
            ((this.rpcode==null && other.getRpcode()==null) || 
             (this.rpcode!=null &&
              this.rpcode.equals(other.getRpcode()))) &&
            ((this.rpcodePub==null && other.getRpcodePub()==null) || 
             (this.rpcodePub!=null &&
              this.rpcodePub.equals(other.getRpcodePub()))) &&
            ((this.sccode==null && other.getSccode()==null) || 
             (this.sccode!=null &&
              this.sccode.equals(other.getSccode()))) &&
            ((this.sccodePub==null && other.getSccodePub()==null) || 
             (this.sccodePub!=null &&
              this.sccodePub.equals(other.getSccodePub()))) &&
            ((this.smModdate==null && other.getSmModdate()==null) || 
             (this.smModdate!=null &&
              this.smModdate.equals(other.getSmModdate()))) &&
            ((this.submId==null && other.getSubmId()==null) || 
             (this.submId!=null &&
              this.submId.equals(other.getSubmId()))) &&
            ((this.submIdPub==null && other.getSubmIdPub()==null) || 
             (this.submIdPub!=null &&
              this.submIdPub.equals(other.getSubmIdPub())));
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
        if (getAltRpcode() != null) {
            _hashCode += getAltRpcode().hashCode();
        }
        if (getAltRpcodePub() != null) {
            _hashCode += getAltRpcodePub().hashCode();
        }
        if (getCoActivated() != null) {
            _hashCode += getCoActivated().hashCode();
        }
        if (getCoLastReason() != null) {
            _hashCode += getCoLastReason().hashCode();
        }
        if (getCoSignedDate() != null) {
            _hashCode += getCoSignedDate().hashCode();
        }
        if (getCoStatus() != null) {
            _hashCode += getCoStatus().hashCode();
        }
        if (getCoStmedDealerId() != null) {
            _hashCode += getCoStmedDealerId().hashCode();
        }
        if (getCoStmedDealerIdPub() != null) {
            _hashCode += getCoStmedDealerIdPub().hashCode();
        }
        if (getCoStmedno() != null) {
            _hashCode += getCoStmedno().hashCode();
        }
        if (getContractTypeId() != null) {
            _hashCode += getContractTypeId().hashCode();
        }
        if (getCsId() != null) {
            _hashCode += getCsId().hashCode();
        }
        if (getCsIdPub() != null) {
            _hashCode += getCsIdPub().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getPin() != null) {
            _hashCode += getPin().hashCode();
        }
        if (getPin2() != null) {
            _hashCode += getPin2().hashCode();
        }
        if (getPuk() != null) {
            _hashCode += getPuk().hashCode();
        }
        if (getPuk2() != null) {
            _hashCode += getPuk2().hashCode();
        }
        if (getRpDes() != null) {
            _hashCode += getRpDes().hashCode();
        }
        if (getRpDesc() != null) {
            _hashCode += getRpDesc().hashCode();
        }
        if (getRpcode() != null) {
            _hashCode += getRpcode().hashCode();
        }
        if (getRpcodePub() != null) {
            _hashCode += getRpcodePub().hashCode();
        }
        if (getSccode() != null) {
            _hashCode += getSccode().hashCode();
        }
        if (getSccodePub() != null) {
            _hashCode += getSccodePub().hashCode();
        }
        if (getSmModdate() != null) {
            _hashCode += getSmModdate().hashCode();
        }
        if (getSubmId() != null) {
            _hashCode += getSubmId().hashCode();
        }
        if (getSubmIdPub() != null) {
            _hashCode += getSubmIdPub().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContractFull.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ContractFull"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altRpcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "altRpcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altRpcodePub");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "altRpcodePub"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coActivated");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "coActivated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "DateTimeBean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coLastReason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "coLastReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coSignedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "coSignedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "DateBean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "coStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coStmedDealerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "coStmedDealerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coStmedDealerIdPub");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "coStmedDealerIdPub"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coStmedno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "coStmedno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "contractTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("csId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "csId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("csIdPub");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "csIdPub"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "pin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pin2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "pin2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("puk");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "puk"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("puk2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "puk2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rpDes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "rpDes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rpDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "rpDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rpcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "rpcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rpcodePub");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "rpcodePub"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sccode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "sccode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sccodePub");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "sccodePub"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smModdate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "smModdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "DateTimeBean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "submId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submIdPub");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "submIdPub"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
