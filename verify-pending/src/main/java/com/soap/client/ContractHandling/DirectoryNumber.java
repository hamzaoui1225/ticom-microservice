/**
 * DirectoryNumber.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soap.client.ContractHandling;

public class DirectoryNumber  extends BaseSOIBean implements java.io.Serializable {
    private Long bccode;

    private String dirnum;

    private Boolean dirnumOnBill;

    private Long dnId;

    private Long dnType;

    private String extResourceTypeCode;

    private Long hmcode;

    private String hmcodePub;

    private Long linkedPublicDnId;

    private String lowerExt;

    private Boolean mainDirnum;

    private Long npcode;

    private String npcodePub;

    private String upperExt;

    private Long vpnId;

    private String vpnIdPub;

    public DirectoryNumber() {
    }

    public DirectoryNumber(
           Long bccode,
           String dirnum,
           Boolean dirnumOnBill,
           Long dnId,
           Long dnType,
           String extResourceTypeCode,
           Long hmcode,
           String hmcodePub,
           Long linkedPublicDnId,
           String lowerExt,
           Boolean mainDirnum,
           Long npcode,
           String npcodePub,
           String upperExt,
           Long vpnId,
           String vpnIdPub) {
        this.bccode = bccode;
        this.dirnum = dirnum;
        this.dirnumOnBill = dirnumOnBill;
        this.dnId = dnId;
        this.dnType = dnType;
        this.extResourceTypeCode = extResourceTypeCode;
        this.hmcode = hmcode;
        this.hmcodePub = hmcodePub;
        this.linkedPublicDnId = linkedPublicDnId;
        this.lowerExt = lowerExt;
        this.mainDirnum = mainDirnum;
        this.npcode = npcode;
        this.npcodePub = npcodePub;
        this.upperExt = upperExt;
        this.vpnId = vpnId;
        this.vpnIdPub = vpnIdPub;
    }


    /**
     * Gets the bccode value for this DirectoryNumber.
     * 
     * @return bccode
     */
    public Long getBccode() {
        return bccode;
    }


    /**
     * Sets the bccode value for this DirectoryNumber.
     * 
     * @param bccode
     */
    public void setBccode(Long bccode) {
        this.bccode = bccode;
    }


    /**
     * Gets the dirnum value for this DirectoryNumber.
     * 
     * @return dirnum
     */
    public String getDirnum() {
        return dirnum;
    }


    /**
     * Sets the dirnum value for this DirectoryNumber.
     * 
     * @param dirnum
     */
    public void setDirnum(String dirnum) {
        this.dirnum = dirnum;
    }


    /**
     * Gets the dirnumOnBill value for this DirectoryNumber.
     * 
     * @return dirnumOnBill
     */
    public Boolean getDirnumOnBill() {
        return dirnumOnBill;
    }


    /**
     * Sets the dirnumOnBill value for this DirectoryNumber.
     * 
     * @param dirnumOnBill
     */
    public void setDirnumOnBill(Boolean dirnumOnBill) {
        this.dirnumOnBill = dirnumOnBill;
    }


    /**
     * Gets the dnId value for this DirectoryNumber.
     * 
     * @return dnId
     */
    public Long getDnId() {
        return dnId;
    }


    /**
     * Sets the dnId value for this DirectoryNumber.
     * 
     * @param dnId
     */
    public void setDnId(Long dnId) {
        this.dnId = dnId;
    }


    /**
     * Gets the dnType value for this DirectoryNumber.
     * 
     * @return dnType
     */
    public Long getDnType() {
        return dnType;
    }


    /**
     * Sets the dnType value for this DirectoryNumber.
     * 
     * @param dnType
     */
    public void setDnType(Long dnType) {
        this.dnType = dnType;
    }


    /**
     * Gets the extResourceTypeCode value for this DirectoryNumber.
     * 
     * @return extResourceTypeCode
     */
    public String getExtResourceTypeCode() {
        return extResourceTypeCode;
    }


    /**
     * Sets the extResourceTypeCode value for this DirectoryNumber.
     * 
     * @param extResourceTypeCode
     */
    public void setExtResourceTypeCode(String extResourceTypeCode) {
        this.extResourceTypeCode = extResourceTypeCode;
    }


    /**
     * Gets the hmcode value for this DirectoryNumber.
     * 
     * @return hmcode
     */
    public Long getHmcode() {
        return hmcode;
    }


    /**
     * Sets the hmcode value for this DirectoryNumber.
     * 
     * @param hmcode
     */
    public void setHmcode(Long hmcode) {
        this.hmcode = hmcode;
    }


    /**
     * Gets the hmcodePub value for this DirectoryNumber.
     * 
     * @return hmcodePub
     */
    public String getHmcodePub() {
        return hmcodePub;
    }


    /**
     * Sets the hmcodePub value for this DirectoryNumber.
     * 
     * @param hmcodePub
     */
    public void setHmcodePub(String hmcodePub) {
        this.hmcodePub = hmcodePub;
    }


    /**
     * Gets the linkedPublicDnId value for this DirectoryNumber.
     * 
     * @return linkedPublicDnId
     */
    public Long getLinkedPublicDnId() {
        return linkedPublicDnId;
    }


    /**
     * Sets the linkedPublicDnId value for this DirectoryNumber.
     * 
     * @param linkedPublicDnId
     */
    public void setLinkedPublicDnId(Long linkedPublicDnId) {
        this.linkedPublicDnId = linkedPublicDnId;
    }


    /**
     * Gets the lowerExt value for this DirectoryNumber.
     * 
     * @return lowerExt
     */
    public String getLowerExt() {
        return lowerExt;
    }


    /**
     * Sets the lowerExt value for this DirectoryNumber.
     * 
     * @param lowerExt
     */
    public void setLowerExt(String lowerExt) {
        this.lowerExt = lowerExt;
    }


    /**
     * Gets the mainDirnum value for this DirectoryNumber.
     * 
     * @return mainDirnum
     */
    public Boolean getMainDirnum() {
        return mainDirnum;
    }


    /**
     * Sets the mainDirnum value for this DirectoryNumber.
     * 
     * @param mainDirnum
     */
    public void setMainDirnum(Boolean mainDirnum) {
        this.mainDirnum = mainDirnum;
    }


    /**
     * Gets the npcode value for this DirectoryNumber.
     * 
     * @return npcode
     */
    public Long getNpcode() {
        return npcode;
    }


    /**
     * Sets the npcode value for this DirectoryNumber.
     * 
     * @param npcode
     */
    public void setNpcode(Long npcode) {
        this.npcode = npcode;
    }


    /**
     * Gets the npcodePub value for this DirectoryNumber.
     * 
     * @return npcodePub
     */
    public String getNpcodePub() {
        return npcodePub;
    }


    /**
     * Sets the npcodePub value for this DirectoryNumber.
     * 
     * @param npcodePub
     */
    public void setNpcodePub(String npcodePub) {
        this.npcodePub = npcodePub;
    }


    /**
     * Gets the upperExt value for this DirectoryNumber.
     * 
     * @return upperExt
     */
    public String getUpperExt() {
        return upperExt;
    }


    /**
     * Sets the upperExt value for this DirectoryNumber.
     * 
     * @param upperExt
     */
    public void setUpperExt(String upperExt) {
        this.upperExt = upperExt;
    }


    /**
     * Gets the vpnId value for this DirectoryNumber.
     * 
     * @return vpnId
     */
    public Long getVpnId() {
        return vpnId;
    }


    /**
     * Sets the vpnId value for this DirectoryNumber.
     * 
     * @param vpnId
     */
    public void setVpnId(Long vpnId) {
        this.vpnId = vpnId;
    }


    /**
     * Gets the vpnIdPub value for this DirectoryNumber.
     * 
     * @return vpnIdPub
     */
    public String getVpnIdPub() {
        return vpnIdPub;
    }


    /**
     * Sets the vpnIdPub value for this DirectoryNumber.
     * 
     * @param vpnIdPub
     */
    public void setVpnIdPub(String vpnIdPub) {
        this.vpnIdPub = vpnIdPub;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof DirectoryNumber)) return false;
        DirectoryNumber other = (DirectoryNumber) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.bccode==null && other.getBccode()==null) || 
             (this.bccode!=null &&
              this.bccode.equals(other.getBccode()))) &&
            ((this.dirnum==null && other.getDirnum()==null) || 
             (this.dirnum!=null &&
              this.dirnum.equals(other.getDirnum()))) &&
            ((this.dirnumOnBill==null && other.getDirnumOnBill()==null) || 
             (this.dirnumOnBill!=null &&
              this.dirnumOnBill.equals(other.getDirnumOnBill()))) &&
            ((this.dnId==null && other.getDnId()==null) || 
             (this.dnId!=null &&
              this.dnId.equals(other.getDnId()))) &&
            ((this.dnType==null && other.getDnType()==null) || 
             (this.dnType!=null &&
              this.dnType.equals(other.getDnType()))) &&
            ((this.extResourceTypeCode==null && other.getExtResourceTypeCode()==null) || 
             (this.extResourceTypeCode!=null &&
              this.extResourceTypeCode.equals(other.getExtResourceTypeCode()))) &&
            ((this.hmcode==null && other.getHmcode()==null) || 
             (this.hmcode!=null &&
              this.hmcode.equals(other.getHmcode()))) &&
            ((this.hmcodePub==null && other.getHmcodePub()==null) || 
             (this.hmcodePub!=null &&
              this.hmcodePub.equals(other.getHmcodePub()))) &&
            ((this.linkedPublicDnId==null && other.getLinkedPublicDnId()==null) || 
             (this.linkedPublicDnId!=null &&
              this.linkedPublicDnId.equals(other.getLinkedPublicDnId()))) &&
            ((this.lowerExt==null && other.getLowerExt()==null) || 
             (this.lowerExt!=null &&
              this.lowerExt.equals(other.getLowerExt()))) &&
            ((this.mainDirnum==null && other.getMainDirnum()==null) || 
             (this.mainDirnum!=null &&
              this.mainDirnum.equals(other.getMainDirnum()))) &&
            ((this.npcode==null && other.getNpcode()==null) || 
             (this.npcode!=null &&
              this.npcode.equals(other.getNpcode()))) &&
            ((this.npcodePub==null && other.getNpcodePub()==null) || 
             (this.npcodePub!=null &&
              this.npcodePub.equals(other.getNpcodePub()))) &&
            ((this.upperExt==null && other.getUpperExt()==null) || 
             (this.upperExt!=null &&
              this.upperExt.equals(other.getUpperExt()))) &&
            ((this.vpnId==null && other.getVpnId()==null) || 
             (this.vpnId!=null &&
              this.vpnId.equals(other.getVpnId()))) &&
            ((this.vpnIdPub==null && other.getVpnIdPub()==null) || 
             (this.vpnIdPub!=null &&
              this.vpnIdPub.equals(other.getVpnIdPub())));
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
        if (getBccode() != null) {
            _hashCode += getBccode().hashCode();
        }
        if (getDirnum() != null) {
            _hashCode += getDirnum().hashCode();
        }
        if (getDirnumOnBill() != null) {
            _hashCode += getDirnumOnBill().hashCode();
        }
        if (getDnId() != null) {
            _hashCode += getDnId().hashCode();
        }
        if (getDnType() != null) {
            _hashCode += getDnType().hashCode();
        }
        if (getExtResourceTypeCode() != null) {
            _hashCode += getExtResourceTypeCode().hashCode();
        }
        if (getHmcode() != null) {
            _hashCode += getHmcode().hashCode();
        }
        if (getHmcodePub() != null) {
            _hashCode += getHmcodePub().hashCode();
        }
        if (getLinkedPublicDnId() != null) {
            _hashCode += getLinkedPublicDnId().hashCode();
        }
        if (getLowerExt() != null) {
            _hashCode += getLowerExt().hashCode();
        }
        if (getMainDirnum() != null) {
            _hashCode += getMainDirnum().hashCode();
        }
        if (getNpcode() != null) {
            _hashCode += getNpcode().hashCode();
        }
        if (getNpcodePub() != null) {
            _hashCode += getNpcodePub().hashCode();
        }
        if (getUpperExt() != null) {
            _hashCode += getUpperExt().hashCode();
        }
        if (getVpnId() != null) {
            _hashCode += getVpnId().hashCode();
        }
        if (getVpnIdPub() != null) {
            _hashCode += getVpnIdPub().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DirectoryNumber.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "DirectoryNumber"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bccode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "bccode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dirnum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "dirnum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dirnumOnBill");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "dirnumOnBill"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dnId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "dnId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dnType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "dnType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extResourceTypeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "extResourceTypeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hmcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "hmcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hmcodePub");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "hmcodePub"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkedPublicDnId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "linkedPublicDnId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lowerExt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "lowerExt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mainDirnum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "mainDirnum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("npcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "npcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("npcodePub");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "npcodePub"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("upperExt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "upperExt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vpnId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "vpnId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vpnIdPub");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "vpnIdPub"));
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
