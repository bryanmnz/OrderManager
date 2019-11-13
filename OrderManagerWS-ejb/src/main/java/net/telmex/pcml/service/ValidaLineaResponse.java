/**
 * ValidaLineaResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.telmex.pcml.service;

public class ValidaLineaResponse  implements java.io.Serializable {
    private java.lang.String tipoMensaje;

    private java.lang.String mensaje;

    private java.lang.String tipoDocumento;

    private java.lang.String documento;

    private java.lang.String apellido1;

    private java.lang.String apellido2;

    private java.lang.String nombres;

    private java.lang.String estado;

    private java.lang.String clasificacion;

    public ValidaLineaResponse() {
    }

    public ValidaLineaResponse(
           java.lang.String tipoMensaje,
           java.lang.String mensaje,
           java.lang.String tipoDocumento,
           java.lang.String documento,
           java.lang.String apellido1,
           java.lang.String apellido2,
           java.lang.String nombres,
           java.lang.String estado,
           java.lang.String clasificacion) {
           this.tipoMensaje = tipoMensaje;
           this.mensaje = mensaje;
           this.tipoDocumento = tipoDocumento;
           this.documento = documento;
           this.apellido1 = apellido1;
           this.apellido2 = apellido2;
           this.nombres = nombres;
           this.estado = estado;
           this.clasificacion = clasificacion;
    }


    /**
     * Gets the tipoMensaje value for this ValidaLineaResponse.
     * 
     * @return tipoMensaje
     */
    public java.lang.String getTipoMensaje() {
        return tipoMensaje;
    }


    /**
     * Sets the tipoMensaje value for this ValidaLineaResponse.
     * 
     * @param tipoMensaje
     */
    public void setTipoMensaje(java.lang.String tipoMensaje) {
        this.tipoMensaje = tipoMensaje;
    }


    /**
     * Gets the mensaje value for this ValidaLineaResponse.
     * 
     * @return mensaje
     */
    public java.lang.String getMensaje() {
        return mensaje;
    }


    /**
     * Sets the mensaje value for this ValidaLineaResponse.
     * 
     * @param mensaje
     */
    public void setMensaje(java.lang.String mensaje) {
        this.mensaje = mensaje;
    }


    /**
     * Gets the tipoDocumento value for this ValidaLineaResponse.
     * 
     * @return tipoDocumento
     */
    public java.lang.String getTipoDocumento() {
        return tipoDocumento;
    }


    /**
     * Sets the tipoDocumento value for this ValidaLineaResponse.
     * 
     * @param tipoDocumento
     */
    public void setTipoDocumento(java.lang.String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }


    /**
     * Gets the documento value for this ValidaLineaResponse.
     * 
     * @return documento
     */
    public java.lang.String getDocumento() {
        return documento;
    }


    /**
     * Sets the documento value for this ValidaLineaResponse.
     * 
     * @param documento
     */
    public void setDocumento(java.lang.String documento) {
        this.documento = documento;
    }


    /**
     * Gets the apellido1 value for this ValidaLineaResponse.
     * 
     * @return apellido1
     */
    public java.lang.String getApellido1() {
        return apellido1;
    }


    /**
     * Sets the apellido1 value for this ValidaLineaResponse.
     * 
     * @param apellido1
     */
    public void setApellido1(java.lang.String apellido1) {
        this.apellido1 = apellido1;
    }


    /**
     * Gets the apellido2 value for this ValidaLineaResponse.
     * 
     * @return apellido2
     */
    public java.lang.String getApellido2() {
        return apellido2;
    }


    /**
     * Sets the apellido2 value for this ValidaLineaResponse.
     * 
     * @param apellido2
     */
    public void setApellido2(java.lang.String apellido2) {
        this.apellido2 = apellido2;
    }


    /**
     * Gets the nombres value for this ValidaLineaResponse.
     * 
     * @return nombres
     */
    public java.lang.String getNombres() {
        return nombres;
    }


    /**
     * Sets the nombres value for this ValidaLineaResponse.
     * 
     * @param nombres
     */
    public void setNombres(java.lang.String nombres) {
        this.nombres = nombres;
    }


    /**
     * Gets the estado value for this ValidaLineaResponse.
     * 
     * @return estado
     */
    public java.lang.String getEstado() {
        return estado;
    }


    /**
     * Sets the estado value for this ValidaLineaResponse.
     * 
     * @param estado
     */
    public void setEstado(java.lang.String estado) {
        this.estado = estado;
    }


    /**
     * Gets the clasificacion value for this ValidaLineaResponse.
     * 
     * @return clasificacion
     */
    public java.lang.String getClasificacion() {
        return clasificacion;
    }


    /**
     * Sets the clasificacion value for this ValidaLineaResponse.
     * 
     * @param clasificacion
     */
    public void setClasificacion(java.lang.String clasificacion) {
        this.clasificacion = clasificacion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ValidaLineaResponse)) return false;
        ValidaLineaResponse other = (ValidaLineaResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tipoMensaje==null && other.getTipoMensaje()==null) || 
             (this.tipoMensaje!=null &&
              this.tipoMensaje.equals(other.getTipoMensaje()))) &&
            ((this.mensaje==null && other.getMensaje()==null) || 
             (this.mensaje!=null &&
              this.mensaje.equals(other.getMensaje()))) &&
            ((this.tipoDocumento==null && other.getTipoDocumento()==null) || 
             (this.tipoDocumento!=null &&
              this.tipoDocumento.equals(other.getTipoDocumento()))) &&
            ((this.documento==null && other.getDocumento()==null) || 
             (this.documento!=null &&
              this.documento.equals(other.getDocumento()))) &&
            ((this.apellido1==null && other.getApellido1()==null) || 
             (this.apellido1!=null &&
              this.apellido1.equals(other.getApellido1()))) &&
            ((this.apellido2==null && other.getApellido2()==null) || 
             (this.apellido2!=null &&
              this.apellido2.equals(other.getApellido2()))) &&
            ((this.nombres==null && other.getNombres()==null) || 
             (this.nombres!=null &&
              this.nombres.equals(other.getNombres()))) &&
            ((this.estado==null && other.getEstado()==null) || 
             (this.estado!=null &&
              this.estado.equals(other.getEstado()))) &&
            ((this.clasificacion==null && other.getClasificacion()==null) || 
             (this.clasificacion!=null &&
              this.clasificacion.equals(other.getClasificacion())));
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
        if (getTipoMensaje() != null) {
            _hashCode += getTipoMensaje().hashCode();
        }
        if (getMensaje() != null) {
            _hashCode += getMensaje().hashCode();
        }
        if (getTipoDocumento() != null) {
            _hashCode += getTipoDocumento().hashCode();
        }
        if (getDocumento() != null) {
            _hashCode += getDocumento().hashCode();
        }
        if (getApellido1() != null) {
            _hashCode += getApellido1().hashCode();
        }
        if (getApellido2() != null) {
            _hashCode += getApellido2().hashCode();
        }
        if (getNombres() != null) {
            _hashCode += getNombres().hashCode();
        }
        if (getEstado() != null) {
            _hashCode += getEstado().hashCode();
        }
        if (getClasificacion() != null) {
            _hashCode += getClasificacion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ValidaLineaResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "validaLineaResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoMensaje");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoMensaje"));
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
        elemField.setFieldName("tipoDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apellido1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "apellido1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apellido2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "apellido2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombres");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nombres"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clasificacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clasificacion"));
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
