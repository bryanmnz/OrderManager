/**
 * ReporteSerializadosEntry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.telmex.pcml.service;

public class ReporteSerializadosEntry  implements java.io.Serializable {
    private java.lang.String codFuncion;

    private java.lang.String nomArchivo;

    private java.lang.String rmensaje;

    public ReporteSerializadosEntry() {
    }

    public ReporteSerializadosEntry(
           java.lang.String codFuncion,
           java.lang.String nomArchivo,
           java.lang.String rmensaje) {
           this.codFuncion = codFuncion;
           this.nomArchivo = nomArchivo;
           this.rmensaje = rmensaje;
    }


    /**
     * Gets the codFuncion value for this ReporteSerializadosEntry.
     * 
     * @return codFuncion
     */
    public java.lang.String getCodFuncion() {
        return codFuncion;
    }


    /**
     * Sets the codFuncion value for this ReporteSerializadosEntry.
     * 
     * @param codFuncion
     */
    public void setCodFuncion(java.lang.String codFuncion) {
        this.codFuncion = codFuncion;
    }


    /**
     * Gets the nomArchivo value for this ReporteSerializadosEntry.
     * 
     * @return nomArchivo
     */
    public java.lang.String getNomArchivo() {
        return nomArchivo;
    }


    /**
     * Sets the nomArchivo value for this ReporteSerializadosEntry.
     * 
     * @param nomArchivo
     */
    public void setNomArchivo(java.lang.String nomArchivo) {
        this.nomArchivo = nomArchivo;
    }


    /**
     * Gets the rmensaje value for this ReporteSerializadosEntry.
     * 
     * @return rmensaje
     */
    public java.lang.String getRmensaje() {
        return rmensaje;
    }


    /**
     * Sets the rmensaje value for this ReporteSerializadosEntry.
     * 
     * @param rmensaje
     */
    public void setRmensaje(java.lang.String rmensaje) {
        this.rmensaje = rmensaje;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReporteSerializadosEntry)) return false;
        ReporteSerializadosEntry other = (ReporteSerializadosEntry) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codFuncion==null && other.getCodFuncion()==null) || 
             (this.codFuncion!=null &&
              this.codFuncion.equals(other.getCodFuncion()))) &&
            ((this.nomArchivo==null && other.getNomArchivo()==null) || 
             (this.nomArchivo!=null &&
              this.nomArchivo.equals(other.getNomArchivo()))) &&
            ((this.rmensaje==null && other.getRmensaje()==null) || 
             (this.rmensaje!=null &&
              this.rmensaje.equals(other.getRmensaje())));
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
        if (getCodFuncion() != null) {
            _hashCode += getCodFuncion().hashCode();
        }
        if (getNomArchivo() != null) {
            _hashCode += getNomArchivo().hashCode();
        }
        if (getRmensaje() != null) {
            _hashCode += getRmensaje().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReporteSerializadosEntry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "reporteSerializadosEntry"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codFuncion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codFuncion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomArchivo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomArchivo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rmensaje");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rmensaje"));
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
