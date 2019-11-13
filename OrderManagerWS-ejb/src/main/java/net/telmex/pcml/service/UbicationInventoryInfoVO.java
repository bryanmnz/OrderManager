/**
 * UbicationInventoryInfoVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.telmex.pcml.service;

public class UbicationInventoryInfoVO  implements java.io.Serializable {
    private java.lang.String codigoError;

    private net.telmex.pcml.service.UbicationInventoryVO[] informacion;

    private java.lang.String mensaje;

    public UbicationInventoryInfoVO() {
    }

    public UbicationInventoryInfoVO(
           java.lang.String codigoError,
           net.telmex.pcml.service.UbicationInventoryVO[] informacion,
           java.lang.String mensaje) {
           this.codigoError = codigoError;
           this.informacion = informacion;
           this.mensaje = mensaje;
    }


    /**
     * Gets the codigoError value for this UbicationInventoryInfoVO.
     * 
     * @return codigoError
     */
    public java.lang.String getCodigoError() {
        return codigoError;
    }


    /**
     * Sets the codigoError value for this UbicationInventoryInfoVO.
     * 
     * @param codigoError
     */
    public void setCodigoError(java.lang.String codigoError) {
        this.codigoError = codigoError;
    }


    /**
     * Gets the informacion value for this UbicationInventoryInfoVO.
     * 
     * @return informacion
     */
    public net.telmex.pcml.service.UbicationInventoryVO[] getInformacion() {
        return informacion;
    }


    /**
     * Sets the informacion value for this UbicationInventoryInfoVO.
     * 
     * @param informacion
     */
    public void setInformacion(net.telmex.pcml.service.UbicationInventoryVO[] informacion) {
        this.informacion = informacion;
    }

    public net.telmex.pcml.service.UbicationInventoryVO getInformacion(int i) {
        return this.informacion[i];
    }

    public void setInformacion(int i, net.telmex.pcml.service.UbicationInventoryVO _value) {
        this.informacion[i] = _value;
    }


    /**
     * Gets the mensaje value for this UbicationInventoryInfoVO.
     * 
     * @return mensaje
     */
    public java.lang.String getMensaje() {
        return mensaje;
    }


    /**
     * Sets the mensaje value for this UbicationInventoryInfoVO.
     * 
     * @param mensaje
     */
    public void setMensaje(java.lang.String mensaje) {
        this.mensaje = mensaje;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UbicationInventoryInfoVO)) return false;
        UbicationInventoryInfoVO other = (UbicationInventoryInfoVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigoError==null && other.getCodigoError()==null) || 
             (this.codigoError!=null &&
              this.codigoError.equals(other.getCodigoError()))) &&
            ((this.informacion==null && other.getInformacion()==null) || 
             (this.informacion!=null &&
              java.util.Arrays.equals(this.informacion, other.getInformacion()))) &&
            ((this.mensaje==null && other.getMensaje()==null) || 
             (this.mensaje!=null &&
              this.mensaje.equals(other.getMensaje())));
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
        if (getCodigoError() != null) {
            _hashCode += getCodigoError().hashCode();
        }
        if (getInformacion() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInformacion());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInformacion(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMensaje() != null) {
            _hashCode += getMensaje().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UbicationInventoryInfoVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "ubicationInventoryInfoVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoError");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("informacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "informacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "ubicationInventoryVO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensaje");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mensaje"));
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
