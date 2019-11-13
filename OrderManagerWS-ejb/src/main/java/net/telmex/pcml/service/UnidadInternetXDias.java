/**
 * UnidadInternetXDias.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.telmex.pcml.service;

public class UnidadInternetXDias  implements java.io.Serializable {
    private java.lang.String codigoError;

    private java.lang.String dias;

    private java.lang.String mensajeError;

    private java.lang.String respuesta;

    private java.lang.String unidad;

    public UnidadInternetXDias() {
    }

    public UnidadInternetXDias(
           java.lang.String codigoError,
           java.lang.String dias,
           java.lang.String mensajeError,
           java.lang.String respuesta,
           java.lang.String unidad) {
           this.codigoError = codigoError;
           this.dias = dias;
           this.mensajeError = mensajeError;
           this.respuesta = respuesta;
           this.unidad = unidad;
    }


    /**
     * Gets the codigoError value for this UnidadInternetXDias.
     * 
     * @return codigoError
     */
    public java.lang.String getCodigoError() {
        return codigoError;
    }


    /**
     * Sets the codigoError value for this UnidadInternetXDias.
     * 
     * @param codigoError
     */
    public void setCodigoError(java.lang.String codigoError) {
        this.codigoError = codigoError;
    }


    /**
     * Gets the dias value for this UnidadInternetXDias.
     * 
     * @return dias
     */
    public java.lang.String getDias() {
        return dias;
    }


    /**
     * Sets the dias value for this UnidadInternetXDias.
     * 
     * @param dias
     */
    public void setDias(java.lang.String dias) {
        this.dias = dias;
    }


    /**
     * Gets the mensajeError value for this UnidadInternetXDias.
     * 
     * @return mensajeError
     */
    public java.lang.String getMensajeError() {
        return mensajeError;
    }


    /**
     * Sets the mensajeError value for this UnidadInternetXDias.
     * 
     * @param mensajeError
     */
    public void setMensajeError(java.lang.String mensajeError) {
        this.mensajeError = mensajeError;
    }


    /**
     * Gets the respuesta value for this UnidadInternetXDias.
     * 
     * @return respuesta
     */
    public java.lang.String getRespuesta() {
        return respuesta;
    }


    /**
     * Sets the respuesta value for this UnidadInternetXDias.
     * 
     * @param respuesta
     */
    public void setRespuesta(java.lang.String respuesta) {
        this.respuesta = respuesta;
    }


    /**
     * Gets the unidad value for this UnidadInternetXDias.
     * 
     * @return unidad
     */
    public java.lang.String getUnidad() {
        return unidad;
    }


    /**
     * Sets the unidad value for this UnidadInternetXDias.
     * 
     * @param unidad
     */
    public void setUnidad(java.lang.String unidad) {
        this.unidad = unidad;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UnidadInternetXDias)) return false;
        UnidadInternetXDias other = (UnidadInternetXDias) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigoError==null && other.getCodigoError()==null) || 
             (this.codigoError!=null &&
              this.codigoError.equals(other.getCodigoError()))) &&
            ((this.dias==null && other.getDias()==null) || 
             (this.dias!=null &&
              this.dias.equals(other.getDias()))) &&
            ((this.mensajeError==null && other.getMensajeError()==null) || 
             (this.mensajeError!=null &&
              this.mensajeError.equals(other.getMensajeError()))) &&
            ((this.respuesta==null && other.getRespuesta()==null) || 
             (this.respuesta!=null &&
              this.respuesta.equals(other.getRespuesta()))) &&
            ((this.unidad==null && other.getUnidad()==null) || 
             (this.unidad!=null &&
              this.unidad.equals(other.getUnidad())));
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
        if (getCodigoError() != null) {
            _hashCode += getCodigoError().hashCode();
        }
        if (getDias() != null) {
            _hashCode += getDias().hashCode();
        }
        if (getMensajeError() != null) {
            _hashCode += getMensajeError().hashCode();
        }
        if (getRespuesta() != null) {
            _hashCode += getRespuesta().hashCode();
        }
        if (getUnidad() != null) {
            _hashCode += getUnidad().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UnidadInternetXDias.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "unidadInternetXDias"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoError");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dias");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensajeError");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mensajeError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("respuesta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "respuesta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unidad");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unidad"));
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
