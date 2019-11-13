/**
 * ServicesSummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.telmex.pcml.service;

public class ServicesSummary  implements java.io.Serializable {
    private java.lang.String errorCode;

    private java.lang.String message;

    private java.lang.String packaged;

    private java.lang.String rateSchedule;

    private net.telmex.pcml.service.Service[] services;

    public ServicesSummary() {
    }

    public ServicesSummary(
           java.lang.String errorCode,
           java.lang.String message,
           java.lang.String packaged,
           java.lang.String rateSchedule,
           net.telmex.pcml.service.Service[] services) {
           this.errorCode = errorCode;
           this.message = message;
           this.packaged = packaged;
           this.rateSchedule = rateSchedule;
           this.services = services;
    }


    /**
     * Gets the errorCode value for this ServicesSummary.
     * 
     * @return errorCode
     */
    public java.lang.String getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this ServicesSummary.
     * 
     * @param errorCode
     */
    public void setErrorCode(java.lang.String errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * Gets the message value for this ServicesSummary.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this ServicesSummary.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the packaged value for this ServicesSummary.
     * 
     * @return packaged
     */
    public java.lang.String getPackaged() {
        return packaged;
    }


    /**
     * Sets the packaged value for this ServicesSummary.
     * 
     * @param packaged
     */
    public void setPackaged(java.lang.String packaged) {
        this.packaged = packaged;
    }


    /**
     * Gets the rateSchedule value for this ServicesSummary.
     * 
     * @return rateSchedule
     */
    public java.lang.String getRateSchedule() {
        return rateSchedule;
    }


    /**
     * Sets the rateSchedule value for this ServicesSummary.
     * 
     * @param rateSchedule
     */
    public void setRateSchedule(java.lang.String rateSchedule) {
        this.rateSchedule = rateSchedule;
    }


    /**
     * Gets the services value for this ServicesSummary.
     * 
     * @return services
     */
    public net.telmex.pcml.service.Service[] getServices() {
        return services;
    }


    /**
     * Sets the services value for this ServicesSummary.
     * 
     * @param services
     */
    public void setServices(net.telmex.pcml.service.Service[] services) {
        this.services = services;
    }

    public net.telmex.pcml.service.Service getServices(int i) {
        return this.services[i];
    }

    public void setServices(int i, net.telmex.pcml.service.Service _value) {
        this.services[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServicesSummary)) return false;
        ServicesSummary other = (ServicesSummary) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.errorCode==null && other.getErrorCode()==null) || 
             (this.errorCode!=null &&
              this.errorCode.equals(other.getErrorCode()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.packaged==null && other.getPackaged()==null) || 
             (this.packaged!=null &&
              this.packaged.equals(other.getPackaged()))) &&
            ((this.rateSchedule==null && other.getRateSchedule()==null) || 
             (this.rateSchedule!=null &&
              this.rateSchedule.equals(other.getRateSchedule()))) &&
            ((this.services==null && other.getServices()==null) || 
             (this.services!=null &&
              java.util.Arrays.equals(this.services, other.getServices())));
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
        if (getErrorCode() != null) {
            _hashCode += getErrorCode().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getPackaged() != null) {
            _hashCode += getPackaged().hashCode();
        }
        if (getRateSchedule() != null) {
            _hashCode += getRateSchedule().hashCode();
        }
        if (getServices() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServices());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServices(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServicesSummary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "servicesSummary"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorCode"));
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
        elemField.setFieldName("packaged");
        elemField.setXmlName(new javax.xml.namespace.QName("", "packaged"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateSchedule");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rateSchedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("services");
        elemField.setXmlName(new javax.xml.namespace.QName("", "services"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "service"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
