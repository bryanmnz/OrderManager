/**
 * PcmlCampaign.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.telmex.pcml.service;

public class PcmlCampaign  implements java.io.Serializable {
    private java.lang.String camp1;

    private java.lang.String camp2;

    private java.lang.String camp3;

    private java.lang.String codigo;

    private java.lang.String mensaje;

    private java.lang.String ordern;

    public PcmlCampaign() {
    }

    public PcmlCampaign(
           java.lang.String camp1,
           java.lang.String camp2,
           java.lang.String camp3,
           java.lang.String codigo,
           java.lang.String mensaje,
           java.lang.String ordern) {
           this.camp1 = camp1;
           this.camp2 = camp2;
           this.camp3 = camp3;
           this.codigo = codigo;
           this.mensaje = mensaje;
           this.ordern = ordern;
    }


    /**
     * Gets the camp1 value for this PcmlCampaign.
     * 
     * @return camp1
     */
    public java.lang.String getCamp1() {
        return camp1;
    }


    /**
     * Sets the camp1 value for this PcmlCampaign.
     * 
     * @param camp1
     */
    public void setCamp1(java.lang.String camp1) {
        this.camp1 = camp1;
    }


    /**
     * Gets the camp2 value for this PcmlCampaign.
     * 
     * @return camp2
     */
    public java.lang.String getCamp2() {
        return camp2;
    }


    /**
     * Sets the camp2 value for this PcmlCampaign.
     * 
     * @param camp2
     */
    public void setCamp2(java.lang.String camp2) {
        this.camp2 = camp2;
    }


    /**
     * Gets the camp3 value for this PcmlCampaign.
     * 
     * @return camp3
     */
    public java.lang.String getCamp3() {
        return camp3;
    }


    /**
     * Sets the camp3 value for this PcmlCampaign.
     * 
     * @param camp3
     */
    public void setCamp3(java.lang.String camp3) {
        this.camp3 = camp3;
    }


    /**
     * Gets the codigo value for this PcmlCampaign.
     * 
     * @return codigo
     */
    public java.lang.String getCodigo() {
        return codigo;
    }


    /**
     * Sets the codigo value for this PcmlCampaign.
     * 
     * @param codigo
     */
    public void setCodigo(java.lang.String codigo) {
        this.codigo = codigo;
    }


    /**
     * Gets the mensaje value for this PcmlCampaign.
     * 
     * @return mensaje
     */
    public java.lang.String getMensaje() {
        return mensaje;
    }


    /**
     * Sets the mensaje value for this PcmlCampaign.
     * 
     * @param mensaje
     */
    public void setMensaje(java.lang.String mensaje) {
        this.mensaje = mensaje;
    }


    /**
     * Gets the ordern value for this PcmlCampaign.
     * 
     * @return ordern
     */
    public java.lang.String getOrdern() {
        return ordern;
    }


    /**
     * Sets the ordern value for this PcmlCampaign.
     * 
     * @param ordern
     */
    public void setOrdern(java.lang.String ordern) {
        this.ordern = ordern;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PcmlCampaign)) return false;
        PcmlCampaign other = (PcmlCampaign) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.camp1==null && other.getCamp1()==null) || 
             (this.camp1!=null &&
              this.camp1.equals(other.getCamp1()))) &&
            ((this.camp2==null && other.getCamp2()==null) || 
             (this.camp2!=null &&
              this.camp2.equals(other.getCamp2()))) &&
            ((this.camp3==null && other.getCamp3()==null) || 
             (this.camp3!=null &&
              this.camp3.equals(other.getCamp3()))) &&
            ((this.codigo==null && other.getCodigo()==null) || 
             (this.codigo!=null &&
              this.codigo.equals(other.getCodigo()))) &&
            ((this.mensaje==null && other.getMensaje()==null) || 
             (this.mensaje!=null &&
              this.mensaje.equals(other.getMensaje()))) &&
            ((this.ordern==null && other.getOrdern()==null) || 
             (this.ordern!=null &&
              this.ordern.equals(other.getOrdern())));
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
        if (getCamp1() != null) {
            _hashCode += getCamp1().hashCode();
        }
        if (getCamp2() != null) {
            _hashCode += getCamp2().hashCode();
        }
        if (getCamp3() != null) {
            _hashCode += getCamp3().hashCode();
        }
        if (getCodigo() != null) {
            _hashCode += getCodigo().hashCode();
        }
        if (getMensaje() != null) {
            _hashCode += getMensaje().hashCode();
        }
        if (getOrdern() != null) {
            _hashCode += getOrdern().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PcmlCampaign.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "pcmlCampaign"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("camp1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "camp1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("camp2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "camp2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("camp3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "camp3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensaje");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mensaje"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ordern");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ordern"));
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
