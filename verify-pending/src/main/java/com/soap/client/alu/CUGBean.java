/**
 * CUGBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soap.client.alu;


import com.soap.client.lhs.ws.beans.v2.contract_service_cug_parameters_read.NumParamsBeanOut;
import com.soap.client.lhs.ws.beans.v2.contract_services_read.services.CugMembershipsBeanOut;

public class CUGBean  implements java.io.Serializable {
    private CugMembershipsBeanOut[] memberShipList;

    private NumParamsBeanOut[] numParams;

    private Long snCode;

    private Long spCode;

    public CUGBean() {
    }

    public CUGBean(
           CugMembershipsBeanOut[] memberShipList,
           NumParamsBeanOut[] numParams,
           Long snCode,
           Long spCode) {
           this.memberShipList = memberShipList;
           this.numParams = numParams;
           this.snCode = snCode;
           this.spCode = spCode;
    }


    /**
     * Gets the memberShipList value for this CUGBean.
     * 
     * @return memberShipList
     */
    public CugMembershipsBeanOut[] getMemberShipList() {
        return memberShipList;
    }


    /**
     * Sets the memberShipList value for this CUGBean.
     * 
     * @param memberShipList
     */
    public void setMemberShipList(CugMembershipsBeanOut[] memberShipList) {
        this.memberShipList = memberShipList;
    }


    /**
     * Gets the numParams value for this CUGBean.
     * 
     * @return numParams
     */
    public NumParamsBeanOut[] getNumParams() {
        return numParams;
    }


    /**
     * Sets the numParams value for this CUGBean.
     * 
     * @param numParams
     */
    public void setNumParams(NumParamsBeanOut[] numParams) {
        this.numParams = numParams;
    }


    /**
     * Gets the snCode value for this CUGBean.
     * 
     * @return snCode
     */
    public Long getSnCode() {
        return snCode;
    }


    /**
     * Sets the snCode value for this CUGBean.
     * 
     * @param snCode
     */
    public void setSnCode(Long snCode) {
        this.snCode = snCode;
    }


    /**
     * Gets the spCode value for this CUGBean.
     * 
     * @return spCode
     */
    public Long getSpCode() {
        return spCode;
    }


    /**
     * Sets the spCode value for this CUGBean.
     * 
     * @param spCode
     */
    public void setSpCode(Long spCode) {
        this.spCode = spCode;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CUGBean)) return false;
        CUGBean other = (CUGBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.memberShipList==null && other.getMemberShipList()==null) || 
             (this.memberShipList!=null &&
              java.util.Arrays.equals(this.memberShipList, other.getMemberShipList()))) &&
            ((this.numParams==null && other.getNumParams()==null) || 
             (this.numParams!=null &&
              java.util.Arrays.equals(this.numParams, other.getNumParams()))) &&
            ((this.snCode==null && other.getSnCode()==null) || 
             (this.snCode!=null &&
              this.snCode.equals(other.getSnCode()))) &&
            ((this.spCode==null && other.getSpCode()==null) || 
             (this.spCode!=null &&
              this.spCode.equals(other.getSpCode())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getMemberShipList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMemberShipList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getMemberShipList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNumParams() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNumParams());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getNumParams(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSnCode() != null) {
            _hashCode += getSnCode().hashCode();
        }
        if (getSpCode() != null) {
            _hashCode += getSpCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CUGBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CUGBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memberShipList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "memberShipList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.contract_services_read.v2.beans.ws.lhs.com", "CugMembershipsBeanOut"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numParams");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "numParams"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://contract_service_cug_parameters_read.v2.beans.ws.lhs.com", "NumParamsBeanOut"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("snCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "snCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "spCode"));
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
