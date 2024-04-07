/**
 * CalculateAccelerationResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soap.client.alu;

public class CalculateAccelerationResponse  extends OperationResponse implements java.io.Serializable {
    private Double actualForfait;

    private String dateFin;

    private Double montant;

    private Integer nbMois;

    private String remise;

    private Double targetForfait;

    public CalculateAccelerationResponse() {
    }

    public CalculateAccelerationResponse(
           String bscsErrorCode,
           String comment,
           Boolean isSuccessful,
           Double actualForfait,
           String dateFin,
           Double montant,
           Integer nbMois,
           String remise,
           Double targetForfait) {
        super(
            bscsErrorCode,
            comment,
            isSuccessful);
        this.actualForfait = actualForfait;
        this.dateFin = dateFin;
        this.montant = montant;
        this.nbMois = nbMois;
        this.remise = remise;
        this.targetForfait = targetForfait;
    }


    /**
     * Gets the actualForfait value for this CalculateAccelerationResponse.
     * 
     * @return actualForfait
     */
    public Double getActualForfait() {
        return actualForfait;
    }


    /**
     * Sets the actualForfait value for this CalculateAccelerationResponse.
     * 
     * @param actualForfait
     */
    public void setActualForfait(Double actualForfait) {
        this.actualForfait = actualForfait;
    }


    /**
     * Gets the dateFin value for this CalculateAccelerationResponse.
     * 
     * @return dateFin
     */
    public String getDateFin() {
        return dateFin;
    }


    /**
     * Sets the dateFin value for this CalculateAccelerationResponse.
     * 
     * @param dateFin
     */
    public void setDateFin(String dateFin) {
        this.dateFin = dateFin;
    }


    /**
     * Gets the montant value for this CalculateAccelerationResponse.
     * 
     * @return montant
     */
    public Double getMontant() {
        return montant;
    }


    /**
     * Sets the montant value for this CalculateAccelerationResponse.
     * 
     * @param montant
     */
    public void setMontant(Double montant) {
        this.montant = montant;
    }


    /**
     * Gets the nbMois value for this CalculateAccelerationResponse.
     * 
     * @return nbMois
     */
    public Integer getNbMois() {
        return nbMois;
    }


    /**
     * Sets the nbMois value for this CalculateAccelerationResponse.
     * 
     * @param nbMois
     */
    public void setNbMois(Integer nbMois) {
        this.nbMois = nbMois;
    }


    /**
     * Gets the remise value for this CalculateAccelerationResponse.
     * 
     * @return remise
     */
    public String getRemise() {
        return remise;
    }


    /**
     * Sets the remise value for this CalculateAccelerationResponse.
     * 
     * @param remise
     */
    public void setRemise(String remise) {
        this.remise = remise;
    }


    /**
     * Gets the targetForfait value for this CalculateAccelerationResponse.
     * 
     * @return targetForfait
     */
    public Double getTargetForfait() {
        return targetForfait;
    }


    /**
     * Sets the targetForfait value for this CalculateAccelerationResponse.
     * 
     * @param targetForfait
     */
    public void setTargetForfait(Double targetForfait) {
        this.targetForfait = targetForfait;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CalculateAccelerationResponse)) return false;
        CalculateAccelerationResponse other = (CalculateAccelerationResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.actualForfait==null && other.getActualForfait()==null) || 
             (this.actualForfait!=null &&
              this.actualForfait.equals(other.getActualForfait()))) &&
            ((this.dateFin==null && other.getDateFin()==null) || 
             (this.dateFin!=null &&
              this.dateFin.equals(other.getDateFin()))) &&
            ((this.montant==null && other.getMontant()==null) || 
             (this.montant!=null &&
              this.montant.equals(other.getMontant()))) &&
            ((this.nbMois==null && other.getNbMois()==null) || 
             (this.nbMois!=null &&
              this.nbMois.equals(other.getNbMois()))) &&
            ((this.remise==null && other.getRemise()==null) || 
             (this.remise!=null &&
              this.remise.equals(other.getRemise()))) &&
            ((this.targetForfait==null && other.getTargetForfait()==null) || 
             (this.targetForfait!=null &&
              this.targetForfait.equals(other.getTargetForfait())));
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
        if (getActualForfait() != null) {
            _hashCode += getActualForfait().hashCode();
        }
        if (getDateFin() != null) {
            _hashCode += getDateFin().hashCode();
        }
        if (getMontant() != null) {
            _hashCode += getMontant().hashCode();
        }
        if (getNbMois() != null) {
            _hashCode += getNbMois().hashCode();
        }
        if (getRemise() != null) {
            _hashCode += getRemise().hashCode();
        }
        if (getTargetForfait() != null) {
            _hashCode += getTargetForfait().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CalculateAccelerationResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CalculateAccelerationResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualForfait");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "actualForfait"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateFin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "dateFin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("montant");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "montant"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nbMois");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "nbMois"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remise");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "remise"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetForfait");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "targetForfait"));
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
