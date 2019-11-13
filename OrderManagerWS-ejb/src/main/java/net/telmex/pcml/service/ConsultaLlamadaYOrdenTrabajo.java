/**
 * ConsultaLlamadaYOrdenTrabajo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.telmex.pcml.service;

public class ConsultaLlamadaYOrdenTrabajo  implements java.io.Serializable {
    private net.telmex.pcml.service.LlamadaServicioStruct consulta;

    public ConsultaLlamadaYOrdenTrabajo() {
    }

    public ConsultaLlamadaYOrdenTrabajo(
           net.telmex.pcml.service.LlamadaServicioStruct consulta) {
           this.consulta = consulta;
    }


    /**
     * Gets the consulta value for this ConsultaLlamadaYOrdenTrabajo.
     * 
     * @return consulta
     */
    public net.telmex.pcml.service.LlamadaServicioStruct getConsulta() {
        return consulta;
    }


    /**
     * Sets the consulta value for this ConsultaLlamadaYOrdenTrabajo.
     * 
     * @param consulta
     */
    public void setConsulta(net.telmex.pcml.service.LlamadaServicioStruct consulta) {
        this.consulta = consulta;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultaLlamadaYOrdenTrabajo)) return false;
        ConsultaLlamadaYOrdenTrabajo other = (ConsultaLlamadaYOrdenTrabajo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.consulta==null && other.getConsulta()==null) || 
             (this.consulta!=null &&
              this.consulta.equals(other.getConsulta())));
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
        if (getConsulta() != null) {
            _hashCode += getConsulta().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsultaLlamadaYOrdenTrabajo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "consultaLlamadaYOrdenTrabajo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consulta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "consulta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "llamadaServicioStruct"));
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
