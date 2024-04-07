/**
 * DesactivateServicesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soap.client.alu;

public class DesactivateServicesResponse  extends OperationResponse implements java.io.Serializable {
    private boolean finished;

    private String remark;

    private long[] snCodes;

    public DesactivateServicesResponse() {
    }

    public DesactivateServicesResponse(
           String bscsErrorCode,
           String comment,
           Boolean isSuccessful,
           boolean finished,
           String remark,
           long[] snCodes) {
        super(
            bscsErrorCode,
            comment,
            isSuccessful);
        this.finished = finished;
        this.remark = remark;
        this.snCodes = snCodes;
    }


    /**
     * Gets the finished value for this DesactivateServicesResponse.
     * 
     * @return finished
     */
    public boolean isFinished() {
        return finished;
    }


    /**
     * Sets the finished value for this DesactivateServicesResponse.
     * 
     * @param finished
     */
    public void setFinished(boolean finished) {
        this.finished = finished;
    }


    /**
     * Gets the remark value for this DesactivateServicesResponse.
     * 
     * @return remark
     */
    public String getRemark() {
        return remark;
    }


    /**
     * Sets the remark value for this DesactivateServicesResponse.
     * 
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }


    /**
     * Gets the snCodes value for this DesactivateServicesResponse.
     * 
     * @return snCodes
     */
    public long[] getSnCodes() {
        return snCodes;
    }


    /**
     * Sets the snCodes value for this DesactivateServicesResponse.
     * 
     * @param snCodes
     */
    public void setSnCodes(long[] snCodes) {
        this.snCodes = snCodes;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof DesactivateServicesResponse)) return false;
        DesactivateServicesResponse other = (DesactivateServicesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.finished == other.isFinished() &&
            ((this.remark==null && other.getRemark()==null) || 
             (this.remark!=null &&
              this.remark.equals(other.getRemark()))) &&
            ((this.snCodes==null && other.getSnCodes()==null) || 
             (this.snCodes!=null &&
              java.util.Arrays.equals(this.snCodes, other.getSnCodes())));
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
        _hashCode += (isFinished() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getRemark() != null) {
            _hashCode += getRemark().hashCode();
        }
        if (getSnCodes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSnCodes());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getSnCodes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DesactivateServicesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "DesactivateServicesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finished");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "finished"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remark");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "remark"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("snCodes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "snCodes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item"));
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
