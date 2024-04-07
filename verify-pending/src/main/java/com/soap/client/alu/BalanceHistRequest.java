/**
 * BalanceHistRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soap.client.alu;

public class BalanceHistRequest  implements java.io.Serializable {
    private String canal;

    private Long coId;

    private Long orderId;

    private Long sncodeBalance;

    private Long tmcode;

    private String type;

    private String unit;

    private Double value;

    public BalanceHistRequest() {
    }

    public BalanceHistRequest(
           String canal,
           Long coId,
           Long orderId,
           Long sncodeBalance,
           Long tmcode,
           String type,
           String unit,
           Double value) {
           this.canal = canal;
           this.coId = coId;
           this.orderId = orderId;
           this.sncodeBalance = sncodeBalance;
           this.tmcode = tmcode;
           this.type = type;
           this.unit = unit;
           this.value = value;
    }


    /**
     * Gets the canal value for this BalanceHistRequest.
     * 
     * @return canal
     */
    public String getCanal() {
        return canal;
    }


    /**
     * Sets the canal value for this BalanceHistRequest.
     * 
     * @param canal
     */
    public void setCanal(String canal) {
        this.canal = canal;
    }


    /**
     * Gets the coId value for this BalanceHistRequest.
     * 
     * @return coId
     */
    public Long getCoId() {
        return coId;
    }


    /**
     * Sets the coId value for this BalanceHistRequest.
     * 
     * @param coId
     */
    public void setCoId(Long coId) {
        this.coId = coId;
    }


    /**
     * Gets the orderId value for this BalanceHistRequest.
     * 
     * @return orderId
     */
    public Long getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this BalanceHistRequest.
     * 
     * @param orderId
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the sncodeBalance value for this BalanceHistRequest.
     * 
     * @return sncodeBalance
     */
    public Long getSncodeBalance() {
        return sncodeBalance;
    }


    /**
     * Sets the sncodeBalance value for this BalanceHistRequest.
     * 
     * @param sncodeBalance
     */
    public void setSncodeBalance(Long sncodeBalance) {
        this.sncodeBalance = sncodeBalance;
    }


    /**
     * Gets the tmcode value for this BalanceHistRequest.
     * 
     * @return tmcode
     */
    public Long getTmcode() {
        return tmcode;
    }


    /**
     * Sets the tmcode value for this BalanceHistRequest.
     * 
     * @param tmcode
     */
    public void setTmcode(Long tmcode) {
        this.tmcode = tmcode;
    }


    /**
     * Gets the type value for this BalanceHistRequest.
     * 
     * @return type
     */
    public String getType() {
        return type;
    }


    /**
     * Sets the type value for this BalanceHistRequest.
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }


    /**
     * Gets the unit value for this BalanceHistRequest.
     * 
     * @return unit
     */
    public String getUnit() {
        return unit;
    }


    /**
     * Sets the unit value for this BalanceHistRequest.
     * 
     * @param unit
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }


    /**
     * Gets the value value for this BalanceHistRequest.
     * 
     * @return value
     */
    public Double getValue() {
        return value;
    }


    /**
     * Sets the value value for this BalanceHistRequest.
     * 
     * @param value
     */
    public void setValue(Double value) {
        this.value = value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof BalanceHistRequest)) return false;
        BalanceHistRequest other = (BalanceHistRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.canal==null && other.getCanal()==null) || 
             (this.canal!=null &&
              this.canal.equals(other.getCanal()))) &&
            ((this.coId==null && other.getCoId()==null) || 
             (this.coId!=null &&
              this.coId.equals(other.getCoId()))) &&
            ((this.orderId==null && other.getOrderId()==null) || 
             (this.orderId!=null &&
              this.orderId.equals(other.getOrderId()))) &&
            ((this.sncodeBalance==null && other.getSncodeBalance()==null) || 
             (this.sncodeBalance!=null &&
              this.sncodeBalance.equals(other.getSncodeBalance()))) &&
            ((this.tmcode==null && other.getTmcode()==null) || 
             (this.tmcode!=null &&
              this.tmcode.equals(other.getTmcode()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.unit==null && other.getUnit()==null) || 
             (this.unit!=null &&
              this.unit.equals(other.getUnit()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue())));
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
        if (getCanal() != null) {
            _hashCode += getCanal().hashCode();
        }
        if (getCoId() != null) {
            _hashCode += getCoId().hashCode();
        }
        if (getOrderId() != null) {
            _hashCode += getOrderId().hashCode();
        }
        if (getSncodeBalance() != null) {
            _hashCode += getSncodeBalance().hashCode();
        }
        if (getTmcode() != null) {
            _hashCode += getTmcode().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getUnit() != null) {
            _hashCode += getUnit().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BalanceHistRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "BalanceHistRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "canal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "coId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "orderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sncodeBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "sncodeBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tmcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "tmcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "unit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
