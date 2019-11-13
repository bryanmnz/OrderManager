/**
 * CampaignAccount.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.telmex.pcml.service;

public class CampaignAccount  implements java.io.Serializable {
    private java.lang.String codCam;

    private java.lang.String cuenta;

    private java.lang.String mensaje;

    public CampaignAccount() {
    }

    public CampaignAccount(
           java.lang.String codCam,
           java.lang.String cuenta,
           java.lang.String mensaje) {
           this.codCam = codCam;
           this.cuenta = cuenta;
           this.mensaje = mensaje;
    }


    /**
     * Gets the codCam value for this CampaignAccount.
     * 
     * @return codCam
     */
    public java.lang.String getCodCam() {
        return codCam;
    }


    /**
     * Sets the codCam value for this CampaignAccount.
     * 
     * @param codCam
     */
    public void setCodCam(java.lang.String codCam) {
        this.codCam = codCam;
    }


    /**
     * Gets the cuenta value for this CampaignAccount.
     * 
     * @return cuenta
     */
    public java.lang.String getCuenta() {
        return cuenta;
    }


    /**
     * Sets the cuenta value for this CampaignAccount.
     * 
     * @param cuenta
     */
    public void setCuenta(java.lang.String cuenta) {
        this.cuenta = cuenta;
    }


    /**
     * Gets the mensaje value for this CampaignAccount.
     * 
     * @return mensaje
     */
    public java.lang.String getMensaje() {
        return mensaje;
    }


    /**
     * Sets the mensaje value for this CampaignAccount.
     * 
     * @param mensaje
     */
    public void setMensaje(java.lang.String mensaje) {
        this.mensaje = mensaje;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CampaignAccount)) return false;
        CampaignAccount other = (CampaignAccount) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codCam==null && other.getCodCam()==null) || 
             (this.codCam!=null &&
              this.codCam.equals(other.getCodCam()))) &&
            ((this.cuenta==null && other.getCuenta()==null) || 
             (this.cuenta!=null &&
              this.cuenta.equals(other.getCuenta()))) &&
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
        if (getCodCam() != null) {
            _hashCode += getCodCam().hashCode();
        }
        if (getCuenta() != null) {
            _hashCode += getCuenta().hashCode();
        }
        if (getMensaje() != null) {
            _hashCode += getMensaje().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CampaignAccount.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "campaignAccount"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codCam");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codCam"));
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
