/**
 * ResponseMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.telmex.ws;

public class ResponseMessage  extends net.telmex.ws.BasicMessage  implements java.io.Serializable {
    private java.lang.String messageText;

    private java.lang.String messageType;

    private java.lang.String subscriberAccount;

    private java.lang.String workOrderNo;

    public ResponseMessage() {
    }

    public ResponseMessage(
           java.lang.String messageText,
           java.lang.String messageType,
           java.lang.String subscriberAccount,
           java.lang.String workOrderNo) {
        this.messageText = messageText;
        this.messageType = messageType;
        this.subscriberAccount = subscriberAccount;
        this.workOrderNo = workOrderNo;
    }


    /**
     * Gets the messageText value for this ResponseMessage.
     * 
     * @return messageText
     */
    public java.lang.String getMessageText() {
        return messageText;
    }


    /**
     * Sets the messageText value for this ResponseMessage.
     * 
     * @param messageText
     */
    public void setMessageText(java.lang.String messageText) {
        this.messageText = messageText;
    }


    /**
     * Gets the messageType value for this ResponseMessage.
     * 
     * @return messageType
     */
    public java.lang.String getMessageType() {
        return messageType;
    }


    /**
     * Sets the messageType value for this ResponseMessage.
     * 
     * @param messageType
     */
    public void setMessageType(java.lang.String messageType) {
        this.messageType = messageType;
    }


    /**
     * Gets the subscriberAccount value for this ResponseMessage.
     * 
     * @return subscriberAccount
     */
    public java.lang.String getSubscriberAccount() {
        return subscriberAccount;
    }


    /**
     * Sets the subscriberAccount value for this ResponseMessage.
     * 
     * @param subscriberAccount
     */
    public void setSubscriberAccount(java.lang.String subscriberAccount) {
        this.subscriberAccount = subscriberAccount;
    }


    /**
     * Gets the workOrderNo value for this ResponseMessage.
     * 
     * @return workOrderNo
     */
    public java.lang.String getWorkOrderNo() {
        return workOrderNo;
    }


    /**
     * Sets the workOrderNo value for this ResponseMessage.
     * 
     * @param workOrderNo
     */
    public void setWorkOrderNo(java.lang.String workOrderNo) {
        this.workOrderNo = workOrderNo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResponseMessage)) return false;
        ResponseMessage other = (ResponseMessage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.messageText==null && other.getMessageText()==null) || 
             (this.messageText!=null &&
              this.messageText.equals(other.getMessageText()))) &&
            ((this.messageType==null && other.getMessageType()==null) || 
             (this.messageType!=null &&
              this.messageType.equals(other.getMessageType()))) &&
            ((this.subscriberAccount==null && other.getSubscriberAccount()==null) || 
             (this.subscriberAccount!=null &&
              this.subscriberAccount.equals(other.getSubscriberAccount()))) &&
            ((this.workOrderNo==null && other.getWorkOrderNo()==null) || 
             (this.workOrderNo!=null &&
              this.workOrderNo.equals(other.getWorkOrderNo())));
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
        if (getMessageText() != null) {
            _hashCode += getMessageText().hashCode();
        }
        if (getMessageType() != null) {
            _hashCode += getMessageType().hashCode();
        }
        if (getSubscriberAccount() != null) {
            _hashCode += getSubscriberAccount().hashCode();
        }
        if (getWorkOrderNo() != null) {
            _hashCode += getWorkOrderNo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResponseMessage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.telmex.net/", "responseMessage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageText");
        elemField.setXmlName(new javax.xml.namespace.QName("", "messageText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "messageType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subscriberAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workOrderNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "workOrderNo"));
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
