/**
 * WoServiceVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.telmex.pcml.service;

public class WoServiceVO  implements java.io.Serializable {
    private java.lang.String actual;

    private java.lang.String cambio;

    private java.lang.String estado;

    private java.lang.String origen;

    private java.lang.String servicioId;

    public WoServiceVO() {
    }

    public WoServiceVO(
           java.lang.String actual,
           java.lang.String cambio,
           java.lang.String estado,
           java.lang.String origen,
           java.lang.String servicioId) {
           this.actual = actual;
           this.cambio = cambio;
           this.estado = estado;
           this.origen = origen;
           this.servicioId = servicioId;
    }


    /**
     * Gets the actual value for this WoServiceVO.
     * 
     * @return actual
     */
    public java.lang.String getActual() {
        return actual;
    }


    /**
     * Sets the actual value for this WoServiceVO.
     * 
     * @param actual
     */
    public void setActual(java.lang.String actual) {
        this.actual = actual;
    }


    /**
     * Gets the cambio value for this WoServiceVO.
     * 
     * @return cambio
     */
    public java.lang.String getCambio() {
        return cambio;
    }


    /**
     * Sets the cambio value for this WoServiceVO.
     * 
     * @param cambio
     */
    public void setCambio(java.lang.String cambio) {
        this.cambio = cambio;
    }


    /**
     * Gets the estado value for this WoServiceVO.
     * 
     * @return estado
     */
    public java.lang.String getEstado() {
        return estado;
    }


    /**
     * Sets the estado value for this WoServiceVO.
     * 
     * @param estado
     */
    public void setEstado(java.lang.String estado) {
        this.estado = estado;
    }


    /**
     * Gets the origen value for this WoServiceVO.
     * 
     * @return origen
     */
    public java.lang.String getOrigen() {
        return origen;
    }


    /**
     * Sets the origen value for this WoServiceVO.
     * 
     * @param origen
     */
    public void setOrigen(java.lang.String origen) {
        this.origen = origen;
    }


    /**
     * Gets the servicioId value for this WoServiceVO.
     * 
     * @return servicioId
     */
    public java.lang.String getServicioId() {
        return servicioId;
    }


    /**
     * Sets the servicioId value for this WoServiceVO.
     * 
     * @param servicioId
     */
    public void setServicioId(java.lang.String servicioId) {
        this.servicioId = servicioId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WoServiceVO)) return false;
        WoServiceVO other = (WoServiceVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.actual==null && other.getActual()==null) || 
             (this.actual!=null &&
              this.actual.equals(other.getActual()))) &&
            ((this.cambio==null && other.getCambio()==null) || 
             (this.cambio!=null &&
              this.cambio.equals(other.getCambio()))) &&
            ((this.estado==null && other.getEstado()==null) || 
             (this.estado!=null &&
              this.estado.equals(other.getEstado()))) &&
            ((this.origen==null && other.getOrigen()==null) || 
             (this.origen!=null &&
              this.origen.equals(other.getOrigen()))) &&
            ((this.servicioId==null && other.getServicioId()==null) || 
             (this.servicioId!=null &&
              this.servicioId.equals(other.getServicioId())));
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
        if (getActual() != null) {
            _hashCode += getActual().hashCode();
        }
        if (getCambio() != null) {
            _hashCode += getCambio().hashCode();
        }
        if (getEstado() != null) {
            _hashCode += getEstado().hashCode();
        }
        if (getOrigen() != null) {
            _hashCode += getOrigen().hashCode();
        }
        if (getServicioId() != null) {
            _hashCode += getServicioId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WoServiceVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "woServiceVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actual");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actual"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cambio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cambio"));
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
        elemField.setFieldName("origen");
        elemField.setXmlName(new javax.xml.namespace.QName("", "origen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicioId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "servicioId"));
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
