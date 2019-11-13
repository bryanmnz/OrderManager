/**
 * CambioPass.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.telmex.pcml.service;

public class CambioPass  implements java.io.Serializable {
    private java.lang.String claveAnterior;

    private java.lang.String claveNueva;

    private java.lang.String mensaje;

    private java.lang.String usuario;

    public CambioPass() {
    }

    public CambioPass(
           java.lang.String claveAnterior,
           java.lang.String claveNueva,
           java.lang.String mensaje,
           java.lang.String usuario) {
           this.claveAnterior = claveAnterior;
           this.claveNueva = claveNueva;
           this.mensaje = mensaje;
           this.usuario = usuario;
    }


    /**
     * Gets the claveAnterior value for this CambioPass.
     * 
     * @return claveAnterior
     */
    public java.lang.String getClaveAnterior() {
        return claveAnterior;
    }


    /**
     * Sets the claveAnterior value for this CambioPass.
     * 
     * @param claveAnterior
     */
    public void setClaveAnterior(java.lang.String claveAnterior) {
        this.claveAnterior = claveAnterior;
    }


    /**
     * Gets the claveNueva value for this CambioPass.
     * 
     * @return claveNueva
     */
    public java.lang.String getClaveNueva() {
        return claveNueva;
    }


    /**
     * Sets the claveNueva value for this CambioPass.
     * 
     * @param claveNueva
     */
    public void setClaveNueva(java.lang.String claveNueva) {
        this.claveNueva = claveNueva;
    }


    /**
     * Gets the mensaje value for this CambioPass.
     * 
     * @return mensaje
     */
    public java.lang.String getMensaje() {
        return mensaje;
    }


    /**
     * Sets the mensaje value for this CambioPass.
     * 
     * @param mensaje
     */
    public void setMensaje(java.lang.String mensaje) {
        this.mensaje = mensaje;
    }


    /**
     * Gets the usuario value for this CambioPass.
     * 
     * @return usuario
     */
    public java.lang.String getUsuario() {
        return usuario;
    }


    /**
     * Sets the usuario value for this CambioPass.
     * 
     * @param usuario
     */
    public void setUsuario(java.lang.String usuario) {
        this.usuario = usuario;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CambioPass)) return false;
        CambioPass other = (CambioPass) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.claveAnterior==null && other.getClaveAnterior()==null) || 
             (this.claveAnterior!=null &&
              this.claveAnterior.equals(other.getClaveAnterior()))) &&
            ((this.claveNueva==null && other.getClaveNueva()==null) || 
             (this.claveNueva!=null &&
              this.claveNueva.equals(other.getClaveNueva()))) &&
            ((this.mensaje==null && other.getMensaje()==null) || 
             (this.mensaje!=null &&
              this.mensaje.equals(other.getMensaje()))) &&
            ((this.usuario==null && other.getUsuario()==null) || 
             (this.usuario!=null &&
              this.usuario.equals(other.getUsuario())));
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
        if (getClaveAnterior() != null) {
            _hashCode += getClaveAnterior().hashCode();
        }
        if (getClaveNueva() != null) {
            _hashCode += getClaveNueva().hashCode();
        }
        if (getMensaje() != null) {
            _hashCode += getMensaje().hashCode();
        }
        if (getUsuario() != null) {
            _hashCode += getUsuario().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CambioPass.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "cambioPass"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("claveAnterior");
        elemField.setXmlName(new javax.xml.namespace.QName("", "claveAnterior"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("claveNueva");
        elemField.setXmlName(new javax.xml.namespace.QName("", "claveNueva"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensaje");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mensaje"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usuario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usuario"));
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
