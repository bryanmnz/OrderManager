/**
 * MaterialVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.telmex.pcml.service;

public class MaterialVO  implements java.io.Serializable {
    private java.lang.String codManufactura;

    private java.lang.String descripcion;

    private java.util.Calendar fechaEfectiva;

    private double valorIva;

    private double valorTarifa;

    public MaterialVO() {
    }

    public MaterialVO(
           java.lang.String codManufactura,
           java.lang.String descripcion,
           java.util.Calendar fechaEfectiva,
           double valorIva,
           double valorTarifa) {
           this.codManufactura = codManufactura;
           this.descripcion = descripcion;
           this.fechaEfectiva = fechaEfectiva;
           this.valorIva = valorIva;
           this.valorTarifa = valorTarifa;
    }


    /**
     * Gets the codManufactura value for this MaterialVO.
     * 
     * @return codManufactura
     */
    public java.lang.String getCodManufactura() {
        return codManufactura;
    }


    /**
     * Sets the codManufactura value for this MaterialVO.
     * 
     * @param codManufactura
     */
    public void setCodManufactura(java.lang.String codManufactura) {
        this.codManufactura = codManufactura;
    }


    /**
     * Gets the descripcion value for this MaterialVO.
     * 
     * @return descripcion
     */
    public java.lang.String getDescripcion() {
        return descripcion;
    }


    /**
     * Sets the descripcion value for this MaterialVO.
     * 
     * @param descripcion
     */
    public void setDescripcion(java.lang.String descripcion) {
        this.descripcion = descripcion;
    }


    /**
     * Gets the fechaEfectiva value for this MaterialVO.
     * 
     * @return fechaEfectiva
     */
    public java.util.Calendar getFechaEfectiva() {
        return fechaEfectiva;
    }


    /**
     * Sets the fechaEfectiva value for this MaterialVO.
     * 
     * @param fechaEfectiva
     */
    public void setFechaEfectiva(java.util.Calendar fechaEfectiva) {
        this.fechaEfectiva = fechaEfectiva;
    }


    /**
     * Gets the valorIva value for this MaterialVO.
     * 
     * @return valorIva
     */
    public double getValorIva() {
        return valorIva;
    }


    /**
     * Sets the valorIva value for this MaterialVO.
     * 
     * @param valorIva
     */
    public void setValorIva(double valorIva) {
        this.valorIva = valorIva;
    }


    /**
     * Gets the valorTarifa value for this MaterialVO.
     * 
     * @return valorTarifa
     */
    public double getValorTarifa() {
        return valorTarifa;
    }


    /**
     * Sets the valorTarifa value for this MaterialVO.
     * 
     * @param valorTarifa
     */
    public void setValorTarifa(double valorTarifa) {
        this.valorTarifa = valorTarifa;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MaterialVO)) return false;
        MaterialVO other = (MaterialVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codManufactura==null && other.getCodManufactura()==null) || 
             (this.codManufactura!=null &&
              this.codManufactura.equals(other.getCodManufactura()))) &&
            ((this.descripcion==null && other.getDescripcion()==null) || 
             (this.descripcion!=null &&
              this.descripcion.equals(other.getDescripcion()))) &&
            ((this.fechaEfectiva==null && other.getFechaEfectiva()==null) || 
             (this.fechaEfectiva!=null &&
              this.fechaEfectiva.equals(other.getFechaEfectiva()))) &&
            this.valorIva == other.getValorIva() &&
            this.valorTarifa == other.getValorTarifa();
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
        if (getCodManufactura() != null) {
            _hashCode += getCodManufactura().hashCode();
        }
        if (getDescripcion() != null) {
            _hashCode += getDescripcion().hashCode();
        }
        if (getFechaEfectiva() != null) {
            _hashCode += getFechaEfectiva().hashCode();
        }
        _hashCode += new Double(getValorIva()).hashCode();
        _hashCode += new Double(getValorTarifa()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MaterialVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "materialVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codManufactura");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codManufactura"));
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
        elemField.setFieldName("fechaEfectiva");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechaEfectiva"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorIva");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valorIva"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorTarifa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valorTarifa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
