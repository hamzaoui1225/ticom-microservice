/**
 * AddCugRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soap.client.alu;

public class AddCugRequest  implements java.io.Serializable {
    private Long coId;

    private CUGBean[] cugs;

    public AddCugRequest() {
    }

    public AddCugRequest(
           Long coId,
           CUGBean[] cugs) {
           this.coId = coId;
           this.cugs = cugs;
    }


    /**
     * Gets the coId value for this AddCugRequest.
     * 
     * @return coId
     */
    public Long getCoId() {
        return coId;
    }


    /**
     * Sets the coId value for this AddCugRequest.
     * 
     * @param coId
     */
    public void setCoId(Long coId) {
        this.coId = coId;
    }


    /**
     * Gets the cugs value for this AddCugRequest.
     * 
     * @return cugs
     */
    public CUGBean[] getCugs() {
        return cugs;
    }


    /**
     * Sets the cugs value for this AddCugRequest.
     * 
     * @param cugs
     */
    public void setCugs(CUGBean[] cugs) {
        this.cugs = cugs;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof AddCugRequest)) return false;
        AddCugRequest other = (AddCugRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.coId==null && other.getCoId()==null) || 
             (this.coId!=null &&
              this.coId.equals(other.getCoId()))) &&
            ((this.cugs==null && other.getCugs()==null) || 
             (this.cugs!=null &&
              java.util.Arrays.equals(this.cugs, other.getCugs())));
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
        if (getCoId() != null) {
            _hashCode += getCoId().hashCode();
        }
        if (getCugs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCugs());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getCugs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddCugRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "AddCugRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "coId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cugs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "cugs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CUGBean"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item"));
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
