/**
 * SuscriberVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.telmex.pcml.service;

public class SuscriberVO  implements java.io.Serializable {
    private java.lang.String apellido;

    private java.lang.String cuenta;

    private java.lang.String direccion;

    private java.lang.String estado;

    private java.lang.String nombre;

    private java.lang.String numeroIdentificacion;

    private java.lang.String telAdicional;

    private java.lang.String telCasa;

    private java.lang.String telOficina;

    private java.lang.String tipoIdentificacion;

    private java.lang.String tipoSuscriptor;

    public SuscriberVO() {
    }

    public SuscriberVO(
           java.lang.String apellido,
           java.lang.String cuenta,
           java.lang.String direccion,
           java.lang.String estado,
           java.lang.String nombre,
           java.lang.String numeroIdentificacion,
           java.lang.String telAdicional,
           java.lang.String telCasa,
           java.lang.String telOficina,
           java.lang.String tipoIdentificacion,
           java.lang.String tipoSuscriptor) {
           this.apellido = apellido;
           this.cuenta = cuenta;
           this.direccion = direccion;
           this.estado = estado;
           this.nombre = nombre;
           this.numeroIdentificacion = numeroIdentificacion;
           this.telAdicional = telAdicional;
           this.telCasa = telCasa;
           this.telOficina = telOficina;
           this.tipoIdentificacion = tipoIdentificacion;
           this.tipoSuscriptor = tipoSuscriptor;
    }


    /**
     * Gets the apellido value for this SuscriberVO.
     * 
     * @return apellido
     */
    public java.lang.String getApellido() {
        return apellido;
    }


    /**
     * Sets the apellido value for this SuscriberVO.
     * 
     * @param apellido
     */
    public void setApellido(java.lang.String apellido) {
        this.apellido = apellido;
    }


    /**
     * Gets the cuenta value for this SuscriberVO.
     * 
     * @return cuenta
     */
    public java.lang.String getCuenta() {
        return cuenta;
    }


    /**
     * Sets the cuenta value for this SuscriberVO.
     * 
     * @param cuenta
     */
    public void setCuenta(java.lang.String cuenta) {
        this.cuenta = cuenta;
    }


    /**
     * Gets the direccion value for this SuscriberVO.
     * 
     * @return direccion
     */
    public java.lang.String getDireccion() {
        return direccion;
    }


    /**
     * Sets the direccion value for this SuscriberVO.
     * 
     * @param direccion
     */
    public void setDireccion(java.lang.String direccion) {
        this.direccion = direccion;
    }


    /**
     * Gets the estado value for this SuscriberVO.
     * 
     * @return estado
     */
    public java.lang.String getEstado() {
        return estado;
    }


    /**
     * Sets the estado value for this SuscriberVO.
     * 
     * @param estado
     */
    public void setEstado(java.lang.String estado) {
        this.estado = estado;
    }


    /**
     * Gets the nombre value for this SuscriberVO.
     * 
     * @return nombre
     */
    public java.lang.String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this SuscriberVO.
     * 
     * @param nombre
     */
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }


    /**
     * Gets the numeroIdentificacion value for this SuscriberVO.
     * 
     * @return numeroIdentificacion
     */
    public java.lang.String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }


    /**
     * Sets the numeroIdentificacion value for this SuscriberVO.
     * 
     * @param numeroIdentificacion
     */
    public void setNumeroIdentificacion(java.lang.String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }


    /**
     * Gets the telAdicional value for this SuscriberVO.
     * 
     * @return telAdicional
     */
    public java.lang.String getTelAdicional() {
        return telAdicional;
    }


    /**
     * Sets the telAdicional value for this SuscriberVO.
     * 
     * @param telAdicional
     */
    public void setTelAdicional(java.lang.String telAdicional) {
        this.telAdicional = telAdicional;
    }


    /**
     * Gets the telCasa value for this SuscriberVO.
     * 
     * @return telCasa
     */
    public java.lang.String getTelCasa() {
        return telCasa;
    }


    /**
     * Sets the telCasa value for this SuscriberVO.
     * 
     * @param telCasa
     */
    public void setTelCasa(java.lang.String telCasa) {
        this.telCasa = telCasa;
    }


    /**
     * Gets the telOficina value for this SuscriberVO.
     * 
     * @return telOficina
     */
    public java.lang.String getTelOficina() {
        return telOficina;
    }


    /**
     * Sets the telOficina value for this SuscriberVO.
     * 
     * @param telOficina
     */
    public void setTelOficina(java.lang.String telOficina) {
        this.telOficina = telOficina;
    }


    /**
     * Gets the tipoIdentificacion value for this SuscriberVO.
     * 
     * @return tipoIdentificacion
     */
    public java.lang.String getTipoIdentificacion() {
        return tipoIdentificacion;
    }


    /**
     * Sets the tipoIdentificacion value for this SuscriberVO.
     * 
     * @param tipoIdentificacion
     */
    public void setTipoIdentificacion(java.lang.String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }


    /**
     * Gets the tipoSuscriptor value for this SuscriberVO.
     * 
     * @return tipoSuscriptor
     */
    public java.lang.String getTipoSuscriptor() {
        return tipoSuscriptor;
    }


    /**
     * Sets the tipoSuscriptor value for this SuscriberVO.
     * 
     * @param tipoSuscriptor
     */
    public void setTipoSuscriptor(java.lang.String tipoSuscriptor) {
        this.tipoSuscriptor = tipoSuscriptor;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SuscriberVO)) return false;
        SuscriberVO other = (SuscriberVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.apellido==null && other.getApellido()==null) || 
             (this.apellido!=null &&
              this.apellido.equals(other.getApellido()))) &&
            ((this.cuenta==null && other.getCuenta()==null) || 
             (this.cuenta!=null &&
              this.cuenta.equals(other.getCuenta()))) &&
            ((this.direccion==null && other.getDireccion()==null) || 
             (this.direccion!=null &&
              this.direccion.equals(other.getDireccion()))) &&
            ((this.estado==null && other.getEstado()==null) || 
             (this.estado!=null &&
              this.estado.equals(other.getEstado()))) &&
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre()))) &&
            ((this.numeroIdentificacion==null && other.getNumeroIdentificacion()==null) || 
             (this.numeroIdentificacion!=null &&
              this.numeroIdentificacion.equals(other.getNumeroIdentificacion()))) &&
            ((this.telAdicional==null && other.getTelAdicional()==null) || 
             (this.telAdicional!=null &&
              this.telAdicional.equals(other.getTelAdicional()))) &&
            ((this.telCasa==null && other.getTelCasa()==null) || 
             (this.telCasa!=null &&
              this.telCasa.equals(other.getTelCasa()))) &&
            ((this.telOficina==null && other.getTelOficina()==null) || 
             (this.telOficina!=null &&
              this.telOficina.equals(other.getTelOficina()))) &&
            ((this.tipoIdentificacion==null && other.getTipoIdentificacion()==null) || 
             (this.tipoIdentificacion!=null &&
              this.tipoIdentificacion.equals(other.getTipoIdentificacion()))) &&
            ((this.tipoSuscriptor==null && other.getTipoSuscriptor()==null) || 
             (this.tipoSuscriptor!=null &&
              this.tipoSuscriptor.equals(other.getTipoSuscriptor())));
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
        if (getApellido() != null) {
            _hashCode += getApellido().hashCode();
        }
        if (getCuenta() != null) {
            _hashCode += getCuenta().hashCode();
        }
        if (getDireccion() != null) {
            _hashCode += getDireccion().hashCode();
        }
        if (getEstado() != null) {
            _hashCode += getEstado().hashCode();
        }
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        if (getNumeroIdentificacion() != null) {
            _hashCode += getNumeroIdentificacion().hashCode();
        }
        if (getTelAdicional() != null) {
            _hashCode += getTelAdicional().hashCode();
        }
        if (getTelCasa() != null) {
            _hashCode += getTelCasa().hashCode();
        }
        if (getTelOficina() != null) {
            _hashCode += getTelOficina().hashCode();
        }
        if (getTipoIdentificacion() != null) {
            _hashCode += getTipoIdentificacion().hashCode();
        }
        if (getTipoSuscriptor() != null) {
            _hashCode += getTipoSuscriptor().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SuscriberVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "suscriberVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apellido");
        elemField.setXmlName(new javax.xml.namespace.QName("", "apellido"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cuenta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cuenta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("direccion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "direccion"));
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
        elemField.setFieldName("nombre");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroIdentificacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroIdentificacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telAdicional");
        elemField.setXmlName(new javax.xml.namespace.QName("", "telAdicional"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telCasa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "telCasa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telOficina");
        elemField.setXmlName(new javax.xml.namespace.QName("", "telOficina"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoIdentificacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoIdentificacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoSuscriptor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoSuscriptor"));
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
