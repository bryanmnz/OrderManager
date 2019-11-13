/**
 * EntregaDomicilioVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.telmex.pcml.service;

public class EntregaDomicilioVO  implements java.io.Serializable {
    private java.lang.String comunidad;

    private java.lang.String cuenta;

    private java.lang.String estadoCarpeta;

    private java.lang.String estadoOT;

    private java.lang.String fechaCreacion;

    private java.lang.String ordenTrabajo;

    public EntregaDomicilioVO() {
    }

    public EntregaDomicilioVO(
           java.lang.String comunidad,
           java.lang.String cuenta,
           java.lang.String estadoCarpeta,
           java.lang.String estadoOT,
           java.lang.String fechaCreacion,
           java.lang.String ordenTrabajo) {
           this.comunidad = comunidad;
           this.cuenta = cuenta;
           this.estadoCarpeta = estadoCarpeta;
           this.estadoOT = estadoOT;
           this.fechaCreacion = fechaCreacion;
           this.ordenTrabajo = ordenTrabajo;
    }


    /**
     * Gets the comunidad value for this EntregaDomicilioVO.
     * 
     * @return comunidad
     */
    public java.lang.String getComunidad() {
        return comunidad;
    }


    /**
     * Sets the comunidad value for this EntregaDomicilioVO.
     * 
     * @param comunidad
     */
    public void setComunidad(java.lang.String comunidad) {
        this.comunidad = comunidad;
    }


    /**
     * Gets the cuenta value for this EntregaDomicilioVO.
     * 
     * @return cuenta
     */
    public java.lang.String getCuenta() {
        return cuenta;
    }


    /**
     * Sets the cuenta value for this EntregaDomicilioVO.
     * 
     * @param cuenta
     */
    public void setCuenta(java.lang.String cuenta) {
        this.cuenta = cuenta;
    }


    /**
     * Gets the estadoCarpeta value for this EntregaDomicilioVO.
     * 
     * @return estadoCarpeta
     */
    public java.lang.String getEstadoCarpeta() {
        return estadoCarpeta;
    }


    /**
     * Sets the estadoCarpeta value for this EntregaDomicilioVO.
     * 
     * @param estadoCarpeta
     */
    public void setEstadoCarpeta(java.lang.String estadoCarpeta) {
        this.estadoCarpeta = estadoCarpeta;
    }


    /**
     * Gets the estadoOT value for this EntregaDomicilioVO.
     * 
     * @return estadoOT
     */
    public java.lang.String getEstadoOT() {
        return estadoOT;
    }


    /**
     * Sets the estadoOT value for this EntregaDomicilioVO.
     * 
     * @param estadoOT
     */
    public void setEstadoOT(java.lang.String estadoOT) {
        this.estadoOT = estadoOT;
    }


    /**
     * Gets the fechaCreacion value for this EntregaDomicilioVO.
     * 
     * @return fechaCreacion
     */
    public java.lang.String getFechaCreacion() {
        return fechaCreacion;
    }


    /**
     * Sets the fechaCreacion value for this EntregaDomicilioVO.
     * 
     * @param fechaCreacion
     */
    public void setFechaCreacion(java.lang.String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }


    /**
     * Gets the ordenTrabajo value for this EntregaDomicilioVO.
     * 
     * @return ordenTrabajo
     */
    public java.lang.String getOrdenTrabajo() {
        return ordenTrabajo;
    }


    /**
     * Sets the ordenTrabajo value for this EntregaDomicilioVO.
     * 
     * @param ordenTrabajo
     */
    public void setOrdenTrabajo(java.lang.String ordenTrabajo) {
        this.ordenTrabajo = ordenTrabajo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EntregaDomicilioVO)) return false;
        EntregaDomicilioVO other = (EntregaDomicilioVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.comunidad==null && other.getComunidad()==null) || 
             (this.comunidad!=null &&
              this.comunidad.equals(other.getComunidad()))) &&
            ((this.cuenta==null && other.getCuenta()==null) || 
             (this.cuenta!=null &&
              this.cuenta.equals(other.getCuenta()))) &&
            ((this.estadoCarpeta==null && other.getEstadoCarpeta()==null) || 
             (this.estadoCarpeta!=null &&
              this.estadoCarpeta.equals(other.getEstadoCarpeta()))) &&
            ((this.estadoOT==null && other.getEstadoOT()==null) || 
             (this.estadoOT!=null &&
              this.estadoOT.equals(other.getEstadoOT()))) &&
            ((this.fechaCreacion==null && other.getFechaCreacion()==null) || 
             (this.fechaCreacion!=null &&
              this.fechaCreacion.equals(other.getFechaCreacion()))) &&
            ((this.ordenTrabajo==null && other.getOrdenTrabajo()==null) || 
             (this.ordenTrabajo!=null &&
              this.ordenTrabajo.equals(other.getOrdenTrabajo())));
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
        if (getComunidad() != null) {
            _hashCode += getComunidad().hashCode();
        }
        if (getCuenta() != null) {
            _hashCode += getCuenta().hashCode();
        }
        if (getEstadoCarpeta() != null) {
            _hashCode += getEstadoCarpeta().hashCode();
        }
        if (getEstadoOT() != null) {
            _hashCode += getEstadoOT().hashCode();
        }
        if (getFechaCreacion() != null) {
            _hashCode += getFechaCreacion().hashCode();
        }
        if (getOrdenTrabajo() != null) {
            _hashCode += getOrdenTrabajo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EntregaDomicilioVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "entregaDomicilioVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comunidad");
        elemField.setXmlName(new javax.xml.namespace.QName("", "comunidad"));
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
        elemField.setFieldName("estadoCarpeta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estadoCarpeta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estadoOT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estadoOT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaCreacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechaCreacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ordenTrabajo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ordenTrabajo"));
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
