/**
 * ReconnectionData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.telmex.pcml.service;

public class ReconnectionData  implements java.io.Serializable {
    private java.lang.String accountType;

    private boolean hasInternet;

    private boolean hasTV;

    private boolean hasVoice;

    private java.lang.String message;

    private java.lang.String networkType;

    private java.lang.String workOrderNo;

    public ReconnectionData() {
    }

    public ReconnectionData(
           java.lang.String accountType,
           boolean hasInternet,
           boolean hasTV,
           boolean hasVoice,
           java.lang.String message,
           java.lang.String networkType,
           java.lang.String workOrderNo) {
           this.accountType = accountType;
           this.hasInternet = hasInternet;
           this.hasTV = hasTV;
           this.hasVoice = hasVoice;
           this.message = message;
           this.networkType = networkType;
           this.workOrderNo = workOrderNo;
    }


    /**
     * Gets the accountType value for this ReconnectionData.
     * 
     * @return accountType
     */
    public java.lang.String getAccountType() {
        return accountType;
    }


    /**
     * Sets the accountType value for this ReconnectionData.
     * 
     * @param accountType
     */
    public void setAccountType(java.lang.String accountType) {
        this.accountType = accountType;
    }


    /**
     * Gets the hasInternet value for this ReconnectionData.
     * 
     * @return hasInternet
     */
    public boolean isHasInternet() {
        return hasInternet;
    }


    /**
     * Sets the hasInternet value for this ReconnectionData.
     * 
     * @param hasInternet
     */
    public void setHasInternet(boolean hasInternet) {
        this.hasInternet = hasInternet;
    }


    /**
     * Gets the hasTV value for this ReconnectionData.
     * 
     * @return hasTV
     */
    public boolean isHasTV() {
        return hasTV;
    }


    /**
     * Sets the hasTV value for this ReconnectionData.
     * 
     * @param hasTV
     */
    public void setHasTV(boolean hasTV) {
        this.hasTV = hasTV;
    }


    /**
     * Gets the hasVoice value for this ReconnectionData.
     * 
     * @return hasVoice
     */
    public boolean isHasVoice() {
        return hasVoice;
    }


    /**
     * Sets the hasVoice value for this ReconnectionData.
     * 
     * @param hasVoice
     */
    public void setHasVoice(boolean hasVoice) {
        this.hasVoice = hasVoice;
    }


    /**
     * Gets the message value for this ReconnectionData.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this ReconnectionData.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the networkType value for this ReconnectionData.
     * 
     * @return networkType
     */
    public java.lang.String getNetworkType() {
        return networkType;
    }


    /**
     * Sets the networkType value for this ReconnectionData.
     * 
     * @param networkType
     */
    public void setNetworkType(java.lang.String networkType) {
        this.networkType = networkType;
    }


    /**
     * Gets the workOrderNo value for this ReconnectionData.
     * 
     * @return workOrderNo
     */
    public java.lang.String getWorkOrderNo() {
        return workOrderNo;
    }


    /**
     * Sets the workOrderNo value for this ReconnectionData.
     * 
     * @param workOrderNo
     */
    public void setWorkOrderNo(java.lang.String workOrderNo) {
        this.workOrderNo = workOrderNo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReconnectionData)) return false;
        ReconnectionData other = (ReconnectionData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountType==null && other.getAccountType()==null) || 
             (this.accountType!=null &&
              this.accountType.equals(other.getAccountType()))) &&
            this.hasInternet == other.isHasInternet() &&
            this.hasTV == other.isHasTV() &&
            this.hasVoice == other.isHasVoice() &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.networkType==null && other.getNetworkType()==null) || 
             (this.networkType!=null &&
              this.networkType.equals(other.getNetworkType()))) &&
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
        int _hashCode = 1;
        if (getAccountType() != null) {
            _hashCode += getAccountType().hashCode();
        }
        _hashCode += (isHasInternet() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isHasTV() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isHasVoice() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getNetworkType() != null) {
            _hashCode += getNetworkType().hashCode();
        }
        if (getWorkOrderNo() != null) {
            _hashCode += getWorkOrderNo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReconnectionData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "reconnectionData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasInternet");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hasInternet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasTV");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hasTV"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasVoice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hasVoice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "networkType"));
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
