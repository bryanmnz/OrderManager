/**
 * ServiceStructAmount.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.telmex.pcml.service;

public class ServiceStructAmount  implements java.io.Serializable {
    private java.lang.String amountAditionalService;

    private java.lang.String amountAditionalService3;

    private java.lang.String amountAditionalService4;

    private java.lang.String amountService;

    private java.lang.String serviceCode;

    private java.lang.String taxCode;

    private java.lang.String telephoneBenefit;

    public ServiceStructAmount() {
    }

    public ServiceStructAmount(
           java.lang.String amountAditionalService,
           java.lang.String amountAditionalService3,
           java.lang.String amountAditionalService4,
           java.lang.String amountService,
           java.lang.String serviceCode,
           java.lang.String taxCode,
           java.lang.String telephoneBenefit) {
           this.amountAditionalService = amountAditionalService;
           this.amountAditionalService3 = amountAditionalService3;
           this.amountAditionalService4 = amountAditionalService4;
           this.amountService = amountService;
           this.serviceCode = serviceCode;
           this.taxCode = taxCode;
           this.telephoneBenefit = telephoneBenefit;
    }


    /**
     * Gets the amountAditionalService value for this ServiceStructAmount.
     * 
     * @return amountAditionalService
     */
    public java.lang.String getAmountAditionalService() {
        return amountAditionalService;
    }


    /**
     * Sets the amountAditionalService value for this ServiceStructAmount.
     * 
     * @param amountAditionalService
     */
    public void setAmountAditionalService(java.lang.String amountAditionalService) {
        this.amountAditionalService = amountAditionalService;
    }


    /**
     * Gets the amountAditionalService3 value for this ServiceStructAmount.
     * 
     * @return amountAditionalService3
     */
    public java.lang.String getAmountAditionalService3() {
        return amountAditionalService3;
    }


    /**
     * Sets the amountAditionalService3 value for this ServiceStructAmount.
     * 
     * @param amountAditionalService3
     */
    public void setAmountAditionalService3(java.lang.String amountAditionalService3) {
        this.amountAditionalService3 = amountAditionalService3;
    }


    /**
     * Gets the amountAditionalService4 value for this ServiceStructAmount.
     * 
     * @return amountAditionalService4
     */
    public java.lang.String getAmountAditionalService4() {
        return amountAditionalService4;
    }


    /**
     * Sets the amountAditionalService4 value for this ServiceStructAmount.
     * 
     * @param amountAditionalService4
     */
    public void setAmountAditionalService4(java.lang.String amountAditionalService4) {
        this.amountAditionalService4 = amountAditionalService4;
    }


    /**
     * Gets the amountService value for this ServiceStructAmount.
     * 
     * @return amountService
     */
    public java.lang.String getAmountService() {
        return amountService;
    }


    /**
     * Sets the amountService value for this ServiceStructAmount.
     * 
     * @param amountService
     */
    public void setAmountService(java.lang.String amountService) {
        this.amountService = amountService;
    }


    /**
     * Gets the serviceCode value for this ServiceStructAmount.
     * 
     * @return serviceCode
     */
    public java.lang.String getServiceCode() {
        return serviceCode;
    }


    /**
     * Sets the serviceCode value for this ServiceStructAmount.
     * 
     * @param serviceCode
     */
    public void setServiceCode(java.lang.String serviceCode) {
        this.serviceCode = serviceCode;
    }


    /**
     * Gets the taxCode value for this ServiceStructAmount.
     * 
     * @return taxCode
     */
    public java.lang.String getTaxCode() {
        return taxCode;
    }


    /**
     * Sets the taxCode value for this ServiceStructAmount.
     * 
     * @param taxCode
     */
    public void setTaxCode(java.lang.String taxCode) {
        this.taxCode = taxCode;
    }


    /**
     * Gets the telephoneBenefit value for this ServiceStructAmount.
     * 
     * @return telephoneBenefit
     */
    public java.lang.String getTelephoneBenefit() {
        return telephoneBenefit;
    }


    /**
     * Sets the telephoneBenefit value for this ServiceStructAmount.
     * 
     * @param telephoneBenefit
     */
    public void setTelephoneBenefit(java.lang.String telephoneBenefit) {
        this.telephoneBenefit = telephoneBenefit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceStructAmount)) return false;
        ServiceStructAmount other = (ServiceStructAmount) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.amountAditionalService==null && other.getAmountAditionalService()==null) || 
             (this.amountAditionalService!=null &&
              this.amountAditionalService.equals(other.getAmountAditionalService()))) &&
            ((this.amountAditionalService3==null && other.getAmountAditionalService3()==null) || 
             (this.amountAditionalService3!=null &&
              this.amountAditionalService3.equals(other.getAmountAditionalService3()))) &&
            ((this.amountAditionalService4==null && other.getAmountAditionalService4()==null) || 
             (this.amountAditionalService4!=null &&
              this.amountAditionalService4.equals(other.getAmountAditionalService4()))) &&
            ((this.amountService==null && other.getAmountService()==null) || 
             (this.amountService!=null &&
              this.amountService.equals(other.getAmountService()))) &&
            ((this.serviceCode==null && other.getServiceCode()==null) || 
             (this.serviceCode!=null &&
              this.serviceCode.equals(other.getServiceCode()))) &&
            ((this.taxCode==null && other.getTaxCode()==null) || 
             (this.taxCode!=null &&
              this.taxCode.equals(other.getTaxCode()))) &&
            ((this.telephoneBenefit==null && other.getTelephoneBenefit()==null) || 
             (this.telephoneBenefit!=null &&
              this.telephoneBenefit.equals(other.getTelephoneBenefit())));
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
        if (getAmountAditionalService() != null) {
            _hashCode += getAmountAditionalService().hashCode();
        }
        if (getAmountAditionalService3() != null) {
            _hashCode += getAmountAditionalService3().hashCode();
        }
        if (getAmountAditionalService4() != null) {
            _hashCode += getAmountAditionalService4().hashCode();
        }
        if (getAmountService() != null) {
            _hashCode += getAmountService().hashCode();
        }
        if (getServiceCode() != null) {
            _hashCode += getServiceCode().hashCode();
        }
        if (getTaxCode() != null) {
            _hashCode += getTaxCode().hashCode();
        }
        if (getTelephoneBenefit() != null) {
            _hashCode += getTelephoneBenefit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServiceStructAmount.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "serviceStructAmount"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountAditionalService");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amountAditionalService"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountAditionalService3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amountAditionalService3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountAditionalService4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amountAditionalService4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountService");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amountService"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telephoneBenefit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "telephoneBenefit"));
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
