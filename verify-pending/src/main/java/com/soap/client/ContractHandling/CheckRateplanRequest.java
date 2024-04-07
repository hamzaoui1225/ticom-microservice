/**
 * CheckRateplanRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soap.client.ContractHandling;

public class CheckRateplanRequest  implements java.io.Serializable {
    private ContractReference contract;

    private Reference rateplan;

    public CheckRateplanRequest() {
    }

    public CheckRateplanRequest(
           ContractReference contract,
           Reference rateplan) {
           this.contract = contract;
           this.rateplan = rateplan;
    }


    /**
     * Gets the contract value for this CheckRateplanRequest.
     * 
     * @return contract
     */
    public ContractReference getContract() {
        return contract;
    }


    /**
     * Sets the contract value for this CheckRateplanRequest.
     * 
     * @param contract
     */
    public void setContract(ContractReference contract) {
        this.contract = contract;
    }


    /**
     * Gets the rateplan value for this CheckRateplanRequest.
     * 
     * @return rateplan
     */
    public Reference getRateplan() {
        return rateplan;
    }


    /**
     * Sets the rateplan value for this CheckRateplanRequest.
     * 
     * @param rateplan
     */
    public void setRateplan(Reference rateplan) {
        this.rateplan = rateplan;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CheckRateplanRequest)) return false;
        CheckRateplanRequest other = (CheckRateplanRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.contract==null && other.getContract()==null) || 
             (this.contract!=null &&
              this.contract.equals(other.getContract()))) &&
            ((this.rateplan==null && other.getRateplan()==null) || 
             (this.rateplan!=null &&
              this.rateplan.equals(other.getRateplan())));
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
        if (getContract() != null) {
            _hashCode += getContract().hashCode();
        }
        if (getRateplan() != null) {
            _hashCode += getRateplan().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CheckRateplanRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CheckRateplanRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contract");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "contract"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ContractReference"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateplan");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "rateplan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "Reference"));
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
