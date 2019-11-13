/**
 * InfoSale.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.telmex.pcml.service;

public class InfoSale  implements java.io.Serializable {
    private java.lang.String account;

    private java.lang.String asesorCode;

    private java.lang.String contractCode;

    private java.lang.String message;

    private java.lang.String returnCode;

    public InfoSale() {
    }

    public InfoSale(
           java.lang.String account,
           java.lang.String asesorCode,
           java.lang.String contractCode,
           java.lang.String message,
           java.lang.String returnCode) {
           this.account = account;
           this.asesorCode = asesorCode;
           this.contractCode = contractCode;
           this.message = message;
           this.returnCode = returnCode;
    }


    /**
     * Gets the account value for this InfoSale.
     * 
     * @return account
     */
    public java.lang.String getAccount() {
        return account;
    }


    /**
     * Sets the account value for this InfoSale.
     * 
     * @param account
     */
    public void setAccount(java.lang.String account) {
        this.account = account;
    }


    /**
     * Gets the asesorCode value for this InfoSale.
     * 
     * @return asesorCode
     */
    public java.lang.String getAsesorCode() {
        return asesorCode;
    }


    /**
     * Sets the asesorCode value for this InfoSale.
     * 
     * @param asesorCode
     */
    public void setAsesorCode(java.lang.String asesorCode) {
        this.asesorCode = asesorCode;
    }


    /**
     * Gets the contractCode value for this InfoSale.
     * 
     * @return contractCode
     */
    public java.lang.String getContractCode() {
        return contractCode;
    }


    /**
     * Sets the contractCode value for this InfoSale.
     * 
     * @param contractCode
     */
    public void setContractCode(java.lang.String contractCode) {
        this.contractCode = contractCode;
    }


    /**
     * Gets the message value for this InfoSale.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this InfoSale.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the returnCode value for this InfoSale.
     * 
     * @return returnCode
     */
    public java.lang.String getReturnCode() {
        return returnCode;
    }


    /**
     * Sets the returnCode value for this InfoSale.
     * 
     * @param returnCode
     */
    public void setReturnCode(java.lang.String returnCode) {
        this.returnCode = returnCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InfoSale)) return false;
        InfoSale other = (InfoSale) obj;
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
            ((this.asesorCode==null && other.getAsesorCode()==null) || 
             (this.asesorCode!=null &&
              this.asesorCode.equals(other.getAsesorCode()))) &&
            ((this.contractCode==null && other.getContractCode()==null) || 
             (this.contractCode!=null &&
              this.contractCode.equals(other.getContractCode()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.returnCode==null && other.getReturnCode()==null) || 
             (this.returnCode!=null &&
              this.returnCode.equals(other.getReturnCode())));
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
        if (getAsesorCode() != null) {
            _hashCode += getAsesorCode().hashCode();
        }
        if (getContractCode() != null) {
            _hashCode += getContractCode().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getReturnCode() != null) {
            _hashCode += getReturnCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InfoSale.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "infoSale"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("", "account"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("asesorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "asesorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contractCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("returnCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "returnCode"));
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
