/**
 * InvoicesByBillingAccount.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soap.client.ContractHandling;

public class InvoicesByBillingAccount  implements java.io.Serializable {
    private BillingAccountReference baRef;

    private InvoiceDetails[] invoices;

    public InvoicesByBillingAccount() {
    }

    public InvoicesByBillingAccount(
           BillingAccountReference baRef,
           InvoiceDetails[] invoices) {
           this.baRef = baRef;
           this.invoices = invoices;
    }


    /**
     * Gets the baRef value for this InvoicesByBillingAccount.
     * 
     * @return baRef
     */
    public BillingAccountReference getBaRef() {
        return baRef;
    }


    /**
     * Sets the baRef value for this InvoicesByBillingAccount.
     * 
     * @param baRef
     */
    public void setBaRef(BillingAccountReference baRef) {
        this.baRef = baRef;
    }


    /**
     * Gets the invoices value for this InvoicesByBillingAccount.
     * 
     * @return invoices
     */
    public InvoiceDetails[] getInvoices() {
        return invoices;
    }


    /**
     * Sets the invoices value for this InvoicesByBillingAccount.
     * 
     * @param invoices
     */
    public void setInvoices(InvoiceDetails[] invoices) {
        this.invoices = invoices;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof InvoicesByBillingAccount)) return false;
        InvoicesByBillingAccount other = (InvoicesByBillingAccount) obj;
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
            ((this.invoices==null && other.getInvoices()==null) || 
             (this.invoices!=null &&
              java.util.Arrays.equals(this.invoices, other.getInvoices())));
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
        if (getInvoices() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInvoices());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getInvoices(), i);
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
        new org.apache.axis.description.TypeDesc(InvoicesByBillingAccount.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "InvoicesByBillingAccount"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baRef");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "baRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "BillingAccountReference"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoices");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "invoices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "InvoiceDetails"));
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
