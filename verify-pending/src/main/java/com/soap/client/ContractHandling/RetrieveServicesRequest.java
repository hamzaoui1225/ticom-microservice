/**
 * RetrieveServicesRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soap.client.ContractHandling;

public class RetrieveServicesRequest  implements java.io.Serializable {
    private Long contractID;

    private long[] serviceCodes;

    public RetrieveServicesRequest() {
    }

    public RetrieveServicesRequest(
           Long contractID,
           long[] serviceCodes) {
           this.contractID = contractID;
           this.serviceCodes = serviceCodes;
    }


    /**
     * Gets the contractID value for this RetrieveServicesRequest.
     * 
     * @return contractID
     */
    public Long getContractID() {
        return contractID;
    }


    /**
     * Sets the contractID value for this RetrieveServicesRequest.
     * 
     * @param contractID
     */
    public void setContractID(Long contractID) {
        this.contractID = contractID;
    }


    /**
     * Gets the serviceCodes value for this RetrieveServicesRequest.
     * 
     * @return serviceCodes
     */
    public long[] getServiceCodes() {
        return serviceCodes;
    }


    /**
     * Sets the serviceCodes value for this RetrieveServicesRequest.
     * 
     * @param serviceCodes
     */
    public void setServiceCodes(long[] serviceCodes) {
        this.serviceCodes = serviceCodes;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof RetrieveServicesRequest)) return false;
        RetrieveServicesRequest other = (RetrieveServicesRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.contractID==null && other.getContractID()==null) || 
             (this.contractID!=null &&
              this.contractID.equals(other.getContractID()))) &&
            ((this.serviceCodes==null && other.getServiceCodes()==null) || 
             (this.serviceCodes!=null &&
              java.util.Arrays.equals(this.serviceCodes, other.getServiceCodes())));
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
        if (getContractID() != null) {
            _hashCode += getContractID().hashCode();
        }
        if (getServiceCodes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServiceCodes());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getServiceCodes(), i);
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
        new org.apache.axis.description.TypeDesc(RetrieveServicesRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "RetrieveServicesRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "contractID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceCodes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "serviceCodes"));
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
