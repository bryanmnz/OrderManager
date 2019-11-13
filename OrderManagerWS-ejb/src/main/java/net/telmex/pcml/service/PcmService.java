/**
 * PcmService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.telmex.pcml.service;

public class PcmService  implements java.io.Serializable {
    private java.lang.String comunidad;

    private java.lang.String division;

    private java.math.BigDecimal numReg;

    private java.lang.String[] respuesta;

    private java.lang.String tarifa;

    public PcmService() {
    }

    public PcmService(
           java.lang.String comunidad,
           java.lang.String division,
           java.math.BigDecimal numReg,
           java.lang.String[] respuesta,
           java.lang.String tarifa) {
           this.comunidad = comunidad;
           this.division = division;
           this.numReg = numReg;
           this.respuesta = respuesta;
           this.tarifa = tarifa;
    }


    /**
     * Gets the comunidad value for this PcmService.
     * 
     * @return comunidad
     */
    public java.lang.String getComunidad() {
        return comunidad;
    }


    /**
     * Sets the comunidad value for this PcmService.
     * 
     * @param comunidad
     */
    public void setComunidad(java.lang.String comunidad) {
        this.comunidad = comunidad;
    }


    /**
     * Gets the division value for this PcmService.
     * 
     * @return division
     */
    public java.lang.String getDivision() {
        return division;
    }


    /**
     * Sets the division value for this PcmService.
     * 
     * @param division
     */
    public void setDivision(java.lang.String division) {
        this.division = division;
    }


    /**
     * Gets the numReg value for this PcmService.
     * 
     * @return numReg
     */
    public java.math.BigDecimal getNumReg() {
        return numReg;
    }


    /**
     * Sets the numReg value for this PcmService.
     * 
     * @param numReg
     */
    public void setNumReg(java.math.BigDecimal numReg) {
        this.numReg = numReg;
    }


    /**
     * Gets the respuesta value for this PcmService.
     * 
     * @return respuesta
     */
    public java.lang.String[] getRespuesta() {
        return respuesta;
    }


    /**
     * Sets the respuesta value for this PcmService.
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
     * Gets the tarifa value for this PcmService.
     * 
     * @return tarifa
     */
    public java.lang.String getTarifa() {
        return tarifa;
    }


    /**
     * Sets the tarifa value for this PcmService.
     * 
     * @param tarifa
     */
    public void setTarifa(java.lang.String tarifa) {
        this.tarifa = tarifa;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PcmService)) return false;
        PcmService other = (PcmService) obj;
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
            ((this.numReg==null && other.getNumReg()==null) || 
             (this.numReg!=null &&
              this.numReg.equals(other.getNumReg()))) &&
            ((this.respuesta==null && other.getRespuesta()==null) || 
             (this.respuesta!=null &&
              java.util.Arrays.equals(this.respuesta, other.getRespuesta()))) &&
            ((this.tarifa==null && other.getTarifa()==null) || 
             (this.tarifa!=null &&
              this.tarifa.equals(other.getTarifa())));
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
        if (getTarifa() != null) {
            _hashCode += getTarifa().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PcmService.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "pcmService"));
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
        elemField.setFieldName("tarifa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tarifa"));
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
