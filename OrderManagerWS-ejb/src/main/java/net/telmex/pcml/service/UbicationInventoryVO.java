/**
 * UbicationInventoryVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.telmex.pcml.service;

public class UbicationInventoryVO  implements java.io.Serializable {
    private java.lang.String codigo;

    private java.lang.String descripcion;

    private java.lang.String origenDato;

    public UbicationInventoryVO() {
    }

    public UbicationInventoryVO(
           java.lang.String codigo,
           java.lang.String descripcion,
           java.lang.String origenDato) {
           this.codigo = codigo;
           this.descripcion = descripcion;
           this.origenDato = origenDato;
    }


    /**
     * Gets the codigo value for this UbicationInventoryVO.
     * 
     * @return codigo
     */
    public java.lang.String getCodigo() {
        return codigo;
    }


    /**
     * Sets the codigo value for this UbicationInventoryVO.
     * 
     * @param codigo
     */
    public void setCodigo(java.lang.String codigo) {
        this.codigo = codigo;
    }


    /**
     * Gets the descripcion value for this UbicationInventoryVO.
     * 
     * @return descripcion
     */
    public java.lang.String getDescripcion() {
        return descripcion;
    }


    /**
     * Sets the descripcion value for this UbicationInventoryVO.
     * 
     * @param descripcion
     */
    public void setDescripcion(java.lang.String descripcion) {
        this.descripcion = descripcion;
    }


    /**
     * Gets the origenDato value for this UbicationInventoryVO.
     * 
     * @return origenDato
     */
    public java.lang.String getOrigenDato() {
        return origenDato;
    }


    /**
     * Sets the origenDato value for this UbicationInventoryVO.
     * 
     * @param origenDato
     */
    public void setOrigenDato(java.lang.String origenDato) {
        this.origenDato = origenDato;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UbicationInventoryVO)) return false;
        UbicationInventoryVO other = (UbicationInventoryVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigo==null && other.getCodigo()==null) || 
             (this.codigo!=null &&
              this.codigo.equals(other.getCodigo()))) &&
            ((this.descripcion==null && other.getDescripcion()==null) || 
             (this.descripcion!=null &&
              this.descripcion.equals(other.getDescripcion()))) &&
            ((this.origenDato==null && other.getOrigenDato()==null) || 
             (this.origenDato!=null &&
              this.origenDato.equals(other.getOrigenDato())));
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
        if (getCodigo() != null) {
            _hashCode += getCodigo().hashCode();
        }
        if (getDescripcion() != null) {
            _hashCode += getDescripcion().hashCode();
        }
        if (getOrigenDato() != null) {
            _hashCode += getOrigenDato().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UbicationInventoryVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "ubicationInventoryVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descripcion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("origenDato");
        elemField.setXmlName(new javax.xml.namespace.QName("", "origenDato"));
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
