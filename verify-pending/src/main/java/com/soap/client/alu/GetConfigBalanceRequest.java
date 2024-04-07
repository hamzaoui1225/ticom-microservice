/**
 * GetConfigBalanceRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soap.client.alu;

public class GetConfigBalanceRequest  implements java.io.Serializable {
    private String desCible;

    private String desSource;

    private Long rpCodeCible;

    private Long rpCodeSource;

    private String valueSource;

    private String valueTarget;

    public GetConfigBalanceRequest() {
    }

    public GetConfigBalanceRequest(
           String desCible,
           String desSource,
           Long rpCodeCible,
           Long rpCodeSource,
           String valueSource,
           String valueTarget) {
           this.desCible = desCible;
           this.desSource = desSource;
           this.rpCodeCible = rpCodeCible;
           this.rpCodeSource = rpCodeSource;
           this.valueSource = valueSource;
           this.valueTarget = valueTarget;
    }


    /**
     * Gets the desCible value for this GetConfigBalanceRequest.
     * 
     * @return desCible
     */
    public String getDesCible() {
        return desCible;
    }


    /**
     * Sets the desCible value for this GetConfigBalanceRequest.
     * 
     * @param desCible
     */
    public void setDesCible(String desCible) {
        this.desCible = desCible;
    }


    /**
     * Gets the desSource value for this GetConfigBalanceRequest.
     * 
     * @return desSource
     */
    public String getDesSource() {
        return desSource;
    }


    /**
     * Sets the desSource value for this GetConfigBalanceRequest.
     * 
     * @param desSource
     */
    public void setDesSource(String desSource) {
        this.desSource = desSource;
    }


    /**
     * Gets the rpCodeCible value for this GetConfigBalanceRequest.
     * 
     * @return rpCodeCible
     */
    public Long getRpCodeCible() {
        return rpCodeCible;
    }


    /**
     * Sets the rpCodeCible value for this GetConfigBalanceRequest.
     * 
     * @param rpCodeCible
     */
    public void setRpCodeCible(Long rpCodeCible) {
        this.rpCodeCible = rpCodeCible;
    }


    /**
     * Gets the rpCodeSource value for this GetConfigBalanceRequest.
     * 
     * @return rpCodeSource
     */
    public Long getRpCodeSource() {
        return rpCodeSource;
    }


    /**
     * Sets the rpCodeSource value for this GetConfigBalanceRequest.
     * 
     * @param rpCodeSource
     */
    public void setRpCodeSource(Long rpCodeSource) {
        this.rpCodeSource = rpCodeSource;
    }


    /**
     * Gets the valueSource value for this GetConfigBalanceRequest.
     * 
     * @return valueSource
     */
    public String getValueSource() {
        return valueSource;
    }


    /**
     * Sets the valueSource value for this GetConfigBalanceRequest.
     * 
     * @param valueSource
     */
    public void setValueSource(String valueSource) {
        this.valueSource = valueSource;
    }


    /**
     * Gets the valueTarget value for this GetConfigBalanceRequest.
     * 
     * @return valueTarget
     */
    public String getValueTarget() {
        return valueTarget;
    }


    /**
     * Sets the valueTarget value for this GetConfigBalanceRequest.
     * 
     * @param valueTarget
     */
    public void setValueTarget(String valueTarget) {
        this.valueTarget = valueTarget;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetConfigBalanceRequest)) return false;
        GetConfigBalanceRequest other = (GetConfigBalanceRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.desCible==null && other.getDesCible()==null) || 
             (this.desCible!=null &&
              this.desCible.equals(other.getDesCible()))) &&
            ((this.desSource==null && other.getDesSource()==null) || 
             (this.desSource!=null &&
              this.desSource.equals(other.getDesSource()))) &&
            ((this.rpCodeCible==null && other.getRpCodeCible()==null) || 
             (this.rpCodeCible!=null &&
              this.rpCodeCible.equals(other.getRpCodeCible()))) &&
            ((this.rpCodeSource==null && other.getRpCodeSource()==null) || 
             (this.rpCodeSource!=null &&
              this.rpCodeSource.equals(other.getRpCodeSource()))) &&
            ((this.valueSource==null && other.getValueSource()==null) || 
             (this.valueSource!=null &&
              this.valueSource.equals(other.getValueSource()))) &&
            ((this.valueTarget==null && other.getValueTarget()==null) || 
             (this.valueTarget!=null &&
              this.valueTarget.equals(other.getValueTarget())));
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
        if (getDesCible() != null) {
            _hashCode += getDesCible().hashCode();
        }
        if (getDesSource() != null) {
            _hashCode += getDesSource().hashCode();
        }
        if (getRpCodeCible() != null) {
            _hashCode += getRpCodeCible().hashCode();
        }
        if (getRpCodeSource() != null) {
            _hashCode += getRpCodeSource().hashCode();
        }
        if (getValueSource() != null) {
            _hashCode += getValueSource().hashCode();
        }
        if (getValueTarget() != null) {
            _hashCode += getValueTarget().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetConfigBalanceRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetConfigBalanceRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("desCible");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "desCible"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("desSource");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "desSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rpCodeCible");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "rpCodeCible"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rpCodeSource");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "rpCodeSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueSource");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "valueSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueTarget");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "valueTarget"));
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
