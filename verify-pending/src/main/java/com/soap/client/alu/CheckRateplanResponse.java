/**
 * CheckRateplanResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soap.client.alu;

public class CheckRateplanResponse  extends OperationResponse implements java.io.Serializable {
    private Service[] communServices;

    private Service[] incompatibleServices;

    private Boolean isCompatible;

    private Service[] missingServices;

    public CheckRateplanResponse() {
    }

    public CheckRateplanResponse(
           String bscsErrorCode,
           String comment,
           Boolean isSuccessful,
           Service[] communServices,
           Service[] incompatibleServices,
           Boolean isCompatible,
           Service[] missingServices) {
        super(
            bscsErrorCode,
            comment,
            isSuccessful);
        this.communServices = communServices;
        this.incompatibleServices = incompatibleServices;
        this.isCompatible = isCompatible;
        this.missingServices = missingServices;
    }


    /**
     * Gets the communServices value for this CheckRateplanResponse.
     * 
     * @return communServices
     */
    public Service[] getCommunServices() {
        return communServices;
    }


    /**
     * Sets the communServices value for this CheckRateplanResponse.
     * 
     * @param communServices
     */
    public void setCommunServices(Service[] communServices) {
        this.communServices = communServices;
    }


    /**
     * Gets the incompatibleServices value for this CheckRateplanResponse.
     * 
     * @return incompatibleServices
     */
    public Service[] getIncompatibleServices() {
        return incompatibleServices;
    }


    /**
     * Sets the incompatibleServices value for this CheckRateplanResponse.
     * 
     * @param incompatibleServices
     */
    public void setIncompatibleServices(Service[] incompatibleServices) {
        this.incompatibleServices = incompatibleServices;
    }


    /**
     * Gets the isCompatible value for this CheckRateplanResponse.
     * 
     * @return isCompatible
     */
    public Boolean getIsCompatible() {
        return isCompatible;
    }


    /**
     * Sets the isCompatible value for this CheckRateplanResponse.
     * 
     * @param isCompatible
     */
    public void setIsCompatible(Boolean isCompatible) {
        this.isCompatible = isCompatible;
    }


    /**
     * Gets the missingServices value for this CheckRateplanResponse.
     * 
     * @return missingServices
     */
    public Service[] getMissingServices() {
        return missingServices;
    }


    /**
     * Sets the missingServices value for this CheckRateplanResponse.
     * 
     * @param missingServices
     */
    public void setMissingServices(Service[] missingServices) {
        this.missingServices = missingServices;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CheckRateplanResponse)) return false;
        CheckRateplanResponse other = (CheckRateplanResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.communServices==null && other.getCommunServices()==null) || 
             (this.communServices!=null &&
              java.util.Arrays.equals(this.communServices, other.getCommunServices()))) &&
            ((this.incompatibleServices==null && other.getIncompatibleServices()==null) || 
             (this.incompatibleServices!=null &&
              java.util.Arrays.equals(this.incompatibleServices, other.getIncompatibleServices()))) &&
            ((this.isCompatible==null && other.getIsCompatible()==null) || 
             (this.isCompatible!=null &&
              this.isCompatible.equals(other.getIsCompatible()))) &&
            ((this.missingServices==null && other.getMissingServices()==null) || 
             (this.missingServices!=null &&
              java.util.Arrays.equals(this.missingServices, other.getMissingServices())));
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
        if (getCommunServices() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCommunServices());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getCommunServices(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIncompatibleServices() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIncompatibleServices());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getIncompatibleServices(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsCompatible() != null) {
            _hashCode += getIsCompatible().hashCode();
        }
        if (getMissingServices() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMissingServices());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getMissingServices(), i);
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
        new org.apache.axis.description.TypeDesc(CheckRateplanResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CheckRateplanResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("communServices");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "communServices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "Service"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("incompatibleServices");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "incompatibleServices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "Service"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isCompatible");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "isCompatible"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("missingServices");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "missingServices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "Service"));
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
