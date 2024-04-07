/**
 * GetConfigBalanceResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soap.client.alu;

public class GetConfigBalanceResponse  extends OperationResponse implements java.io.Serializable {
    private Balance[] balancesCible;

    private Balance[] balancesSource;

    public GetConfigBalanceResponse() {
    }

    public GetConfigBalanceResponse(
           String bscsErrorCode,
           String comment,
           Boolean isSuccessful,
           Balance[] balancesCible,
           Balance[] balancesSource) {
        super(
            bscsErrorCode,
            comment,
            isSuccessful);
        this.balancesCible = balancesCible;
        this.balancesSource = balancesSource;
    }


    /**
     * Gets the balancesCible value for this GetConfigBalanceResponse.
     * 
     * @return balancesCible
     */
    public Balance[] getBalancesCible() {
        return balancesCible;
    }


    /**
     * Sets the balancesCible value for this GetConfigBalanceResponse.
     * 
     * @param balancesCible
     */
    public void setBalancesCible(Balance[] balancesCible) {
        this.balancesCible = balancesCible;
    }


    /**
     * Gets the balancesSource value for this GetConfigBalanceResponse.
     * 
     * @return balancesSource
     */
    public Balance[] getBalancesSource() {
        return balancesSource;
    }


    /**
     * Sets the balancesSource value for this GetConfigBalanceResponse.
     * 
     * @param balancesSource
     */
    public void setBalancesSource(Balance[] balancesSource) {
        this.balancesSource = balancesSource;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetConfigBalanceResponse)) return false;
        GetConfigBalanceResponse other = (GetConfigBalanceResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.balancesCible==null && other.getBalancesCible()==null) || 
             (this.balancesCible!=null &&
              java.util.Arrays.equals(this.balancesCible, other.getBalancesCible()))) &&
            ((this.balancesSource==null && other.getBalancesSource()==null) || 
             (this.balancesSource!=null &&
              java.util.Arrays.equals(this.balancesSource, other.getBalancesSource())));
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
        if (getBalancesCible() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBalancesCible());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getBalancesCible(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBalancesSource() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBalancesSource());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getBalancesSource(), i);
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
        new org.apache.axis.description.TypeDesc(GetConfigBalanceResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetConfigBalanceResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balancesCible");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "balancesCible"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "Balance"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balancesSource");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "balancesSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "Balance"));
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
