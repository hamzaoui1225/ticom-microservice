/**
 * MultValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soap.client.ContractHandling;

public class MultValue  extends BaseSOIBean implements java.io.Serializable {
    private DateBean validFrom;

    private String value;

    private String valueDes;

    private String valuePub;

    private Long valueSeqno;

    public MultValue() {
    }

    public MultValue(
           DateBean validFrom,
           String value,
           String valueDes,
           String valuePub,
           Long valueSeqno) {
        this.validFrom = validFrom;
        this.value = value;
        this.valueDes = valueDes;
        this.valuePub = valuePub;
        this.valueSeqno = valueSeqno;
    }


    /**
     * Gets the validFrom value for this MultValue.
     * 
     * @return validFrom
     */
    public DateBean getValidFrom() {
        return validFrom;
    }


    /**
     * Sets the validFrom value for this MultValue.
     * 
     * @param validFrom
     */
    public void setValidFrom(DateBean validFrom) {
        this.validFrom = validFrom;
    }


    /**
     * Gets the value value for this MultValue.
     * 
     * @return value
     */
    public String getValue() {
        return value;
    }


    /**
     * Sets the value value for this MultValue.
     * 
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }


    /**
     * Gets the valueDes value for this MultValue.
     * 
     * @return valueDes
     */
    public String getValueDes() {
        return valueDes;
    }


    /**
     * Sets the valueDes value for this MultValue.
     * 
     * @param valueDes
     */
    public void setValueDes(String valueDes) {
        this.valueDes = valueDes;
    }


    /**
     * Gets the valuePub value for this MultValue.
     * 
     * @return valuePub
     */
    public String getValuePub() {
        return valuePub;
    }


    /**
     * Sets the valuePub value for this MultValue.
     * 
     * @param valuePub
     */
    public void setValuePub(String valuePub) {
        this.valuePub = valuePub;
    }


    /**
     * Gets the valueSeqno value for this MultValue.
     * 
     * @return valueSeqno
     */
    public Long getValueSeqno() {
        return valueSeqno;
    }


    /**
     * Sets the valueSeqno value for this MultValue.
     * 
     * @param valueSeqno
     */
    public void setValueSeqno(Long valueSeqno) {
        this.valueSeqno = valueSeqno;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof MultValue)) return false;
        MultValue other = (MultValue) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.validFrom==null && other.getValidFrom()==null) || 
             (this.validFrom!=null &&
              this.validFrom.equals(other.getValidFrom()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue()))) &&
            ((this.valueDes==null && other.getValueDes()==null) || 
             (this.valueDes!=null &&
              this.valueDes.equals(other.getValueDes()))) &&
            ((this.valuePub==null && other.getValuePub()==null) || 
             (this.valuePub!=null &&
              this.valuePub.equals(other.getValuePub()))) &&
            ((this.valueSeqno==null && other.getValueSeqno()==null) || 
             (this.valueSeqno!=null &&
              this.valueSeqno.equals(other.getValueSeqno())));
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
        if (getValidFrom() != null) {
            _hashCode += getValidFrom().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        if (getValueDes() != null) {
            _hashCode += getValueDes().hashCode();
        }
        if (getValuePub() != null) {
            _hashCode += getValuePub().hashCode();
        }
        if (getValueSeqno() != null) {
            _hashCode += getValueSeqno().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MultValue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "MultValue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "validFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "DateBean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueDes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "valueDes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valuePub");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "valuePub"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueSeqno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "valueSeqno"));
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
