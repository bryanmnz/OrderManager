/**
 * Vecino.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.telmex.pcml.service;

public class Vecino  implements java.io.Serializable {
    private java.lang.String apartamento;

    private java.lang.String calle;

    private java.lang.String casa;

    private java.lang.String comunidad;

    private java.lang.String cuentaSuscriptor;

    private java.lang.String division;

    private java.lang.String estadoUnidad;

    private java.lang.String nodo;

    public Vecino() {
    }

    public Vecino(
           java.lang.String apartamento,
           java.lang.String calle,
           java.lang.String casa,
           java.lang.String comunidad,
           java.lang.String cuentaSuscriptor,
           java.lang.String division,
           java.lang.String estadoUnidad,
           java.lang.String nodo) {
           this.apartamento = apartamento;
           this.calle = calle;
           this.casa = casa;
           this.comunidad = comunidad;
           this.cuentaSuscriptor = cuentaSuscriptor;
           this.division = division;
           this.estadoUnidad = estadoUnidad;
           this.nodo = nodo;
    }


    /**
     * Gets the apartamento value for this Vecino.
     * 
     * @return apartamento
     */
    public java.lang.String getApartamento() {
        return apartamento;
    }


    /**
     * Sets the apartamento value for this Vecino.
     * 
     * @param apartamento
     */
    public void setApartamento(java.lang.String apartamento) {
        this.apartamento = apartamento;
    }


    /**
     * Gets the calle value for this Vecino.
     * 
     * @return calle
     */
    public java.lang.String getCalle() {
        return calle;
    }


    /**
     * Sets the calle value for this Vecino.
     * 
     * @param calle
     */
    public void setCalle(java.lang.String calle) {
        this.calle = calle;
    }


    /**
     * Gets the casa value for this Vecino.
     * 
     * @return casa
     */
    public java.lang.String getCasa() {
        return casa;
    }


    /**
     * Sets the casa value for this Vecino.
     * 
     * @param casa
     */
    public void setCasa(java.lang.String casa) {
        this.casa = casa;
    }


    /**
     * Gets the comunidad value for this Vecino.
     * 
     * @return comunidad
     */
    public java.lang.String getComunidad() {
        return comunidad;
    }


    /**
     * Sets the comunidad value for this Vecino.
     * 
     * @param comunidad
     */
    public void setComunidad(java.lang.String comunidad) {
        this.comunidad = comunidad;
    }


    /**
     * Gets the cuentaSuscriptor value for this Vecino.
     * 
     * @return cuentaSuscriptor
     */
    public java.lang.String getCuentaSuscriptor() {
        return cuentaSuscriptor;
    }


    /**
     * Sets the cuentaSuscriptor value for this Vecino.
     * 
     * @param cuentaSuscriptor
     */
    public void setCuentaSuscriptor(java.lang.String cuentaSuscriptor) {
        this.cuentaSuscriptor = cuentaSuscriptor;
    }


    /**
     * Gets the division value for this Vecino.
     * 
     * @return division
     */
    public java.lang.String getDivision() {
        return division;
    }


    /**
     * Sets the division value for this Vecino.
     * 
     * @param division
     */
    public void setDivision(java.lang.String division) {
        this.division = division;
    }


    /**
     * Gets the estadoUnidad value for this Vecino.
     * 
     * @return estadoUnidad
     */
    public java.lang.String getEstadoUnidad() {
        return estadoUnidad;
    }


    /**
     * Sets the estadoUnidad value for this Vecino.
     * 
     * @param estadoUnidad
     */
    public void setEstadoUnidad(java.lang.String estadoUnidad) {
        this.estadoUnidad = estadoUnidad;
    }


    /**
     * Gets the nodo value for this Vecino.
     * 
     * @return nodo
     */
    public java.lang.String getNodo() {
        return nodo;
    }


    /**
     * Sets the nodo value for this Vecino.
     * 
     * @param nodo
     */
    public void setNodo(java.lang.String nodo) {
        this.nodo = nodo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Vecino)) return false;
        Vecino other = (Vecino) obj;
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
            ((this.cuentaSuscriptor==null && other.getCuentaSuscriptor()==null) || 
             (this.cuentaSuscriptor!=null &&
              this.cuentaSuscriptor.equals(other.getCuentaSuscriptor()))) &&
            ((this.division==null && other.getDivision()==null) || 
             (this.division!=null &&
              this.division.equals(other.getDivision()))) &&
            ((this.estadoUnidad==null && other.getEstadoUnidad()==null) || 
             (this.estadoUnidad!=null &&
              this.estadoUnidad.equals(other.getEstadoUnidad()))) &&
            ((this.nodo==null && other.getNodo()==null) || 
             (this.nodo!=null &&
              this.nodo.equals(other.getNodo())));
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
        if (getCuentaSuscriptor() != null) {
            _hashCode += getCuentaSuscriptor().hashCode();
        }
        if (getDivision() != null) {
            _hashCode += getDivision().hashCode();
        }
        if (getEstadoUnidad() != null) {
            _hashCode += getEstadoUnidad().hashCode();
        }
        if (getNodo() != null) {
            _hashCode += getNodo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Vecino.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "vecino"));
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
        elemField.setFieldName("cuentaSuscriptor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cuentaSuscriptor"));
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
        elemField.setFieldName("estadoUnidad");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estadoUnidad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nodo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nodo"));
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
