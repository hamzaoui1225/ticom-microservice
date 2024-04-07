/**
 * In0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soap.client.ws_v2;

public class In0  extends BaseSOIBean implements java.io.Serializable {
    private ContractResourcesReplaceBeanIn input;

    private SessionChangeBeanIn sessionChange;

    public In0() {
    }

    public In0(
           ContractResourcesReplaceBeanIn input,
           SessionChangeBeanIn sessionChange) {
        this.input = input;
        this.sessionChange = sessionChange;
    }

    @Override
    public String toString() {
        return "In0{" +
                "input=" + input +
                ", sessionChange=" + sessionChange +
                ", __equalsCalc=" + __equalsCalc +
                ", __hashCodeCalc=" + __hashCodeCalc +
                '}';
    }

    /**
     * Gets the input value for this In0.
     * 
     * @return input
     */
    public ContractResourcesReplaceBeanIn getInput() {
        return input;
    }


    /**
     * Sets the input value for this In0.
     * 
     * @param input
     */
    public void setInput(ContractResourcesReplaceBeanIn input) {
        this.input = input;
    }


    /**
     * Gets the sessionChange value for this In0.
     * 
     * @return sessionChange
     */
    public SessionChangeBeanIn getSessionChange() {
        return sessionChange;
    }


    /**
     * Sets the sessionChange value for this In0.
     * 
     * @param sessionChange
     */
    public void setSessionChange(SessionChangeBeanIn sessionChange) {
        this.sessionChange = sessionChange;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof In0)) return false;
        In0 other = (In0) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.input==null && other.getInput()==null) || 
             (this.input!=null &&
              this.input.equals(other.getInput()))) &&
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
        int _hashCode = super.hashCode();
        if (getInput() != null) {
            _hashCode += getInput().hashCode();
        }
        if (getSessionChange() != null) {
            _hashCode += getSessionChange().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(In0.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "in0"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("input");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "input"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "ContractResourcesReplaceBeanIn"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionChange");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "sessionChange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "SessionChangeBeanIn"));
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
