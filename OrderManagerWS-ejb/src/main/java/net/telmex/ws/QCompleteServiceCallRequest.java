/**
 * QCompleteServiceCallRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.telmex.ws;

public class QCompleteServiceCallRequest  extends net.telmex.ws.BasicRequest  implements java.io.Serializable {
    private java.lang.String aplicacion;

    private java.lang.String comments;

    private java.lang.String dateCompletedCancelled;

    private java.lang.String proceso;

    private java.lang.String rolUsuario;

    private java.lang.String serviceCallNumber;

    private java.lang.String sesionUserId;

    private java.lang.String technician;

    private java.lang.String timeCompletedCancelled;

    private java.lang.String usuario;

    private java.lang.String worksPerformedCodes;

    public QCompleteServiceCallRequest() {
    }

    public QCompleteServiceCallRequest(
           java.lang.String aplicacion,
           java.lang.String comments,
           java.lang.String dateCompletedCancelled,
           java.lang.String proceso,
           java.lang.String rolUsuario,
           java.lang.String serviceCallNumber,
           java.lang.String sesionUserId,
           java.lang.String technician,
           java.lang.String timeCompletedCancelled,
           java.lang.String usuario,
           java.lang.String worksPerformedCodes) {
        this.aplicacion = aplicacion;
        this.comments = comments;
        this.dateCompletedCancelled = dateCompletedCancelled;
        this.proceso = proceso;
        this.rolUsuario = rolUsuario;
        this.serviceCallNumber = serviceCallNumber;
        this.sesionUserId = sesionUserId;
        this.technician = technician;
        this.timeCompletedCancelled = timeCompletedCancelled;
        this.usuario = usuario;
        this.worksPerformedCodes = worksPerformedCodes;
    }


    /**
     * Gets the aplicacion value for this QCompleteServiceCallRequest.
     * 
     * @return aplicacion
     */
    public java.lang.String getAplicacion() {
        return aplicacion;
    }


    /**
     * Sets the aplicacion value for this QCompleteServiceCallRequest.
     * 
     * @param aplicacion
     */
    public void setAplicacion(java.lang.String aplicacion) {
        this.aplicacion = aplicacion;
    }


    /**
     * Gets the comments value for this QCompleteServiceCallRequest.
     * 
     * @return comments
     */
    public java.lang.String getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this QCompleteServiceCallRequest.
     * 
     * @param comments
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }


    /**
     * Gets the dateCompletedCancelled value for this QCompleteServiceCallRequest.
     * 
     * @return dateCompletedCancelled
     */
    public java.lang.String getDateCompletedCancelled() {
        return dateCompletedCancelled;
    }


    /**
     * Sets the dateCompletedCancelled value for this QCompleteServiceCallRequest.
     * 
     * @param dateCompletedCancelled
     */
    public void setDateCompletedCancelled(java.lang.String dateCompletedCancelled) {
        this.dateCompletedCancelled = dateCompletedCancelled;
    }


    /**
     * Gets the proceso value for this QCompleteServiceCallRequest.
     * 
     * @return proceso
     */
    public java.lang.String getProceso() {
        return proceso;
    }


    /**
     * Sets the proceso value for this QCompleteServiceCallRequest.
     * 
     * @param proceso
     */
    public void setProceso(java.lang.String proceso) {
        this.proceso = proceso;
    }


    /**
     * Gets the rolUsuario value for this QCompleteServiceCallRequest.
     * 
     * @return rolUsuario
     */
    public java.lang.String getRolUsuario() {
        return rolUsuario;
    }


    /**
     * Sets the rolUsuario value for this QCompleteServiceCallRequest.
     * 
     * @param rolUsuario
     */
    public void setRolUsuario(java.lang.String rolUsuario) {
        this.rolUsuario = rolUsuario;
    }


    /**
     * Gets the serviceCallNumber value for this QCompleteServiceCallRequest.
     * 
     * @return serviceCallNumber
     */
    public java.lang.String getServiceCallNumber() {
        return serviceCallNumber;
    }


    /**
     * Sets the serviceCallNumber value for this QCompleteServiceCallRequest.
     * 
     * @param serviceCallNumber
     */
    public void setServiceCallNumber(java.lang.String serviceCallNumber) {
        this.serviceCallNumber = serviceCallNumber;
    }


    /**
     * Gets the sesionUserId value for this QCompleteServiceCallRequest.
     * 
     * @return sesionUserId
     */
    public java.lang.String getSesionUserId() {
        return sesionUserId;
    }


    /**
     * Sets the sesionUserId value for this QCompleteServiceCallRequest.
     * 
     * @param sesionUserId
     */
    public void setSesionUserId(java.lang.String sesionUserId) {
        this.sesionUserId = sesionUserId;
    }


    /**
     * Gets the technician value for this QCompleteServiceCallRequest.
     * 
     * @return technician
     */
    public java.lang.String getTechnician() {
        return technician;
    }


    /**
     * Sets the technician value for this QCompleteServiceCallRequest.
     * 
     * @param technician
     */
    public void setTechnician(java.lang.String technician) {
        this.technician = technician;
    }


    /**
     * Gets the timeCompletedCancelled value for this QCompleteServiceCallRequest.
     * 
     * @return timeCompletedCancelled
     */
    public java.lang.String getTimeCompletedCancelled() {
        return timeCompletedCancelled;
    }


    /**
     * Sets the timeCompletedCancelled value for this QCompleteServiceCallRequest.
     * 
     * @param timeCompletedCancelled
     */
    public void setTimeCompletedCancelled(java.lang.String timeCompletedCancelled) {
        this.timeCompletedCancelled = timeCompletedCancelled;
    }


    /**
     * Gets the usuario value for this QCompleteServiceCallRequest.
     * 
     * @return usuario
     */
    public java.lang.String getUsuario() {
        return usuario;
    }


    /**
     * Sets the usuario value for this QCompleteServiceCallRequest.
     * 
     * @param usuario
     */
    public void setUsuario(java.lang.String usuario) {
        this.usuario = usuario;
    }


    /**
     * Gets the worksPerformedCodes value for this QCompleteServiceCallRequest.
     * 
     * @return worksPerformedCodes
     */
    public java.lang.String getWorksPerformedCodes() {
        return worksPerformedCodes;
    }


    /**
     * Sets the worksPerformedCodes value for this QCompleteServiceCallRequest.
     * 
     * @param worksPerformedCodes
     */
    public void setWorksPerformedCodes(java.lang.String worksPerformedCodes) {
        this.worksPerformedCodes = worksPerformedCodes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QCompleteServiceCallRequest)) return false;
        QCompleteServiceCallRequest other = (QCompleteServiceCallRequest) obj;
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
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments()))) &&
            ((this.dateCompletedCancelled==null && other.getDateCompletedCancelled()==null) || 
             (this.dateCompletedCancelled!=null &&
              this.dateCompletedCancelled.equals(other.getDateCompletedCancelled()))) &&
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
            ((this.technician==null && other.getTechnician()==null) || 
             (this.technician!=null &&
              this.technician.equals(other.getTechnician()))) &&
            ((this.timeCompletedCancelled==null && other.getTimeCompletedCancelled()==null) || 
             (this.timeCompletedCancelled!=null &&
              this.timeCompletedCancelled.equals(other.getTimeCompletedCancelled()))) &&
            ((this.usuario==null && other.getUsuario()==null) || 
             (this.usuario!=null &&
              this.usuario.equals(other.getUsuario()))) &&
            ((this.worksPerformedCodes==null && other.getWorksPerformedCodes()==null) || 
             (this.worksPerformedCodes!=null &&
              this.worksPerformedCodes.equals(other.getWorksPerformedCodes())));
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
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        if (getDateCompletedCancelled() != null) {
            _hashCode += getDateCompletedCancelled().hashCode();
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
        if (getTechnician() != null) {
            _hashCode += getTechnician().hashCode();
        }
        if (getTimeCompletedCancelled() != null) {
            _hashCode += getTimeCompletedCancelled().hashCode();
        }
        if (getUsuario() != null) {
            _hashCode += getUsuario().hashCode();
        }
        if (getWorksPerformedCodes() != null) {
            _hashCode += getWorksPerformedCodes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QCompleteServiceCallRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.telmex.net/", "qCompleteServiceCallRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aplicacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aplicacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("", "comments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateCompletedCancelled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateCompletedCancelled"));
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
        elemField.setFieldName("technician");
        elemField.setXmlName(new javax.xml.namespace.QName("", "technician"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeCompletedCancelled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeCompletedCancelled"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("worksPerformedCodes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "worksPerformedCodes"));
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
