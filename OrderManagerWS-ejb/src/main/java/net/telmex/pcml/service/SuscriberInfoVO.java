/**
 * SuscriberInfoVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.telmex.pcml.service;

public class SuscriberInfoVO  extends net.telmex.pcml.service.SuscriberVO  implements java.io.Serializable {
    private java.lang.String avisoFinal;

    private java.lang.String fechaDX;

    private java.lang.String saldo;

    private java.lang.String segundoApellido;

    public SuscriberInfoVO() {
    }

    public SuscriberInfoVO(
           java.lang.String apellido,
           java.lang.String cuenta,
           java.lang.String direccion,
           java.lang.String estado,
           java.lang.String nombre,
           java.lang.String numeroIdentificacion,
           java.lang.String telAdicional,
           java.lang.String telCasa,
           java.lang.String telOficina,
           java.lang.String tipoIdentificacion,
           java.lang.String tipoSuscriptor,
           java.lang.String avisoFinal,
           java.lang.String fechaDX,
           java.lang.String saldo,
           java.lang.String segundoApellido) {
        super(
            apellido,
            cuenta,
            direccion,
            estado,
            nombre,
            numeroIdentificacion,
            telAdicional,
            telCasa,
            telOficina,
            tipoIdentificacion,
            tipoSuscriptor);
        this.avisoFinal = avisoFinal;
        this.fechaDX = fechaDX;
        this.saldo = saldo;
        this.segundoApellido = segundoApellido;
    }


    /**
     * Gets the avisoFinal value for this SuscriberInfoVO.
     * 
     * @return avisoFinal
     */
    public java.lang.String getAvisoFinal() {
        return avisoFinal;
    }


    /**
     * Sets the avisoFinal value for this SuscriberInfoVO.
     * 
     * @param avisoFinal
     */
    public void setAvisoFinal(java.lang.String avisoFinal) {
        this.avisoFinal = avisoFinal;
    }


    /**
     * Gets the fechaDX value for this SuscriberInfoVO.
     * 
     * @return fechaDX
     */
    public java.lang.String getFechaDX() {
        return fechaDX;
    }


    /**
     * Sets the fechaDX value for this SuscriberInfoVO.
     * 
     * @param fechaDX
     */
    public void setFechaDX(java.lang.String fechaDX) {
        this.fechaDX = fechaDX;
    }


    /**
     * Gets the saldo value for this SuscriberInfoVO.
     * 
     * @return saldo
     */
    public java.lang.String getSaldo() {
        return saldo;
    }


    /**
     * Sets the saldo value for this SuscriberInfoVO.
     * 
     * @param saldo
     */
    public void setSaldo(java.lang.String saldo) {
        this.saldo = saldo;
    }


    /**
     * Gets the segundoApellido value for this SuscriberInfoVO.
     * 
     * @return segundoApellido
     */
    public java.lang.String getSegundoApellido() {
        return segundoApellido;
    }


    /**
     * Sets the segundoApellido value for this SuscriberInfoVO.
     * 
     * @param segundoApellido
     */
    public void setSegundoApellido(java.lang.String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SuscriberInfoVO)) return false;
        SuscriberInfoVO other = (SuscriberInfoVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.avisoFinal==null && other.getAvisoFinal()==null) || 
             (this.avisoFinal!=null &&
              this.avisoFinal.equals(other.getAvisoFinal()))) &&
            ((this.fechaDX==null && other.getFechaDX()==null) || 
             (this.fechaDX!=null &&
              this.fechaDX.equals(other.getFechaDX()))) &&
            ((this.saldo==null && other.getSaldo()==null) || 
             (this.saldo!=null &&
              this.saldo.equals(other.getSaldo()))) &&
            ((this.segundoApellido==null && other.getSegundoApellido()==null) || 
             (this.segundoApellido!=null &&
              this.segundoApellido.equals(other.getSegundoApellido())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getAvisoFinal() != null) {
            _hashCode += getAvisoFinal().hashCode();
        }
        if (getFechaDX() != null) {
            _hashCode += getFechaDX().hashCode();
        }
        if (getSaldo() != null) {
            _hashCode += getSaldo().hashCode();
        }
        if (getSegundoApellido() != null) {
            _hashCode += getSegundoApellido().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SuscriberInfoVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "suscriberInfoVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("avisoFinal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "avisoFinal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaDX");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechaDX"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("saldo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "saldo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("segundoApellido");
        elemField.setXmlName(new javax.xml.namespace.QName("", "segundoApellido"));
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
