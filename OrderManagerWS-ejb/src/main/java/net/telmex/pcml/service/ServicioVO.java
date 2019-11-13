/**
 * ServicioVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.telmex.pcml.service;

public class ServicioVO  implements java.io.Serializable {
    private java.lang.String cantidad;

    private java.lang.String servicio;

    public ServicioVO() {
    }

    public ServicioVO(
           java.lang.String cantidad,
           java.lang.String servicio) {
           this.cantidad = cantidad;
           this.servicio = servicio;
    }


    /**
     * Gets the cantidad value for this ServicioVO.
     * 
     * @return cantidad
     */
    public java.lang.String getCantidad() {
        return cantidad;
    }


    /**
     * Sets the cantidad value for this ServicioVO.
     * 
     * @param cantidad
     */
    public void setCantidad(java.lang.String cantidad) {
        this.cantidad = cantidad;
    }


    /**
     * Gets the servicio value for this ServicioVO.
     * 
     * @return servicio
     */
    public java.lang.String getServicio() {
        return servicio;
    }


    /**
     * Sets the servicio value for this ServicioVO.
     * 
     * @param servicio
     */
    public void setServicio(java.lang.String servicio) {
        this.servicio = servicio;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServicioVO)) return false;
        ServicioVO other = (ServicioVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cantidad==null && other.getCantidad()==null) || 
             (this.cantidad!=null &&
              this.cantidad.equals(other.getCantidad()))) &&
            ((this.servicio==null && other.getServicio()==null) || 
             (this.servicio!=null &&
              this.servicio.equals(other.getServicio())));
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
        if (getCantidad() != null) {
            _hashCode += getCantidad().hashCode();
        }
        if (getServicio() != null) {
            _hashCode += getServicio().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServicioVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "servicioVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cantidad");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cantidad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "servicio"));
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
