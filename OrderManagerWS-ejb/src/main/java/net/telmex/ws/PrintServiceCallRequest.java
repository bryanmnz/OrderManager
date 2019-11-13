/**
 * PrintServiceCallRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.telmex.ws;

public class PrintServiceCallRequest  extends net.telmex.ws.BasicRequest  implements java.io.Serializable {
    private java.lang.String aplicacion;

    private java.lang.String outputQueue;

    private java.lang.String proceso;

    private java.lang.String rolUsuario;

    private java.lang.String serviceCallNumber;

    private java.lang.String sesionUserId;

    private java.lang.String usuario;

    public PrintServiceCallRequest() {
    }

    public PrintServiceCallRequest(
           java.lang.String aplicacion,
           java.lang.String outputQueue,
           java.lang.String proceso,
           java.lang.String rolUsuario,
           java.lang.String serviceCallNumber,
           java.lang.String sesionUserId,
           java.lang.String usuario) {
        this.aplicacion = aplicacion;
        this.outputQueue = outputQueue;
        this.proceso = proceso;
        this.rolUsuario = rolUsuario;
        this.serviceCallNumber = serviceCallNumber;
        this.sesionUserId = sesionUserId;
        this.usuario = usuario;
    }


    /**
     * Gets the aplicacion value for this PrintServiceCallRequest.
     * 
     * @return aplicacion
     */
    public java.lang.String getAplicacion() {
        return aplicacion;
    }


    /**
     * Sets the aplicacion value for this PrintServiceCallRequest.
     * 
     * @param aplicacion
     */
    public void setAplicacion(java.lang.String aplicacion) {
        this.aplicacion = aplicacion;
    }


    /**
     * Gets the outputQueue value for this PrintServiceCallRequest.
     * 
     * @return outputQueue
     */
    public java.lang.String getOutputQueue() {
        return outputQueue;
    }


    /**
     * Sets the outputQueue value for this PrintServiceCallRequest.
     * 
     * @param outputQueue
     */
    public void setOutputQueue(java.lang.String outputQueue) {
        this.outputQueue = outputQueue;
    }


    /**
     * Gets the proceso value for this PrintServiceCallRequest.
     * 
     * @return proceso
     */
    public java.lang.String getProceso() {
        return proceso;
    }


    /**
     * Sets the proceso value for this PrintServiceCallRequest.
     * 
     * @param proceso
     */
    public void setProceso(java.lang.String proceso) {
        this.proceso = proceso;
    }


    /**
     * Gets the rolUsuario value for this PrintServiceCallRequest.
     * 
     * @return rolUsuario
     */
    public java.lang.String getRolUsuario() {
        return rolUsuario;
    }


    /**
     * Sets the rolUsuario value for this PrintServiceCallRequest.
     * 
     * @param rolUsuario
     */
    public void setRolUsuario(java.lang.String rolUsuario) {
        this.rolUsuario = rolUsuario;
    }


    /**
     * Gets the serviceCallNumber value for this PrintServiceCallRequest.
     * 
     * @return serviceCallNumber
     */
    public java.lang.String getServiceCallNumber() {
        return serviceCallNumber;
    }


    /**
     * Sets the serviceCallNumber value for this PrintServiceCallRequest.
     * 
     * @param serviceCallNumber
     */
    public void setServiceCallNumber(java.lang.String serviceCallNumber) {
        this.serviceCallNumber = serviceCallNumber;
    }


    /**
     * Gets the sesionUserId value for this PrintServiceCallRequest.
     * 
     * @return sesionUserId
     */
    public java.lang.String getSesionUserId() {
        return sesionUserId;
    }


    /**
     * Sets the sesionUserId value for this PrintServiceCallRequest.
     * 
     * @param sesionUserId
     */
    public void setSesionUserId(java.lang.String sesionUserId) {
        this.sesionUserId = sesionUserId;
    }


    /**
     * Gets the usuario value for this PrintServiceCallRequest.
     * 
     * @return usuario
     */
    public java.lang.String getUsuario() {
        return usuario;
    }


    /**
     * Sets the usuario value for this PrintServiceCallRequest.
     * 
     * @param usuario
     */
    public void setUsuario(java.lang.String usuario) {
        this.usuario = usuario;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PrintServiceCallRequest)) return false;
        PrintServiceCallRequest other = (PrintServiceCallRequest) obj;
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
            ((this.outputQueue==null && other.getOutputQueue()==null) || 
             (this.outputQueue!=null &&
              this.outputQueue.equals(other.getOutputQueue()))) &&
            ((this.proceso==null && other.getProceso()==null) || 
             (this.proceso!=null &&
              this.proceso.equals(other.getProceso()))) &&
            ((this.rolUsuario==null && other.getRolUsuario()==null) || 
             (this.rolUsuario!=null &&
              this.rolUsuario.equals(other.getRolUsuario()))) &&
            ((this.serviceCallNumber==null && other.getServiceCallNumber()==null) || 
             (this.serviceCallNumber!=null &&
              this.serviceCallNumber.equals(other.getServiceCallNumber()))) &&
            ((this.sesionUserId==null && other.getSesionUserId()==null) || 
             (this.sesionUserId!=null &&
              this.sesionUserId.equals(other.getSesionUserId()))) &&
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
        if (getOutputQueue() != null) {
            _hashCode += getOutputQueue().hashCode();
        }
        if (getProceso() != null) {
            _hashCode += getProceso().hashCode();
        }
        if (getRolUsuario() != null) {
            _hashCode += getRolUsuario().hashCode();
        }
        if (getServiceCallNumber() != null) {
            _hashCode += getServiceCallNumber().hashCode();
        }
        if (getSesionUserId() != null) {
            _hashCode += getSesionUserId().hashCode();
        }
        if (getUsuario() != null) {
            _hashCode += getUsuario().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PrintServiceCallRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.telmex.net/", "printServiceCallRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aplicacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aplicacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outputQueue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outputQueue"));
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
        elemField.setFieldName("serviceCallNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceCallNumber"));
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
