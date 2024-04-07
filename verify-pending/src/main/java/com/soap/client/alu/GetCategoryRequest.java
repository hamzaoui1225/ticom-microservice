/**
 * GetCategoryRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soap.client.alu;

public class GetCategoryRequest  implements java.io.Serializable {
    private Long rpCodeInit;

    private Long rpCodeTarget;

    public GetCategoryRequest() {
    }

    public GetCategoryRequest(
           Long rpCodeInit,
           Long rpCodeTarget) {
           this.rpCodeInit = rpCodeInit;
           this.rpCodeTarget = rpCodeTarget;
    }


    /**
     * Gets the rpCodeInit value for this GetCategoryRequest.
     * 
     * @return rpCodeInit
     */
    public Long getRpCodeInit() {
        return rpCodeInit;
    }


    /**
     * Sets the rpCodeInit value for this GetCategoryRequest.
     * 
     * @param rpCodeInit
     */
    public void setRpCodeInit(Long rpCodeInit) {
        this.rpCodeInit = rpCodeInit;
    }


    /**
     * Gets the rpCodeTarget value for this GetCategoryRequest.
     * 
     * @return rpCodeTarget
     */
    public Long getRpCodeTarget() {
        return rpCodeTarget;
    }


    /**
     * Sets the rpCodeTarget value for this GetCategoryRequest.
     * 
     * @param rpCodeTarget
     */
    public void setRpCodeTarget(Long rpCodeTarget) {
        this.rpCodeTarget = rpCodeTarget;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetCategoryRequest)) return false;
        GetCategoryRequest other = (GetCategoryRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rpCodeInit==null && other.getRpCodeInit()==null) || 
             (this.rpCodeInit!=null &&
              this.rpCodeInit.equals(other.getRpCodeInit()))) &&
            ((this.rpCodeTarget==null && other.getRpCodeTarget()==null) || 
             (this.rpCodeTarget!=null &&
              this.rpCodeTarget.equals(other.getRpCodeTarget())));
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
        if (getRpCodeInit() != null) {
            _hashCode += getRpCodeInit().hashCode();
        }
        if (getRpCodeTarget() != null) {
            _hashCode += getRpCodeTarget().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCategoryRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetCategoryRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rpCodeInit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "rpCodeInit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rpCodeTarget");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "rpCodeTarget"));
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
