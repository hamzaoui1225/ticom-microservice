/**
 * DirnumBlocksBeanOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soap.client.ContractHandling;

public class DirnumBlocksBeanOut  extends BaseSOIBean implements java.io.Serializable {
    private String lowerExt;

    private String upperExt;

    public DirnumBlocksBeanOut() {
    }

    public DirnumBlocksBeanOut(
           String lowerExt,
           String upperExt) {
        this.lowerExt = lowerExt;
        this.upperExt = upperExt;
    }


    /**
     * Gets the lowerExt value for this DirnumBlocksBeanOut.
     * 
     * @return lowerExt
     */
    public String getLowerExt() {
        return lowerExt;
    }


    /**
     * Sets the lowerExt value for this DirnumBlocksBeanOut.
     * 
     * @param lowerExt
     */
    public void setLowerExt(String lowerExt) {
        this.lowerExt = lowerExt;
    }


    /**
     * Gets the upperExt value for this DirnumBlocksBeanOut.
     * 
     * @return upperExt
     */
    public String getUpperExt() {
        return upperExt;
    }


    /**
     * Sets the upperExt value for this DirnumBlocksBeanOut.
     * 
     * @param upperExt
     */
    public void setUpperExt(String upperExt) {
        this.upperExt = upperExt;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof DirnumBlocksBeanOut)) return false;
        DirnumBlocksBeanOut other = (DirnumBlocksBeanOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.lowerExt==null && other.getLowerExt()==null) || 
             (this.lowerExt!=null &&
              this.lowerExt.equals(other.getLowerExt()))) &&
            ((this.upperExt==null && other.getUpperExt()==null) || 
             (this.upperExt!=null &&
              this.upperExt.equals(other.getUpperExt())));
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
        if (getLowerExt() != null) {
            _hashCode += getLowerExt().hashCode();
        }
        if (getUpperExt() != null) {
            _hashCode += getUpperExt().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DirnumBlocksBeanOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "DirnumBlocksBeanOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lowerExt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "lowerExt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("upperExt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "upperExt"));
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
