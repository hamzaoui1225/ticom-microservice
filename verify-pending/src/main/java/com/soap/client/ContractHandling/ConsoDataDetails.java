/**
 * ConsoDataDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soap.client.ContractHandling;

public class ConsoDataDetails  implements java.io.Serializable {
    private Double dataVolum;

    private java.util.Calendar dateConso;

    public ConsoDataDetails() {
    }

    public ConsoDataDetails(
           Double dataVolum,
           java.util.Calendar dateConso) {
           this.dataVolum = dataVolum;
           this.dateConso = dateConso;
    }


    /**
     * Gets the dataVolum value for this ConsoDataDetails.
     * 
     * @return dataVolum
     */
    public Double getDataVolum() {
        return dataVolum;
    }


    /**
     * Sets the dataVolum value for this ConsoDataDetails.
     * 
     * @param dataVolum
     */
    public void setDataVolum(Double dataVolum) {
        this.dataVolum = dataVolum;
    }


    /**
     * Gets the dateConso value for this ConsoDataDetails.
     * 
     * @return dateConso
     */
    public java.util.Calendar getDateConso() {
        return dateConso;
    }


    /**
     * Sets the dateConso value for this ConsoDataDetails.
     * 
     * @param dateConso
     */
    public void setDateConso(java.util.Calendar dateConso) {
        this.dateConso = dateConso;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ConsoDataDetails)) return false;
        ConsoDataDetails other = (ConsoDataDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dataVolum==null && other.getDataVolum()==null) || 
             (this.dataVolum!=null &&
              this.dataVolum.equals(other.getDataVolum()))) &&
            ((this.dateConso==null && other.getDateConso()==null) || 
             (this.dateConso!=null &&
              this.dateConso.equals(other.getDateConso())));
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
        if (getDataVolum() != null) {
            _hashCode += getDataVolum().hashCode();
        }
        if (getDateConso() != null) {
            _hashCode += getDateConso().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsoDataDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ConsoDataDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataVolum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "dataVolum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateConso");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "dateConso"));
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
