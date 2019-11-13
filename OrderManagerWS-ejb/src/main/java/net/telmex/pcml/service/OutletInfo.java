/**
 * OutletInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.telmex.pcml.service;

public class OutletInfo  implements java.io.Serializable {
    private java.lang.String amountAditionalTV;

    private java.lang.String amountAditionalVoice;

    private java.lang.String valueAditionalTV;

    private java.lang.String valueAditionalVoice;

    public OutletInfo() {
    }

    public OutletInfo(
           java.lang.String amountAditionalTV,
           java.lang.String amountAditionalVoice,
           java.lang.String valueAditionalTV,
           java.lang.String valueAditionalVoice) {
           this.amountAditionalTV = amountAditionalTV;
           this.amountAditionalVoice = amountAditionalVoice;
           this.valueAditionalTV = valueAditionalTV;
           this.valueAditionalVoice = valueAditionalVoice;
    }


    /**
     * Gets the amountAditionalTV value for this OutletInfo.
     * 
     * @return amountAditionalTV
     */
    public java.lang.String getAmountAditionalTV() {
        return amountAditionalTV;
    }


    /**
     * Sets the amountAditionalTV value for this OutletInfo.
     * 
     * @param amountAditionalTV
     */
    public void setAmountAditionalTV(java.lang.String amountAditionalTV) {
        this.amountAditionalTV = amountAditionalTV;
    }


    /**
     * Gets the amountAditionalVoice value for this OutletInfo.
     * 
     * @return amountAditionalVoice
     */
    public java.lang.String getAmountAditionalVoice() {
        return amountAditionalVoice;
    }


    /**
     * Sets the amountAditionalVoice value for this OutletInfo.
     * 
     * @param amountAditionalVoice
     */
    public void setAmountAditionalVoice(java.lang.String amountAditionalVoice) {
        this.amountAditionalVoice = amountAditionalVoice;
    }


    /**
     * Gets the valueAditionalTV value for this OutletInfo.
     * 
     * @return valueAditionalTV
     */
    public java.lang.String getValueAditionalTV() {
        return valueAditionalTV;
    }


    /**
     * Sets the valueAditionalTV value for this OutletInfo.
     * 
     * @param valueAditionalTV
     */
    public void setValueAditionalTV(java.lang.String valueAditionalTV) {
        this.valueAditionalTV = valueAditionalTV;
    }


    /**
     * Gets the valueAditionalVoice value for this OutletInfo.
     * 
     * @return valueAditionalVoice
     */
    public java.lang.String getValueAditionalVoice() {
        return valueAditionalVoice;
    }


    /**
     * Sets the valueAditionalVoice value for this OutletInfo.
     * 
     * @param valueAditionalVoice
     */
    public void setValueAditionalVoice(java.lang.String valueAditionalVoice) {
        this.valueAditionalVoice = valueAditionalVoice;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OutletInfo)) return false;
        OutletInfo other = (OutletInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.amountAditionalTV==null && other.getAmountAditionalTV()==null) || 
             (this.amountAditionalTV!=null &&
              this.amountAditionalTV.equals(other.getAmountAditionalTV()))) &&
            ((this.amountAditionalVoice==null && other.getAmountAditionalVoice()==null) || 
             (this.amountAditionalVoice!=null &&
              this.amountAditionalVoice.equals(other.getAmountAditionalVoice()))) &&
            ((this.valueAditionalTV==null && other.getValueAditionalTV()==null) || 
             (this.valueAditionalTV!=null &&
              this.valueAditionalTV.equals(other.getValueAditionalTV()))) &&
            ((this.valueAditionalVoice==null && other.getValueAditionalVoice()==null) || 
             (this.valueAditionalVoice!=null &&
              this.valueAditionalVoice.equals(other.getValueAditionalVoice())));
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
        if (getAmountAditionalTV() != null) {
            _hashCode += getAmountAditionalTV().hashCode();
        }
        if (getAmountAditionalVoice() != null) {
            _hashCode += getAmountAditionalVoice().hashCode();
        }
        if (getValueAditionalTV() != null) {
            _hashCode += getValueAditionalTV().hashCode();
        }
        if (getValueAditionalVoice() != null) {
            _hashCode += getValueAditionalVoice().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OutletInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "outletInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountAditionalTV");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amountAditionalTV"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountAditionalVoice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amountAditionalVoice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueAditionalTV");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valueAditionalTV"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueAditionalVoice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valueAditionalVoice"));
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
