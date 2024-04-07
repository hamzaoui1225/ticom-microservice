/**
 * Port.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soap.client.ContractHandling;

public class Port  extends BaseSOIBean implements java.io.Serializable {
    private String extResourceTypeCode;

    private Long npcode;

    private String npcodePub;

    private Long portId;

    public Port() {
    }

    public Port(
           String extResourceTypeCode,
           Long npcode,
           String npcodePub,
           Long portId) {
        this.extResourceTypeCode = extResourceTypeCode;
        this.npcode = npcode;
        this.npcodePub = npcodePub;
        this.portId = portId;
    }


    /**
     * Gets the extResourceTypeCode value for this Port.
     * 
     * @return extResourceTypeCode
     */
    public String getExtResourceTypeCode() {
        return extResourceTypeCode;
    }


    /**
     * Sets the extResourceTypeCode value for this Port.
     * 
     * @param extResourceTypeCode
     */
    public void setExtResourceTypeCode(String extResourceTypeCode) {
        this.extResourceTypeCode = extResourceTypeCode;
    }


    /**
     * Gets the npcode value for this Port.
     * 
     * @return npcode
     */
    public Long getNpcode() {
        return npcode;
    }


    /**
     * Sets the npcode value for this Port.
     * 
     * @param npcode
     */
    public void setNpcode(Long npcode) {
        this.npcode = npcode;
    }


    /**
     * Gets the npcodePub value for this Port.
     * 
     * @return npcodePub
     */
    public String getNpcodePub() {
        return npcodePub;
    }


    /**
     * Sets the npcodePub value for this Port.
     * 
     * @param npcodePub
     */
    public void setNpcodePub(String npcodePub) {
        this.npcodePub = npcodePub;
    }


    /**
     * Gets the portId value for this Port.
     * 
     * @return portId
     */
    public Long getPortId() {
        return portId;
    }


    /**
     * Sets the portId value for this Port.
     * 
     * @param portId
     */
    public void setPortId(Long portId) {
        this.portId = portId;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof Port)) return false;
        Port other = (Port) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.extResourceTypeCode==null && other.getExtResourceTypeCode()==null) || 
             (this.extResourceTypeCode!=null &&
              this.extResourceTypeCode.equals(other.getExtResourceTypeCode()))) &&
            ((this.npcode==null && other.getNpcode()==null) || 
             (this.npcode!=null &&
              this.npcode.equals(other.getNpcode()))) &&
            ((this.npcodePub==null && other.getNpcodePub()==null) || 
             (this.npcodePub!=null &&
              this.npcodePub.equals(other.getNpcodePub()))) &&
            ((this.portId==null && other.getPortId()==null) || 
             (this.portId!=null &&
              this.portId.equals(other.getPortId())));
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
        if (getExtResourceTypeCode() != null) {
            _hashCode += getExtResourceTypeCode().hashCode();
        }
        if (getNpcode() != null) {
            _hashCode += getNpcode().hashCode();
        }
        if (getNpcodePub() != null) {
            _hashCode += getNpcodePub().hashCode();
        }
        if (getPortId() != null) {
            _hashCode += getPortId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Port.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "Port"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extResourceTypeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "extResourceTypeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("portId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "portId"));
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
