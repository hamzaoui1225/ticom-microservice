/**
 * GetServiceRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soap.client.alu;

public class GetServiceRequest  implements java.io.Serializable {
    private String des;

    private Long prgCode;

    private Long rpCode;

    private String value;

    public GetServiceRequest() {
    }

    public GetServiceRequest(
           String des,
           Long prgCode,
           Long rpCode,
           String value) {
           this.des = des;
           this.prgCode = prgCode;
           this.rpCode = rpCode;
           this.value = value;
    }


    /**
     * Gets the des value for this GetServiceRequest.
     * 
     * @return des
     */
    public String getDes() {
        return des;
    }


    /**
     * Sets the des value for this GetServiceRequest.
     * 
     * @param des
     */
    public void setDes(String des) {
        this.des = des;
    }


    /**
     * Gets the prgCode value for this GetServiceRequest.
     * 
     * @return prgCode
     */
    public Long getPrgCode() {
        return prgCode;
    }


    /**
     * Sets the prgCode value for this GetServiceRequest.
     * 
     * @param prgCode
     */
    public void setPrgCode(Long prgCode) {
        this.prgCode = prgCode;
    }


    /**
     * Gets the rpCode value for this GetServiceRequest.
     * 
     * @return rpCode
     */
    public Long getRpCode() {
        return rpCode;
    }


    /**
     * Sets the rpCode value for this GetServiceRequest.
     * 
     * @param rpCode
     */
    public void setRpCode(Long rpCode) {
        this.rpCode = rpCode;
    }


    /**
     * Gets the value value for this GetServiceRequest.
     * 
     * @return value
     */
    public String getValue() {
        return value;
    }


    /**
     * Sets the value value for this GetServiceRequest.
     * 
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetServiceRequest)) return false;
        GetServiceRequest other = (GetServiceRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.des==null && other.getDes()==null) || 
             (this.des!=null &&
              this.des.equals(other.getDes()))) &&
            ((this.prgCode==null && other.getPrgCode()==null) || 
             (this.prgCode!=null &&
              this.prgCode.equals(other.getPrgCode()))) &&
            ((this.rpCode==null && other.getRpCode()==null) || 
             (this.rpCode!=null &&
              this.rpCode.equals(other.getRpCode()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue())));
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
        if (getDes() != null) {
            _hashCode += getDes().hashCode();
        }
        if (getPrgCode() != null) {
            _hashCode += getPrgCode().hashCode();
        }
        if (getRpCode() != null) {
            _hashCode += getRpCode().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetServiceRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetServiceRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("des");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "des"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prgCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "prgCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rpCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "rpCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "value"));
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
