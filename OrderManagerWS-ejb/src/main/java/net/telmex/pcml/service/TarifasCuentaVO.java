/**
 * TarifasCuentaVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.telmex.pcml.service;

public class TarifasCuentaVO  implements java.io.Serializable {
    private java.lang.String estadoOt;

    private java.lang.String tarifaActualOt;

    private java.lang.String tarifaActualSubscriptor;

    private java.lang.String tarifaAnteriorOt;

    public TarifasCuentaVO() {
    }

    public TarifasCuentaVO(
           java.lang.String estadoOt,
           java.lang.String tarifaActualOt,
           java.lang.String tarifaActualSubscriptor,
           java.lang.String tarifaAnteriorOt) {
           this.estadoOt = estadoOt;
           this.tarifaActualOt = tarifaActualOt;
           this.tarifaActualSubscriptor = tarifaActualSubscriptor;
           this.tarifaAnteriorOt = tarifaAnteriorOt;
    }


    /**
     * Gets the estadoOt value for this TarifasCuentaVO.
     * 
     * @return estadoOt
     */
    public java.lang.String getEstadoOt() {
        return estadoOt;
    }


    /**
     * Sets the estadoOt value for this TarifasCuentaVO.
     * 
     * @param estadoOt
     */
    public void setEstadoOt(java.lang.String estadoOt) {
        this.estadoOt = estadoOt;
    }


    /**
     * Gets the tarifaActualOt value for this TarifasCuentaVO.
     * 
     * @return tarifaActualOt
     */
    public java.lang.String getTarifaActualOt() {
        return tarifaActualOt;
    }


    /**
     * Sets the tarifaActualOt value for this TarifasCuentaVO.
     * 
     * @param tarifaActualOt
     */
    public void setTarifaActualOt(java.lang.String tarifaActualOt) {
        this.tarifaActualOt = tarifaActualOt;
    }


    /**
     * Gets the tarifaActualSubscriptor value for this TarifasCuentaVO.
     * 
     * @return tarifaActualSubscriptor
     */
    public java.lang.String getTarifaActualSubscriptor() {
        return tarifaActualSubscriptor;
    }


    /**
     * Sets the tarifaActualSubscriptor value for this TarifasCuentaVO.
     * 
     * @param tarifaActualSubscriptor
     */
    public void setTarifaActualSubscriptor(java.lang.String tarifaActualSubscriptor) {
        this.tarifaActualSubscriptor = tarifaActualSubscriptor;
    }


    /**
     * Gets the tarifaAnteriorOt value for this TarifasCuentaVO.
     * 
     * @return tarifaAnteriorOt
     */
    public java.lang.String getTarifaAnteriorOt() {
        return tarifaAnteriorOt;
    }


    /**
     * Sets the tarifaAnteriorOt value for this TarifasCuentaVO.
     * 
     * @param tarifaAnteriorOt
     */
    public void setTarifaAnteriorOt(java.lang.String tarifaAnteriorOt) {
        this.tarifaAnteriorOt = tarifaAnteriorOt;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TarifasCuentaVO)) return false;
        TarifasCuentaVO other = (TarifasCuentaVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.estadoOt==null && other.getEstadoOt()==null) || 
             (this.estadoOt!=null &&
              this.estadoOt.equals(other.getEstadoOt()))) &&
            ((this.tarifaActualOt==null && other.getTarifaActualOt()==null) || 
             (this.tarifaActualOt!=null &&
              this.tarifaActualOt.equals(other.getTarifaActualOt()))) &&
            ((this.tarifaActualSubscriptor==null && other.getTarifaActualSubscriptor()==null) || 
             (this.tarifaActualSubscriptor!=null &&
              this.tarifaActualSubscriptor.equals(other.getTarifaActualSubscriptor()))) &&
            ((this.tarifaAnteriorOt==null && other.getTarifaAnteriorOt()==null) || 
             (this.tarifaAnteriorOt!=null &&
              this.tarifaAnteriorOt.equals(other.getTarifaAnteriorOt())));
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
        if (getEstadoOt() != null) {
            _hashCode += getEstadoOt().hashCode();
        }
        if (getTarifaActualOt() != null) {
            _hashCode += getTarifaActualOt().hashCode();
        }
        if (getTarifaActualSubscriptor() != null) {
            _hashCode += getTarifaActualSubscriptor().hashCode();
        }
        if (getTarifaAnteriorOt() != null) {
            _hashCode += getTarifaAnteriorOt().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TarifasCuentaVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "tarifasCuentaVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estadoOt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estadoOt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tarifaActualOt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tarifaActualOt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tarifaActualSubscriptor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tarifaActualSubscriptor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tarifaAnteriorOt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tarifaAnteriorOt"));
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
