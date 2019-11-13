/**
 * UpdateAditionalInfoSubscriber.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.telmex.pcml.service;

public class UpdateAditionalInfoSubscriber  implements java.io.Serializable {
    private java.lang.String account;

    private java.lang.String creditBureaus;

    private java.lang.String info;

    private java.lang.String returnCode;

    private java.lang.String returnMessage;

    private java.lang.String stateContract;

    private java.lang.String telemercadeo;

    private java.lang.String typeSolicitude;

    public UpdateAditionalInfoSubscriber() {
    }

    public UpdateAditionalInfoSubscriber(
           java.lang.String account,
           java.lang.String creditBureaus,
           java.lang.String info,
           java.lang.String returnCode,
           java.lang.String returnMessage,
           java.lang.String stateContract,
           java.lang.String telemercadeo,
           java.lang.String typeSolicitude) {
           this.account = account;
           this.creditBureaus = creditBureaus;
           this.info = info;
           this.returnCode = returnCode;
           this.returnMessage = returnMessage;
           this.stateContract = stateContract;
           this.telemercadeo = telemercadeo;
           this.typeSolicitude = typeSolicitude;
    }


    /**
     * Gets the account value for this UpdateAditionalInfoSubscriber.
     * 
     * @return account
     */
    public java.lang.String getAccount() {
        return account;
    }


    /**
     * Sets the account value for this UpdateAditionalInfoSubscriber.
     * 
     * @param account
     */
    public void setAccount(java.lang.String account) {
        this.account = account;
    }


    /**
     * Gets the creditBureaus value for this UpdateAditionalInfoSubscriber.
     * 
     * @return creditBureaus
     */
    public java.lang.String getCreditBureaus() {
        return creditBureaus;
    }


    /**
     * Sets the creditBureaus value for this UpdateAditionalInfoSubscriber.
     * 
     * @param creditBureaus
     */
    public void setCreditBureaus(java.lang.String creditBureaus) {
        this.creditBureaus = creditBureaus;
    }


    /**
     * Gets the info value for this UpdateAditionalInfoSubscriber.
     * 
     * @return info
     */
    public java.lang.String getInfo() {
        return info;
    }


    /**
     * Sets the info value for this UpdateAditionalInfoSubscriber.
     * 
     * @param info
     */
    public void setInfo(java.lang.String info) {
        this.info = info;
    }


    /**
     * Gets the returnCode value for this UpdateAditionalInfoSubscriber.
     * 
     * @return returnCode
     */
    public java.lang.String getReturnCode() {
        return returnCode;
    }


    /**
     * Sets the returnCode value for this UpdateAditionalInfoSubscriber.
     * 
     * @param returnCode
     */
    public void setReturnCode(java.lang.String returnCode) {
        this.returnCode = returnCode;
    }


    /**
     * Gets the returnMessage value for this UpdateAditionalInfoSubscriber.
     * 
     * @return returnMessage
     */
    public java.lang.String getReturnMessage() {
        return returnMessage;
    }


    /**
     * Sets the returnMessage value for this UpdateAditionalInfoSubscriber.
     * 
     * @param returnMessage
     */
    public void setReturnMessage(java.lang.String returnMessage) {
        this.returnMessage = returnMessage;
    }


    /**
     * Gets the stateContract value for this UpdateAditionalInfoSubscriber.
     * 
     * @return stateContract
     */
    public java.lang.String getStateContract() {
        return stateContract;
    }


    /**
     * Sets the stateContract value for this UpdateAditionalInfoSubscriber.
     * 
     * @param stateContract
     */
    public void setStateContract(java.lang.String stateContract) {
        this.stateContract = stateContract;
    }


    /**
     * Gets the telemercadeo value for this UpdateAditionalInfoSubscriber.
     * 
     * @return telemercadeo
     */
    public java.lang.String getTelemercadeo() {
        return telemercadeo;
    }


    /**
     * Sets the telemercadeo value for this UpdateAditionalInfoSubscriber.
     * 
     * @param telemercadeo
     */
    public void setTelemercadeo(java.lang.String telemercadeo) {
        this.telemercadeo = telemercadeo;
    }


    /**
     * Gets the typeSolicitude value for this UpdateAditionalInfoSubscriber.
     * 
     * @return typeSolicitude
     */
    public java.lang.String getTypeSolicitude() {
        return typeSolicitude;
    }


    /**
     * Sets the typeSolicitude value for this UpdateAditionalInfoSubscriber.
     * 
     * @param typeSolicitude
     */
    public void setTypeSolicitude(java.lang.String typeSolicitude) {
        this.typeSolicitude = typeSolicitude;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateAditionalInfoSubscriber)) return false;
        UpdateAditionalInfoSubscriber other = (UpdateAditionalInfoSubscriber) obj;
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
            ((this.creditBureaus==null && other.getCreditBureaus()==null) || 
             (this.creditBureaus!=null &&
              this.creditBureaus.equals(other.getCreditBureaus()))) &&
            ((this.info==null && other.getInfo()==null) || 
             (this.info!=null &&
              this.info.equals(other.getInfo()))) &&
            ((this.returnCode==null && other.getReturnCode()==null) || 
             (this.returnCode!=null &&
              this.returnCode.equals(other.getReturnCode()))) &&
            ((this.returnMessage==null && other.getReturnMessage()==null) || 
             (this.returnMessage!=null &&
              this.returnMessage.equals(other.getReturnMessage()))) &&
            ((this.stateContract==null && other.getStateContract()==null) || 
             (this.stateContract!=null &&
              this.stateContract.equals(other.getStateContract()))) &&
            ((this.telemercadeo==null && other.getTelemercadeo()==null) || 
             (this.telemercadeo!=null &&
              this.telemercadeo.equals(other.getTelemercadeo()))) &&
            ((this.typeSolicitude==null && other.getTypeSolicitude()==null) || 
             (this.typeSolicitude!=null &&
              this.typeSolicitude.equals(other.getTypeSolicitude())));
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
        if (getCreditBureaus() != null) {
            _hashCode += getCreditBureaus().hashCode();
        }
        if (getInfo() != null) {
            _hashCode += getInfo().hashCode();
        }
        if (getReturnCode() != null) {
            _hashCode += getReturnCode().hashCode();
        }
        if (getReturnMessage() != null) {
            _hashCode += getReturnMessage().hashCode();
        }
        if (getStateContract() != null) {
            _hashCode += getStateContract().hashCode();
        }
        if (getTelemercadeo() != null) {
            _hashCode += getTelemercadeo().hashCode();
        }
        if (getTypeSolicitude() != null) {
            _hashCode += getTypeSolicitude().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateAditionalInfoSubscriber.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "updateAditionalInfoSubscriber"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("", "account"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditBureaus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creditBureaus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("info");
        elemField.setXmlName(new javax.xml.namespace.QName("", "info"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateContract");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stateContract"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telemercadeo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "telemercadeo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typeSolicitude");
        elemField.setXmlName(new javax.xml.namespace.QName("", "typeSolicitude"));
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
