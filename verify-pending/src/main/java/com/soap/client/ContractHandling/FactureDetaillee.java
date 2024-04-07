/**
 * FactureDetaillee.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soap.client.ContractHandling;

public class FactureDetaillee  implements java.io.Serializable {
    private String coCode;

    private Long coId;

    private Long csId;

    private String detailedInvoiceReferenceNumber;

    private String invoiceReferenceNumber;

    private String msisdn;

    public FactureDetaillee() {
    }

    public FactureDetaillee(
           String coCode,
           Long coId,
           Long csId,
           String detailedInvoiceReferenceNumber,
           String invoiceReferenceNumber,
           String msisdn) {
           this.coCode = coCode;
           this.coId = coId;
           this.csId = csId;
           this.detailedInvoiceReferenceNumber = detailedInvoiceReferenceNumber;
           this.invoiceReferenceNumber = invoiceReferenceNumber;
           this.msisdn = msisdn;
    }


    /**
     * Gets the coCode value for this FactureDetaillee.
     * 
     * @return coCode
     */
    public String getCoCode() {
        return coCode;
    }


    /**
     * Sets the coCode value for this FactureDetaillee.
     * 
     * @param coCode
     */
    public void setCoCode(String coCode) {
        this.coCode = coCode;
    }


    /**
     * Gets the coId value for this FactureDetaillee.
     * 
     * @return coId
     */
    public Long getCoId() {
        return coId;
    }


    /**
     * Sets the coId value for this FactureDetaillee.
     * 
     * @param coId
     */
    public void setCoId(Long coId) {
        this.coId = coId;
    }


    /**
     * Gets the csId value for this FactureDetaillee.
     * 
     * @return csId
     */
    public Long getCsId() {
        return csId;
    }


    /**
     * Sets the csId value for this FactureDetaillee.
     * 
     * @param csId
     */
    public void setCsId(Long csId) {
        this.csId = csId;
    }


    /**
     * Gets the detailedInvoiceReferenceNumber value for this FactureDetaillee.
     * 
     * @return detailedInvoiceReferenceNumber
     */
    public String getDetailedInvoiceReferenceNumber() {
        return detailedInvoiceReferenceNumber;
    }


    /**
     * Sets the detailedInvoiceReferenceNumber value for this FactureDetaillee.
     * 
     * @param detailedInvoiceReferenceNumber
     */
    public void setDetailedInvoiceReferenceNumber(String detailedInvoiceReferenceNumber) {
        this.detailedInvoiceReferenceNumber = detailedInvoiceReferenceNumber;
    }


    /**
     * Gets the invoiceReferenceNumber value for this FactureDetaillee.
     * 
     * @return invoiceReferenceNumber
     */
    public String getInvoiceReferenceNumber() {
        return invoiceReferenceNumber;
    }


    /**
     * Sets the invoiceReferenceNumber value for this FactureDetaillee.
     * 
     * @param invoiceReferenceNumber
     */
    public void setInvoiceReferenceNumber(String invoiceReferenceNumber) {
        this.invoiceReferenceNumber = invoiceReferenceNumber;
    }


    /**
     * Gets the msisdn value for this FactureDetaillee.
     * 
     * @return msisdn
     */
    public String getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this FactureDetaillee.
     * 
     * @param msisdn
     */
    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof FactureDetaillee)) return false;
        FactureDetaillee other = (FactureDetaillee) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.coCode==null && other.getCoCode()==null) || 
             (this.coCode!=null &&
              this.coCode.equals(other.getCoCode()))) &&
            ((this.coId==null && other.getCoId()==null) || 
             (this.coId!=null &&
              this.coId.equals(other.getCoId()))) &&
            ((this.csId==null && other.getCsId()==null) || 
             (this.csId!=null &&
              this.csId.equals(other.getCsId()))) &&
            ((this.detailedInvoiceReferenceNumber==null && other.getDetailedInvoiceReferenceNumber()==null) || 
             (this.detailedInvoiceReferenceNumber!=null &&
              this.detailedInvoiceReferenceNumber.equals(other.getDetailedInvoiceReferenceNumber()))) &&
            ((this.invoiceReferenceNumber==null && other.getInvoiceReferenceNumber()==null) || 
             (this.invoiceReferenceNumber!=null &&
              this.invoiceReferenceNumber.equals(other.getInvoiceReferenceNumber()))) &&
            ((this.msisdn==null && other.getMsisdn()==null) || 
             (this.msisdn!=null &&
              this.msisdn.equals(other.getMsisdn())));
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
        if (getCoCode() != null) {
            _hashCode += getCoCode().hashCode();
        }
        if (getCoId() != null) {
            _hashCode += getCoId().hashCode();
        }
        if (getCsId() != null) {
            _hashCode += getCsId().hashCode();
        }
        if (getDetailedInvoiceReferenceNumber() != null) {
            _hashCode += getDetailedInvoiceReferenceNumber().hashCode();
        }
        if (getInvoiceReferenceNumber() != null) {
            _hashCode += getInvoiceReferenceNumber().hashCode();
        }
        if (getMsisdn() != null) {
            _hashCode += getMsisdn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FactureDetaillee.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "FactureDetaillee"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "coCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "coId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("csId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "csId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detailedInvoiceReferenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "detailedInvoiceReferenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceReferenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "invoiceReferenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "msisdn"));
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
