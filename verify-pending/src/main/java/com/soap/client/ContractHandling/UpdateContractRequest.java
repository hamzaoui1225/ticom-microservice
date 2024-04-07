/**
 * UpdateContractRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soap.client.ContractHandling;

public class UpdateContractRequest  implements java.io.Serializable {
    private Contract contract;

    private SessionChange sessionChange;

    public UpdateContractRequest() {
    }

    public UpdateContractRequest(
           Contract contract,
           SessionChange sessionChange) {
           this.contract = contract;
           this.sessionChange = sessionChange;
    }


    /**
     * Gets the contract value for this UpdateContractRequest.
     * 
     * @return contract
     */
    public Contract getContract() {
        return contract;
    }


    /**
     * Sets the contract value for this UpdateContractRequest.
     * 
     * @param contract
     */
    public void setContract(Contract contract) {
        this.contract = contract;
    }


    /**
     * Gets the sessionChange value for this UpdateContractRequest.
     * 
     * @return sessionChange
     */
    public SessionChange getSessionChange() {
        return sessionChange;
    }


    /**
     * Sets the sessionChange value for this UpdateContractRequest.
     * 
     * @param sessionChange
     */
    public void setSessionChange(SessionChange sessionChange) {
        this.sessionChange = sessionChange;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof UpdateContractRequest)) return false;
        UpdateContractRequest other = (UpdateContractRequest) obj;
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
            ((this.sessionChange==null && other.getSessionChange()==null) || 
             (this.sessionChange!=null &&
              this.sessionChange.equals(other.getSessionChange())));
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
        if (getSessionChange() != null) {
            _hashCode += getSessionChange().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateContractRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UpdateContractRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contract");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "contract"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "Contract"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionChange");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "sessionChange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "SessionChange"));
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
