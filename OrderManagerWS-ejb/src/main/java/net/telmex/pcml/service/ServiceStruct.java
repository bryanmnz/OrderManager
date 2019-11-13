/**
 * ServiceStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.telmex.pcml.service;

public class ServiceStruct  implements java.io.Serializable {
    private java.lang.String category;

    private java.lang.String jurisdiction;

    private java.lang.String rateMandatory;

    private java.lang.String rateScheduleDescription;

    private java.lang.String rateScheduleId;

    private java.lang.String serviceCode;

    private java.lang.String serviceName;

    public ServiceStruct() {
    }

    public ServiceStruct(
           java.lang.String category,
           java.lang.String jurisdiction,
           java.lang.String rateMandatory,
           java.lang.String rateScheduleDescription,
           java.lang.String rateScheduleId,
           java.lang.String serviceCode,
           java.lang.String serviceName) {
           this.category = category;
           this.jurisdiction = jurisdiction;
           this.rateMandatory = rateMandatory;
           this.rateScheduleDescription = rateScheduleDescription;
           this.rateScheduleId = rateScheduleId;
           this.serviceCode = serviceCode;
           this.serviceName = serviceName;
    }


    /**
     * Gets the category value for this ServiceStruct.
     * 
     * @return category
     */
    public java.lang.String getCategory() {
        return category;
    }


    /**
     * Sets the category value for this ServiceStruct.
     * 
     * @param category
     */
    public void setCategory(java.lang.String category) {
        this.category = category;
    }


    /**
     * Gets the jurisdiction value for this ServiceStruct.
     * 
     * @return jurisdiction
     */
    public java.lang.String getJurisdiction() {
        return jurisdiction;
    }


    /**
     * Sets the jurisdiction value for this ServiceStruct.
     * 
     * @param jurisdiction
     */
    public void setJurisdiction(java.lang.String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }


    /**
     * Gets the rateMandatory value for this ServiceStruct.
     * 
     * @return rateMandatory
     */
    public java.lang.String getRateMandatory() {
        return rateMandatory;
    }


    /**
     * Sets the rateMandatory value for this ServiceStruct.
     * 
     * @param rateMandatory
     */
    public void setRateMandatory(java.lang.String rateMandatory) {
        this.rateMandatory = rateMandatory;
    }


    /**
     * Gets the rateScheduleDescription value for this ServiceStruct.
     * 
     * @return rateScheduleDescription
     */
    public java.lang.String getRateScheduleDescription() {
        return rateScheduleDescription;
    }


    /**
     * Sets the rateScheduleDescription value for this ServiceStruct.
     * 
     * @param rateScheduleDescription
     */
    public void setRateScheduleDescription(java.lang.String rateScheduleDescription) {
        this.rateScheduleDescription = rateScheduleDescription;
    }


    /**
     * Gets the rateScheduleId value for this ServiceStruct.
     * 
     * @return rateScheduleId
     */
    public java.lang.String getRateScheduleId() {
        return rateScheduleId;
    }


    /**
     * Sets the rateScheduleId value for this ServiceStruct.
     * 
     * @param rateScheduleId
     */
    public void setRateScheduleId(java.lang.String rateScheduleId) {
        this.rateScheduleId = rateScheduleId;
    }


    /**
     * Gets the serviceCode value for this ServiceStruct.
     * 
     * @return serviceCode
     */
    public java.lang.String getServiceCode() {
        return serviceCode;
    }


    /**
     * Sets the serviceCode value for this ServiceStruct.
     * 
     * @param serviceCode
     */
    public void setServiceCode(java.lang.String serviceCode) {
        this.serviceCode = serviceCode;
    }


    /**
     * Gets the serviceName value for this ServiceStruct.
     * 
     * @return serviceName
     */
    public java.lang.String getServiceName() {
        return serviceName;
    }


    /**
     * Sets the serviceName value for this ServiceStruct.
     * 
     * @param serviceName
     */
    public void setServiceName(java.lang.String serviceName) {
        this.serviceName = serviceName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceStruct)) return false;
        ServiceStruct other = (ServiceStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory()))) &&
            ((this.jurisdiction==null && other.getJurisdiction()==null) || 
             (this.jurisdiction!=null &&
              this.jurisdiction.equals(other.getJurisdiction()))) &&
            ((this.rateMandatory==null && other.getRateMandatory()==null) || 
             (this.rateMandatory!=null &&
              this.rateMandatory.equals(other.getRateMandatory()))) &&
            ((this.rateScheduleDescription==null && other.getRateScheduleDescription()==null) || 
             (this.rateScheduleDescription!=null &&
              this.rateScheduleDescription.equals(other.getRateScheduleDescription()))) &&
            ((this.rateScheduleId==null && other.getRateScheduleId()==null) || 
             (this.rateScheduleId!=null &&
              this.rateScheduleId.equals(other.getRateScheduleId()))) &&
            ((this.serviceCode==null && other.getServiceCode()==null) || 
             (this.serviceCode!=null &&
              this.serviceCode.equals(other.getServiceCode()))) &&
            ((this.serviceName==null && other.getServiceName()==null) || 
             (this.serviceName!=null &&
              this.serviceName.equals(other.getServiceName())));
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
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        if (getJurisdiction() != null) {
            _hashCode += getJurisdiction().hashCode();
        }
        if (getRateMandatory() != null) {
            _hashCode += getRateMandatory().hashCode();
        }
        if (getRateScheduleDescription() != null) {
            _hashCode += getRateScheduleDescription().hashCode();
        }
        if (getRateScheduleId() != null) {
            _hashCode += getRateScheduleId().hashCode();
        }
        if (getServiceCode() != null) {
            _hashCode += getServiceCode().hashCode();
        }
        if (getServiceName() != null) {
            _hashCode += getServiceName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServiceStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "serviceStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("", "category"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jurisdiction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "jurisdiction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateMandatory");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rateMandatory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateScheduleDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rateScheduleDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateScheduleId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rateScheduleId"));
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
        elemField.setFieldName("serviceName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceName"));
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
