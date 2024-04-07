/**
 * NumParamsBeanOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soap.client.lhs.ws.beans.v2.contract_service_cug_parameters_read;


import com.soap.client.alu.BaseSOIBean;
import com.soap.client.lhs.ws.beans.v2.contract_service_cug_parameters_read.num_params.MultValuesBeanOut;

public class NumParamsBeanOut  extends BaseSOIBean implements java.io.Serializable {
    private Long bsgId;

    private Long complexLevel;

    private Long complexNo;

    private Long cugId;

    private String dataType;

    private MultValuesBeanOut[] multValues;

    private Long parentNo;

    private String prmDes;

    private Long prmId;

    private String prmIdPub;

    private Long prmNo;

    private Long requestId;

    private Long siblingNo;

    private String type;

    public NumParamsBeanOut() {
    }

    public NumParamsBeanOut(
           Long bsgId,
           Long complexLevel,
           Long complexNo,
           Long cugId,
           String dataType,
           MultValuesBeanOut[] multValues,
           Long parentNo,
           String prmDes,
           Long prmId,
           String prmIdPub,
           Long prmNo,
           Long requestId,
           Long siblingNo,
           String type) {
        this.bsgId = bsgId;
        this.complexLevel = complexLevel;
        this.complexNo = complexNo;
        this.cugId = cugId;
        this.dataType = dataType;
        this.multValues = multValues;
        this.parentNo = parentNo;
        this.prmDes = prmDes;
        this.prmId = prmId;
        this.prmIdPub = prmIdPub;
        this.prmNo = prmNo;
        this.requestId = requestId;
        this.siblingNo = siblingNo;
        this.type = type;
    }


    /**
     * Gets the bsgId value for this NumParamsBeanOut.
     * 
     * @return bsgId
     */
    public Long getBsgId() {
        return bsgId;
    }


    /**
     * Sets the bsgId value for this NumParamsBeanOut.
     * 
     * @param bsgId
     */
    public void setBsgId(Long bsgId) {
        this.bsgId = bsgId;
    }


    /**
     * Gets the complexLevel value for this NumParamsBeanOut.
     * 
     * @return complexLevel
     */
    public Long getComplexLevel() {
        return complexLevel;
    }


    /**
     * Sets the complexLevel value for this NumParamsBeanOut.
     * 
     * @param complexLevel
     */
    public void setComplexLevel(Long complexLevel) {
        this.complexLevel = complexLevel;
    }


    /**
     * Gets the complexNo value for this NumParamsBeanOut.
     * 
     * @return complexNo
     */
    public Long getComplexNo() {
        return complexNo;
    }


    /**
     * Sets the complexNo value for this NumParamsBeanOut.
     * 
     * @param complexNo
     */
    public void setComplexNo(Long complexNo) {
        this.complexNo = complexNo;
    }


    /**
     * Gets the cugId value for this NumParamsBeanOut.
     * 
     * @return cugId
     */
    public Long getCugId() {
        return cugId;
    }


    /**
     * Sets the cugId value for this NumParamsBeanOut.
     * 
     * @param cugId
     */
    public void setCugId(Long cugId) {
        this.cugId = cugId;
    }


    /**
     * Gets the dataType value for this NumParamsBeanOut.
     * 
     * @return dataType
     */
    public String getDataType() {
        return dataType;
    }


    /**
     * Sets the dataType value for this NumParamsBeanOut.
     * 
     * @param dataType
     */
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }


    /**
     * Gets the multValues value for this NumParamsBeanOut.
     * 
     * @return multValues
     */
    public MultValuesBeanOut[] getMultValues() {
        return multValues;
    }


    /**
     * Sets the multValues value for this NumParamsBeanOut.
     * 
     * @param multValues
     */
    public void setMultValues(MultValuesBeanOut[] multValues) {
        this.multValues = multValues;
    }


    /**
     * Gets the parentNo value for this NumParamsBeanOut.
     * 
     * @return parentNo
     */
    public Long getParentNo() {
        return parentNo;
    }


    /**
     * Sets the parentNo value for this NumParamsBeanOut.
     * 
     * @param parentNo
     */
    public void setParentNo(Long parentNo) {
        this.parentNo = parentNo;
    }


    /**
     * Gets the prmDes value for this NumParamsBeanOut.
     * 
     * @return prmDes
     */
    public String getPrmDes() {
        return prmDes;
    }


    /**
     * Sets the prmDes value for this NumParamsBeanOut.
     * 
     * @param prmDes
     */
    public void setPrmDes(String prmDes) {
        this.prmDes = prmDes;
    }


    /**
     * Gets the prmId value for this NumParamsBeanOut.
     * 
     * @return prmId
     */
    public Long getPrmId() {
        return prmId;
    }


    /**
     * Sets the prmId value for this NumParamsBeanOut.
     * 
     * @param prmId
     */
    public void setPrmId(Long prmId) {
        this.prmId = prmId;
    }


    /**
     * Gets the prmIdPub value for this NumParamsBeanOut.
     * 
     * @return prmIdPub
     */
    public String getPrmIdPub() {
        return prmIdPub;
    }


    /**
     * Sets the prmIdPub value for this NumParamsBeanOut.
     * 
     * @param prmIdPub
     */
    public void setPrmIdPub(String prmIdPub) {
        this.prmIdPub = prmIdPub;
    }


    /**
     * Gets the prmNo value for this NumParamsBeanOut.
     * 
     * @return prmNo
     */
    public Long getPrmNo() {
        return prmNo;
    }


    /**
     * Sets the prmNo value for this NumParamsBeanOut.
     * 
     * @param prmNo
     */
    public void setPrmNo(Long prmNo) {
        this.prmNo = prmNo;
    }


    /**
     * Gets the requestId value for this NumParamsBeanOut.
     * 
     * @return requestId
     */
    public Long getRequestId() {
        return requestId;
    }


    /**
     * Sets the requestId value for this NumParamsBeanOut.
     * 
     * @param requestId
     */
    public void setRequestId(Long requestId) {
        this.requestId = requestId;
    }


    /**
     * Gets the siblingNo value for this NumParamsBeanOut.
     * 
     * @return siblingNo
     */
    public Long getSiblingNo() {
        return siblingNo;
    }


    /**
     * Sets the siblingNo value for this NumParamsBeanOut.
     * 
     * @param siblingNo
     */
    public void setSiblingNo(Long siblingNo) {
        this.siblingNo = siblingNo;
    }


    /**
     * Gets the type value for this NumParamsBeanOut.
     * 
     * @return type
     */
    public String getType() {
        return type;
    }


    /**
     * Sets the type value for this NumParamsBeanOut.
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof NumParamsBeanOut)) return false;
        NumParamsBeanOut other = (NumParamsBeanOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.bsgId==null && other.getBsgId()==null) || 
             (this.bsgId!=null &&
              this.bsgId.equals(other.getBsgId()))) &&
            ((this.complexLevel==null && other.getComplexLevel()==null) || 
             (this.complexLevel!=null &&
              this.complexLevel.equals(other.getComplexLevel()))) &&
            ((this.complexNo==null && other.getComplexNo()==null) || 
             (this.complexNo!=null &&
              this.complexNo.equals(other.getComplexNo()))) &&
            ((this.cugId==null && other.getCugId()==null) || 
             (this.cugId!=null &&
              this.cugId.equals(other.getCugId()))) &&
            ((this.dataType==null && other.getDataType()==null) || 
             (this.dataType!=null &&
              this.dataType.equals(other.getDataType()))) &&
            ((this.multValues==null && other.getMultValues()==null) || 
             (this.multValues!=null &&
              java.util.Arrays.equals(this.multValues, other.getMultValues()))) &&
            ((this.parentNo==null && other.getParentNo()==null) || 
             (this.parentNo!=null &&
              this.parentNo.equals(other.getParentNo()))) &&
            ((this.prmDes==null && other.getPrmDes()==null) || 
             (this.prmDes!=null &&
              this.prmDes.equals(other.getPrmDes()))) &&
            ((this.prmId==null && other.getPrmId()==null) || 
             (this.prmId!=null &&
              this.prmId.equals(other.getPrmId()))) &&
            ((this.prmIdPub==null && other.getPrmIdPub()==null) || 
             (this.prmIdPub!=null &&
              this.prmIdPub.equals(other.getPrmIdPub()))) &&
            ((this.prmNo==null && other.getPrmNo()==null) || 
             (this.prmNo!=null &&
              this.prmNo.equals(other.getPrmNo()))) &&
            ((this.requestId==null && other.getRequestId()==null) || 
             (this.requestId!=null &&
              this.requestId.equals(other.getRequestId()))) &&
            ((this.siblingNo==null && other.getSiblingNo()==null) || 
             (this.siblingNo!=null &&
              this.siblingNo.equals(other.getSiblingNo()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
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
        if (getBsgId() != null) {
            _hashCode += getBsgId().hashCode();
        }
        if (getComplexLevel() != null) {
            _hashCode += getComplexLevel().hashCode();
        }
        if (getComplexNo() != null) {
            _hashCode += getComplexNo().hashCode();
        }
        if (getCugId() != null) {
            _hashCode += getCugId().hashCode();
        }
        if (getDataType() != null) {
            _hashCode += getDataType().hashCode();
        }
        if (getMultValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMultValues());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getMultValues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getParentNo() != null) {
            _hashCode += getParentNo().hashCode();
        }
        if (getPrmDes() != null) {
            _hashCode += getPrmDes().hashCode();
        }
        if (getPrmId() != null) {
            _hashCode += getPrmId().hashCode();
        }
        if (getPrmIdPub() != null) {
            _hashCode += getPrmIdPub().hashCode();
        }
        if (getPrmNo() != null) {
            _hashCode += getPrmNo().hashCode();
        }
        if (getRequestId() != null) {
            _hashCode += getRequestId().hashCode();
        }
        if (getSiblingNo() != null) {
            _hashCode += getSiblingNo().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NumParamsBeanOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://contract_service_cug_parameters_read.v2.beans.ws.lhs.com", "NumParamsBeanOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bsgId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://contract_service_cug_parameters_read.v2.beans.ws.lhs.com", "bsgId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complexLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://contract_service_cug_parameters_read.v2.beans.ws.lhs.com", "complexLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complexNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://contract_service_cug_parameters_read.v2.beans.ws.lhs.com", "complexNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cugId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://contract_service_cug_parameters_read.v2.beans.ws.lhs.com", "cugId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://contract_service_cug_parameters_read.v2.beans.ws.lhs.com", "dataType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multValues");
        elemField.setXmlName(new javax.xml.namespace.QName("http://contract_service_cug_parameters_read.v2.beans.ws.lhs.com", "multValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://num_params.contract_service_cug_parameters_read.v2.beans.ws.lhs.com", "MultValuesBeanOut"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://contract_service_cug_parameters_read.v2.beans.ws.lhs.com", "parentNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prmDes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://contract_service_cug_parameters_read.v2.beans.ws.lhs.com", "prmDes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prmId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://contract_service_cug_parameters_read.v2.beans.ws.lhs.com", "prmId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prmIdPub");
        elemField.setXmlName(new javax.xml.namespace.QName("http://contract_service_cug_parameters_read.v2.beans.ws.lhs.com", "prmIdPub"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prmNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://contract_service_cug_parameters_read.v2.beans.ws.lhs.com", "prmNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://contract_service_cug_parameters_read.v2.beans.ws.lhs.com", "requestId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siblingNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://contract_service_cug_parameters_read.v2.beans.ws.lhs.com", "siblingNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://contract_service_cug_parameters_read.v2.beans.ws.lhs.com", "type"));
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
