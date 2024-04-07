/**
 * OperationDateRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soap.client.alu;

public class OperationDateRequest  implements java.io.Serializable {
    private Service[] activateService;

    private Long coId;

    private String date;

    private long[] desctivateService;

    public OperationDateRequest() {
    }

    public OperationDateRequest(
           Service[] activateService,
           Long coId,
           String date,
           long[] desctivateService) {
           this.activateService = activateService;
           this.coId = coId;
           this.date = date;
           this.desctivateService = desctivateService;
    }


    /**
     * Gets the activateService value for this OperationDateRequest.
     * 
     * @return activateService
     */
    public Service[] getActivateService() {
        return activateService;
    }


    /**
     * Sets the activateService value for this OperationDateRequest.
     * 
     * @param activateService
     */
    public void setActivateService(Service[] activateService) {
        this.activateService = activateService;
    }


    /**
     * Gets the coId value for this OperationDateRequest.
     * 
     * @return coId
     */
    public Long getCoId() {
        return coId;
    }


    /**
     * Sets the coId value for this OperationDateRequest.
     * 
     * @param coId
     */
    public void setCoId(Long coId) {
        this.coId = coId;
    }


    /**
     * Gets the date value for this OperationDateRequest.
     * 
     * @return date
     */
    public String getDate() {
        return date;
    }


    /**
     * Sets the date value for this OperationDateRequest.
     * 
     * @param date
     */
    public void setDate(String date) {
        this.date = date;
    }


    /**
     * Gets the desctivateService value for this OperationDateRequest.
     * 
     * @return desctivateService
     */
    public long[] getDesctivateService() {
        return desctivateService;
    }


    /**
     * Sets the desctivateService value for this OperationDateRequest.
     * 
     * @param desctivateService
     */
    public void setDesctivateService(long[] desctivateService) {
        this.desctivateService = desctivateService;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof OperationDateRequest)) return false;
        OperationDateRequest other = (OperationDateRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.activateService==null && other.getActivateService()==null) || 
             (this.activateService!=null &&
              java.util.Arrays.equals(this.activateService, other.getActivateService()))) &&
            ((this.coId==null && other.getCoId()==null) || 
             (this.coId!=null &&
              this.coId.equals(other.getCoId()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.desctivateService==null && other.getDesctivateService()==null) || 
             (this.desctivateService!=null &&
              java.util.Arrays.equals(this.desctivateService, other.getDesctivateService())));
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
        if (getActivateService() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getActivateService());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getActivateService(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCoId() != null) {
            _hashCode += getCoId().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getDesctivateService() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDesctivateService());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getDesctivateService(), i);
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
        new org.apache.axis.description.TypeDesc(OperationDateRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "OperationDateRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activateService");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "activateService"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "Service"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("desctivateService");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "desctivateService"));
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
