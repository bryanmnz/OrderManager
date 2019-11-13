/**
 * SubscriberInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.telmex.pcml.service;

public class SubscriberInfo  implements java.io.Serializable {
    private java.lang.String account;

    private java.lang.String codeSubsctriptorProblem;

    private java.lang.String internetForAll;

    private java.lang.String lastNameContact;

    private java.lang.String nameContact;

    private java.lang.String receiptType;

    private java.lang.String returnCode;

    private java.lang.String returnMessage;

    public SubscriberInfo() {
    }

    public SubscriberInfo(
           java.lang.String account,
           java.lang.String codeSubsctriptorProblem,
           java.lang.String internetForAll,
           java.lang.String lastNameContact,
           java.lang.String nameContact,
           java.lang.String receiptType,
           java.lang.String returnCode,
           java.lang.String returnMessage) {
           this.account = account;
           this.codeSubsctriptorProblem = codeSubsctriptorProblem;
           this.internetForAll = internetForAll;
           this.lastNameContact = lastNameContact;
           this.nameContact = nameContact;
           this.receiptType = receiptType;
           this.returnCode = returnCode;
           this.returnMessage = returnMessage;
    }


    /**
     * Gets the account value for this SubscriberInfo.
     * 
     * @return account
     */
    public java.lang.String getAccount() {
        return account;
    }


    /**
     * Sets the account value for this SubscriberInfo.
     * 
     * @param account
     */
    public void setAccount(java.lang.String account) {
        this.account = account;
    }


    /**
     * Gets the codeSubsctriptorProblem value for this SubscriberInfo.
     * 
     * @return codeSubsctriptorProblem
     */
    public java.lang.String getCodeSubsctriptorProblem() {
        return codeSubsctriptorProblem;
    }


    /**
     * Sets the codeSubsctriptorProblem value for this SubscriberInfo.
     * 
     * @param codeSubsctriptorProblem
     */
    public void setCodeSubsctriptorProblem(java.lang.String codeSubsctriptorProblem) {
        this.codeSubsctriptorProblem = codeSubsctriptorProblem;
    }


    /**
     * Gets the internetForAll value for this SubscriberInfo.
     * 
     * @return internetForAll
     */
    public java.lang.String getInternetForAll() {
        return internetForAll;
    }


    /**
     * Sets the internetForAll value for this SubscriberInfo.
     * 
     * @param internetForAll
     */
    public void setInternetForAll(java.lang.String internetForAll) {
        this.internetForAll = internetForAll;
    }


    /**
     * Gets the lastNameContact value for this SubscriberInfo.
     * 
     * @return lastNameContact
     */
    public java.lang.String getLastNameContact() {
        return lastNameContact;
    }


    /**
     * Sets the lastNameContact value for this SubscriberInfo.
     * 
     * @param lastNameContact
     */
    public void setLastNameContact(java.lang.String lastNameContact) {
        this.lastNameContact = lastNameContact;
    }


    /**
     * Gets the nameContact value for this SubscriberInfo.
     * 
     * @return nameContact
     */
    public java.lang.String getNameContact() {
        return nameContact;
    }


    /**
     * Sets the nameContact value for this SubscriberInfo.
     * 
     * @param nameContact
     */
    public void setNameContact(java.lang.String nameContact) {
        this.nameContact = nameContact;
    }


    /**
     * Gets the receiptType value for this SubscriberInfo.
     * 
     * @return receiptType
     */
    public java.lang.String getReceiptType() {
        return receiptType;
    }


    /**
     * Sets the receiptType value for this SubscriberInfo.
     * 
     * @param receiptType
     */
    public void setReceiptType(java.lang.String receiptType) {
        this.receiptType = receiptType;
    }


    /**
     * Gets the returnCode value for this SubscriberInfo.
     * 
     * @return returnCode
     */
    public java.lang.String getReturnCode() {
        return returnCode;
    }


    /**
     * Sets the returnCode value for this SubscriberInfo.
     * 
     * @param returnCode
     */
    public void setReturnCode(java.lang.String returnCode) {
        this.returnCode = returnCode;
    }


    /**
     * Gets the returnMessage value for this SubscriberInfo.
     * 
     * @return returnMessage
     */
    public java.lang.String getReturnMessage() {
        return returnMessage;
    }


    /**
     * Sets the returnMessage value for this SubscriberInfo.
     * 
     * @param returnMessage
     */
    public void setReturnMessage(java.lang.String returnMessage) {
        this.returnMessage = returnMessage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubscriberInfo)) return false;
        SubscriberInfo other = (SubscriberInfo) obj;
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
            ((this.codeSubsctriptorProblem==null && other.getCodeSubsctriptorProblem()==null) || 
             (this.codeSubsctriptorProblem!=null &&
              this.codeSubsctriptorProblem.equals(other.getCodeSubsctriptorProblem()))) &&
            ((this.internetForAll==null && other.getInternetForAll()==null) || 
             (this.internetForAll!=null &&
              this.internetForAll.equals(other.getInternetForAll()))) &&
            ((this.lastNameContact==null && other.getLastNameContact()==null) || 
             (this.lastNameContact!=null &&
              this.lastNameContact.equals(other.getLastNameContact()))) &&
            ((this.nameContact==null && other.getNameContact()==null) || 
             (this.nameContact!=null &&
              this.nameContact.equals(other.getNameContact()))) &&
            ((this.receiptType==null && other.getReceiptType()==null) || 
             (this.receiptType!=null &&
              this.receiptType.equals(other.getReceiptType()))) &&
            ((this.returnCode==null && other.getReturnCode()==null) || 
             (this.returnCode!=null &&
              this.returnCode.equals(other.getReturnCode()))) &&
            ((this.returnMessage==null && other.getReturnMessage()==null) || 
             (this.returnMessage!=null &&
              this.returnMessage.equals(other.getReturnMessage())));
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
        if (getCodeSubsctriptorProblem() != null) {
            _hashCode += getCodeSubsctriptorProblem().hashCode();
        }
        if (getInternetForAll() != null) {
            _hashCode += getInternetForAll().hashCode();
        }
        if (getLastNameContact() != null) {
            _hashCode += getLastNameContact().hashCode();
        }
        if (getNameContact() != null) {
            _hashCode += getNameContact().hashCode();
        }
        if (getReceiptType() != null) {
            _hashCode += getReceiptType().hashCode();
        }
        if (getReturnCode() != null) {
            _hashCode += getReturnCode().hashCode();
        }
        if (getReturnMessage() != null) {
            _hashCode += getReturnMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubscriberInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "subscriberInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("", "account"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codeSubsctriptorProblem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codeSubsctriptorProblem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internetForAll");
        elemField.setXmlName(new javax.xml.namespace.QName("", "internetForAll"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastNameContact");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastNameContact"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameContact");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nameContact"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiptType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receiptType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "returnCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "returnMessage"));
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
