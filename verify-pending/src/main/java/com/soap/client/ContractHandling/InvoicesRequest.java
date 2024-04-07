/**
 * InvoicesRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soap.client.ContractHandling;

public class InvoicesRequest  implements java.io.Serializable {
    private BillingAccountReference baRef;

    private CustomerReference custRef;

    private java.util.Calendar endDate;

    private java.util.Calendar startDate;

    public InvoicesRequest() {
    }

    public InvoicesRequest(
           BillingAccountReference baRef,
           CustomerReference custRef,
           java.util.Calendar endDate,
           java.util.Calendar startDate) {
           this.baRef = baRef;
           this.custRef = custRef;
           this.endDate = endDate;
           this.startDate = startDate;
    }


    /**
     * Gets the baRef value for this InvoicesRequest.
     * 
     * @return baRef
     */
    public BillingAccountReference getBaRef() {
        return baRef;
    }


    /**
     * Sets the baRef value for this InvoicesRequest.
     * 
     * @param baRef
     */
    public void setBaRef(BillingAccountReference baRef) {
        this.baRef = baRef;
    }


    /**
     * Gets the custRef value for this InvoicesRequest.
     * 
     * @return custRef
     */
    public CustomerReference getCustRef() {
        return custRef;
    }


    /**
     * Sets the custRef value for this InvoicesRequest.
     * 
     * @param custRef
     */
    public void setCustRef(CustomerReference custRef) {
        this.custRef = custRef;
    }


    /**
     * Gets the endDate value for this InvoicesRequest.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this InvoicesRequest.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the startDate value for this InvoicesRequest.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this InvoicesRequest.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof InvoicesRequest)) return false;
        InvoicesRequest other = (InvoicesRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.baRef==null && other.getBaRef()==null) || 
             (this.baRef!=null &&
              this.baRef.equals(other.getBaRef()))) &&
            ((this.custRef==null && other.getCustRef()==null) || 
             (this.custRef!=null &&
              this.custRef.equals(other.getCustRef()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate())));
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
        if (getBaRef() != null) {
            _hashCode += getBaRef().hashCode();
        }
        if (getCustRef() != null) {
            _hashCode += getCustRef().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InvoicesRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "InvoicesRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baRef");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "baRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "BillingAccountReference"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custRef");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "custRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CustomerReference"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "startDate"));
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
