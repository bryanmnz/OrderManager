/**
 * TipoLinea.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.telmex.pcml.service;

public class TipoLinea  implements java.io.Serializable {
    private java.lang.String mensaje;

    private java.lang.String numeroWO;

    private java.lang.String telefono;

    private java.lang.String tipoLineaTel;

    private java.lang.String tipoMensaje;

    public TipoLinea() {
    }

    public TipoLinea(
           java.lang.String mensaje,
           java.lang.String numeroWO,
           java.lang.String telefono,
           java.lang.String tipoLineaTel,
           java.lang.String tipoMensaje) {
           this.mensaje = mensaje;
           this.numeroWO = numeroWO;
           this.telefono = telefono;
           this.tipoLineaTel = tipoLineaTel;
           this.tipoMensaje = tipoMensaje;
    }


    /**
     * Gets the mensaje value for this TipoLinea.
     * 
     * @return mensaje
     */
    public java.lang.String getMensaje() {
        return mensaje;
    }


    /**
     * Sets the mensaje value for this TipoLinea.
     * 
     * @param mensaje
     */
    public void setMensaje(java.lang.String mensaje) {
        this.mensaje = mensaje;
    }


    /**
     * Gets the numeroWO value for this TipoLinea.
     * 
     * @return numeroWO
     */
    public java.lang.String getNumeroWO() {
        return numeroWO;
    }


    /**
     * Sets the numeroWO value for this TipoLinea.
     * 
     * @param numeroWO
     */
    public void setNumeroWO(java.lang.String numeroWO) {
        this.numeroWO = numeroWO;
    }


    /**
     * Gets the telefono value for this TipoLinea.
     * 
     * @return telefono
     */
    public java.lang.String getTelefono() {
        return telefono;
    }


    /**
     * Sets the telefono value for this TipoLinea.
     * 
     * @param telefono
     */
    public void setTelefono(java.lang.String telefono) {
        this.telefono = telefono;
    }


    /**
     * Gets the tipoLineaTel value for this TipoLinea.
     * 
     * @return tipoLineaTel
     */
    public java.lang.String getTipoLineaTel() {
        return tipoLineaTel;
    }


    /**
     * Sets the tipoLineaTel value for this TipoLinea.
     * 
     * @param tipoLineaTel
     */
    public void setTipoLineaTel(java.lang.String tipoLineaTel) {
        this.tipoLineaTel = tipoLineaTel;
    }


    /**
     * Gets the tipoMensaje value for this TipoLinea.
     * 
     * @return tipoMensaje
     */
    public java.lang.String getTipoMensaje() {
        return tipoMensaje;
    }


    /**
     * Sets the tipoMensaje value for this TipoLinea.
     * 
     * @param tipoMensaje
     */
    public void setTipoMensaje(java.lang.String tipoMensaje) {
        this.tipoMensaje = tipoMensaje;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TipoLinea)) return false;
        TipoLinea other = (TipoLinea) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mensaje==null && other.getMensaje()==null) || 
             (this.mensaje!=null &&
              this.mensaje.equals(other.getMensaje()))) &&
            ((this.numeroWO==null && other.getNumeroWO()==null) || 
             (this.numeroWO!=null &&
              this.numeroWO.equals(other.getNumeroWO()))) &&
            ((this.telefono==null && other.getTelefono()==null) || 
             (this.telefono!=null &&
              this.telefono.equals(other.getTelefono()))) &&
            ((this.tipoLineaTel==null && other.getTipoLineaTel()==null) || 
             (this.tipoLineaTel!=null &&
              this.tipoLineaTel.equals(other.getTipoLineaTel()))) &&
            ((this.tipoMensaje==null && other.getTipoMensaje()==null) || 
             (this.tipoMensaje!=null &&
              this.tipoMensaje.equals(other.getTipoMensaje())));
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
        if (getMensaje() != null) {
            _hashCode += getMensaje().hashCode();
        }
        if (getNumeroWO() != null) {
            _hashCode += getNumeroWO().hashCode();
        }
        if (getTelefono() != null) {
            _hashCode += getTelefono().hashCode();
        }
        if (getTipoLineaTel() != null) {
            _hashCode += getTipoLineaTel().hashCode();
        }
        if (getTipoMensaje() != null) {
            _hashCode += getTipoMensaje().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TipoLinea.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "tipoLinea"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensaje");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mensaje"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroWO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroWO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telefono");
        elemField.setXmlName(new javax.xml.namespace.QName("", "telefono"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoLineaTel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoLineaTel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoMensaje");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoMensaje"));
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
