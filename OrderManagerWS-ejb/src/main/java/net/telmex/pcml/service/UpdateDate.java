/**
 * UpdateDate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.telmex.pcml.service;

public class UpdateDate  implements java.io.Serializable {
    private java.lang.String account;

    private java.lang.String action;

    private java.lang.String codMessageResponse;

    private java.lang.String descriptionId;

    private java.lang.String identificationCode;

    private java.lang.String messageResponse;

    public UpdateDate() {
    }

    public UpdateDate(
           java.lang.String account,
           java.lang.String action,
           java.lang.String codMessageResponse,
           java.lang.String descriptionId,
           java.lang.String identificationCode,
           java.lang.String messageResponse) {
           this.account = account;
           this.action = action;
           this.codMessageResponse = codMessageResponse;
           this.descriptionId = descriptionId;
           this.identificationCode = identificationCode;
           this.messageResponse = messageResponse;
    }


    /**
     * Gets the account value for this UpdateDate.
     * 
     * @return account
     */
    public java.lang.String getAccount() {
        return account;
    }


    /**
     * Sets the account value for this UpdateDate.
     * 
     * @param account
     */
    public void setAccount(java.lang.String account) {
        this.account = account;
    }


    /**
     * Gets the action value for this UpdateDate.
     * 
     * @return action
     */
    public java.lang.String getAction() {
        return action;
    }


    /**
     * Sets the action value for this UpdateDate.
     * 
     * @param action
     */
    public void setAction(java.lang.String action) {
        this.action = action;
    }


    /**
     * Gets the codMessageResponse value for this UpdateDate.
     * 
     * @return codMessageResponse
     */
    public java.lang.String getCodMessageResponse() {
        return codMessageResponse;
    }


    /**
     * Sets the codMessageResponse value for this UpdateDate.
     * 
     * @param codMessageResponse
     */
    public void setCodMessageResponse(java.lang.String codMessageResponse) {
        this.codMessageResponse = codMessageResponse;
    }


    /**
     * Gets the descriptionId value for this UpdateDate.
     * 
     * @return descriptionId
     */
    public java.lang.String getDescriptionId() {
        return descriptionId;
    }


    /**
     * Sets the descriptionId value for this UpdateDate.
     * 
     * @param descriptionId
     */
    public void setDescriptionId(java.lang.String descriptionId) {
        this.descriptionId = descriptionId;
    }


    /**
     * Gets the identificationCode value for this UpdateDate.
     * 
     * @return identificationCode
     */
    public java.lang.String getIdentificationCode() {
        return identificationCode;
    }


    /**
     * Sets the identificationCode value for this UpdateDate.
     * 
     * @param identificationCode
     */
    public void setIdentificationCode(java.lang.String identificationCode) {
        this.identificationCode = identificationCode;
    }


    /**
     * Gets the messageResponse value for this UpdateDate.
     * 
     * @return messageResponse
     */
    public java.lang.String getMessageResponse() {
        return messageResponse;
    }


    /**
     * Sets the messageResponse value for this UpdateDate.
     * 
     * @param messageResponse
     */
    public void setMessageResponse(java.lang.String messageResponse) {
        this.messageResponse = messageResponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateDate)) return false;
        UpdateDate other = (UpdateDate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              this.account.equals(other.getAccount()))) &&
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              this.action.equals(other.getAction()))) &&
            ((this.codMessageResponse==null && other.getCodMessageResponse()==null) || 
             (this.codMessageResponse!=null &&
              this.codMessageResponse.equals(other.getCodMessageResponse()))) &&
            ((this.descriptionId==null && other.getDescriptionId()==null) || 
             (this.descriptionId!=null &&
              this.descriptionId.equals(other.getDescriptionId()))) &&
            ((this.identificationCode==null && other.getIdentificationCode()==null) || 
             (this.identificationCode!=null &&
              this.identificationCode.equals(other.getIdentificationCode()))) &&
            ((this.messageResponse==null && other.getMessageResponse()==null) || 
             (this.messageResponse!=null &&
              this.messageResponse.equals(other.getMessageResponse())));
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
        if (getAccount() != null) {
            _hashCode += getAccount().hashCode();
        }
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        if (getCodMessageResponse() != null) {
            _hashCode += getCodMessageResponse().hashCode();
        }
        if (getDescriptionId() != null) {
            _hashCode += getDescriptionId().hashCode();
        }
        if (getIdentificationCode() != null) {
            _hashCode += getIdentificationCode().hashCode();
        }
        if (getMessageResponse() != null) {
            _hashCode += getMessageResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateDate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "updateDate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("", "account"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("", "action"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codMessageResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codMessageResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descriptionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descriptionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "identificationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "messageResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
