/**
 * DetailedInvoicesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soap.client.ContractHandling;

public class DetailedInvoicesResponse  extends OperationResponse implements java.io.Serializable {
    private DetailedInvoice[] detailedInvoices;

    public DetailedInvoicesResponse() {
    }

    public DetailedInvoicesResponse(
           String bscsErrorCode,
           String comment,
           Boolean isSuccessful,
           DetailedInvoice[] detailedInvoices) {
        super(
            bscsErrorCode,
            comment,
            isSuccessful);
        this.detailedInvoices = detailedInvoices;
    }


    /**
     * Gets the detailedInvoices value for this DetailedInvoicesResponse.
     * 
     * @return detailedInvoices
     */
    public DetailedInvoice[] getDetailedInvoices() {
        return detailedInvoices;
    }


    /**
     * Sets the detailedInvoices value for this DetailedInvoicesResponse.
     * 
     * @param detailedInvoices
     */
    public void setDetailedInvoices(DetailedInvoice[] detailedInvoices) {
        this.detailedInvoices = detailedInvoices;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof DetailedInvoicesResponse)) return false;
        DetailedInvoicesResponse other = (DetailedInvoicesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.detailedInvoices==null && other.getDetailedInvoices()==null) || 
             (this.detailedInvoices!=null &&
              java.util.Arrays.equals(this.detailedInvoices, other.getDetailedInvoices())));
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
        if (getDetailedInvoices() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDetailedInvoices());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getDetailedInvoices(), i);
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
        new org.apache.axis.description.TypeDesc(DetailedInvoicesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "DetailedInvoicesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detailedInvoices");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "detailedInvoices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "DetailedInvoice"));
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
