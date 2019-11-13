/**
 * ValLineaTelefonica.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.telmex.pcml.service;

public class ValLineaTelefonica  implements java.io.Serializable {
    private java.lang.String PESTADO;

    private java.lang.String PMENSAJE;

    private java.lang.String PNUMID;

    private java.lang.String PTIPOID;

    private java.lang.String PUSERID;

    private java.lang.String RESULTADO;

    private java.lang.String SFOPCI;

    private java.lang.String TABDATOS;

    public ValLineaTelefonica() {
    }

    public ValLineaTelefonica(
           java.lang.String PESTADO,
           java.lang.String PMENSAJE,
           java.lang.String PNUMID,
           java.lang.String PTIPOID,
           java.lang.String PUSERID,
           java.lang.String RESULTADO,
           java.lang.String SFOPCI,
           java.lang.String TABDATOS) {
           this.PESTADO = PESTADO;
           this.PMENSAJE = PMENSAJE;
           this.PNUMID = PNUMID;
           this.PTIPOID = PTIPOID;
           this.PUSERID = PUSERID;
           this.RESULTADO = RESULTADO;
           this.SFOPCI = SFOPCI;
           this.TABDATOS = TABDATOS;
    }


    /**
     * Gets the PESTADO value for this ValLineaTelefonica.
     * 
     * @return PESTADO
     */
    public java.lang.String getPESTADO() {
        return PESTADO;
    }


    /**
     * Sets the PESTADO value for this ValLineaTelefonica.
     * 
     * @param PESTADO
     */
    public void setPESTADO(java.lang.String PESTADO) {
        this.PESTADO = PESTADO;
    }


    /**
     * Gets the PMENSAJE value for this ValLineaTelefonica.
     * 
     * @return PMENSAJE
     */
    public java.lang.String getPMENSAJE() {
        return PMENSAJE;
    }


    /**
     * Sets the PMENSAJE value for this ValLineaTelefonica.
     * 
     * @param PMENSAJE
     */
    public void setPMENSAJE(java.lang.String PMENSAJE) {
        this.PMENSAJE = PMENSAJE;
    }


    /**
     * Gets the PNUMID value for this ValLineaTelefonica.
     * 
     * @return PNUMID
     */
    public java.lang.String getPNUMID() {
        return PNUMID;
    }


    /**
     * Sets the PNUMID value for this ValLineaTelefonica.
     * 
     * @param PNUMID
     */
    public void setPNUMID(java.lang.String PNUMID) {
        this.PNUMID = PNUMID;
    }


    /**
     * Gets the PTIPOID value for this ValLineaTelefonica.
     * 
     * @return PTIPOID
     */
    public java.lang.String getPTIPOID() {
        return PTIPOID;
    }


    /**
     * Sets the PTIPOID value for this ValLineaTelefonica.
     * 
     * @param PTIPOID
     */
    public void setPTIPOID(java.lang.String PTIPOID) {
        this.PTIPOID = PTIPOID;
    }


    /**
     * Gets the PUSERID value for this ValLineaTelefonica.
     * 
     * @return PUSERID
     */
    public java.lang.String getPUSERID() {
        return PUSERID;
    }


    /**
     * Sets the PUSERID value for this ValLineaTelefonica.
     * 
     * @param PUSERID
     */
    public void setPUSERID(java.lang.String PUSERID) {
        this.PUSERID = PUSERID;
    }


    /**
     * Gets the RESULTADO value for this ValLineaTelefonica.
     * 
     * @return RESULTADO
     */
    public java.lang.String getRESULTADO() {
        return RESULTADO;
    }


    /**
     * Sets the RESULTADO value for this ValLineaTelefonica.
     * 
     * @param RESULTADO
     */
    public void setRESULTADO(java.lang.String RESULTADO) {
        this.RESULTADO = RESULTADO;
    }


    /**
     * Gets the SFOPCI value for this ValLineaTelefonica.
     * 
     * @return SFOPCI
     */
    public java.lang.String getSFOPCI() {
        return SFOPCI;
    }


    /**
     * Sets the SFOPCI value for this ValLineaTelefonica.
     * 
     * @param SFOPCI
     */
    public void setSFOPCI(java.lang.String SFOPCI) {
        this.SFOPCI = SFOPCI;
    }


    /**
     * Gets the TABDATOS value for this ValLineaTelefonica.
     * 
     * @return TABDATOS
     */
    public java.lang.String getTABDATOS() {
        return TABDATOS;
    }


    /**
     * Sets the TABDATOS value for this ValLineaTelefonica.
     * 
     * @param TABDATOS
     */
    public void setTABDATOS(java.lang.String TABDATOS) {
        this.TABDATOS = TABDATOS;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ValLineaTelefonica)) return false;
        ValLineaTelefonica other = (ValLineaTelefonica) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PESTADO==null && other.getPESTADO()==null) || 
             (this.PESTADO!=null &&
              this.PESTADO.equals(other.getPESTADO()))) &&
            ((this.PMENSAJE==null && other.getPMENSAJE()==null) || 
             (this.PMENSAJE!=null &&
              this.PMENSAJE.equals(other.getPMENSAJE()))) &&
            ((this.PNUMID==null && other.getPNUMID()==null) || 
             (this.PNUMID!=null &&
              this.PNUMID.equals(other.getPNUMID()))) &&
            ((this.PTIPOID==null && other.getPTIPOID()==null) || 
             (this.PTIPOID!=null &&
              this.PTIPOID.equals(other.getPTIPOID()))) &&
            ((this.PUSERID==null && other.getPUSERID()==null) || 
             (this.PUSERID!=null &&
              this.PUSERID.equals(other.getPUSERID()))) &&
            ((this.RESULTADO==null && other.getRESULTADO()==null) || 
             (this.RESULTADO!=null &&
              this.RESULTADO.equals(other.getRESULTADO()))) &&
            ((this.SFOPCI==null && other.getSFOPCI()==null) || 
             (this.SFOPCI!=null &&
              this.SFOPCI.equals(other.getSFOPCI()))) &&
            ((this.TABDATOS==null && other.getTABDATOS()==null) || 
             (this.TABDATOS!=null &&
              this.TABDATOS.equals(other.getTABDATOS())));
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
        if (getPESTADO() != null) {
            _hashCode += getPESTADO().hashCode();
        }
        if (getPMENSAJE() != null) {
            _hashCode += getPMENSAJE().hashCode();
        }
        if (getPNUMID() != null) {
            _hashCode += getPNUMID().hashCode();
        }
        if (getPTIPOID() != null) {
            _hashCode += getPTIPOID().hashCode();
        }
        if (getPUSERID() != null) {
            _hashCode += getPUSERID().hashCode();
        }
        if (getRESULTADO() != null) {
            _hashCode += getRESULTADO().hashCode();
        }
        if (getSFOPCI() != null) {
            _hashCode += getSFOPCI().hashCode();
        }
        if (getTABDATOS() != null) {
            _hashCode += getTABDATOS().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ValLineaTelefonica.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "valLineaTelefonica"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PESTADO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PESTADO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PMENSAJE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PMENSAJE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PNUMID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PNUMID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PTIPOID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PTIPOID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PUSERID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PUSERID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RESULTADO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RESULTADO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SFOPCI");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SFOPCI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TABDATOS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TABDATOS"));
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
