/**
 * DateDXSuscriberStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.telmex.pcml.service;

public class DateDXSuscriberStruct  implements java.io.Serializable {
    private java.math.BigDecimal cuentaA;

    private java.math.BigDecimal cuentaP;

    private java.math.BigDecimal cuentaU;

    private java.lang.String error;

    private java.math.BigDecimal fechaA;

    private java.math.BigDecimal fechaP;

    private java.math.BigDecimal fechaU;

    private java.lang.String keyAdd;

    public DateDXSuscriberStruct() {
    }

    public DateDXSuscriberStruct(
           java.math.BigDecimal cuentaA,
           java.math.BigDecimal cuentaP,
           java.math.BigDecimal cuentaU,
           java.lang.String error,
           java.math.BigDecimal fechaA,
           java.math.BigDecimal fechaP,
           java.math.BigDecimal fechaU,
           java.lang.String keyAdd) {
           this.cuentaA = cuentaA;
           this.cuentaP = cuentaP;
           this.cuentaU = cuentaU;
           this.error = error;
           this.fechaA = fechaA;
           this.fechaP = fechaP;
           this.fechaU = fechaU;
           this.keyAdd = keyAdd;
    }


    /**
     * Gets the cuentaA value for this DateDXSuscriberStruct.
     * 
     * @return cuentaA
     */
    public java.math.BigDecimal getCuentaA() {
        return cuentaA;
    }


    /**
     * Sets the cuentaA value for this DateDXSuscriberStruct.
     * 
     * @param cuentaA
     */
    public void setCuentaA(java.math.BigDecimal cuentaA) {
        this.cuentaA = cuentaA;
    }


    /**
     * Gets the cuentaP value for this DateDXSuscriberStruct.
     * 
     * @return cuentaP
     */
    public java.math.BigDecimal getCuentaP() {
        return cuentaP;
    }


    /**
     * Sets the cuentaP value for this DateDXSuscriberStruct.
     * 
     * @param cuentaP
     */
    public void setCuentaP(java.math.BigDecimal cuentaP) {
        this.cuentaP = cuentaP;
    }


    /**
     * Gets the cuentaU value for this DateDXSuscriberStruct.
     * 
     * @return cuentaU
     */
    public java.math.BigDecimal getCuentaU() {
        return cuentaU;
    }


    /**
     * Sets the cuentaU value for this DateDXSuscriberStruct.
     * 
     * @param cuentaU
     */
    public void setCuentaU(java.math.BigDecimal cuentaU) {
        this.cuentaU = cuentaU;
    }


    /**
     * Gets the error value for this DateDXSuscriberStruct.
     * 
     * @return error
     */
    public java.lang.String getError() {
        return error;
    }


    /**
     * Sets the error value for this DateDXSuscriberStruct.
     * 
     * @param error
     */
    public void setError(java.lang.String error) {
        this.error = error;
    }


    /**
     * Gets the fechaA value for this DateDXSuscriberStruct.
     * 
     * @return fechaA
     */
    public java.math.BigDecimal getFechaA() {
        return fechaA;
    }


    /**
     * Sets the fechaA value for this DateDXSuscriberStruct.
     * 
     * @param fechaA
     */
    public void setFechaA(java.math.BigDecimal fechaA) {
        this.fechaA = fechaA;
    }


    /**
     * Gets the fechaP value for this DateDXSuscriberStruct.
     * 
     * @return fechaP
     */
    public java.math.BigDecimal getFechaP() {
        return fechaP;
    }


    /**
     * Sets the fechaP value for this DateDXSuscriberStruct.
     * 
     * @param fechaP
     */
    public void setFechaP(java.math.BigDecimal fechaP) {
        this.fechaP = fechaP;
    }


    /**
     * Gets the fechaU value for this DateDXSuscriberStruct.
     * 
     * @return fechaU
     */
    public java.math.BigDecimal getFechaU() {
        return fechaU;
    }


    /**
     * Sets the fechaU value for this DateDXSuscriberStruct.
     * 
     * @param fechaU
     */
    public void setFechaU(java.math.BigDecimal fechaU) {
        this.fechaU = fechaU;
    }


    /**
     * Gets the keyAdd value for this DateDXSuscriberStruct.
     * 
     * @return keyAdd
     */
    public java.lang.String getKeyAdd() {
        return keyAdd;
    }


    /**
     * Sets the keyAdd value for this DateDXSuscriberStruct.
     * 
     * @param keyAdd
     */
    public void setKeyAdd(java.lang.String keyAdd) {
        this.keyAdd = keyAdd;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DateDXSuscriberStruct)) return false;
        DateDXSuscriberStruct other = (DateDXSuscriberStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cuentaA==null && other.getCuentaA()==null) || 
             (this.cuentaA!=null &&
              this.cuentaA.equals(other.getCuentaA()))) &&
            ((this.cuentaP==null && other.getCuentaP()==null) || 
             (this.cuentaP!=null &&
              this.cuentaP.equals(other.getCuentaP()))) &&
            ((this.cuentaU==null && other.getCuentaU()==null) || 
             (this.cuentaU!=null &&
              this.cuentaU.equals(other.getCuentaU()))) &&
            ((this.error==null && other.getError()==null) || 
             (this.error!=null &&
              this.error.equals(other.getError()))) &&
            ((this.fechaA==null && other.getFechaA()==null) || 
             (this.fechaA!=null &&
              this.fechaA.equals(other.getFechaA()))) &&
            ((this.fechaP==null && other.getFechaP()==null) || 
             (this.fechaP!=null &&
              this.fechaP.equals(other.getFechaP()))) &&
            ((this.fechaU==null && other.getFechaU()==null) || 
             (this.fechaU!=null &&
              this.fechaU.equals(other.getFechaU()))) &&
            ((this.keyAdd==null && other.getKeyAdd()==null) || 
             (this.keyAdd!=null &&
              this.keyAdd.equals(other.getKeyAdd())));
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
        if (getCuentaA() != null) {
            _hashCode += getCuentaA().hashCode();
        }
        if (getCuentaP() != null) {
            _hashCode += getCuentaP().hashCode();
        }
        if (getCuentaU() != null) {
            _hashCode += getCuentaU().hashCode();
        }
        if (getError() != null) {
            _hashCode += getError().hashCode();
        }
        if (getFechaA() != null) {
            _hashCode += getFechaA().hashCode();
        }
        if (getFechaP() != null) {
            _hashCode += getFechaP().hashCode();
        }
        if (getFechaU() != null) {
            _hashCode += getFechaU().hashCode();
        }
        if (getKeyAdd() != null) {
            _hashCode += getKeyAdd().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DateDXSuscriberStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "dateDXSuscriberStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cuentaA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cuentaA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cuentaP");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cuentaP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cuentaU");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cuentaU"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error");
        elemField.setXmlName(new javax.xml.namespace.QName("", "error"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechaA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaP");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechaP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaU");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechaU"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyAdd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "keyAdd"));
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
