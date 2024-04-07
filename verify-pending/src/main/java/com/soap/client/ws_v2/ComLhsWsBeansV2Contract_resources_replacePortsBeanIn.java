/**
 * ComLhsWsBeansV2Contract_resources_replacePortsBeanIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soap.client.ws_v2;

public class ComLhsWsBeansV2Contract_resources_replacePortsBeanIn  extends BaseSOIBean implements java.io.Serializable {
    private Long hlcode;

    private String hlcodePub;

    private Long npcode;

    private String npcodePub;

    private String oldPortNum;

    private Long portId;

    private Integer retention;

    public ComLhsWsBeansV2Contract_resources_replacePortsBeanIn() {
    }

    public ComLhsWsBeansV2Contract_resources_replacePortsBeanIn(
           Long hlcode,
           String hlcodePub,
           Long npcode,
           String npcodePub,
           String oldPortNum,
           Long portId,
           Integer retention) {
        this.hlcode = hlcode;
        this.hlcodePub = hlcodePub;
        this.npcode = npcode;
        this.npcodePub = npcodePub;
        this.oldPortNum = oldPortNum;
        this.portId = portId;
        this.retention = retention;
    }


    /**
     * Gets the hlcode value for this ComLhsWsBeansV2Contract_resources_replacePortsBeanIn.
     * 
     * @return hlcode
     */
    public Long getHlcode() {
        return hlcode;
    }


    /**
     * Sets the hlcode value for this ComLhsWsBeansV2Contract_resources_replacePortsBeanIn.
     * 
     * @param hlcode
     */
    public void setHlcode(Long hlcode) {
        this.hlcode = hlcode;
    }


    /**
     * Gets the hlcodePub value for this ComLhsWsBeansV2Contract_resources_replacePortsBeanIn.
     * 
     * @return hlcodePub
     */
    public String getHlcodePub() {
        return hlcodePub;
    }


    /**
     * Sets the hlcodePub value for this ComLhsWsBeansV2Contract_resources_replacePortsBeanIn.
     * 
     * @param hlcodePub
     */
    public void setHlcodePub(String hlcodePub) {
        this.hlcodePub = hlcodePub;
    }


    /**
     * Gets the npcode value for this ComLhsWsBeansV2Contract_resources_replacePortsBeanIn.
     * 
     * @return npcode
     */
    public Long getNpcode() {
        return npcode;
    }


    /**
     * Sets the npcode value for this ComLhsWsBeansV2Contract_resources_replacePortsBeanIn.
     * 
     * @param npcode
     */
    public void setNpcode(Long npcode) {
        this.npcode = npcode;
    }


    /**
     * Gets the npcodePub value for this ComLhsWsBeansV2Contract_resources_replacePortsBeanIn.
     * 
     * @return npcodePub
     */
    public String getNpcodePub() {
        return npcodePub;
    }


    /**
     * Sets the npcodePub value for this ComLhsWsBeansV2Contract_resources_replacePortsBeanIn.
     * 
     * @param npcodePub
     */
    public void setNpcodePub(String npcodePub) {
        this.npcodePub = npcodePub;
    }


    /**
     * Gets the oldPortNum value for this ComLhsWsBeansV2Contract_resources_replacePortsBeanIn.
     * 
     * @return oldPortNum
     */
    public String getOldPortNum() {
        return oldPortNum;
    }


    /**
     * Sets the oldPortNum value for this ComLhsWsBeansV2Contract_resources_replacePortsBeanIn.
     * 
     * @param oldPortNum
     */
    public void setOldPortNum(String oldPortNum) {
        this.oldPortNum = oldPortNum;
    }


    /**
     * Gets the portId value for this ComLhsWsBeansV2Contract_resources_replacePortsBeanIn.
     * 
     * @return portId
     */
    public Long getPortId() {
        return portId;
    }


    /**
     * Sets the portId value for this ComLhsWsBeansV2Contract_resources_replacePortsBeanIn.
     * 
     * @param portId
     */
    public void setPortId(Long portId) {
        this.portId = portId;
    }


    /**
     * Gets the retention value for this ComLhsWsBeansV2Contract_resources_replacePortsBeanIn.
     * 
     * @return retention
     */
    public Integer getRetention() {
        return retention;
    }


    /**
     * Sets the retention value for this ComLhsWsBeansV2Contract_resources_replacePortsBeanIn.
     * 
     * @param retention
     */
    public void setRetention(Integer retention) {
        this.retention = retention;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ComLhsWsBeansV2Contract_resources_replacePortsBeanIn)) return false;
        ComLhsWsBeansV2Contract_resources_replacePortsBeanIn other = (ComLhsWsBeansV2Contract_resources_replacePortsBeanIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.hlcode==null && other.getHlcode()==null) || 
             (this.hlcode!=null &&
              this.hlcode.equals(other.getHlcode()))) &&
            ((this.hlcodePub==null && other.getHlcodePub()==null) || 
             (this.hlcodePub!=null &&
              this.hlcodePub.equals(other.getHlcodePub()))) &&
            ((this.npcode==null && other.getNpcode()==null) || 
             (this.npcode!=null &&
              this.npcode.equals(other.getNpcode()))) &&
            ((this.npcodePub==null && other.getNpcodePub()==null) || 
             (this.npcodePub!=null &&
              this.npcodePub.equals(other.getNpcodePub()))) &&
            ((this.oldPortNum==null && other.getOldPortNum()==null) || 
             (this.oldPortNum!=null &&
              this.oldPortNum.equals(other.getOldPortNum()))) &&
            ((this.portId==null && other.getPortId()==null) || 
             (this.portId!=null &&
              this.portId.equals(other.getPortId()))) &&
            ((this.retention==null && other.getRetention()==null) || 
             (this.retention!=null &&
              this.retention.equals(other.getRetention())));
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
        if (getHlcode() != null) {
            _hashCode += getHlcode().hashCode();
        }
        if (getHlcodePub() != null) {
            _hashCode += getHlcodePub().hashCode();
        }
        if (getNpcode() != null) {
            _hashCode += getNpcode().hashCode();
        }
        if (getNpcodePub() != null) {
            _hashCode += getNpcodePub().hashCode();
        }
        if (getOldPortNum() != null) {
            _hashCode += getOldPortNum().hashCode();
        }
        if (getPortId() != null) {
            _hashCode += getPortId().hashCode();
        }
        if (getRetention() != null) {
            _hashCode += getRetention().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ComLhsWsBeansV2Contract_resources_replacePortsBeanIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "com.lhs.ws.beans.v2.contract_resources_replace.PortsBeanIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hlcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "hlcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hlcodePub");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "hlcodePub"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("npcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "npcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("npcodePub");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "npcodePub"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldPortNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "oldPortNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "portId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retention");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "retention"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
