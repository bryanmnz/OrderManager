/**
 * Schedule2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.telmex.pcml.service;

public class Schedule2  implements java.io.Serializable {
    private java.lang.String comunidad;

    private java.lang.String division;

    private java.lang.String estrato;

    private java.math.BigDecimal numReg;

    private java.lang.String[] respuesta;

    private java.lang.String servicios;

    private java.lang.String tipoCliente;

    private java.lang.String tipoTV;

    public Schedule2() {
    }

    public Schedule2(
           java.lang.String comunidad,
           java.lang.String division,
           java.lang.String estrato,
           java.math.BigDecimal numReg,
           java.lang.String[] respuesta,
           java.lang.String servicios,
           java.lang.String tipoCliente,
           java.lang.String tipoTV) {
           this.comunidad = comunidad;
           this.division = division;
           this.estrato = estrato;
           this.numReg = numReg;
           this.respuesta = respuesta;
           this.servicios = servicios;
           this.tipoCliente = tipoCliente;
           this.tipoTV = tipoTV;
    }


    /**
     * Gets the comunidad value for this Schedule2.
     * 
     * @return comunidad
     */
    public java.lang.String getComunidad() {
        return comunidad;
    }


    /**
     * Sets the comunidad value for this Schedule2.
     * 
     * @param comunidad
     */
    public void setComunidad(java.lang.String comunidad) {
        this.comunidad = comunidad;
    }


    /**
     * Gets the division value for this Schedule2.
     * 
     * @return division
     */
    public java.lang.String getDivision() {
        return division;
    }


    /**
     * Sets the division value for this Schedule2.
     * 
     * @param division
     */
    public void setDivision(java.lang.String division) {
        this.division = division;
    }


    /**
     * Gets the estrato value for this Schedule2.
     * 
     * @return estrato
     */
    public java.lang.String getEstrato() {
        return estrato;
    }


    /**
     * Sets the estrato value for this Schedule2.
     * 
     * @param estrato
     */
    public void setEstrato(java.lang.String estrato) {
        this.estrato = estrato;
    }


    /**
     * Gets the numReg value for this Schedule2.
     * 
     * @return numReg
     */
    public java.math.BigDecimal getNumReg() {
        return numReg;
    }


    /**
     * Sets the numReg value for this Schedule2.
     * 
     * @param numReg
     */
    public void setNumReg(java.math.BigDecimal numReg) {
        this.numReg = numReg;
    }


    /**
     * Gets the respuesta value for this Schedule2.
     * 
     * @return respuesta
     */
    public java.lang.String[] getRespuesta() {
        return respuesta;
    }


    /**
     * Sets the respuesta value for this Schedule2.
     * 
     * @param respuesta
     */
    public void setRespuesta(java.lang.String[] respuesta) {
        this.respuesta = respuesta;
    }

    public java.lang.String getRespuesta(int i) {
        return this.respuesta[i];
    }

    public void setRespuesta(int i, java.lang.String _value) {
        this.respuesta[i] = _value;
    }


    /**
     * Gets the servicios value for this Schedule2.
     * 
     * @return servicios
     */
    public java.lang.String getServicios() {
        return servicios;
    }


    /**
     * Sets the servicios value for this Schedule2.
     * 
     * @param servicios
     */
    public void setServicios(java.lang.String servicios) {
        this.servicios = servicios;
    }


    /**
     * Gets the tipoCliente value for this Schedule2.
     * 
     * @return tipoCliente
     */
    public java.lang.String getTipoCliente() {
        return tipoCliente;
    }


    /**
     * Sets the tipoCliente value for this Schedule2.
     * 
     * @param tipoCliente
     */
    public void setTipoCliente(java.lang.String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }


    /**
     * Gets the tipoTV value for this Schedule2.
     * 
     * @return tipoTV
     */
    public java.lang.String getTipoTV() {
        return tipoTV;
    }


    /**
     * Sets the tipoTV value for this Schedule2.
     * 
     * @param tipoTV
     */
    public void setTipoTV(java.lang.String tipoTV) {
        this.tipoTV = tipoTV;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Schedule2)) return false;
        Schedule2 other = (Schedule2) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.comunidad==null && other.getComunidad()==null) || 
             (this.comunidad!=null &&
              this.comunidad.equals(other.getComunidad()))) &&
            ((this.division==null && other.getDivision()==null) || 
             (this.division!=null &&
              this.division.equals(other.getDivision()))) &&
            ((this.estrato==null && other.getEstrato()==null) || 
             (this.estrato!=null &&
              this.estrato.equals(other.getEstrato()))) &&
            ((this.numReg==null && other.getNumReg()==null) || 
             (this.numReg!=null &&
              this.numReg.equals(other.getNumReg()))) &&
            ((this.respuesta==null && other.getRespuesta()==null) || 
             (this.respuesta!=null &&
              java.util.Arrays.equals(this.respuesta, other.getRespuesta()))) &&
            ((this.servicios==null && other.getServicios()==null) || 
             (this.servicios!=null &&
              this.servicios.equals(other.getServicios()))) &&
            ((this.tipoCliente==null && other.getTipoCliente()==null) || 
             (this.tipoCliente!=null &&
              this.tipoCliente.equals(other.getTipoCliente()))) &&
            ((this.tipoTV==null && other.getTipoTV()==null) || 
             (this.tipoTV!=null &&
              this.tipoTV.equals(other.getTipoTV())));
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
        if (getComunidad() != null) {
            _hashCode += getComunidad().hashCode();
        }
        if (getDivision() != null) {
            _hashCode += getDivision().hashCode();
        }
        if (getEstrato() != null) {
            _hashCode += getEstrato().hashCode();
        }
        if (getNumReg() != null) {
            _hashCode += getNumReg().hashCode();
        }
        if (getRespuesta() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRespuesta());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRespuesta(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getServicios() != null) {
            _hashCode += getServicios().hashCode();
        }
        if (getTipoCliente() != null) {
            _hashCode += getTipoCliente().hashCode();
        }
        if (getTipoTV() != null) {
            _hashCode += getTipoTV().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Schedule2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "schedule2"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("estrato");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estrato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numReg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numReg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("respuesta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "respuesta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicios");
        elemField.setXmlName(new javax.xml.namespace.QName("", "servicios"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoCliente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoCliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoTV");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoTV"));
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
