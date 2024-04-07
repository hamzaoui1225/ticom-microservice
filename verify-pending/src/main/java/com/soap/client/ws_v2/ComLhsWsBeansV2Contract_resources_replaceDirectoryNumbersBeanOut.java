/**
 * ComLhsWsBeansV2Contract_resources_replaceDirectoryNumbersBeanOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soap.client.ws_v2;

public class ComLhsWsBeansV2Contract_resources_replaceDirectoryNumbersBeanOut  extends BaseSOIBean implements java.io.Serializable {
    private Long coId;

    private String coIdPub;

    private String dirnum;

    public ComLhsWsBeansV2Contract_resources_replaceDirectoryNumbersBeanOut() {
    }

    public ComLhsWsBeansV2Contract_resources_replaceDirectoryNumbersBeanOut(
           Long coId,
           String coIdPub,
           String dirnum) {
        this.coId = coId;
        this.coIdPub = coIdPub;
        this.dirnum = dirnum;
    }


    /**
     * Gets the coId value for this ComLhsWsBeansV2Contract_resources_replaceDirectoryNumbersBeanOut.
     * 
     * @return coId
     */
    public Long getCoId() {
        return coId;
    }


    /**
     * Sets the coId value for this ComLhsWsBeansV2Contract_resources_replaceDirectoryNumbersBeanOut.
     * 
     * @param coId
     */
    public void setCoId(Long coId) {
        this.coId = coId;
    }


    /**
     * Gets the coIdPub value for this ComLhsWsBeansV2Contract_resources_replaceDirectoryNumbersBeanOut.
     * 
     * @return coIdPub
     */
    public String getCoIdPub() {
        return coIdPub;
    }


    /**
     * Sets the coIdPub value for this ComLhsWsBeansV2Contract_resources_replaceDirectoryNumbersBeanOut.
     * 
     * @param coIdPub
     */
    public void setCoIdPub(String coIdPub) {
        this.coIdPub = coIdPub;
    }


    /**
     * Gets the dirnum value for this ComLhsWsBeansV2Contract_resources_replaceDirectoryNumbersBeanOut.
     * 
     * @return dirnum
     */
    public String getDirnum() {
        return dirnum;
    }


    /**
     * Sets the dirnum value for this ComLhsWsBeansV2Contract_resources_replaceDirectoryNumbersBeanOut.
     * 
     * @param dirnum
     */
    public void setDirnum(String dirnum) {
        this.dirnum = dirnum;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ComLhsWsBeansV2Contract_resources_replaceDirectoryNumbersBeanOut)) return false;
        ComLhsWsBeansV2Contract_resources_replaceDirectoryNumbersBeanOut other = (ComLhsWsBeansV2Contract_resources_replaceDirectoryNumbersBeanOut) obj;
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
            ((this.dirnum==null && other.getDirnum()==null) || 
             (this.dirnum!=null &&
              this.dirnum.equals(other.getDirnum())));
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
        if (getDirnum() != null) {
            _hashCode += getDirnum().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ComLhsWsBeansV2Contract_resources_replaceDirectoryNumbersBeanOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "com.lhs.ws.beans.v2.contract_resources_replace.DirectoryNumbersBeanOut"));
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
        elemField.setFieldName("dirnum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "dirnum"));
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
