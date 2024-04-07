/**
 * ComLhsWsBeansV2Contract_resources_replacePortsBeanOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soap.client.ws_v2;

public class ComLhsWsBeansV2Contract_resources_replacePortsBeanOut  extends BaseSOIBean implements java.io.Serializable {
    private Long coId;

    private String coIdPub;

    private String portNum;

    public ComLhsWsBeansV2Contract_resources_replacePortsBeanOut() {
    }

    public ComLhsWsBeansV2Contract_resources_replacePortsBeanOut(
           Long coId,
           String coIdPub,
           String portNum) {
        this.coId = coId;
        this.coIdPub = coIdPub;
        this.portNum = portNum;
    }


    /**
     * Gets the coId value for this ComLhsWsBeansV2Contract_resources_replacePortsBeanOut.
     * 
     * @return coId
     */
    public Long getCoId() {
        return coId;
    }


    /**
     * Sets the coId value for this ComLhsWsBeansV2Contract_resources_replacePortsBeanOut.
     * 
     * @param coId
     */
    public void setCoId(Long coId) {
        this.coId = coId;
    }


    /**
     * Gets the coIdPub value for this ComLhsWsBeansV2Contract_resources_replacePortsBeanOut.
     * 
     * @return coIdPub
     */
    public String getCoIdPub() {
        return coIdPub;
    }


    /**
     * Sets the coIdPub value for this ComLhsWsBeansV2Contract_resources_replacePortsBeanOut.
     * 
     * @param coIdPub
     */
    public void setCoIdPub(String coIdPub) {
        this.coIdPub = coIdPub;
    }


    /**
     * Gets the portNum value for this ComLhsWsBeansV2Contract_resources_replacePortsBeanOut.
     * 
     * @return portNum
     */
    public String getPortNum() {
        return portNum;
    }


    /**
     * Sets the portNum value for this ComLhsWsBeansV2Contract_resources_replacePortsBeanOut.
     * 
     * @param portNum
     */
    public void setPortNum(String portNum) {
        this.portNum = portNum;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ComLhsWsBeansV2Contract_resources_replacePortsBeanOut)) return false;
        ComLhsWsBeansV2Contract_resources_replacePortsBeanOut other = (ComLhsWsBeansV2Contract_resources_replacePortsBeanOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.coId==null && other.getCoId()==null) || 
             (this.coId!=null &&
              this.coId.equals(other.getCoId()))) &&
            ((this.coIdPub==null && other.getCoIdPub()==null) || 
             (this.coIdPub!=null &&
              this.coIdPub.equals(other.getCoIdPub()))) &&
            ((this.portNum==null && other.getPortNum()==null) || 
             (this.portNum!=null &&
              this.portNum.equals(other.getPortNum())));
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
        if (getCoId() != null) {
            _hashCode += getCoId().hashCode();
        }
        if (getCoIdPub() != null) {
            _hashCode += getCoIdPub().hashCode();
        }
        if (getPortNum() != null) {
            _hashCode += getPortNum().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ComLhsWsBeansV2Contract_resources_replacePortsBeanOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "com.lhs.ws.beans.v2.contract_resources_replace.PortsBeanOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "coId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coIdPub");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "coIdPub"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "portNum"));
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
