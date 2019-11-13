/**
 * QuitarServicio.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.telmex.pcml.service;

public class QuitarServicio  implements java.io.Serializable {
    private java.lang.String asesorId;

    private java.lang.String cuenta;

    private java.lang.String errorDescription;

    private java.lang.String errorStatus;

    private java.lang.String fechaOT;

    private java.lang.String notas;

    private java.lang.String servicioId;

    private java.lang.String tarifa;

    private java.lang.String usuario;

    public QuitarServicio() {
    }

    public QuitarServicio(
           java.lang.String asesorId,
           java.lang.String cuenta,
           java.lang.String errorDescription,
           java.lang.String errorStatus,
           java.lang.String fechaOT,
           java.lang.String notas,
           java.lang.String servicioId,
           java.lang.String tarifa,
           java.lang.String usuario) {
           this.asesorId = asesorId;
           this.cuenta = cuenta;
           this.errorDescription = errorDescription;
           this.errorStatus = errorStatus;
           this.fechaOT = fechaOT;
           this.notas = notas;
           this.servicioId = servicioId;
           this.tarifa = tarifa;
           this.usuario = usuario;
    }


    /**
     * Gets the asesorId value for this QuitarServicio.
     * 
     * @return asesorId
     */
    public java.lang.String getAsesorId() {
        return asesorId;
    }


    /**
     * Sets the asesorId value for this QuitarServicio.
     * 
     * @param asesorId
     */
    public void setAsesorId(java.lang.String asesorId) {
        this.asesorId = asesorId;
    }


    /**
     * Gets the cuenta value for this QuitarServicio.
     * 
     * @return cuenta
     */
    public java.lang.String getCuenta() {
        return cuenta;
    }


    /**
     * Sets the cuenta value for this QuitarServicio.
     * 
     * @param cuenta
     */
    public void setCuenta(java.lang.String cuenta) {
        this.cuenta = cuenta;
    }


    /**
     * Gets the errorDescription value for this QuitarServicio.
     * 
     * @return errorDescription
     */
    public java.lang.String getErrorDescription() {
        return errorDescription;
    }


    /**
     * Sets the errorDescription value for this QuitarServicio.
     * 
     * @param errorDescription
     */
    public void setErrorDescription(java.lang.String errorDescription) {
        this.errorDescription = errorDescription;
    }


    /**
     * Gets the errorStatus value for this QuitarServicio.
     * 
     * @return errorStatus
     */
    public java.lang.String getErrorStatus() {
        return errorStatus;
    }


    /**
     * Sets the errorStatus value for this QuitarServicio.
     * 
     * @param errorStatus
     */
    public void setErrorStatus(java.lang.String errorStatus) {
        this.errorStatus = errorStatus;
    }


    /**
     * Gets the fechaOT value for this QuitarServicio.
     * 
     * @return fechaOT
     */
    public java.lang.String getFechaOT() {
        return fechaOT;
    }


    /**
     * Sets the fechaOT value for this QuitarServicio.
     * 
     * @param fechaOT
     */
    public void setFechaOT(java.lang.String fechaOT) {
        this.fechaOT = fechaOT;
    }


    /**
     * Gets the notas value for this QuitarServicio.
     * 
     * @return notas
     */
    public java.lang.String getNotas() {
        return notas;
    }


    /**
     * Sets the notas value for this QuitarServicio.
     * 
     * @param notas
     */
    public void setNotas(java.lang.String notas) {
        this.notas = notas;
    }


    /**
     * Gets the servicioId value for this QuitarServicio.
     * 
     * @return servicioId
     */
    public java.lang.String getServicioId() {
        return servicioId;
    }


    /**
     * Sets the servicioId value for this QuitarServicio.
     * 
     * @param servicioId
     */
    public void setServicioId(java.lang.String servicioId) {
        this.servicioId = servicioId;
    }


    /**
     * Gets the tarifa value for this QuitarServicio.
     * 
     * @return tarifa
     */
    public java.lang.String getTarifa() {
        return tarifa;
    }


    /**
     * Sets the tarifa value for this QuitarServicio.
     * 
     * @param tarifa
     */
    public void setTarifa(java.lang.String tarifa) {
        this.tarifa = tarifa;
    }


    /**
     * Gets the usuario value for this QuitarServicio.
     * 
     * @return usuario
     */
    public java.lang.String getUsuario() {
        return usuario;
    }


    /**
     * Sets the usuario value for this QuitarServicio.
     * 
     * @param usuario
     */
    public void setUsuario(java.lang.String usuario) {
        this.usuario = usuario;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QuitarServicio)) return false;
        QuitarServicio other = (QuitarServicio) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.asesorId==null && other.getAsesorId()==null) || 
             (this.asesorId!=null &&
              this.asesorId.equals(other.getAsesorId()))) &&
            ((this.cuenta==null && other.getCuenta()==null) || 
             (this.cuenta!=null &&
              this.cuenta.equals(other.getCuenta()))) &&
            ((this.errorDescription==null && other.getErrorDescription()==null) || 
             (this.errorDescription!=null &&
              this.errorDescription.equals(other.getErrorDescription()))) &&
            ((this.errorStatus==null && other.getErrorStatus()==null) || 
             (this.errorStatus!=null &&
              this.errorStatus.equals(other.getErrorStatus()))) &&
            ((this.fechaOT==null && other.getFechaOT()==null) || 
             (this.fechaOT!=null &&
              this.fechaOT.equals(other.getFechaOT()))) &&
            ((this.notas==null && other.getNotas()==null) || 
             (this.notas!=null &&
              this.notas.equals(other.getNotas()))) &&
            ((this.servicioId==null && other.getServicioId()==null) || 
             (this.servicioId!=null &&
              this.servicioId.equals(other.getServicioId()))) &&
            ((this.tarifa==null && other.getTarifa()==null) || 
             (this.tarifa!=null &&
              this.tarifa.equals(other.getTarifa()))) &&
            ((this.usuario==null && other.getUsuario()==null) || 
             (this.usuario!=null &&
              this.usuario.equals(other.getUsuario())));
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
        if (getAsesorId() != null) {
            _hashCode += getAsesorId().hashCode();
        }
        if (getCuenta() != null) {
            _hashCode += getCuenta().hashCode();
        }
        if (getErrorDescription() != null) {
            _hashCode += getErrorDescription().hashCode();
        }
        if (getErrorStatus() != null) {
            _hashCode += getErrorStatus().hashCode();
        }
        if (getFechaOT() != null) {
            _hashCode += getFechaOT().hashCode();
        }
        if (getNotas() != null) {
            _hashCode += getNotas().hashCode();
        }
        if (getServicioId() != null) {
            _hashCode += getServicioId().hashCode();
        }
        if (getTarifa() != null) {
            _hashCode += getTarifa().hashCode();
        }
        if (getUsuario() != null) {
            _hashCode += getUsuario().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QuitarServicio.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "quitarServicio"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("asesorId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "asesorId"));
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
        elemField.setFieldName("errorDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaOT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechaOT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notas");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicioId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "servicioId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tarifa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tarifa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usuario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usuario"));
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
