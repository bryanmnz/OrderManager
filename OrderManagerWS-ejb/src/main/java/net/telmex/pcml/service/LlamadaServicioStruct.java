/**
 * LlamadaServicioStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.telmex.pcml.service;

public class LlamadaServicioStruct  implements java.io.Serializable {
    private java.lang.String cuenta;

    private java.lang.String error;

    private java.lang.String llamadas;

    private java.lang.String ordenesTrabajos;

    public LlamadaServicioStruct() {
    }

    public LlamadaServicioStruct(
           java.lang.String cuenta,
           java.lang.String error,
           java.lang.String llamadas,
           java.lang.String ordenesTrabajos) {
           this.cuenta = cuenta;
           this.error = error;
           this.llamadas = llamadas;
           this.ordenesTrabajos = ordenesTrabajos;
    }


    /**
     * Gets the cuenta value for this LlamadaServicioStruct.
     * 
     * @return cuenta
     */
    public java.lang.String getCuenta() {
        return cuenta;
    }


    /**
     * Sets the cuenta value for this LlamadaServicioStruct.
     * 
     * @param cuenta
     */
    public void setCuenta(java.lang.String cuenta) {
        this.cuenta = cuenta;
    }


    /**
     * Gets the error value for this LlamadaServicioStruct.
     * 
     * @return error
     */
    public java.lang.String getError() {
        return error;
    }


    /**
     * Sets the error value for this LlamadaServicioStruct.
     * 
     * @param error
     */
    public void setError(java.lang.String error) {
        this.error = error;
    }


    /**
     * Gets the llamadas value for this LlamadaServicioStruct.
     * 
     * @return llamadas
     */
    public java.lang.String getLlamadas() {
        return llamadas;
    }


    /**
     * Sets the llamadas value for this LlamadaServicioStruct.
     * 
     * @param llamadas
     */
    public void setLlamadas(java.lang.String llamadas) {
        this.llamadas = llamadas;
    }


    /**
     * Gets the ordenesTrabajos value for this LlamadaServicioStruct.
     * 
     * @return ordenesTrabajos
     */
    public java.lang.String getOrdenesTrabajos() {
        return ordenesTrabajos;
    }


    /**
     * Sets the ordenesTrabajos value for this LlamadaServicioStruct.
     * 
     * @param ordenesTrabajos
     */
    public void setOrdenesTrabajos(java.lang.String ordenesTrabajos) {
        this.ordenesTrabajos = ordenesTrabajos;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LlamadaServicioStruct)) return false;
        LlamadaServicioStruct other = (LlamadaServicioStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cuenta==null && other.getCuenta()==null) || 
             (this.cuenta!=null &&
              this.cuenta.equals(other.getCuenta()))) &&
            ((this.error==null && other.getError()==null) || 
             (this.error!=null &&
              this.error.equals(other.getError()))) &&
            ((this.llamadas==null && other.getLlamadas()==null) || 
             (this.llamadas!=null &&
              this.llamadas.equals(other.getLlamadas()))) &&
            ((this.ordenesTrabajos==null && other.getOrdenesTrabajos()==null) || 
             (this.ordenesTrabajos!=null &&
              this.ordenesTrabajos.equals(other.getOrdenesTrabajos())));
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
        if (getCuenta() != null) {
            _hashCode += getCuenta().hashCode();
        }
        if (getError() != null) {
            _hashCode += getError().hashCode();
        }
        if (getLlamadas() != null) {
            _hashCode += getLlamadas().hashCode();
        }
        if (getOrdenesTrabajos() != null) {
            _hashCode += getOrdenesTrabajos().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LlamadaServicioStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "llamadaServicioStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cuenta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cuenta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error");
        elemField.setXmlName(new javax.xml.namespace.QName("", "error"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("llamadas");
        elemField.setXmlName(new javax.xml.namespace.QName("", "llamadas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ordenesTrabajos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ordenesTrabajos"));
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
