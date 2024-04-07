/**
 * ContractResourcesReplaceBeanOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soap.client.ws_v2;

public class ContractResourcesReplaceBeanOut  extends BaseSOIBean implements java.io.Serializable {
    private ComLhsWsBeansV2Contract_resources_replaceDirectoryNumbersBeanOut[] directoryNumbers;

    private ComLhsWsBeansV2Contract_resources_replacePortsBeanOut[] ports;

    private String resNum;

    public ContractResourcesReplaceBeanOut() {
    }

    public ContractResourcesReplaceBeanOut(
           ComLhsWsBeansV2Contract_resources_replaceDirectoryNumbersBeanOut[] directoryNumbers,
           ComLhsWsBeansV2Contract_resources_replacePortsBeanOut[] ports,
           String resNum) {
        this.directoryNumbers = directoryNumbers;
        this.ports = ports;
        this.resNum = resNum;
    }


    /**
     * Gets the directoryNumbers value for this ContractResourcesReplaceBeanOut.
     * 
     * @return directoryNumbers
     */
    public ComLhsWsBeansV2Contract_resources_replaceDirectoryNumbersBeanOut[] getDirectoryNumbers() {
        return directoryNumbers;
    }


    /**
     * Sets the directoryNumbers value for this ContractResourcesReplaceBeanOut.
     * 
     * @param directoryNumbers
     */
    public void setDirectoryNumbers(ComLhsWsBeansV2Contract_resources_replaceDirectoryNumbersBeanOut[] directoryNumbers) {
        this.directoryNumbers = directoryNumbers;
    }


    /**
     * Gets the ports value for this ContractResourcesReplaceBeanOut.
     * 
     * @return ports
     */
    public ComLhsWsBeansV2Contract_resources_replacePortsBeanOut[] getPorts() {
        return ports;
    }


    /**
     * Sets the ports value for this ContractResourcesReplaceBeanOut.
     * 
     * @param ports
     */
    public void setPorts(ComLhsWsBeansV2Contract_resources_replacePortsBeanOut[] ports) {
        this.ports = ports;
    }


    /**
     * Gets the resNum value for this ContractResourcesReplaceBeanOut.
     * 
     * @return resNum
     */
    public String getResNum() {
        return resNum;
    }


    /**
     * Sets the resNum value for this ContractResourcesReplaceBeanOut.
     * 
     * @param resNum
     */
    public void setResNum(String resNum) {
        this.resNum = resNum;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ContractResourcesReplaceBeanOut)) return false;
        ContractResourcesReplaceBeanOut other = (ContractResourcesReplaceBeanOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.directoryNumbers==null && other.getDirectoryNumbers()==null) || 
             (this.directoryNumbers!=null &&
              java.util.Arrays.equals(this.directoryNumbers, other.getDirectoryNumbers()))) &&
            ((this.ports==null && other.getPorts()==null) || 
             (this.ports!=null &&
              java.util.Arrays.equals(this.ports, other.getPorts()))) &&
            ((this.resNum==null && other.getResNum()==null) || 
             (this.resNum!=null &&
              this.resNum.equals(other.getResNum())));
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
        if (getDirectoryNumbers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDirectoryNumbers());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getDirectoryNumbers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPorts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPorts());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getPorts(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getResNum() != null) {
            _hashCode += getResNum().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContractResourcesReplaceBeanOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "ContractResourcesReplaceBeanOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("directoryNumbers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "directoryNumbers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "com.lhs.ws.beans.v2.contract_resources_replace.DirectoryNumbersBeanOut"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ports");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "ports"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "com.lhs.ws.beans.v2.contract_resources_replace.PortsBeanOut"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "resNum"));
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
