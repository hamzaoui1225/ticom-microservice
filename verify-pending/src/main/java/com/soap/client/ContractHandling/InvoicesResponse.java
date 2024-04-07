/**
 * InvoicesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soap.client.ContractHandling;

public class InvoicesResponse  extends OperationResponse implements java.io.Serializable {
    private CustomerReference customerRef;

    private InvoicesByBillingAccount[] invoicesByBa;

    public InvoicesResponse() {
    }

    public InvoicesResponse(
           String bscsErrorCode,
           String comment,
           Boolean isSuccessful,
           CustomerReference customerRef,
           InvoicesByBillingAccount[] invoicesByBa) {
        super(
            bscsErrorCode,
            comment,
            isSuccessful);
        this.customerRef = customerRef;
        this.invoicesByBa = invoicesByBa;
    }


    /**
     * Gets the customerRef value for this InvoicesResponse.
     * 
     * @return customerRef
     */
    public CustomerReference getCustomerRef() {
        return customerRef;
    }


    /**
     * Sets the customerRef value for this InvoicesResponse.
     * 
     * @param customerRef
     */
    public void setCustomerRef(CustomerReference customerRef) {
        this.customerRef = customerRef;
    }


    /**
     * Gets the invoicesByBa value for this InvoicesResponse.
     * 
     * @return invoicesByBa
     */
    public InvoicesByBillingAccount[] getInvoicesByBa() {
        return invoicesByBa;
    }


    /**
     * Sets the invoicesByBa value for this InvoicesResponse.
     * 
     * @param invoicesByBa
     */
    public void setInvoicesByBa(InvoicesByBillingAccount[] invoicesByBa) {
        this.invoicesByBa = invoicesByBa;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof InvoicesResponse)) return false;
        InvoicesResponse other = (InvoicesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.customerRef==null && other.getCustomerRef()==null) || 
             (this.customerRef!=null &&
              this.customerRef.equals(other.getCustomerRef()))) &&
            ((this.invoicesByBa==null && other.getInvoicesByBa()==null) || 
             (this.invoicesByBa!=null &&
              java.util.Arrays.equals(this.invoicesByBa, other.getInvoicesByBa())));
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
        if (getCustomerRef() != null) {
            _hashCode += getCustomerRef().hashCode();
        }
        if (getInvoicesByBa() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInvoicesByBa());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getInvoicesByBa(), i);
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
        new org.apache.axis.description.TypeDesc(InvoicesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "InvoicesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerRef");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "customerRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CustomerReference"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoicesByBa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "invoicesByBa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "InvoicesByBillingAccount"));
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
