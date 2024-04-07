/**
 * UpdateAdvChargeRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soap.client.alu;

public class UpdateAdvChargeRequest  implements java.io.Serializable {
    private Long coIdSrc;

    private Long coIdTarget;

    private java.util.Calendar dateMig;

    private Long rpCodeCible;

    private Long rpCodeSrc;

    public UpdateAdvChargeRequest() {
    }

    public UpdateAdvChargeRequest(
           Long coIdSrc,
           Long coIdTarget,
           java.util.Calendar dateMig,
           Long rpCodeCible,
           Long rpCodeSrc) {
           this.coIdSrc = coIdSrc;
           this.coIdTarget = coIdTarget;
           this.dateMig = dateMig;
           this.rpCodeCible = rpCodeCible;
           this.rpCodeSrc = rpCodeSrc;
    }


    /**
     * Gets the coIdSrc value for this UpdateAdvChargeRequest.
     * 
     * @return coIdSrc
     */
    public Long getCoIdSrc() {
        return coIdSrc;
    }


    /**
     * Sets the coIdSrc value for this UpdateAdvChargeRequest.
     * 
     * @param coIdSrc
     */
    public void setCoIdSrc(Long coIdSrc) {
        this.coIdSrc = coIdSrc;
    }


    /**
     * Gets the coIdTarget value for this UpdateAdvChargeRequest.
     * 
     * @return coIdTarget
     */
    public Long getCoIdTarget() {
        return coIdTarget;
    }


    /**
     * Sets the coIdTarget value for this UpdateAdvChargeRequest.
     * 
     * @param coIdTarget
     */
    public void setCoIdTarget(Long coIdTarget) {
        this.coIdTarget = coIdTarget;
    }


    /**
     * Gets the dateMig value for this UpdateAdvChargeRequest.
     * 
     * @return dateMig
     */
    public java.util.Calendar getDateMig() {
        return dateMig;
    }


    /**
     * Sets the dateMig value for this UpdateAdvChargeRequest.
     * 
     * @param dateMig
     */
    public void setDateMig(java.util.Calendar dateMig) {
        this.dateMig = dateMig;
    }


    /**
     * Gets the rpCodeCible value for this UpdateAdvChargeRequest.
     * 
     * @return rpCodeCible
     */
    public Long getRpCodeCible() {
        return rpCodeCible;
    }


    /**
     * Sets the rpCodeCible value for this UpdateAdvChargeRequest.
     * 
     * @param rpCodeCible
     */
    public void setRpCodeCible(Long rpCodeCible) {
        this.rpCodeCible = rpCodeCible;
    }


    /**
     * Gets the rpCodeSrc value for this UpdateAdvChargeRequest.
     * 
     * @return rpCodeSrc
     */
    public Long getRpCodeSrc() {
        return rpCodeSrc;
    }


    /**
     * Sets the rpCodeSrc value for this UpdateAdvChargeRequest.
     * 
     * @param rpCodeSrc
     */
    public void setRpCodeSrc(Long rpCodeSrc) {
        this.rpCodeSrc = rpCodeSrc;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof UpdateAdvChargeRequest)) return false;
        UpdateAdvChargeRequest other = (UpdateAdvChargeRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.coIdSrc==null && other.getCoIdSrc()==null) || 
             (this.coIdSrc!=null &&
              this.coIdSrc.equals(other.getCoIdSrc()))) &&
            ((this.coIdTarget==null && other.getCoIdTarget()==null) || 
             (this.coIdTarget!=null &&
              this.coIdTarget.equals(other.getCoIdTarget()))) &&
            ((this.dateMig==null && other.getDateMig()==null) || 
             (this.dateMig!=null &&
              this.dateMig.equals(other.getDateMig()))) &&
            ((this.rpCodeCible==null && other.getRpCodeCible()==null) || 
             (this.rpCodeCible!=null &&
              this.rpCodeCible.equals(other.getRpCodeCible()))) &&
            ((this.rpCodeSrc==null && other.getRpCodeSrc()==null) || 
             (this.rpCodeSrc!=null &&
              this.rpCodeSrc.equals(other.getRpCodeSrc())));
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
        if (getCoIdSrc() != null) {
            _hashCode += getCoIdSrc().hashCode();
        }
        if (getCoIdTarget() != null) {
            _hashCode += getCoIdTarget().hashCode();
        }
        if (getDateMig() != null) {
            _hashCode += getDateMig().hashCode();
        }
        if (getRpCodeCible() != null) {
            _hashCode += getRpCodeCible().hashCode();
        }
        if (getRpCodeSrc() != null) {
            _hashCode += getRpCodeSrc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateAdvChargeRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UpdateAdvChargeRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coIdSrc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "coIdSrc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coIdTarget");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "coIdTarget"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateMig");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "dateMig"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rpCodeCible");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "rpCodeCible"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rpCodeSrc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "rpCodeSrc"));
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
