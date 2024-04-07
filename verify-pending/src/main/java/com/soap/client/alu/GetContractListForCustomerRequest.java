/**
 * GetContractListForCustomerRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soap.client.alu;

public class GetContractListForCustomerRequest  implements java.io.Serializable {
    private long csId;

    private String des;

    private long[] listCoid;

    private long rpCode;

    private String value;

    public GetContractListForCustomerRequest() {
    }

    public GetContractListForCustomerRequest(
           long csId,
           String des,
           long[] listCoid,
           long rpCode,
           String value) {
           this.csId = csId;
           this.des = des;
           this.listCoid = listCoid;
           this.rpCode = rpCode;
           this.value = value;
    }


    /**
     * Gets the csId value for this GetContractListForCustomerRequest.
     * 
     * @return csId
     */
    public long getCsId() {
        return csId;
    }


    /**
     * Sets the csId value for this GetContractListForCustomerRequest.
     * 
     * @param csId
     */
    public void setCsId(long csId) {
        this.csId = csId;
    }


    /**
     * Gets the des value for this GetContractListForCustomerRequest.
     * 
     * @return des
     */
    public String getDes() {
        return des;
    }


    /**
     * Sets the des value for this GetContractListForCustomerRequest.
     * 
     * @param des
     */
    public void setDes(String des) {
        this.des = des;
    }


    /**
     * Gets the listCoid value for this GetContractListForCustomerRequest.
     * 
     * @return listCoid
     */
    public long[] getListCoid() {
        return listCoid;
    }


    /**
     * Sets the listCoid value for this GetContractListForCustomerRequest.
     * 
     * @param listCoid
     */
    public void setListCoid(long[] listCoid) {
        this.listCoid = listCoid;
    }


    /**
     * Gets the rpCode value for this GetContractListForCustomerRequest.
     * 
     * @return rpCode
     */
    public long getRpCode() {
        return rpCode;
    }


    /**
     * Sets the rpCode value for this GetContractListForCustomerRequest.
     * 
     * @param rpCode
     */
    public void setRpCode(long rpCode) {
        this.rpCode = rpCode;
    }


    /**
     * Gets the value value for this GetContractListForCustomerRequest.
     * 
     * @return value
     */
    public String getValue() {
        return value;
    }


    /**
     * Sets the value value for this GetContractListForCustomerRequest.
     * 
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetContractListForCustomerRequest)) return false;
        GetContractListForCustomerRequest other = (GetContractListForCustomerRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.csId == other.getCsId() &&
            ((this.des==null && other.getDes()==null) || 
             (this.des!=null &&
              this.des.equals(other.getDes()))) &&
            ((this.listCoid==null && other.getListCoid()==null) || 
             (this.listCoid!=null &&
              java.util.Arrays.equals(this.listCoid, other.getListCoid()))) &&
            this.rpCode == other.getRpCode() &&
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
        _hashCode += new Long(getCsId()).hashCode();
        if (getDes() != null) {
            _hashCode += getDes().hashCode();
        }
        if (getListCoid() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListCoid());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getListCoid(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Long(getRpCode()).hashCode();
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetContractListForCustomerRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetContractListForCustomerRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("csId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "csId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("des");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "des"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listCoid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "listCoid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rpCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "rpCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "value"));
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
