/**
 * ContractsSearchBeanOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soap.client.ContractHandling;

public class ContractsSearchBeanOut  extends BaseSOIBean implements java.io.Serializable {
    private ContractsBeanOut[] contracts;

    private Boolean searchIsComplete;

    public ContractsSearchBeanOut() {
    }

    public ContractsSearchBeanOut(
           ContractsBeanOut[] contracts,
           Boolean searchIsComplete) {
        this.contracts = contracts;
        this.searchIsComplete = searchIsComplete;
    }


    /**
     * Gets the contracts value for this ContractsSearchBeanOut.
     * 
     * @return contracts
     */
    public ContractsBeanOut[] getContracts() {
        return contracts;
    }


    /**
     * Sets the contracts value for this ContractsSearchBeanOut.
     * 
     * @param contracts
     */
    public void setContracts(ContractsBeanOut[] contracts) {
        this.contracts = contracts;
    }


    /**
     * Gets the searchIsComplete value for this ContractsSearchBeanOut.
     * 
     * @return searchIsComplete
     */
    public Boolean getSearchIsComplete() {
        return searchIsComplete;
    }


    /**
     * Sets the searchIsComplete value for this ContractsSearchBeanOut.
     * 
     * @param searchIsComplete
     */
    public void setSearchIsComplete(Boolean searchIsComplete) {
        this.searchIsComplete = searchIsComplete;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ContractsSearchBeanOut)) return false;
        ContractsSearchBeanOut other = (ContractsSearchBeanOut) obj;
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
              java.util.Arrays.equals(this.contracts, other.getContracts()))) &&
            ((this.searchIsComplete==null && other.getSearchIsComplete()==null) || 
             (this.searchIsComplete!=null &&
              this.searchIsComplete.equals(other.getSearchIsComplete())));
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
        if (getSearchIsComplete() != null) {
            _hashCode += getSearchIsComplete().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContractsSearchBeanOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ContractsSearchBeanOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contracts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "contracts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ContractsBeanOut"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchIsComplete");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "searchIsComplete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
