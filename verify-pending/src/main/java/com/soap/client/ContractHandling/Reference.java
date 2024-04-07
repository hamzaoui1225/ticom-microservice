/**
 * Reference.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soap.client.ContractHandling;

public class Reference  implements java.io.Serializable {
    private Long privateKey;

    private String publicKey;

    public Reference() {
    }

    public Reference(
           Long privateKey,
           String publicKey) {
           this.privateKey = privateKey;
           this.publicKey = publicKey;
    }


    /**
     * Gets the privateKey value for this Reference.
     * 
     * @return privateKey
     */
    public Long getPrivateKey() {
        return privateKey;
    }


    /**
     * Sets the privateKey value for this Reference.
     * 
     * @param privateKey
     */
    public void setPrivateKey(Long privateKey) {
        this.privateKey = privateKey;
    }


    /**
     * Gets the publicKey value for this Reference.
     * 
     * @return publicKey
     */
    public String getPublicKey() {
        return publicKey;
    }


    /**
     * Sets the publicKey value for this Reference.
     * 
     * @param publicKey
     */
    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof Reference)) return false;
        Reference other = (Reference) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.privateKey==null && other.getPrivateKey()==null) || 
             (this.privateKey!=null &&
              this.privateKey.equals(other.getPrivateKey()))) &&
            ((this.publicKey==null && other.getPublicKey()==null) || 
             (this.publicKey!=null &&
              this.publicKey.equals(other.getPublicKey())));
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
        if (getPrivateKey() != null) {
            _hashCode += getPrivateKey().hashCode();
        }
        if (getPublicKey() != null) {
            _hashCode += getPublicKey().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Reference.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "Reference"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privateKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "privateKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publicKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "publicKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
