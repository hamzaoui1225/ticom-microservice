/**
 * UserGroupResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soap.client.alu;

public class UserGroupResponse  extends OperationResponse implements java.io.Serializable {
    private String userGroup;

    private boolean userHasGroup;

    public UserGroupResponse() {
    }

    public UserGroupResponse(
           String bscsErrorCode,
           String comment,
           Boolean isSuccessful,
           String userGroup,
           boolean userHasGroup) {
        super(
            bscsErrorCode,
            comment,
            isSuccessful);
        this.userGroup = userGroup;
        this.userHasGroup = userHasGroup;
    }


    /**
     * Gets the userGroup value for this UserGroupResponse.
     * 
     * @return userGroup
     */
    public String getUserGroup() {
        return userGroup;
    }


    /**
     * Sets the userGroup value for this UserGroupResponse.
     * 
     * @param userGroup
     */
    public void setUserGroup(String userGroup) {
        this.userGroup = userGroup;
    }


    /**
     * Gets the userHasGroup value for this UserGroupResponse.
     * 
     * @return userHasGroup
     */
    public boolean isUserHasGroup() {
        return userHasGroup;
    }


    /**
     * Sets the userHasGroup value for this UserGroupResponse.
     * 
     * @param userHasGroup
     */
    public void setUserHasGroup(boolean userHasGroup) {
        this.userHasGroup = userHasGroup;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof UserGroupResponse)) return false;
        UserGroupResponse other = (UserGroupResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.userGroup==null && other.getUserGroup()==null) || 
             (this.userGroup!=null &&
              this.userGroup.equals(other.getUserGroup()))) &&
            this.userHasGroup == other.isUserHasGroup();
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
        if (getUserGroup() != null) {
            _hashCode += getUserGroup().hashCode();
        }
        _hashCode += (isUserHasGroup() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserGroupResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "UserGroupResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "userGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userHasGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "userHasGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
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
