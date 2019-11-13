/**
 * MantenimientoClavIVR.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.telmex.pcml.service;

public class MantenimientoClavIVR  implements java.io.Serializable {
    private java.lang.String PMENSAJE;

    private java.lang.String PUSERID;

    private java.lang.String RESULTADO;

    private java.lang.String SFOPCI;

    private java.lang.String TABDATOS;

    public MantenimientoClavIVR() {
    }

    public MantenimientoClavIVR(
           java.lang.String PMENSAJE,
           java.lang.String PUSERID,
           java.lang.String RESULTADO,
           java.lang.String SFOPCI,
           java.lang.String TABDATOS) {
           this.PMENSAJE = PMENSAJE;
           this.PUSERID = PUSERID;
           this.RESULTADO = RESULTADO;
           this.SFOPCI = SFOPCI;
           this.TABDATOS = TABDATOS;
    }


    /**
     * Gets the PMENSAJE value for this MantenimientoClavIVR.
     * 
     * @return PMENSAJE
     */
    public java.lang.String getPMENSAJE() {
        return PMENSAJE;
    }


    /**
     * Sets the PMENSAJE value for this MantenimientoClavIVR.
     * 
     * @param PMENSAJE
     */
    public void setPMENSAJE(java.lang.String PMENSAJE) {
        this.PMENSAJE = PMENSAJE;
    }


    /**
     * Gets the PUSERID value for this MantenimientoClavIVR.
     * 
     * @return PUSERID
     */
    public java.lang.String getPUSERID() {
        return PUSERID;
    }


    /**
     * Sets the PUSERID value for this MantenimientoClavIVR.
     * 
     * @param PUSERID
     */
    public void setPUSERID(java.lang.String PUSERID) {
        this.PUSERID = PUSERID;
    }


    /**
     * Gets the RESULTADO value for this MantenimientoClavIVR.
     * 
     * @return RESULTADO
     */
    public java.lang.String getRESULTADO() {
        return RESULTADO;
    }


    /**
     * Sets the RESULTADO value for this MantenimientoClavIVR.
     * 
     * @param RESULTADO
     */
    public void setRESULTADO(java.lang.String RESULTADO) {
        this.RESULTADO = RESULTADO;
    }


    /**
     * Gets the SFOPCI value for this MantenimientoClavIVR.
     * 
     * @return SFOPCI
     */
    public java.lang.String getSFOPCI() {
        return SFOPCI;
    }


    /**
     * Sets the SFOPCI value for this MantenimientoClavIVR.
     * 
     * @param SFOPCI
     */
    public void setSFOPCI(java.lang.String SFOPCI) {
        this.SFOPCI = SFOPCI;
    }


    /**
     * Gets the TABDATOS value for this MantenimientoClavIVR.
     * 
     * @return TABDATOS
     */
    public java.lang.String getTABDATOS() {
        return TABDATOS;
    }


    /**
     * Sets the TABDATOS value for this MantenimientoClavIVR.
     * 
     * @param TABDATOS
     */
    public void setTABDATOS(java.lang.String TABDATOS) {
        this.TABDATOS = TABDATOS;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MantenimientoClavIVR)) return false;
        MantenimientoClavIVR other = (MantenimientoClavIVR) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PMENSAJE==null && other.getPMENSAJE()==null) || 
             (this.PMENSAJE!=null &&
              this.PMENSAJE.equals(other.getPMENSAJE()))) &&
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
        if (getPMENSAJE() != null) {
            _hashCode += getPMENSAJE().hashCode();
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
        new org.apache.axis.description.TypeDesc(MantenimientoClavIVR.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "mantenimientoClavIVR"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PMENSAJE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PMENSAJE"));
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
