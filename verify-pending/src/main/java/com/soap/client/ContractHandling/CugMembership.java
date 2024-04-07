/**
 * CugMembership.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soap.client.ContractHandling;

public class CugMembership  extends BaseSOIBean implements java.io.Serializable {
    private BasicServiceGroupAssignment[] basicservicegroupassigments;

    private Long cugId;

    public CugMembership() {
    }

    public CugMembership(
           BasicServiceGroupAssignment[] basicservicegroupassigments,
           Long cugId) {
        this.basicservicegroupassigments = basicservicegroupassigments;
        this.cugId = cugId;
    }


    /**
     * Gets the basicservicegroupassigments value for this CugMembership.
     * 
     * @return basicservicegroupassigments
     */
    public BasicServiceGroupAssignment[] getBasicservicegroupassigments() {
        return basicservicegroupassigments;
    }


    /**
     * Sets the basicservicegroupassigments value for this CugMembership.
     * 
     * @param basicservicegroupassigments
     */
    public void setBasicservicegroupassigments(BasicServiceGroupAssignment[] basicservicegroupassigments) {
        this.basicservicegroupassigments = basicservicegroupassigments;
    }


    /**
     * Gets the cugId value for this CugMembership.
     * 
     * @return cugId
     */
    public Long getCugId() {
        return cugId;
    }


    /**
     * Sets the cugId value for this CugMembership.
     * 
     * @param cugId
     */
    public void setCugId(Long cugId) {
        this.cugId = cugId;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CugMembership)) return false;
        CugMembership other = (CugMembership) obj;
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
              this.cugId.equals(other.getCugId())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CugMembership.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CugMembership"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basicservicegroupassigments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "basicservicegroupassigments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "BasicServiceGroupAssignment"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cugId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "cugId"));
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
