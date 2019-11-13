/**
 * AdministradorNotasVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.telmex.pcml.service;

public class AdministradorNotasVO  implements java.io.Serializable {
    private java.lang.String numLineas;

    private java.lang.String numNota;

    public AdministradorNotasVO() {
    }

    public AdministradorNotasVO(
           java.lang.String numLineas,
           java.lang.String numNota) {
           this.numLineas = numLineas;
           this.numNota = numNota;
    }


    /**
     * Gets the numLineas value for this AdministradorNotasVO.
     * 
     * @return numLineas
     */
    public java.lang.String getNumLineas() {
        return numLineas;
    }


    /**
     * Sets the numLineas value for this AdministradorNotasVO.
     * 
     * @param numLineas
     */
    public void setNumLineas(java.lang.String numLineas) {
        this.numLineas = numLineas;
    }


    /**
     * Gets the numNota value for this AdministradorNotasVO.
     * 
     * @return numNota
     */
    public java.lang.String getNumNota() {
        return numNota;
    }


    /**
     * Sets the numNota value for this AdministradorNotasVO.
     * 
     * @param numNota
     */
    public void setNumNota(java.lang.String numNota) {
        this.numNota = numNota;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdministradorNotasVO)) return false;
        AdministradorNotasVO other = (AdministradorNotasVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.numLineas==null && other.getNumLineas()==null) || 
             (this.numLineas!=null &&
              this.numLineas.equals(other.getNumLineas()))) &&
            ((this.numNota==null && other.getNumNota()==null) || 
             (this.numNota!=null &&
              this.numNota.equals(other.getNumNota())));
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
        if (getNumLineas() != null) {
            _hashCode += getNumLineas().hashCode();
        }
        if (getNumNota() != null) {
            _hashCode += getNumNota().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdministradorNotasVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "administradorNotasVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numLineas");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numLineas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numNota");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numNota"));
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
