/**
 * MacConsStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.telmex.pcml.service;

public class MacConsStruct  implements java.io.Serializable {
    private java.lang.String cuenta;

    private java.lang.String itemc;

    private java.lang.String mace;

    private java.lang.String manufc;

    private java.lang.String serial;

    private java.lang.String servicio;

    public MacConsStruct() {
    }

    public MacConsStruct(
           java.lang.String cuenta,
           java.lang.String itemc,
           java.lang.String mace,
           java.lang.String manufc,
           java.lang.String serial,
           java.lang.String servicio) {
           this.cuenta = cuenta;
           this.itemc = itemc;
           this.mace = mace;
           this.manufc = manufc;
           this.serial = serial;
           this.servicio = servicio;
    }


    /**
     * Gets the cuenta value for this MacConsStruct.
     * 
     * @return cuenta
     */
    public java.lang.String getCuenta() {
        return cuenta;
    }


    /**
     * Sets the cuenta value for this MacConsStruct.
     * 
     * @param cuenta
     */
    public void setCuenta(java.lang.String cuenta) {
        this.cuenta = cuenta;
    }


    /**
     * Gets the itemc value for this MacConsStruct.
     * 
     * @return itemc
     */
    public java.lang.String getItemc() {
        return itemc;
    }


    /**
     * Sets the itemc value for this MacConsStruct.
     * 
     * @param itemc
     */
    public void setItemc(java.lang.String itemc) {
        this.itemc = itemc;
    }


    /**
     * Gets the mace value for this MacConsStruct.
     * 
     * @return mace
     */
    public java.lang.String getMace() {
        return mace;
    }


    /**
     * Sets the mace value for this MacConsStruct.
     * 
     * @param mace
     */
    public void setMace(java.lang.String mace) {
        this.mace = mace;
    }


    /**
     * Gets the manufc value for this MacConsStruct.
     * 
     * @return manufc
     */
    public java.lang.String getManufc() {
        return manufc;
    }


    /**
     * Sets the manufc value for this MacConsStruct.
     * 
     * @param manufc
     */
    public void setManufc(java.lang.String manufc) {
        this.manufc = manufc;
    }


    /**
     * Gets the serial value for this MacConsStruct.
     * 
     * @return serial
     */
    public java.lang.String getSerial() {
        return serial;
    }


    /**
     * Sets the serial value for this MacConsStruct.
     * 
     * @param serial
     */
    public void setSerial(java.lang.String serial) {
        this.serial = serial;
    }


    /**
     * Gets the servicio value for this MacConsStruct.
     * 
     * @return servicio
     */
    public java.lang.String getServicio() {
        return servicio;
    }


    /**
     * Sets the servicio value for this MacConsStruct.
     * 
     * @param servicio
     */
    public void setServicio(java.lang.String servicio) {
        this.servicio = servicio;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MacConsStruct)) return false;
        MacConsStruct other = (MacConsStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cuenta==null && other.getCuenta()==null) || 
             (this.cuenta!=null &&
              this.cuenta.equals(other.getCuenta()))) &&
            ((this.itemc==null && other.getItemc()==null) || 
             (this.itemc!=null &&
              this.itemc.equals(other.getItemc()))) &&
            ((this.mace==null && other.getMace()==null) || 
             (this.mace!=null &&
              this.mace.equals(other.getMace()))) &&
            ((this.manufc==null && other.getManufc()==null) || 
             (this.manufc!=null &&
              this.manufc.equals(other.getManufc()))) &&
            ((this.serial==null && other.getSerial()==null) || 
             (this.serial!=null &&
              this.serial.equals(other.getSerial()))) &&
            ((this.servicio==null && other.getServicio()==null) || 
             (this.servicio!=null &&
              this.servicio.equals(other.getServicio())));
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
        if (getCuenta() != null) {
            _hashCode += getCuenta().hashCode();
        }
        if (getItemc() != null) {
            _hashCode += getItemc().hashCode();
        }
        if (getMace() != null) {
            _hashCode += getMace().hashCode();
        }
        if (getManufc() != null) {
            _hashCode += getManufc().hashCode();
        }
        if (getSerial() != null) {
            _hashCode += getSerial().hashCode();
        }
        if (getServicio() != null) {
            _hashCode += getServicio().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MacConsStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "macConsStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cuenta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cuenta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "itemc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mace");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mace"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "manufc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serial");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "servicio"));
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
