/**
 * UnitDirectionRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.telmex.ws;

public class UnitDirectionRequest  extends net.telmex.ws.BasicRequest  implements java.io.Serializable {
    private java.lang.String aplicacion;

    private java.lang.String lineNumber;

    private java.lang.String lines;

    private java.lang.String proceso;

    private java.lang.String rolUsuario;

    private java.lang.String sesionUserId;

    private java.lang.String subscriberAccount;

    private java.lang.String usuario;

    public UnitDirectionRequest() {
    }

    public UnitDirectionRequest(
           java.lang.String aplicacion,
           java.lang.String lineNumber,
           java.lang.String lines,
           java.lang.String proceso,
           java.lang.String rolUsuario,
           java.lang.String sesionUserId,
           java.lang.String subscriberAccount,
           java.lang.String usuario) {
        this.aplicacion = aplicacion;
        this.lineNumber = lineNumber;
        this.lines = lines;
        this.proceso = proceso;
        this.rolUsuario = rolUsuario;
        this.sesionUserId = sesionUserId;
        this.subscriberAccount = subscriberAccount;
        this.usuario = usuario;
    }


    /**
     * Gets the aplicacion value for this UnitDirectionRequest.
     * 
     * @return aplicacion
     */
    public java.lang.String getAplicacion() {
        return aplicacion;
    }


    /**
     * Sets the aplicacion value for this UnitDirectionRequest.
     * 
     * @param aplicacion
     */
    public void setAplicacion(java.lang.String aplicacion) {
        this.aplicacion = aplicacion;
    }


    /**
     * Gets the lineNumber value for this UnitDirectionRequest.
     * 
     * @return lineNumber
     */
    public java.lang.String getLineNumber() {
        return lineNumber;
    }


    /**
     * Sets the lineNumber value for this UnitDirectionRequest.
     * 
     * @param lineNumber
     */
    public void setLineNumber(java.lang.String lineNumber) {
        this.lineNumber = lineNumber;
    }


    /**
     * Gets the lines value for this UnitDirectionRequest.
     * 
     * @return lines
     */
    public java.lang.String getLines() {
        return lines;
    }


    /**
     * Sets the lines value for this UnitDirectionRequest.
     * 
     * @param lines
     */
    public void setLines(java.lang.String lines) {
        this.lines = lines;
    }


    /**
     * Gets the proceso value for this UnitDirectionRequest.
     * 
     * @return proceso
     */
    public java.lang.String getProceso() {
        return proceso;
    }


    /**
     * Sets the proceso value for this UnitDirectionRequest.
     * 
     * @param proceso
     */
    public void setProceso(java.lang.String proceso) {
        this.proceso = proceso;
    }


    /**
     * Gets the rolUsuario value for this UnitDirectionRequest.
     * 
     * @return rolUsuario
     */
    public java.lang.String getRolUsuario() {
        return rolUsuario;
    }


    /**
     * Sets the rolUsuario value for this UnitDirectionRequest.
     * 
     * @param rolUsuario
     */
    public void setRolUsuario(java.lang.String rolUsuario) {
        this.rolUsuario = rolUsuario;
    }


    /**
     * Gets the sesionUserId value for this UnitDirectionRequest.
     * 
     * @return sesionUserId
     */
    public java.lang.String getSesionUserId() {
        return sesionUserId;
    }


    /**
     * Sets the sesionUserId value for this UnitDirectionRequest.
     * 
     * @param sesionUserId
     */
    public void setSesionUserId(java.lang.String sesionUserId) {
        this.sesionUserId = sesionUserId;
    }


    /**
     * Gets the subscriberAccount value for this UnitDirectionRequest.
     * 
     * @return subscriberAccount
     */
    public java.lang.String getSubscriberAccount() {
        return subscriberAccount;
    }


    /**
     * Sets the subscriberAccount value for this UnitDirectionRequest.
     * 
     * @param subscriberAccount
     */
    public void setSubscriberAccount(java.lang.String subscriberAccount) {
        this.subscriberAccount = subscriberAccount;
    }


    /**
     * Gets the usuario value for this UnitDirectionRequest.
     * 
     * @return usuario
     */
    public java.lang.String getUsuario() {
        return usuario;
    }


    /**
     * Sets the usuario value for this UnitDirectionRequest.
     * 
     * @param usuario
     */
    public void setUsuario(java.lang.String usuario) {
        this.usuario = usuario;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UnitDirectionRequest)) return false;
        UnitDirectionRequest other = (UnitDirectionRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.aplicacion==null && other.getAplicacion()==null) || 
             (this.aplicacion!=null &&
              this.aplicacion.equals(other.getAplicacion()))) &&
            ((this.lineNumber==null && other.getLineNumber()==null) || 
             (this.lineNumber!=null &&
              this.lineNumber.equals(other.getLineNumber()))) &&
            ((this.lines==null && other.getLines()==null) || 
             (this.lines!=null &&
              this.lines.equals(other.getLines()))) &&
            ((this.proceso==null && other.getProceso()==null) || 
             (this.proceso!=null &&
              this.proceso.equals(other.getProceso()))) &&
            ((this.rolUsuario==null && other.getRolUsuario()==null) || 
             (this.rolUsuario!=null &&
              this.rolUsuario.equals(other.getRolUsuario()))) &&
            ((this.sesionUserId==null && other.getSesionUserId()==null) || 
             (this.sesionUserId!=null &&
              this.sesionUserId.equals(other.getSesionUserId()))) &&
            ((this.subscriberAccount==null && other.getSubscriberAccount()==null) || 
             (this.subscriberAccount!=null &&
              this.subscriberAccount.equals(other.getSubscriberAccount()))) &&
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
        int _hashCode = super.hashCode();
        if (getAplicacion() != null) {
            _hashCode += getAplicacion().hashCode();
        }
        if (getLineNumber() != null) {
            _hashCode += getLineNumber().hashCode();
        }
        if (getLines() != null) {
            _hashCode += getLines().hashCode();
        }
        if (getProceso() != null) {
            _hashCode += getProceso().hashCode();
        }
        if (getRolUsuario() != null) {
            _hashCode += getRolUsuario().hashCode();
        }
        if (getSesionUserId() != null) {
            _hashCode += getSesionUserId().hashCode();
        }
        if (getSubscriberAccount() != null) {
            _hashCode += getSubscriberAccount().hashCode();
        }
        if (getUsuario() != null) {
            _hashCode += getUsuario().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UnitDirectionRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.telmex.net/", "unitDirectionRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aplicacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aplicacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lineNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lines");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lines"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proceso");
        elemField.setXmlName(new javax.xml.namespace.QName("", "proceso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rolUsuario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rolUsuario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sesionUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sesionUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subscriberAccount"));
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
