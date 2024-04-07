/**
 * CallsHistoryResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soap.client.ContractHandling;

public class CallsHistoryResponse  extends OperationResponse implements java.io.Serializable {
    private CallDetails[] callHistory;

    public CallsHistoryResponse() {
    }

    public CallsHistoryResponse(
           String bscsErrorCode,
           String comment,
           Boolean isSuccessful,
           CallDetails[] callHistory) {
        super(
            bscsErrorCode,
            comment,
            isSuccessful);
        this.callHistory = callHistory;
    }


    /**
     * Gets the callHistory value for this CallsHistoryResponse.
     * 
     * @return callHistory
     */
    public CallDetails[] getCallHistory() {
        return callHistory;
    }


    /**
     * Sets the callHistory value for this CallsHistoryResponse.
     * 
     * @param callHistory
     */
    public void setCallHistory(CallDetails[] callHistory) {
        this.callHistory = callHistory;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CallsHistoryResponse)) return false;
        CallsHistoryResponse other = (CallsHistoryResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.callHistory==null && other.getCallHistory()==null) || 
             (this.callHistory!=null &&
              java.util.Arrays.equals(this.callHistory, other.getCallHistory())));
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
        if (getCallHistory() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCallHistory());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getCallHistory(), i);
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
        new org.apache.axis.description.TypeDesc(CallsHistoryResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CallsHistoryResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callHistory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "callHistory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CallDetails"));
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
