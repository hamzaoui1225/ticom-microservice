/**
 * CalculateAccelerationRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soap.client.alu;

public class CalculateAccelerationRequest  implements java.io.Serializable {
    private Long coId;

    private String date;

    private String desTarget;

    private Long rpCodeTarget;

    private String valueTarget;

    public CalculateAccelerationRequest() {
    }

    public CalculateAccelerationRequest(
           Long coId,
           String date,
           String desTarget,
           Long rpCodeTarget,
           String valueTarget) {
           this.coId = coId;
           this.date = date;
           this.desTarget = desTarget;
           this.rpCodeTarget = rpCodeTarget;
           this.valueTarget = valueTarget;
    }


    /**
     * Gets the coId value for this CalculateAccelerationRequest.
     * 
     * @return coId
     */
    public Long getCoId() {
        return coId;
    }


    /**
     * Sets the coId value for this CalculateAccelerationRequest.
     * 
     * @param coId
     */
    public void setCoId(Long coId) {
        this.coId = coId;
    }


    /**
     * Gets the date value for this CalculateAccelerationRequest.
     * 
     * @return date
     */
    public String getDate() {
        return date;
    }


    /**
     * Sets the date value for this CalculateAccelerationRequest.
     * 
     * @param date
     */
    public void setDate(String date) {
        this.date = date;
    }


    /**
     * Gets the desTarget value for this CalculateAccelerationRequest.
     * 
     * @return desTarget
     */
    public String getDesTarget() {
        return desTarget;
    }


    /**
     * Sets the desTarget value for this CalculateAccelerationRequest.
     * 
     * @param desTarget
     */
    public void setDesTarget(String desTarget) {
        this.desTarget = desTarget;
    }


    /**
     * Gets the rpCodeTarget value for this CalculateAccelerationRequest.
     * 
     * @return rpCodeTarget
     */
    public Long getRpCodeTarget() {
        return rpCodeTarget;
    }


    /**
     * Sets the rpCodeTarget value for this CalculateAccelerationRequest.
     * 
     * @param rpCodeTarget
     */
    public void setRpCodeTarget(Long rpCodeTarget) {
        this.rpCodeTarget = rpCodeTarget;
    }


    /**
     * Gets the valueTarget value for this CalculateAccelerationRequest.
     * 
     * @return valueTarget
     */
    public String getValueTarget() {
        return valueTarget;
    }


    /**
     * Sets the valueTarget value for this CalculateAccelerationRequest.
     * 
     * @param valueTarget
     */
    public void setValueTarget(String valueTarget) {
        this.valueTarget = valueTarget;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CalculateAccelerationRequest)) return false;
        CalculateAccelerationRequest other = (CalculateAccelerationRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.coId==null && other.getCoId()==null) || 
             (this.coId!=null &&
              this.coId.equals(other.getCoId()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.desTarget==null && other.getDesTarget()==null) || 
             (this.desTarget!=null &&
              this.desTarget.equals(other.getDesTarget()))) &&
            ((this.rpCodeTarget==null && other.getRpCodeTarget()==null) || 
             (this.rpCodeTarget!=null &&
              this.rpCodeTarget.equals(other.getRpCodeTarget()))) &&
            ((this.valueTarget==null && other.getValueTarget()==null) || 
             (this.valueTarget!=null &&
              this.valueTarget.equals(other.getValueTarget())));
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
        if (getCoId() != null) {
            _hashCode += getCoId().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getDesTarget() != null) {
            _hashCode += getDesTarget().hashCode();
        }
        if (getRpCodeTarget() != null) {
            _hashCode += getRpCodeTarget().hashCode();
        }
        if (getValueTarget() != null) {
            _hashCode += getValueTarget().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CalculateAccelerationRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CalculateAccelerationRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "coId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("desTarget");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "desTarget"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rpCodeTarget");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "rpCodeTarget"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueTarget");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "valueTarget"));
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
