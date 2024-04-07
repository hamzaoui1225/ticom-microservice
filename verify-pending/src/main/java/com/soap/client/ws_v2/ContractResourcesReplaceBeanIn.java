/**
 * ContractResourcesReplaceBeanIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soap.client.ws_v2;

import java.util.Arrays;

public class ContractResourcesReplaceBeanIn  extends BaseSOIBean implements java.io.Serializable {
    private DateTimeBean activDate;

    private Long coId;

    private String coIdPub;

    private ComLhsWsBeansV2Contract_resources_replaceDirectoryNumbersBeanIn[] directoryNumbers;

    private Long hlcode;

    private String hlcodePub;

    private Long npcode;

    private String npcodePub;

    private String oldResNum;

    private Long piId;

    private ComLhsWsBeansV2Contract_resources_replacePortsBeanIn[] ports;

    private Long reason;

    private Long resId;

    private Integer resType;
    private Integer retention;

    private Long smcId;

    @Override
    public String toString() {
        return "ContractResourcesReplaceBeanIn{" +
                "activDate=" + activDate +
                ", coId=" + coId +
                ", coIdPub='" + coIdPub + '\'' +
                ", directoryNumbers=" + Arrays.toString(directoryNumbers) +
                ", hlcode=" + hlcode +
                ", hlcodePub='" + hlcodePub + '\'' +

                ", npcode=" + npcode +
                ", npcodePub='" + npcodePub + '\'' +
                ", oldResNum='" + oldResNum + '\'' +
                ", piId=" + piId +
                ", ports=" + Arrays.toString(ports) +
                ", reason=" + reason +
                ", resId=" + resId +
                ", resType=" + resType +
                ", retention=" + retention +
                ", smcId=" + smcId +
                ", __equalsCalc=" + __equalsCalc +
                ", __hashCodeCalc=" + __hashCodeCalc +
                '}';
    }

    public ContractResourcesReplaceBeanIn() {
    }

    public ContractResourcesReplaceBeanIn(
           DateTimeBean activDate,
           Long coId,
           String coIdPub,
           ComLhsWsBeansV2Contract_resources_replaceDirectoryNumbersBeanIn[] directoryNumbers,
           Long hlcode,
           String hlcodePub,
           Long npcode,
           String npcodePub,
           String oldResNum,
           Long piId,
           ComLhsWsBeansV2Contract_resources_replacePortsBeanIn[] ports,
           Long reason,
           Long resId,
           Integer resType,
           Integer retention,
           Long smcId) {
        this.activDate = activDate;
        this.coId = coId;
        this.coIdPub = coIdPub;
        this.directoryNumbers = directoryNumbers;
        this.hlcode = hlcode;
        this.hlcodePub = hlcodePub;
        this.npcode = npcode;
        this.npcodePub = npcodePub;
        this.oldResNum = oldResNum;
        this.piId = piId;
        this.ports = ports;
        this.reason = reason;
        this.resId = resId;
        this.resType = resType;
        this.retention = retention;
        this.smcId = smcId;
    }


    /**
     * Gets the activDate value for this ContractResourcesReplaceBeanIn.
     * 
     * @return activDate
     */
    public DateTimeBean getActivDate() {
        return activDate;
    }


    /**
     * Sets the activDate value for this ContractResourcesReplaceBeanIn.
     * 
     * @param activDate
     */
    public void setActivDate(DateTimeBean activDate) {
        this.activDate = activDate;
    }


    /**
     * Gets the coId value for this ContractResourcesReplaceBeanIn.
     * 
     * @return coId
     */
    public Long getCoId() {
        return coId;
    }


    /**
     * Sets the coId value for this ContractResourcesReplaceBeanIn.
     * 
     * @param coId
     */
    public void setCoId(Long coId) {
        this.coId = coId;
    }


    /**
     * Gets the coIdPub value for this ContractResourcesReplaceBeanIn.
     * 
     * @return coIdPub
     */
    public String getCoIdPub() {
        return coIdPub;
    }


    /**
     * Sets the coIdPub value for this ContractResourcesReplaceBeanIn.
     * 
     * @param coIdPub
     */
    public void setCoIdPub(String coIdPub) {
        this.coIdPub = coIdPub;
    }


    /**
     * Gets the directoryNumbers value for this ContractResourcesReplaceBeanIn.
     * 
     * @return directoryNumbers
     */
    public ComLhsWsBeansV2Contract_resources_replaceDirectoryNumbersBeanIn[] getDirectoryNumbers() {
        return directoryNumbers;
    }


    /**
     * Sets the directoryNumbers value for this ContractResourcesReplaceBeanIn.
     * 
     * @param directoryNumbers
     */
    public void setDirectoryNumbers(ComLhsWsBeansV2Contract_resources_replaceDirectoryNumbersBeanIn[] directoryNumbers) {
        this.directoryNumbers = directoryNumbers;
    }


    /**
     * Gets the hlcode value for this ContractResourcesReplaceBeanIn.
     * 
     * @return hlcode
     */
    public Long getHlcode() {
        return hlcode;
    }


    /**
     * Sets the hlcode value for this ContractResourcesReplaceBeanIn.
     * 
     * @param hlcode
     */
    public void setHlcode(Long hlcode) {
        this.hlcode = hlcode;
    }


    /**
     * Gets the hlcodePub value for this ContractResourcesReplaceBeanIn.
     * 
     * @return hlcodePub
     */
    public String getHlcodePub() {
        return hlcodePub;
    }


    /**
     * Sets the hlcodePub value for this ContractResourcesReplaceBeanIn.
     * 
     * @param hlcodePub
     */
    public void setHlcodePub(String hlcodePub) {
        this.hlcodePub = hlcodePub;
    }


    /**
     * Gets the npcode value for this ContractResourcesReplaceBeanIn.
     * 
     * @return npcode
     */
    public Long getNpcode() {
        return npcode;
    }


    /**
     * Sets the npcode value for this ContractResourcesReplaceBeanIn.
     * 
     * @param npcode
     */
    public void setNpcode(Long npcode) {
        this.npcode = npcode;
    }


    /**
     * Gets the npcodePub value for this ContractResourcesReplaceBeanIn.
     * 
     * @return npcodePub
     */
    public String getNpcodePub() {
        return npcodePub;
    }


    /**
     * Sets the npcodePub value for this ContractResourcesReplaceBeanIn.
     * 
     * @param npcodePub
     */
    public void setNpcodePub(String npcodePub) {
        this.npcodePub = npcodePub;
    }


    /**
     * Gets the oldResNum value for this ContractResourcesReplaceBeanIn.
     * 
     * @return oldResNum
     */
    public String getOldResNum() {
        return oldResNum;
    }


    /**
     * Sets the oldResNum value for this ContractResourcesReplaceBeanIn.
     * 
     * @param oldResNum
     */
    public void setOldResNum(String oldResNum) {
        this.oldResNum = oldResNum;
    }


    /**
     * Gets the piId value for this ContractResourcesReplaceBeanIn.
     * 
     * @return piId
     */
    public Long getPiId() {
        return piId;
    }


    /**
     * Sets the piId value for this ContractResourcesReplaceBeanIn.
     * 
     * @param piId
     */
    public void setPiId(Long piId) {
        this.piId = piId;
    }


    /**
     * Gets the ports value for this ContractResourcesReplaceBeanIn.
     * 
     * @return ports
     */
    public ComLhsWsBeansV2Contract_resources_replacePortsBeanIn[] getPorts() {
        return ports;
    }


    /**
     * Sets the ports value for this ContractResourcesReplaceBeanIn.
     * 
     * @param ports
     */
    public void setPorts(ComLhsWsBeansV2Contract_resources_replacePortsBeanIn[] ports) {
        this.ports = ports;
    }


    /**
     * Gets the reason value for this ContractResourcesReplaceBeanIn.
     * 
     * @return reason
     */
    public Long getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this ContractResourcesReplaceBeanIn.
     * 
     * @param reason
     */
    public void setReason(Long reason) {
        this.reason = reason;
    }


    /**
     * Gets the resId value for this ContractResourcesReplaceBeanIn.
     * 
     * @return resId
     */
    public Long getResId() {
        return resId;
    }


    /**
     * Sets the resId value for this ContractResourcesReplaceBeanIn.
     * 
     * @param resId
     */
    public void setResId(Long resId) {
        this.resId = resId;
    }


    /**
     * Gets the resType value for this ContractResourcesReplaceBeanIn.
     * 
     * @return resType
     */
    public Integer getResType() {
        return resType;
    }


    /**
     * Sets the resType value for this ContractResourcesReplaceBeanIn.
     * 
     * @param resType
     */
    public void setResType(Integer resType) {
        this.resType = resType;
    }


    /**
     * Gets the retention value for this ContractResourcesReplaceBeanIn.
     * 
     * @return retention
     */
    public Integer getRetention() {
        return retention;
    }


    /**
     * Sets the retention value for this ContractResourcesReplaceBeanIn.
     * 
     * @param retention
     */
    public void setRetention(Integer retention) {
        this.retention = retention;
    }


    /**
     * Gets the smcId value for this ContractResourcesReplaceBeanIn.
     * 
     * @return smcId
     */
    public Long getSmcId() {
        return smcId;
    }


    /**
     * Sets the smcId value for this ContractResourcesReplaceBeanIn.
     * 
     * @param smcId
     */
    public void setSmcId(Long smcId) {
        this.smcId = smcId;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ContractResourcesReplaceBeanIn)) return false;
        ContractResourcesReplaceBeanIn other = (ContractResourcesReplaceBeanIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.activDate==null && other.getActivDate()==null) || 
             (this.activDate!=null &&
              this.activDate.equals(other.getActivDate()))) &&
            ((this.coId==null && other.getCoId()==null) || 
             (this.coId!=null &&
              this.coId.equals(other.getCoId()))) &&
            ((this.coIdPub==null && other.getCoIdPub()==null) || 
             (this.coIdPub!=null &&
              this.coIdPub.equals(other.getCoIdPub()))) &&
            ((this.directoryNumbers==null && other.getDirectoryNumbers()==null) || 
             (this.directoryNumbers!=null &&
              Arrays.equals(this.directoryNumbers, other.getDirectoryNumbers()))) &&
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
            ((this.oldResNum==null && other.getOldResNum()==null) || 
             (this.oldResNum!=null &&
              this.oldResNum.equals(other.getOldResNum()))) &&
            ((this.piId==null && other.getPiId()==null) || 
             (this.piId!=null &&
              this.piId.equals(other.getPiId()))) &&
            ((this.ports==null && other.getPorts()==null) || 
             (this.ports!=null &&
              Arrays.equals(this.ports, other.getPorts()))) &&
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              this.reason.equals(other.getReason()))) &&
            ((this.resId==null && other.getResId()==null) || 
             (this.resId!=null &&
              this.resId.equals(other.getResId()))) &&
            ((this.resType==null && other.getResType()==null) || 
             (this.resType!=null &&
              this.resType.equals(other.getResType()))) &&
            ((this.retention==null && other.getRetention()==null) || 
             (this.retention!=null &&
              this.retention.equals(other.getRetention()))) &&
            ((this.smcId==null && other.getSmcId()==null) || 
             (this.smcId!=null &&
              this.smcId.equals(other.getSmcId())));
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
        if (getActivDate() != null) {
            _hashCode += getActivDate().hashCode();
        }
        if (getCoId() != null) {
            _hashCode += getCoId().hashCode();
        }
        if (getCoIdPub() != null) {
            _hashCode += getCoIdPub().hashCode();
        }
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
        if (getOldResNum() != null) {
            _hashCode += getOldResNum().hashCode();
        }
        if (getPiId() != null) {
            _hashCode += getPiId().hashCode();
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
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
        }
        if (getResId() != null) {
            _hashCode += getResId().hashCode();
        }
        if (getResType() != null) {
            _hashCode += getResType().hashCode();
        }
        if (getRetention() != null) {
            _hashCode += getRetention().hashCode();
        }
        if (getSmcId() != null) {
            _hashCode += getSmcId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContractResourcesReplaceBeanIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "ContractResourcesReplaceBeanIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "activDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "DateTimeBean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("directoryNumbers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "directoryNumbers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "com.lhs.ws.beans.v2.contract_resources_replace.DirectoryNumbersBeanIn"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("oldResNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "oldResNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("piId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "piId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ports");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "ports"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "com.lhs.ws.beans.v2.contract_resources_replace.PortsBeanIn"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "reason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "resId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "resType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retention");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "retention"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smcId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "smcId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
