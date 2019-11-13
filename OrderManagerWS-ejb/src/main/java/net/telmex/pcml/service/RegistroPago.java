/**
 * RegistroPago.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.telmex.pcml.service;

public class RegistroPago  implements java.io.Serializable {
    private java.lang.String authorizationNumber;

    private java.math.BigDecimal cuenta;

    private java.lang.String errorDescription;

    private java.lang.String errorStatus;

    private java.lang.String receipt;

    private java.lang.String transactionCode;

    private java.lang.String user;

    private java.math.BigDecimal value;

    public RegistroPago() {
    }

    public RegistroPago(
           java.lang.String authorizationNumber,
           java.math.BigDecimal cuenta,
           java.lang.String errorDescription,
           java.lang.String errorStatus,
           java.lang.String receipt,
           java.lang.String transactionCode,
           java.lang.String user,
           java.math.BigDecimal value) {
           this.authorizationNumber = authorizationNumber;
           this.cuenta = cuenta;
           this.errorDescription = errorDescription;
           this.errorStatus = errorStatus;
           this.receipt = receipt;
           this.transactionCode = transactionCode;
           this.user = user;
           this.value = value;
    }


    /**
     * Gets the authorizationNumber value for this RegistroPago.
     * 
     * @return authorizationNumber
     */
    public java.lang.String getAuthorizationNumber() {
        return authorizationNumber;
    }


    /**
     * Sets the authorizationNumber value for this RegistroPago.
     * 
     * @param authorizationNumber
     */
    public void setAuthorizationNumber(java.lang.String authorizationNumber) {
        this.authorizationNumber = authorizationNumber;
    }


    /**
     * Gets the cuenta value for this RegistroPago.
     * 
     * @return cuenta
     */
    public java.math.BigDecimal getCuenta() {
        return cuenta;
    }


    /**
     * Sets the cuenta value for this RegistroPago.
     * 
     * @param cuenta
     */
    public void setCuenta(java.math.BigDecimal cuenta) {
        this.cuenta = cuenta;
    }


    /**
     * Gets the errorDescription value for this RegistroPago.
     * 
     * @return errorDescription
     */
    public java.lang.String getErrorDescription() {
        return errorDescription;
    }


    /**
     * Sets the errorDescription value for this RegistroPago.
     * 
     * @param errorDescription
     */
    public void setErrorDescription(java.lang.String errorDescription) {
        this.errorDescription = errorDescription;
    }


    /**
     * Gets the errorStatus value for this RegistroPago.
     * 
     * @return errorStatus
     */
    public java.lang.String getErrorStatus() {
        return errorStatus;
    }


    /**
     * Sets the errorStatus value for this RegistroPago.
     * 
     * @param errorStatus
     */
    public void setErrorStatus(java.lang.String errorStatus) {
        this.errorStatus = errorStatus;
    }


    /**
     * Gets the receipt value for this RegistroPago.
     * 
     * @return receipt
     */
    public java.lang.String getReceipt() {
        return receipt;
    }


    /**
     * Sets the receipt value for this RegistroPago.
     * 
     * @param receipt
     */
    public void setReceipt(java.lang.String receipt) {
        this.receipt = receipt;
    }


    /**
     * Gets the transactionCode value for this RegistroPago.
     * 
     * @return transactionCode
     */
    public java.lang.String getTransactionCode() {
        return transactionCode;
    }


    /**
     * Sets the transactionCode value for this RegistroPago.
     * 
     * @param transactionCode
     */
    public void setTransactionCode(java.lang.String transactionCode) {
        this.transactionCode = transactionCode;
    }


    /**
     * Gets the user value for this RegistroPago.
     * 
     * @return user
     */
    public java.lang.String getUser() {
        return user;
    }


    /**
     * Sets the user value for this RegistroPago.
     * 
     * @param user
     */
    public void setUser(java.lang.String user) {
        this.user = user;
    }


    /**
     * Gets the value value for this RegistroPago.
     * 
     * @return value
     */
    public java.math.BigDecimal getValue() {
        return value;
    }


    /**
     * Sets the value value for this RegistroPago.
     * 
     * @param value
     */
    public void setValue(java.math.BigDecimal value) {
        this.value = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RegistroPago)) return false;
        RegistroPago other = (RegistroPago) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.authorizationNumber==null && other.getAuthorizationNumber()==null) || 
             (this.authorizationNumber!=null &&
              this.authorizationNumber.equals(other.getAuthorizationNumber()))) &&
            ((this.cuenta==null && other.getCuenta()==null) || 
             (this.cuenta!=null &&
              this.cuenta.equals(other.getCuenta()))) &&
            ((this.errorDescription==null && other.getErrorDescription()==null) || 
             (this.errorDescription!=null &&
              this.errorDescription.equals(other.getErrorDescription()))) &&
            ((this.errorStatus==null && other.getErrorStatus()==null) || 
             (this.errorStatus!=null &&
              this.errorStatus.equals(other.getErrorStatus()))) &&
            ((this.receipt==null && other.getReceipt()==null) || 
             (this.receipt!=null &&
              this.receipt.equals(other.getReceipt()))) &&
            ((this.transactionCode==null && other.getTransactionCode()==null) || 
             (this.transactionCode!=null &&
              this.transactionCode.equals(other.getTransactionCode()))) &&
            ((this.user==null && other.getUser()==null) || 
             (this.user!=null &&
              this.user.equals(other.getUser()))) &&
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
        if (getAuthorizationNumber() != null) {
            _hashCode += getAuthorizationNumber().hashCode();
        }
        if (getCuenta() != null) {
            _hashCode += getCuenta().hashCode();
        }
        if (getErrorDescription() != null) {
            _hashCode += getErrorDescription().hashCode();
        }
        if (getErrorStatus() != null) {
            _hashCode += getErrorStatus().hashCode();
        }
        if (getReceipt() != null) {
            _hashCode += getReceipt().hashCode();
        }
        if (getTransactionCode() != null) {
            _hashCode += getTransactionCode().hashCode();
        }
        if (getUser() != null) {
            _hashCode += getUser().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RegistroPago.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "registroPago"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorizationNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authorizationNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cuenta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cuenta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receipt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receipt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
