/**
 * ValorRecargaRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.telmex.pcml.service;

public class ValorRecargaRequest  implements java.io.Serializable {
    private java.lang.String calificacion;

    private java.lang.String cuenta;

    private java.lang.String opcion;

    private java.lang.String valor;

    public ValorRecargaRequest() {
    }

    public ValorRecargaRequest(
           java.lang.String calificacion,
           java.lang.String cuenta,
           java.lang.String opcion,
           java.lang.String valor) {
           this.calificacion = calificacion;
           this.cuenta = cuenta;
           this.opcion = opcion;
           this.valor = valor;
    }


    /**
     * Gets the calificacion value for this ValorRecargaRequest.
     * 
     * @return calificacion
     */
    public java.lang.String getCalificacion() {
        return calificacion;
    }


    /**
     * Sets the calificacion value for this ValorRecargaRequest.
     * 
     * @param calificacion
     */
    public void setCalificacion(java.lang.String calificacion) {
        this.calificacion = calificacion;
    }


    /**
     * Gets the cuenta value for this ValorRecargaRequest.
     * 
     * @return cuenta
     */
    public java.lang.String getCuenta() {
        return cuenta;
    }


    /**
     * Sets the cuenta value for this ValorRecargaRequest.
     * 
     * @param cuenta
     */
    public void setCuenta(java.lang.String cuenta) {
        this.cuenta = cuenta;
    }


    /**
     * Gets the opcion value for this ValorRecargaRequest.
     * 
     * @return opcion
     */
    public java.lang.String getOpcion() {
        return opcion;
    }


    /**
     * Sets the opcion value for this ValorRecargaRequest.
     * 
     * @param opcion
     */
    public void setOpcion(java.lang.String opcion) {
        this.opcion = opcion;
    }


    /**
     * Gets the valor value for this ValorRecargaRequest.
     * 
     * @return valor
     */
    public java.lang.String getValor() {
        return valor;
    }


    /**
     * Sets the valor value for this ValorRecargaRequest.
     * 
     * @param valor
     */
    public void setValor(java.lang.String valor) {
        this.valor = valor;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ValorRecargaRequest)) return false;
        ValorRecargaRequest other = (ValorRecargaRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.calificacion==null && other.getCalificacion()==null) || 
             (this.calificacion!=null &&
              this.calificacion.equals(other.getCalificacion()))) &&
            ((this.cuenta==null && other.getCuenta()==null) || 
             (this.cuenta!=null &&
              this.cuenta.equals(other.getCuenta()))) &&
            ((this.opcion==null && other.getOpcion()==null) || 
             (this.opcion!=null &&
              this.opcion.equals(other.getOpcion()))) &&
            ((this.valor==null && other.getValor()==null) || 
             (this.valor!=null &&
              this.valor.equals(other.getValor())));
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
        if (getCalificacion() != null) {
            _hashCode += getCalificacion().hashCode();
        }
        if (getCuenta() != null) {
            _hashCode += getCuenta().hashCode();
        }
        if (getOpcion() != null) {
            _hashCode += getOpcion().hashCode();
        }
        if (getValor() != null) {
            _hashCode += getValor().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ValorRecargaRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "valorRecargaRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calificacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "calificacion"));
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
        elemField.setFieldName("opcion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "opcion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valor"));
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
