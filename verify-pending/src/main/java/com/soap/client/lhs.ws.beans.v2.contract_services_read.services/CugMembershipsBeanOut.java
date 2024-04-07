/**
 * CugMembershipsBeanOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soap.client.lhs.ws.beans.v2.contract_services_read.services;


import com.soap.client.alu.BaseSOIBean;
import com.soap.client.lhs.ws.beans.v2.contract_services_read.services.cug_memberships.BasicserviceBeanOut;

public class CugMembershipsBeanOut  extends BaseSOIBean implements java.io.Serializable {
    private BasicserviceBeanOut[] basicservicegroupassigments;

    private Long cugId;

    private Long cugIndex;

    private String cugInterlockCode;

    private String cugName;

    private Integer cugPendingStatus;

    public CugMembershipsBeanOut() {
    }

    public CugMembershipsBeanOut(
           BasicserviceBeanOut[] basicservicegroupassigments,
           Long cugId,
           Long cugIndex,
           String cugInterlockCode,
           String cugName,
           Integer cugPendingStatus) {
        this.basicservicegroupassigments = basicservicegroupassigments;
        this.cugId = cugId;
        this.cugIndex = cugIndex;
        this.cugInterlockCode = cugInterlockCode;
        this.cugName = cugName;
        this.cugPendingStatus = cugPendingStatus;
    }


    /**
     * Gets the basicservicegroupassigments value for this CugMembershipsBeanOut.
     * 
     * @return basicservicegroupassigments
     */
    public BasicserviceBeanOut[] getBasicservicegroupassigments() {
        return basicservicegroupassigments;
    }


    /**
     * Sets the basicservicegroupassigments value for this CugMembershipsBeanOut.
     * 
     * @param basicservicegroupassigments
     */
    public void setBasicservicegroupassigments(BasicserviceBeanOut[] basicservicegroupassigments) {
        this.basicservicegroupassigments = basicservicegroupassigments;
    }


    /**
     * Gets the cugId value for this CugMembershipsBeanOut.
     * 
     * @return cugId
     */
    public Long getCugId() {
        return cugId;
    }


    /**
     * Sets the cugId value for this CugMembershipsBeanOut.
     * 
     * @param cugId
     */
    public void setCugId(Long cugId) {
        this.cugId = cugId;
    }


    /**
     * Gets the cugIndex value for this CugMembershipsBeanOut.
     * 
     * @return cugIndex
     */
    public Long getCugIndex() {
        return cugIndex;
    }


    /**
     * Sets the cugIndex value for this CugMembershipsBeanOut.
     * 
     * @param cugIndex
     */
    public void setCugIndex(Long cugIndex) {
        this.cugIndex = cugIndex;
    }


    /**
     * Gets the cugInterlockCode value for this CugMembershipsBeanOut.
     * 
     * @return cugInterlockCode
     */
    public String getCugInterlockCode() {
        return cugInterlockCode;
    }


    /**
     * Sets the cugInterlockCode value for this CugMembershipsBeanOut.
     * 
     * @param cugInterlockCode
     */
    public void setCugInterlockCode(String cugInterlockCode) {
        this.cugInterlockCode = cugInterlockCode;
    }


    /**
     * Gets the cugName value for this CugMembershipsBeanOut.
     * 
     * @return cugName
     */
    public String getCugName() {
        return cugName;
    }


    /**
     * Sets the cugName value for this CugMembershipsBeanOut.
     * 
     * @param cugName
     */
    public void setCugName(String cugName) {
        this.cugName = cugName;
    }


    /**
     * Gets the cugPendingStatus value for this CugMembershipsBeanOut.
     * 
     * @return cugPendingStatus
     */
    public Integer getCugPendingStatus() {
        return cugPendingStatus;
    }


    /**
     * Sets the cugPendingStatus value for this CugMembershipsBeanOut.
     * 
     * @param cugPendingStatus
     */
    public void setCugPendingStatus(Integer cugPendingStatus) {
        this.cugPendingStatus = cugPendingStatus;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CugMembershipsBeanOut)) return false;
        CugMembershipsBeanOut other = (CugMembershipsBeanOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.basicservicegroupassigments==null && other.getBasicservicegroupassigments()==null) || 
             (this.basicservicegroupassigments!=null &&
              java.util.Arrays.equals(this.basicservicegroupassigments, other.getBasicservicegroupassigments()))) &&
            ((this.cugId==null && other.getCugId()==null) || 
             (this.cugId!=null &&
              this.cugId.equals(other.getCugId()))) &&
            ((this.cugIndex==null && other.getCugIndex()==null) || 
             (this.cugIndex!=null &&
              this.cugIndex.equals(other.getCugIndex()))) &&
            ((this.cugInterlockCode==null && other.getCugInterlockCode()==null) || 
             (this.cugInterlockCode!=null &&
              this.cugInterlockCode.equals(other.getCugInterlockCode()))) &&
            ((this.cugName==null && other.getCugName()==null) || 
             (this.cugName!=null &&
              this.cugName.equals(other.getCugName()))) &&
            ((this.cugPendingStatus==null && other.getCugPendingStatus()==null) || 
             (this.cugPendingStatus!=null &&
              this.cugPendingStatus.equals(other.getCugPendingStatus())));
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
        if (getBasicservicegroupassigments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBasicservicegroupassigments());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getBasicservicegroupassigments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCugId() != null) {
            _hashCode += getCugId().hashCode();
        }
        if (getCugIndex() != null) {
            _hashCode += getCugIndex().hashCode();
        }
        if (getCugInterlockCode() != null) {
            _hashCode += getCugInterlockCode().hashCode();
        }
        if (getCugName() != null) {
            _hashCode += getCugName().hashCode();
        }
        if (getCugPendingStatus() != null) {
            _hashCode += getCugPendingStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CugMembershipsBeanOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.contract_services_read.v2.beans.ws.lhs.com", "CugMembershipsBeanOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basicservicegroupassigments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.contract_services_read.v2.beans.ws.lhs.com", "basicservicegroupassigments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cug_memberships.services.contract_services_read.v2.beans.ws.lhs.com", "BasicservicegroupassigmentsBeanOut"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cugId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.contract_services_read.v2.beans.ws.lhs.com", "cugId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cugIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.contract_services_read.v2.beans.ws.lhs.com", "cugIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cugInterlockCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.contract_services_read.v2.beans.ws.lhs.com", "cugInterlockCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cugName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.contract_services_read.v2.beans.ws.lhs.com", "cugName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cugPendingStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.contract_services_read.v2.beans.ws.lhs.com", "cugPendingStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
