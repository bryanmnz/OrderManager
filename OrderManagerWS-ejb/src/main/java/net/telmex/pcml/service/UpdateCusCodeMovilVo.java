/**
 * UpdateCusCodeMovilVo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.telmex.pcml.service;

public class UpdateCusCodeMovilVo  implements java.io.Serializable {
    private java.lang.String account;

    private java.lang.String customerMobile;

    private java.lang.String mensrta;

    private java.lang.String otNumber;

    private java.lang.String pnMin;

    private java.lang.String pusu;

    public UpdateCusCodeMovilVo() {
    }

    public UpdateCusCodeMovilVo(
           java.lang.String account,
           java.lang.String customerMobile,
           java.lang.String mensrta,
           java.lang.String otNumber,
           java.lang.String pnMin,
           java.lang.String pusu) {
           this.account = account;
           this.customerMobile = customerMobile;
           this.mensrta = mensrta;
           this.otNumber = otNumber;
           this.pnMin = pnMin;
           this.pusu = pusu;
    }


    /**
     * Gets the account value for this UpdateCusCodeMovilVo.
     * 
     * @return account
     */
    public java.lang.String getAccount() {
        return account;
    }


    /**
     * Sets the account value for this UpdateCusCodeMovilVo.
     * 
     * @param account
     */
    public void setAccount(java.lang.String account) {
        this.account = account;
    }


    /**
     * Gets the customerMobile value for this UpdateCusCodeMovilVo.
     * 
     * @return customerMobile
     */
    public java.lang.String getCustomerMobile() {
        return customerMobile;
    }


    /**
     * Sets the customerMobile value for this UpdateCusCodeMovilVo.
     * 
     * @param customerMobile
     */
    public void setCustomerMobile(java.lang.String customerMobile) {
        this.customerMobile = customerMobile;
    }


    /**
     * Gets the mensrta value for this UpdateCusCodeMovilVo.
     * 
     * @return mensrta
     */
    public java.lang.String getMensrta() {
        return mensrta;
    }


    /**
     * Sets the mensrta value for this UpdateCusCodeMovilVo.
     * 
     * @param mensrta
     */
    public void setMensrta(java.lang.String mensrta) {
        this.mensrta = mensrta;
    }


    /**
     * Gets the otNumber value for this UpdateCusCodeMovilVo.
     * 
     * @return otNumber
     */
    public java.lang.String getOtNumber() {
        return otNumber;
    }


    /**
     * Sets the otNumber value for this UpdateCusCodeMovilVo.
     * 
     * @param otNumber
     */
    public void setOtNumber(java.lang.String otNumber) {
        this.otNumber = otNumber;
    }


    /**
     * Gets the pnMin value for this UpdateCusCodeMovilVo.
     * 
     * @return pnMin
     */
    public java.lang.String getPnMin() {
        return pnMin;
    }


    /**
     * Sets the pnMin value for this UpdateCusCodeMovilVo.
     * 
     * @param pnMin
     */
    public void setPnMin(java.lang.String pnMin) {
        this.pnMin = pnMin;
    }


    /**
     * Gets the pusu value for this UpdateCusCodeMovilVo.
     * 
     * @return pusu
     */
    public java.lang.String getPusu() {
        return pusu;
    }


    /**
     * Sets the pusu value for this UpdateCusCodeMovilVo.
     * 
     * @param pusu
     */
    public void setPusu(java.lang.String pusu) {
        this.pusu = pusu;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateCusCodeMovilVo)) return false;
        UpdateCusCodeMovilVo other = (UpdateCusCodeMovilVo) obj;
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
            ((this.customerMobile==null && other.getCustomerMobile()==null) || 
             (this.customerMobile!=null &&
              this.customerMobile.equals(other.getCustomerMobile()))) &&
            ((this.mensrta==null && other.getMensrta()==null) || 
             (this.mensrta!=null &&
              this.mensrta.equals(other.getMensrta()))) &&
            ((this.otNumber==null && other.getOtNumber()==null) || 
             (this.otNumber!=null &&
              this.otNumber.equals(other.getOtNumber()))) &&
            ((this.pnMin==null && other.getPnMin()==null) || 
             (this.pnMin!=null &&
              this.pnMin.equals(other.getPnMin()))) &&
            ((this.pusu==null && other.getPusu()==null) || 
             (this.pusu!=null &&
              this.pusu.equals(other.getPusu())));
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
        if (getCustomerMobile() != null) {
            _hashCode += getCustomerMobile().hashCode();
        }
        if (getMensrta() != null) {
            _hashCode += getMensrta().hashCode();
        }
        if (getOtNumber() != null) {
            _hashCode += getOtNumber().hashCode();
        }
        if (getPnMin() != null) {
            _hashCode += getPnMin().hashCode();
        }
        if (getPusu() != null) {
            _hashCode += getPusu().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateCusCodeMovilVo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "updateCusCodeMovilVo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("", "account"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerMobile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerMobile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensrta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mensrta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "otNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pnMin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pnMin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pusu");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pusu"));
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
