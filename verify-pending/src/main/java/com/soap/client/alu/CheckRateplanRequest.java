/**
 * CheckRateplanRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soap.client.alu;

public class CheckRateplanRequest  implements java.io.Serializable {
    private Long coId;

    private String des;

    private Long rpcode;

    private Long templateId;

    private String value;

    public CheckRateplanRequest() {
    }

    public CheckRateplanRequest(
           Long coId,
           String des,
           Long rpcode,
           Long templateId,
           String value) {
           this.coId = coId;
           this.des = des;
           this.rpcode = rpcode;
           this.templateId = templateId;
           this.value = value;
    }


    /**
     * Gets the coId value for this CheckRateplanRequest.
     * 
     * @return coId
     */
    public Long getCoId() {
        return coId;
    }


    /**
     * Sets the coId value for this CheckRateplanRequest.
     * 
     * @param coId
     */
    public void setCoId(Long coId) {
        this.coId = coId;
    }


    /**
     * Gets the des value for this CheckRateplanRequest.
     * 
     * @return des
     */
    public String getDes() {
        return des;
    }


    /**
     * Sets the des value for this CheckRateplanRequest.
     * 
     * @param des
     */
    public void setDes(String des) {
        this.des = des;
    }


    /**
     * Gets the rpcode value for this CheckRateplanRequest.
     * 
     * @return rpcode
     */
    public Long getRpcode() {
        return rpcode;
    }


    /**
     * Sets the rpcode value for this CheckRateplanRequest.
     * 
     * @param rpcode
     */
    public void setRpcode(Long rpcode) {
        this.rpcode = rpcode;
    }


    /**
     * Gets the templateId value for this CheckRateplanRequest.
     * 
     * @return templateId
     */
    public Long getTemplateId() {
        return templateId;
    }


    /**
     * Sets the templateId value for this CheckRateplanRequest.
     * 
     * @param templateId
     */
    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }


    /**
     * Gets the value value for this CheckRateplanRequest.
     * 
     * @return value
     */
    public String getValue() {
        return value;
    }


    /**
     * Sets the value value for this CheckRateplanRequest.
     * 
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CheckRateplanRequest)) return false;
        CheckRateplanRequest other = (CheckRateplanRequest) obj;
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
            ((this.des==null && other.getDes()==null) || 
             (this.des!=null &&
              this.des.equals(other.getDes()))) &&
            ((this.rpcode==null && other.getRpcode()==null) || 
             (this.rpcode!=null &&
              this.rpcode.equals(other.getRpcode()))) &&
            ((this.templateId==null && other.getTemplateId()==null) || 
             (this.templateId!=null &&
              this.templateId.equals(other.getTemplateId()))) &&
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
        if (getCoId() != null) {
            _hashCode += getCoId().hashCode();
        }
        if (getDes() != null) {
            _hashCode += getDes().hashCode();
        }
        if (getRpcode() != null) {
            _hashCode += getRpcode().hashCode();
        }
        if (getTemplateId() != null) {
            _hashCode += getTemplateId().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CheckRateplanRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CheckRateplanRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "coId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("des");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "des"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rpcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "rpcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("templateId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "templateId"));
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
