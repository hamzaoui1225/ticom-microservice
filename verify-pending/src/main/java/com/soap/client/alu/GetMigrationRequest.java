/**
 * GetMigrationRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soap.client.alu;

public class GetMigrationRequest  implements java.io.Serializable {
    private String desInit;

    private String desTarget;

    private Long rpCodeInit;

    private Long rpCodeTarget;

    private String valueSource;

    private String valueTarget;

    public GetMigrationRequest() {
    }

    public GetMigrationRequest(
           String desInit,
           String desTarget,
           Long rpCodeInit,
           Long rpCodeTarget,
           String valueSource,
           String valueTarget) {
           this.desInit = desInit;
           this.desTarget = desTarget;
           this.rpCodeInit = rpCodeInit;
           this.rpCodeTarget = rpCodeTarget;
           this.valueSource = valueSource;
           this.valueTarget = valueTarget;
    }


    /**
     * Gets the desInit value for this GetMigrationRequest.
     * 
     * @return desInit
     */
    public String getDesInit() {
        return desInit;
    }


    /**
     * Sets the desInit value for this GetMigrationRequest.
     * 
     * @param desInit
     */
    public void setDesInit(String desInit) {
        this.desInit = desInit;
    }


    /**
     * Gets the desTarget value for this GetMigrationRequest.
     * 
     * @return desTarget
     */
    public String getDesTarget() {
        return desTarget;
    }


    /**
     * Sets the desTarget value for this GetMigrationRequest.
     * 
     * @param desTarget
     */
    public void setDesTarget(String desTarget) {
        this.desTarget = desTarget;
    }


    /**
     * Gets the rpCodeInit value for this GetMigrationRequest.
     * 
     * @return rpCodeInit
     */
    public Long getRpCodeInit() {
        return rpCodeInit;
    }


    /**
     * Sets the rpCodeInit value for this GetMigrationRequest.
     * 
     * @param rpCodeInit
     */
    public void setRpCodeInit(Long rpCodeInit) {
        this.rpCodeInit = rpCodeInit;
    }


    /**
     * Gets the rpCodeTarget value for this GetMigrationRequest.
     * 
     * @return rpCodeTarget
     */
    public Long getRpCodeTarget() {
        return rpCodeTarget;
    }


    /**
     * Sets the rpCodeTarget value for this GetMigrationRequest.
     * 
     * @param rpCodeTarget
     */
    public void setRpCodeTarget(Long rpCodeTarget) {
        this.rpCodeTarget = rpCodeTarget;
    }


    /**
     * Gets the valueSource value for this GetMigrationRequest.
     * 
     * @return valueSource
     */
    public String getValueSource() {
        return valueSource;
    }


    /**
     * Sets the valueSource value for this GetMigrationRequest.
     * 
     * @param valueSource
     */
    public void setValueSource(String valueSource) {
        this.valueSource = valueSource;
    }


    /**
     * Gets the valueTarget value for this GetMigrationRequest.
     * 
     * @return valueTarget
     */
    public String getValueTarget() {
        return valueTarget;
    }


    /**
     * Sets the valueTarget value for this GetMigrationRequest.
     * 
     * @param valueTarget
     */
    public void setValueTarget(String valueTarget) {
        this.valueTarget = valueTarget;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetMigrationRequest)) return false;
        GetMigrationRequest other = (GetMigrationRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.desInit==null && other.getDesInit()==null) || 
             (this.desInit!=null &&
              this.desInit.equals(other.getDesInit()))) &&
            ((this.desTarget==null && other.getDesTarget()==null) || 
             (this.desTarget!=null &&
              this.desTarget.equals(other.getDesTarget()))) &&
            ((this.rpCodeInit==null && other.getRpCodeInit()==null) || 
             (this.rpCodeInit!=null &&
              this.rpCodeInit.equals(other.getRpCodeInit()))) &&
            ((this.rpCodeTarget==null && other.getRpCodeTarget()==null) || 
             (this.rpCodeTarget!=null &&
              this.rpCodeTarget.equals(other.getRpCodeTarget()))) &&
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
        if (getDesInit() != null) {
            _hashCode += getDesInit().hashCode();
        }
        if (getDesTarget() != null) {
            _hashCode += getDesTarget().hashCode();
        }
        if (getRpCodeInit() != null) {
            _hashCode += getRpCodeInit().hashCode();
        }
        if (getRpCodeTarget() != null) {
            _hashCode += getRpCodeTarget().hashCode();
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
        new org.apache.axis.description.TypeDesc(GetMigrationRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetMigrationRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("desInit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "desInit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("desTarget");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "desTarget"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
