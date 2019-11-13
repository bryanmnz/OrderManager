/**
 * CreditHistory.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.telmex.pcml.service;

public class CreditHistory  implements java.io.Serializable {
    private java.lang.String account;

    private java.lang.String balance;

    private java.lang.String creditValue;

    private java.lang.String date;

    private java.lang.String debitValue;

    private java.lang.String transactionCode;

    private java.lang.String transactionDescription;

    public CreditHistory() {
    }

    public CreditHistory(
           java.lang.String account,
           java.lang.String balance,
           java.lang.String creditValue,
           java.lang.String date,
           java.lang.String debitValue,
           java.lang.String transactionCode,
           java.lang.String transactionDescription) {
           this.account = account;
           this.balance = balance;
           this.creditValue = creditValue;
           this.date = date;
           this.debitValue = debitValue;
           this.transactionCode = transactionCode;
           this.transactionDescription = transactionDescription;
    }


    /**
     * Gets the account value for this CreditHistory.
     * 
     * @return account
     */
    public java.lang.String getAccount() {
        return account;
    }


    /**
     * Sets the account value for this CreditHistory.
     * 
     * @param account
     */
    public void setAccount(java.lang.String account) {
        this.account = account;
    }


    /**
     * Gets the balance value for this CreditHistory.
     * 
     * @return balance
     */
    public java.lang.String getBalance() {
        return balance;
    }


    /**
     * Sets the balance value for this CreditHistory.
     * 
     * @param balance
     */
    public void setBalance(java.lang.String balance) {
        this.balance = balance;
    }


    /**
     * Gets the creditValue value for this CreditHistory.
     * 
     * @return creditValue
     */
    public java.lang.String getCreditValue() {
        return creditValue;
    }


    /**
     * Sets the creditValue value for this CreditHistory.
     * 
     * @param creditValue
     */
    public void setCreditValue(java.lang.String creditValue) {
        this.creditValue = creditValue;
    }


    /**
     * Gets the date value for this CreditHistory.
     * 
     * @return date
     */
    public java.lang.String getDate() {
        return date;
    }


    /**
     * Sets the date value for this CreditHistory.
     * 
     * @param date
     */
    public void setDate(java.lang.String date) {
        this.date = date;
    }


    /**
     * Gets the debitValue value for this CreditHistory.
     * 
     * @return debitValue
     */
    public java.lang.String getDebitValue() {
        return debitValue;
    }


    /**
     * Sets the debitValue value for this CreditHistory.
     * 
     * @param debitValue
     */
    public void setDebitValue(java.lang.String debitValue) {
        this.debitValue = debitValue;
    }


    /**
     * Gets the transactionCode value for this CreditHistory.
     * 
     * @return transactionCode
     */
    public java.lang.String getTransactionCode() {
        return transactionCode;
    }


    /**
     * Sets the transactionCode value for this CreditHistory.
     * 
     * @param transactionCode
     */
    public void setTransactionCode(java.lang.String transactionCode) {
        this.transactionCode = transactionCode;
    }


    /**
     * Gets the transactionDescription value for this CreditHistory.
     * 
     * @return transactionDescription
     */
    public java.lang.String getTransactionDescription() {
        return transactionDescription;
    }


    /**
     * Sets the transactionDescription value for this CreditHistory.
     * 
     * @param transactionDescription
     */
    public void setTransactionDescription(java.lang.String transactionDescription) {
        this.transactionDescription = transactionDescription;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreditHistory)) return false;
        CreditHistory other = (CreditHistory) obj;
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
            ((this.balance==null && other.getBalance()==null) || 
             (this.balance!=null &&
              this.balance.equals(other.getBalance()))) &&
            ((this.creditValue==null && other.getCreditValue()==null) || 
             (this.creditValue!=null &&
              this.creditValue.equals(other.getCreditValue()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.debitValue==null && other.getDebitValue()==null) || 
             (this.debitValue!=null &&
              this.debitValue.equals(other.getDebitValue()))) &&
            ((this.transactionCode==null && other.getTransactionCode()==null) || 
             (this.transactionCode!=null &&
              this.transactionCode.equals(other.getTransactionCode()))) &&
            ((this.transactionDescription==null && other.getTransactionDescription()==null) || 
             (this.transactionDescription!=null &&
              this.transactionDescription.equals(other.getTransactionDescription())));
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
        if (getBalance() != null) {
            _hashCode += getBalance().hashCode();
        }
        if (getCreditValue() != null) {
            _hashCode += getCreditValue().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getDebitValue() != null) {
            _hashCode += getDebitValue().hashCode();
        }
        if (getTransactionCode() != null) {
            _hashCode += getTransactionCode().hashCode();
        }
        if (getTransactionDescription() != null) {
            _hashCode += getTransactionDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreditHistory.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "creditHistory"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("", "account"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "balance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creditValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("debitValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "debitValue"));
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
        elemField.setFieldName("transactionDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionDescription"));
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
