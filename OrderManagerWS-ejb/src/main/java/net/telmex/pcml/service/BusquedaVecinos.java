/**
 * BusquedaVecinos.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.telmex.pcml.service;

public class BusquedaVecinos  implements java.io.Serializable {
    private java.lang.String apartamento;

    private java.lang.String calle;

    private java.lang.String casa;

    private java.lang.String comunidad;

    private java.lang.String division;

    private java.lang.String tipoUnidad;

    private java.lang.String[] vecinosString;

    public BusquedaVecinos() {
    }

    public BusquedaVecinos(
           java.lang.String apartamento,
           java.lang.String calle,
           java.lang.String casa,
           java.lang.String comunidad,
           java.lang.String division,
           java.lang.String tipoUnidad,
           java.lang.String[] vecinosString) {
           this.apartamento = apartamento;
           this.calle = calle;
           this.casa = casa;
           this.comunidad = comunidad;
           this.division = division;
           this.tipoUnidad = tipoUnidad;
           this.vecinosString = vecinosString;
    }


    /**
     * Gets the apartamento value for this BusquedaVecinos.
     * 
     * @return apartamento
     */
    public java.lang.String getApartamento() {
        return apartamento;
    }


    /**
     * Sets the apartamento value for this BusquedaVecinos.
     * 
     * @param apartamento
     */
    public void setApartamento(java.lang.String apartamento) {
        this.apartamento = apartamento;
    }


    /**
     * Gets the calle value for this BusquedaVecinos.
     * 
     * @return calle
     */
    public java.lang.String getCalle() {
        return calle;
    }


    /**
     * Sets the calle value for this BusquedaVecinos.
     * 
     * @param calle
     */
    public void setCalle(java.lang.String calle) {
        this.calle = calle;
    }


    /**
     * Gets the casa value for this BusquedaVecinos.
     * 
     * @return casa
     */
    public java.lang.String getCasa() {
        return casa;
    }


    /**
     * Sets the casa value for this BusquedaVecinos.
     * 
     * @param casa
     */
    public void setCasa(java.lang.String casa) {
        this.casa = casa;
    }


    /**
     * Gets the comunidad value for this BusquedaVecinos.
     * 
     * @return comunidad
     */
    public java.lang.String getComunidad() {
        return comunidad;
    }


    /**
     * Sets the comunidad value for this BusquedaVecinos.
     * 
     * @param comunidad
     */
    public void setComunidad(java.lang.String comunidad) {
        this.comunidad = comunidad;
    }


    /**
     * Gets the division value for this BusquedaVecinos.
     * 
     * @return division
     */
    public java.lang.String getDivision() {
        return division;
    }


    /**
     * Sets the division value for this BusquedaVecinos.
     * 
     * @param division
     */
    public void setDivision(java.lang.String division) {
        this.division = division;
    }


    /**
     * Gets the tipoUnidad value for this BusquedaVecinos.
     * 
     * @return tipoUnidad
     */
    public java.lang.String getTipoUnidad() {
        return tipoUnidad;
    }


    /**
     * Sets the tipoUnidad value for this BusquedaVecinos.
     * 
     * @param tipoUnidad
     */
    public void setTipoUnidad(java.lang.String tipoUnidad) {
        this.tipoUnidad = tipoUnidad;
    }


    /**
     * Gets the vecinosString value for this BusquedaVecinos.
     * 
     * @return vecinosString
     */
    public java.lang.String[] getVecinosString() {
        return vecinosString;
    }


    /**
     * Sets the vecinosString value for this BusquedaVecinos.
     * 
     * @param vecinosString
     */
    public void setVecinosString(java.lang.String[] vecinosString) {
        this.vecinosString = vecinosString;
    }

    public java.lang.String getVecinosString(int i) {
        return this.vecinosString[i];
    }

    public void setVecinosString(int i, java.lang.String _value) {
        this.vecinosString[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BusquedaVecinos)) return false;
        BusquedaVecinos other = (BusquedaVecinos) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.apartamento==null && other.getApartamento()==null) || 
             (this.apartamento!=null &&
              this.apartamento.equals(other.getApartamento()))) &&
            ((this.calle==null && other.getCalle()==null) || 
             (this.calle!=null &&
              this.calle.equals(other.getCalle()))) &&
            ((this.casa==null && other.getCasa()==null) || 
             (this.casa!=null &&
              this.casa.equals(other.getCasa()))) &&
            ((this.comunidad==null && other.getComunidad()==null) || 
             (this.comunidad!=null &&
              this.comunidad.equals(other.getComunidad()))) &&
            ((this.division==null && other.getDivision()==null) || 
             (this.division!=null &&
              this.division.equals(other.getDivision()))) &&
            ((this.tipoUnidad==null && other.getTipoUnidad()==null) || 
             (this.tipoUnidad!=null &&
              this.tipoUnidad.equals(other.getTipoUnidad()))) &&
            ((this.vecinosString==null && other.getVecinosString()==null) || 
             (this.vecinosString!=null &&
              java.util.Arrays.equals(this.vecinosString, other.getVecinosString())));
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
        if (getApartamento() != null) {
            _hashCode += getApartamento().hashCode();
        }
        if (getCalle() != null) {
            _hashCode += getCalle().hashCode();
        }
        if (getCasa() != null) {
            _hashCode += getCasa().hashCode();
        }
        if (getComunidad() != null) {
            _hashCode += getComunidad().hashCode();
        }
        if (getDivision() != null) {
            _hashCode += getDivision().hashCode();
        }
        if (getTipoUnidad() != null) {
            _hashCode += getTipoUnidad().hashCode();
        }
        if (getVecinosString() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVecinosString());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVecinosString(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BusquedaVecinos.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "busquedaVecinos"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apartamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "apartamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "calle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("casa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "casa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comunidad");
        elemField.setXmlName(new javax.xml.namespace.QName("", "comunidad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("division");
        elemField.setXmlName(new javax.xml.namespace.QName("", "division"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoUnidad");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoUnidad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vecinosString");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vecinosString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
