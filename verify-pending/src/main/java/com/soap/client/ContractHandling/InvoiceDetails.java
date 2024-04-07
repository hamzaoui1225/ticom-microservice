/**
 * InvoiceDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soap.client.ContractHandling;

public class InvoiceDetails  implements java.io.Serializable {
    private java.math.BigDecimal amountToPay;

    private String billPath;

    private java.math.BigDecimal billedAmount;

    private java.util.Calendar expectedPayementDate;

    private java.util.Calendar lastPayementDate;

    private java.math.BigDecimal orderNumber;

    private java.math.BigDecimal payementAtDate;

    private String referenceNumber;

    private java.util.Calendar sentDate;

    private java.util.Calendar totalPayementDate;

    public InvoiceDetails() {
    }

    public InvoiceDetails(
           java.math.BigDecimal amountToPay,
           String billPath,
           java.math.BigDecimal billedAmount,
           java.util.Calendar expectedPayementDate,
           java.util.Calendar lastPayementDate,
           java.math.BigDecimal orderNumber,
           java.math.BigDecimal payementAtDate,
           String referenceNumber,
           java.util.Calendar sentDate,
           java.util.Calendar totalPayementDate) {
           this.amountToPay = amountToPay;
           this.billPath = billPath;
           this.billedAmount = billedAmount;
           this.expectedPayementDate = expectedPayementDate;
           this.lastPayementDate = lastPayementDate;
           this.orderNumber = orderNumber;
           this.payementAtDate = payementAtDate;
           this.referenceNumber = referenceNumber;
           this.sentDate = sentDate;
           this.totalPayementDate = totalPayementDate;
    }


    /**
     * Gets the amountToPay value for this InvoiceDetails.
     * 
     * @return amountToPay
     */
    public java.math.BigDecimal getAmountToPay() {
        return amountToPay;
    }


    /**
     * Sets the amountToPay value for this InvoiceDetails.
     * 
     * @param amountToPay
     */
    public void setAmountToPay(java.math.BigDecimal amountToPay) {
        this.amountToPay = amountToPay;
    }


    /**
     * Gets the billPath value for this InvoiceDetails.
     * 
     * @return billPath
     */
    public String getBillPath() {
        return billPath;
    }


    /**
     * Sets the billPath value for this InvoiceDetails.
     * 
     * @param billPath
     */
    public void setBillPath(String billPath) {
        this.billPath = billPath;
    }


    /**
     * Gets the billedAmount value for this InvoiceDetails.
     * 
     * @return billedAmount
     */
    public java.math.BigDecimal getBilledAmount() {
        return billedAmount;
    }


    /**
     * Sets the billedAmount value for this InvoiceDetails.
     * 
     * @param billedAmount
     */
    public void setBilledAmount(java.math.BigDecimal billedAmount) {
        this.billedAmount = billedAmount;
    }


    /**
     * Gets the expectedPayementDate value for this InvoiceDetails.
     * 
     * @return expectedPayementDate
     */
    public java.util.Calendar getExpectedPayementDate() {
        return expectedPayementDate;
    }


    /**
     * Sets the expectedPayementDate value for this InvoiceDetails.
     * 
     * @param expectedPayementDate
     */
    public void setExpectedPayementDate(java.util.Calendar expectedPayementDate) {
        this.expectedPayementDate = expectedPayementDate;
    }


    /**
     * Gets the lastPayementDate value for this InvoiceDetails.
     * 
     * @return lastPayementDate
     */
    public java.util.Calendar getLastPayementDate() {
        return lastPayementDate;
    }


    /**
     * Sets the lastPayementDate value for this InvoiceDetails.
     * 
     * @param lastPayementDate
     */
    public void setLastPayementDate(java.util.Calendar lastPayementDate) {
        this.lastPayementDate = lastPayementDate;
    }


    /**
     * Gets the orderNumber value for this InvoiceDetails.
     * 
     * @return orderNumber
     */
    public java.math.BigDecimal getOrderNumber() {
        return orderNumber;
    }


    /**
     * Sets the orderNumber value for this InvoiceDetails.
     * 
     * @param orderNumber
     */
    public void setOrderNumber(java.math.BigDecimal orderNumber) {
        this.orderNumber = orderNumber;
    }


    /**
     * Gets the payementAtDate value for this InvoiceDetails.
     * 
     * @return payementAtDate
     */
    public java.math.BigDecimal getPayementAtDate() {
        return payementAtDate;
    }


    /**
     * Sets the payementAtDate value for this InvoiceDetails.
     * 
     * @param payementAtDate
     */
    public void setPayementAtDate(java.math.BigDecimal payementAtDate) {
        this.payementAtDate = payementAtDate;
    }


    /**
     * Gets the referenceNumber value for this InvoiceDetails.
     * 
     * @return referenceNumber
     */
    public String getReferenceNumber() {
        return referenceNumber;
    }


    /**
     * Sets the referenceNumber value for this InvoiceDetails.
     * 
     * @param referenceNumber
     */
    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }


    /**
     * Gets the sentDate value for this InvoiceDetails.
     * 
     * @return sentDate
     */
    public java.util.Calendar getSentDate() {
        return sentDate;
    }


    /**
     * Sets the sentDate value for this InvoiceDetails.
     * 
     * @param sentDate
     */
    public void setSentDate(java.util.Calendar sentDate) {
        this.sentDate = sentDate;
    }


    /**
     * Gets the totalPayementDate value for this InvoiceDetails.
     * 
     * @return totalPayementDate
     */
    public java.util.Calendar getTotalPayementDate() {
        return totalPayementDate;
    }


    /**
     * Sets the totalPayementDate value for this InvoiceDetails.
     * 
     * @param totalPayementDate
     */
    public void setTotalPayementDate(java.util.Calendar totalPayementDate) {
        this.totalPayementDate = totalPayementDate;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof InvoiceDetails)) return false;
        InvoiceDetails other = (InvoiceDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.amountToPay==null && other.getAmountToPay()==null) || 
             (this.amountToPay!=null &&
              this.amountToPay.equals(other.getAmountToPay()))) &&
            ((this.billPath==null && other.getBillPath()==null) || 
             (this.billPath!=null &&
              this.billPath.equals(other.getBillPath()))) &&
            ((this.billedAmount==null && other.getBilledAmount()==null) || 
             (this.billedAmount!=null &&
              this.billedAmount.equals(other.getBilledAmount()))) &&
            ((this.expectedPayementDate==null && other.getExpectedPayementDate()==null) || 
             (this.expectedPayementDate!=null &&
              this.expectedPayementDate.equals(other.getExpectedPayementDate()))) &&
            ((this.lastPayementDate==null && other.getLastPayementDate()==null) || 
             (this.lastPayementDate!=null &&
              this.lastPayementDate.equals(other.getLastPayementDate()))) &&
            ((this.orderNumber==null && other.getOrderNumber()==null) || 
             (this.orderNumber!=null &&
              this.orderNumber.equals(other.getOrderNumber()))) &&
            ((this.payementAtDate==null && other.getPayementAtDate()==null) || 
             (this.payementAtDate!=null &&
              this.payementAtDate.equals(other.getPayementAtDate()))) &&
            ((this.referenceNumber==null && other.getReferenceNumber()==null) || 
             (this.referenceNumber!=null &&
              this.referenceNumber.equals(other.getReferenceNumber()))) &&
            ((this.sentDate==null && other.getSentDate()==null) || 
             (this.sentDate!=null &&
              this.sentDate.equals(other.getSentDate()))) &&
            ((this.totalPayementDate==null && other.getTotalPayementDate()==null) || 
             (this.totalPayementDate!=null &&
              this.totalPayementDate.equals(other.getTotalPayementDate())));
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
        if (getAmountToPay() != null) {
            _hashCode += getAmountToPay().hashCode();
        }
        if (getBillPath() != null) {
            _hashCode += getBillPath().hashCode();
        }
        if (getBilledAmount() != null) {
            _hashCode += getBilledAmount().hashCode();
        }
        if (getExpectedPayementDate() != null) {
            _hashCode += getExpectedPayementDate().hashCode();
        }
        if (getLastPayementDate() != null) {
            _hashCode += getLastPayementDate().hashCode();
        }
        if (getOrderNumber() != null) {
            _hashCode += getOrderNumber().hashCode();
        }
        if (getPayementAtDate() != null) {
            _hashCode += getPayementAtDate().hashCode();
        }
        if (getReferenceNumber() != null) {
            _hashCode += getReferenceNumber().hashCode();
        }
        if (getSentDate() != null) {
            _hashCode += getSentDate().hashCode();
        }
        if (getTotalPayementDate() != null) {
            _hashCode += getTotalPayementDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InvoiceDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "InvoiceDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountToPay");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "amountToPay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billPath");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "billPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billedAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "billedAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expectedPayementDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "expectedPayementDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastPayementDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "lastPayementDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "orderNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payementAtDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "payementAtDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "referenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sentDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "sentDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalPayementDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "totalPayementDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
