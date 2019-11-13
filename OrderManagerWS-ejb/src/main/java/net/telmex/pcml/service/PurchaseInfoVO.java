/**
 * PurchaseInfoVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.telmex.pcml.service;

public class PurchaseInfoVO  implements java.io.Serializable {
    private java.lang.String codigoError;

    private java.lang.String info1;

    private java.lang.String info2;

    private net.telmex.pcml.service.PurchaseVO[] informacion;

    private java.lang.String mensaje;

    public PurchaseInfoVO() {
    }

    public PurchaseInfoVO(
           java.lang.String codigoError,
           java.lang.String info1,
           java.lang.String info2,
           net.telmex.pcml.service.PurchaseVO[] informacion,
           java.lang.String mensaje) {
           this.codigoError = codigoError;
           this.info1 = info1;
           this.info2 = info2;
           this.informacion = informacion;
           this.mensaje = mensaje;
    }


    /**
     * Gets the codigoError value for this PurchaseInfoVO.
     * 
     * @return codigoError
     */
    public java.lang.String getCodigoError() {
        return codigoError;
    }


    /**
     * Sets the codigoError value for this PurchaseInfoVO.
     * 
     * @param codigoError
     */
    public void setCodigoError(java.lang.String codigoError) {
        this.codigoError = codigoError;
    }


    /**
     * Gets the info1 value for this PurchaseInfoVO.
     * 
     * @return info1
     */
    public java.lang.String getInfo1() {
        return info1;
    }


    /**
     * Sets the info1 value for this PurchaseInfoVO.
     * 
     * @param info1
     */
    public void setInfo1(java.lang.String info1) {
        this.info1 = info1;
    }


    /**
     * Gets the info2 value for this PurchaseInfoVO.
     * 
     * @return info2
     */
    public java.lang.String getInfo2() {
        return info2;
    }


    /**
     * Sets the info2 value for this PurchaseInfoVO.
     * 
     * @param info2
     */
    public void setInfo2(java.lang.String info2) {
        this.info2 = info2;
    }


    /**
     * Gets the informacion value for this PurchaseInfoVO.
     * 
     * @return informacion
     */
    public net.telmex.pcml.service.PurchaseVO[] getInformacion() {
        return informacion;
    }


    /**
     * Sets the informacion value for this PurchaseInfoVO.
     * 
     * @param informacion
     */
    public void setInformacion(net.telmex.pcml.service.PurchaseVO[] informacion) {
        this.informacion = informacion;
    }

    public net.telmex.pcml.service.PurchaseVO getInformacion(int i) {
        return this.informacion[i];
    }

    public void setInformacion(int i, net.telmex.pcml.service.PurchaseVO _value) {
        this.informacion[i] = _value;
    }


    /**
     * Gets the mensaje value for this PurchaseInfoVO.
     * 
     * @return mensaje
     */
    public java.lang.String getMensaje() {
        return mensaje;
    }


    /**
     * Sets the mensaje value for this PurchaseInfoVO.
     * 
     * @param mensaje
     */
    public void setMensaje(java.lang.String mensaje) {
        this.mensaje = mensaje;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PurchaseInfoVO)) return false;
        PurchaseInfoVO other = (PurchaseInfoVO) obj;
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
            ((this.info1==null && other.getInfo1()==null) || 
             (this.info1!=null &&
              this.info1.equals(other.getInfo1()))) &&
            ((this.info2==null && other.getInfo2()==null) || 
             (this.info2!=null &&
              this.info2.equals(other.getInfo2()))) &&
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
        if (getInfo1() != null) {
            _hashCode += getInfo1().hashCode();
        }
        if (getInfo2() != null) {
            _hashCode += getInfo2().hashCode();
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
        new org.apache.axis.description.TypeDesc(PurchaseInfoVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "purchaseInfoVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoError");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("info1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "info1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("info2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "info2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("informacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "informacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "purchaseVO"));
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
