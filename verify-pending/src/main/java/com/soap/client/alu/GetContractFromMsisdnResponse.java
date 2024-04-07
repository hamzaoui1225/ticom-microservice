/**
 * GetContractFromMsisdnResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soap.client.alu;

public class GetContractFromMsisdnResponse  extends OperationResponse implements java.io.Serializable {
    private ContractBean[] contracts;

    public GetContractFromMsisdnResponse() {
    }

    public GetContractFromMsisdnResponse(
           String bscsErrorCode,
           String comment,
           Boolean isSuccessful,
           ContractBean[] contracts) {
        super(
            bscsErrorCode,
            comment,
            isSuccessful);
        this.contracts = contracts;
    }


    /**
     * Gets the contracts value for this GetContractFromMsisdnResponse.
     * 
     * @return contracts
     */
    public ContractBean[] getContracts() {
        return contracts;
    }


    /**
     * Sets the contracts value for this GetContractFromMsisdnResponse.
     * 
     * @param contracts
     */
    public void setContracts(ContractBean[] contracts) {
        this.contracts = contracts;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetContractFromMsisdnResponse)) return false;
        GetContractFromMsisdnResponse other = (GetContractFromMsisdnResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.contracts==null && other.getContracts()==null) || 
             (this.contracts!=null &&
              java.util.Arrays.equals(this.contracts, other.getContracts())));
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
        if (getContracts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContracts());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getContracts(), i);
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
        new org.apache.axis.description.TypeDesc(GetContractFromMsisdnResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetContractFromMsisdnResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contracts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "contracts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ContractBean"));
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
