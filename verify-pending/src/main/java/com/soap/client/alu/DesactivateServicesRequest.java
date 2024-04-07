/**
 * DesactivateServicesRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soap.client.alu;

public class DesactivateServicesRequest  implements java.io.Serializable {
    private long coId;

    private long[] snCodes;

    public DesactivateServicesRequest() {
    }

    public DesactivateServicesRequest(
           long coId,
           long[] snCodes) {
           this.coId = coId;
           this.snCodes = snCodes;
    }


    /**
     * Gets the coId value for this DesactivateServicesRequest.
     * 
     * @return coId
     */
    public long getCoId() {
        return coId;
    }


    /**
     * Sets the coId value for this DesactivateServicesRequest.
     * 
     * @param coId
     */
    public void setCoId(long coId) {
        this.coId = coId;
    }


    /**
     * Gets the snCodes value for this DesactivateServicesRequest.
     * 
     * @return snCodes
     */
    public long[] getSnCodes() {
        return snCodes;
    }


    /**
     * Sets the snCodes value for this DesactivateServicesRequest.
     * 
     * @param snCodes
     */
    public void setSnCodes(long[] snCodes) {
        this.snCodes = snCodes;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof DesactivateServicesRequest)) return false;
        DesactivateServicesRequest other = (DesactivateServicesRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.coId == other.getCoId() &&
            ((this.snCodes==null && other.getSnCodes()==null) || 
             (this.snCodes!=null &&
              java.util.Arrays.equals(this.snCodes, other.getSnCodes())));
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
        _hashCode += new Long(getCoId()).hashCode();
        if (getSnCodes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSnCodes());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getSnCodes(), i);
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
        new org.apache.axis.description.TypeDesc(DesactivateServicesRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "DesactivateServicesRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "coId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("snCodes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "snCodes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
