/**
 * Clminpr00.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.telmex.pcml.service;

public class Clminpr00  implements java.io.Serializable {
    private java.lang.String COD_MEN;

    private java.math.BigDecimal CUENTA;

    private java.lang.String MENSRTA;

    private java.lang.String NUMCUSTCODE;

    private java.math.BigDecimal NUMID;

    private java.math.BigDecimal NUMMIN;

    private java.math.BigDecimal NUMNOTI;

    private java.lang.String TIPOID;

    public Clminpr00() {
    }

    public Clminpr00(
           java.lang.String COD_MEN,
           java.math.BigDecimal CUENTA,
           java.lang.String MENSRTA,
           java.lang.String NUMCUSTCODE,
           java.math.BigDecimal NUMID,
           java.math.BigDecimal NUMMIN,
           java.math.BigDecimal NUMNOTI,
           java.lang.String TIPOID) {
           this.COD_MEN = COD_MEN;
           this.CUENTA = CUENTA;
           this.MENSRTA = MENSRTA;
           this.NUMCUSTCODE = NUMCUSTCODE;
           this.NUMID = NUMID;
           this.NUMMIN = NUMMIN;
           this.NUMNOTI = NUMNOTI;
           this.TIPOID = TIPOID;
    }


    /**
     * Gets the COD_MEN value for this Clminpr00.
     * 
     * @return COD_MEN
     */
    public java.lang.String getCOD_MEN() {
        return COD_MEN;
    }


    /**
     * Sets the COD_MEN value for this Clminpr00.
     * 
     * @param COD_MEN
     */
    public void setCOD_MEN(java.lang.String COD_MEN) {
        this.COD_MEN = COD_MEN;
    }


    /**
     * Gets the CUENTA value for this Clminpr00.
     * 
     * @return CUENTA
     */
    public java.math.BigDecimal getCUENTA() {
        return CUENTA;
    }


    /**
     * Sets the CUENTA value for this Clminpr00.
     * 
     * @param CUENTA
     */
    public void setCUENTA(java.math.BigDecimal CUENTA) {
        this.CUENTA = CUENTA;
    }


    /**
     * Gets the MENSRTA value for this Clminpr00.
     * 
     * @return MENSRTA
     */
    public java.lang.String getMENSRTA() {
        return MENSRTA;
    }


    /**
     * Sets the MENSRTA value for this Clminpr00.
     * 
     * @param MENSRTA
     */
    public void setMENSRTA(java.lang.String MENSRTA) {
        this.MENSRTA = MENSRTA;
    }


    /**
     * Gets the NUMCUSTCODE value for this Clminpr00.
     * 
     * @return NUMCUSTCODE
     */
    public java.lang.String getNUMCUSTCODE() {
        return NUMCUSTCODE;
    }


    /**
     * Sets the NUMCUSTCODE value for this Clminpr00.
     * 
     * @param NUMCUSTCODE
     */
    public void setNUMCUSTCODE(java.lang.String NUMCUSTCODE) {
        this.NUMCUSTCODE = NUMCUSTCODE;
    }


    /**
     * Gets the NUMID value for this Clminpr00.
     * 
     * @return NUMID
     */
    public java.math.BigDecimal getNUMID() {
        return NUMID;
    }


    /**
     * Sets the NUMID value for this Clminpr00.
     * 
     * @param NUMID
     */
    public void setNUMID(java.math.BigDecimal NUMID) {
        this.NUMID = NUMID;
    }


    /**
     * Gets the NUMMIN value for this Clminpr00.
     * 
     * @return NUMMIN
     */
    public java.math.BigDecimal getNUMMIN() {
        return NUMMIN;
    }


    /**
     * Sets the NUMMIN value for this Clminpr00.
     * 
     * @param NUMMIN
     */
    public void setNUMMIN(java.math.BigDecimal NUMMIN) {
        this.NUMMIN = NUMMIN;
    }


    /**
     * Gets the NUMNOTI value for this Clminpr00.
     * 
     * @return NUMNOTI
     */
    public java.math.BigDecimal getNUMNOTI() {
        return NUMNOTI;
    }


    /**
     * Sets the NUMNOTI value for this Clminpr00.
     * 
     * @param NUMNOTI
     */
    public void setNUMNOTI(java.math.BigDecimal NUMNOTI) {
        this.NUMNOTI = NUMNOTI;
    }


    /**
     * Gets the TIPOID value for this Clminpr00.
     * 
     * @return TIPOID
     */
    public java.lang.String getTIPOID() {
        return TIPOID;
    }


    /**
     * Sets the TIPOID value for this Clminpr00.
     * 
     * @param TIPOID
     */
    public void setTIPOID(java.lang.String TIPOID) {
        this.TIPOID = TIPOID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Clminpr00)) return false;
        Clminpr00 other = (Clminpr00) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.COD_MEN==null && other.getCOD_MEN()==null) || 
             (this.COD_MEN!=null &&
              this.COD_MEN.equals(other.getCOD_MEN()))) &&
            ((this.CUENTA==null && other.getCUENTA()==null) || 
             (this.CUENTA!=null &&
              this.CUENTA.equals(other.getCUENTA()))) &&
            ((this.MENSRTA==null && other.getMENSRTA()==null) || 
             (this.MENSRTA!=null &&
              this.MENSRTA.equals(other.getMENSRTA()))) &&
            ((this.NUMCUSTCODE==null && other.getNUMCUSTCODE()==null) || 
             (this.NUMCUSTCODE!=null &&
              this.NUMCUSTCODE.equals(other.getNUMCUSTCODE()))) &&
            ((this.NUMID==null && other.getNUMID()==null) || 
             (this.NUMID!=null &&
              this.NUMID.equals(other.getNUMID()))) &&
            ((this.NUMMIN==null && other.getNUMMIN()==null) || 
             (this.NUMMIN!=null &&
              this.NUMMIN.equals(other.getNUMMIN()))) &&
            ((this.NUMNOTI==null && other.getNUMNOTI()==null) || 
             (this.NUMNOTI!=null &&
              this.NUMNOTI.equals(other.getNUMNOTI()))) &&
            ((this.TIPOID==null && other.getTIPOID()==null) || 
             (this.TIPOID!=null &&
              this.TIPOID.equals(other.getTIPOID())));
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
        if (getCOD_MEN() != null) {
            _hashCode += getCOD_MEN().hashCode();
        }
        if (getCUENTA() != null) {
            _hashCode += getCUENTA().hashCode();
        }
        if (getMENSRTA() != null) {
            _hashCode += getMENSRTA().hashCode();
        }
        if (getNUMCUSTCODE() != null) {
            _hashCode += getNUMCUSTCODE().hashCode();
        }
        if (getNUMID() != null) {
            _hashCode += getNUMID().hashCode();
        }
        if (getNUMMIN() != null) {
            _hashCode += getNUMMIN().hashCode();
        }
        if (getNUMNOTI() != null) {
            _hashCode += getNUMNOTI().hashCode();
        }
        if (getTIPOID() != null) {
            _hashCode += getTIPOID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Clminpr00.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "clminpr00"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("COD_MEN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "COD_MEN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CUENTA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CUENTA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MENSRTA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MENSRTA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NUMCUSTCODE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NUMCUSTCODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NUMID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NUMID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NUMMIN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NUMMIN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NUMNOTI");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NUMNOTI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TIPOID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TIPOID"));
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
