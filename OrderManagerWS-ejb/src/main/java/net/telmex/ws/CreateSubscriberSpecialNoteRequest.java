/**
 * CreateSubscriberSpecialNoteRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.telmex.ws;

public class CreateSubscriberSpecialNoteRequest  extends net.telmex.ws.BasicRequest  implements java.io.Serializable {
    private java.lang.String aplicacion;

    private java.lang.String datePaymentPromised;

    private java.lang.String description;

    private java.lang.String lines;

    private java.lang.String notePriority;

    private java.lang.String noteType;

    private java.lang.String notesExpiryDate;

    private java.lang.String proceso;

    private java.lang.String reminderDate;

    private java.lang.String rolUsuario;

    private java.lang.String sesionUserId;

    private java.lang.String subscriberAccount;

    private java.lang.String usuario;

    public CreateSubscriberSpecialNoteRequest() {
    }

    public CreateSubscriberSpecialNoteRequest(
           java.lang.String aplicacion,
           java.lang.String datePaymentPromised,
           java.lang.String description,
           java.lang.String lines,
           java.lang.String notePriority,
           java.lang.String noteType,
           java.lang.String notesExpiryDate,
           java.lang.String proceso,
           java.lang.String reminderDate,
           java.lang.String rolUsuario,
           java.lang.String sesionUserId,
           java.lang.String subscriberAccount,
           java.lang.String usuario) {
        this.aplicacion = aplicacion;
        this.datePaymentPromised = datePaymentPromised;
        this.description = description;
        this.lines = lines;
        this.notePriority = notePriority;
        this.noteType = noteType;
        this.notesExpiryDate = notesExpiryDate;
        this.proceso = proceso;
        this.reminderDate = reminderDate;
        this.rolUsuario = rolUsuario;
        this.sesionUserId = sesionUserId;
        this.subscriberAccount = subscriberAccount;
        this.usuario = usuario;
    }


    /**
     * Gets the aplicacion value for this CreateSubscriberSpecialNoteRequest.
     * 
     * @return aplicacion
     */
    public java.lang.String getAplicacion() {
        return aplicacion;
    }


    /**
     * Sets the aplicacion value for this CreateSubscriberSpecialNoteRequest.
     * 
     * @param aplicacion
     */
    public void setAplicacion(java.lang.String aplicacion) {
        this.aplicacion = aplicacion;
    }


    /**
     * Gets the datePaymentPromised value for this CreateSubscriberSpecialNoteRequest.
     * 
     * @return datePaymentPromised
     */
    public java.lang.String getDatePaymentPromised() {
        return datePaymentPromised;
    }


    /**
     * Sets the datePaymentPromised value for this CreateSubscriberSpecialNoteRequest.
     * 
     * @param datePaymentPromised
     */
    public void setDatePaymentPromised(java.lang.String datePaymentPromised) {
        this.datePaymentPromised = datePaymentPromised;
    }


    /**
     * Gets the description value for this CreateSubscriberSpecialNoteRequest.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CreateSubscriberSpecialNoteRequest.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the lines value for this CreateSubscriberSpecialNoteRequest.
     * 
     * @return lines
     */
    public java.lang.String getLines() {
        return lines;
    }


    /**
     * Sets the lines value for this CreateSubscriberSpecialNoteRequest.
     * 
     * @param lines
     */
    public void setLines(java.lang.String lines) {
        this.lines = lines;
    }


    /**
     * Gets the notePriority value for this CreateSubscriberSpecialNoteRequest.
     * 
     * @return notePriority
     */
    public java.lang.String getNotePriority() {
        return notePriority;
    }


    /**
     * Sets the notePriority value for this CreateSubscriberSpecialNoteRequest.
     * 
     * @param notePriority
     */
    public void setNotePriority(java.lang.String notePriority) {
        this.notePriority = notePriority;
    }


    /**
     * Gets the noteType value for this CreateSubscriberSpecialNoteRequest.
     * 
     * @return noteType
     */
    public java.lang.String getNoteType() {
        return noteType;
    }


    /**
     * Sets the noteType value for this CreateSubscriberSpecialNoteRequest.
     * 
     * @param noteType
     */
    public void setNoteType(java.lang.String noteType) {
        this.noteType = noteType;
    }


    /**
     * Gets the notesExpiryDate value for this CreateSubscriberSpecialNoteRequest.
     * 
     * @return notesExpiryDate
     */
    public java.lang.String getNotesExpiryDate() {
        return notesExpiryDate;
    }


    /**
     * Sets the notesExpiryDate value for this CreateSubscriberSpecialNoteRequest.
     * 
     * @param notesExpiryDate
     */
    public void setNotesExpiryDate(java.lang.String notesExpiryDate) {
        this.notesExpiryDate = notesExpiryDate;
    }


    /**
     * Gets the proceso value for this CreateSubscriberSpecialNoteRequest.
     * 
     * @return proceso
     */
    public java.lang.String getProceso() {
        return proceso;
    }


    /**
     * Sets the proceso value for this CreateSubscriberSpecialNoteRequest.
     * 
     * @param proceso
     */
    public void setProceso(java.lang.String proceso) {
        this.proceso = proceso;
    }


    /**
     * Gets the reminderDate value for this CreateSubscriberSpecialNoteRequest.
     * 
     * @return reminderDate
     */
    public java.lang.String getReminderDate() {
        return reminderDate;
    }


    /**
     * Sets the reminderDate value for this CreateSubscriberSpecialNoteRequest.
     * 
     * @param reminderDate
     */
    public void setReminderDate(java.lang.String reminderDate) {
        this.reminderDate = reminderDate;
    }


    /**
     * Gets the rolUsuario value for this CreateSubscriberSpecialNoteRequest.
     * 
     * @return rolUsuario
     */
    public java.lang.String getRolUsuario() {
        return rolUsuario;
    }


    /**
     * Sets the rolUsuario value for this CreateSubscriberSpecialNoteRequest.
     * 
     * @param rolUsuario
     */
    public void setRolUsuario(java.lang.String rolUsuario) {
        this.rolUsuario = rolUsuario;
    }


    /**
     * Gets the sesionUserId value for this CreateSubscriberSpecialNoteRequest.
     * 
     * @return sesionUserId
     */
    public java.lang.String getSesionUserId() {
        return sesionUserId;
    }


    /**
     * Sets the sesionUserId value for this CreateSubscriberSpecialNoteRequest.
     * 
     * @param sesionUserId
     */
    public void setSesionUserId(java.lang.String sesionUserId) {
        this.sesionUserId = sesionUserId;
    }


    /**
     * Gets the subscriberAccount value for this CreateSubscriberSpecialNoteRequest.
     * 
     * @return subscriberAccount
     */
    public java.lang.String getSubscriberAccount() {
        return subscriberAccount;
    }


    /**
     * Sets the subscriberAccount value for this CreateSubscriberSpecialNoteRequest.
     * 
     * @param subscriberAccount
     */
    public void setSubscriberAccount(java.lang.String subscriberAccount) {
        this.subscriberAccount = subscriberAccount;
    }


    /**
     * Gets the usuario value for this CreateSubscriberSpecialNoteRequest.
     * 
     * @return usuario
     */
    public java.lang.String getUsuario() {
        return usuario;
    }


    /**
     * Sets the usuario value for this CreateSubscriberSpecialNoteRequest.
     * 
     * @param usuario
     */
    public void setUsuario(java.lang.String usuario) {
        this.usuario = usuario;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateSubscriberSpecialNoteRequest)) return false;
        CreateSubscriberSpecialNoteRequest other = (CreateSubscriberSpecialNoteRequest) obj;
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
            ((this.datePaymentPromised==null && other.getDatePaymentPromised()==null) || 
             (this.datePaymentPromised!=null &&
              this.datePaymentPromised.equals(other.getDatePaymentPromised()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.lines==null && other.getLines()==null) || 
             (this.lines!=null &&
              this.lines.equals(other.getLines()))) &&
            ((this.notePriority==null && other.getNotePriority()==null) || 
             (this.notePriority!=null &&
              this.notePriority.equals(other.getNotePriority()))) &&
            ((this.noteType==null && other.getNoteType()==null) || 
             (this.noteType!=null &&
              this.noteType.equals(other.getNoteType()))) &&
            ((this.notesExpiryDate==null && other.getNotesExpiryDate()==null) || 
             (this.notesExpiryDate!=null &&
              this.notesExpiryDate.equals(other.getNotesExpiryDate()))) &&
            ((this.proceso==null && other.getProceso()==null) || 
             (this.proceso!=null &&
              this.proceso.equals(other.getProceso()))) &&
            ((this.reminderDate==null && other.getReminderDate()==null) || 
             (this.reminderDate!=null &&
              this.reminderDate.equals(other.getReminderDate()))) &&
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
        if (getDatePaymentPromised() != null) {
            _hashCode += getDatePaymentPromised().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getLines() != null) {
            _hashCode += getLines().hashCode();
        }
        if (getNotePriority() != null) {
            _hashCode += getNotePriority().hashCode();
        }
        if (getNoteType() != null) {
            _hashCode += getNoteType().hashCode();
        }
        if (getNotesExpiryDate() != null) {
            _hashCode += getNotesExpiryDate().hashCode();
        }
        if (getProceso() != null) {
            _hashCode += getProceso().hashCode();
        }
        if (getReminderDate() != null) {
            _hashCode += getReminderDate().hashCode();
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
        new org.apache.axis.description.TypeDesc(CreateSubscriberSpecialNoteRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.telmex.net/", "createSubscriberSpecialNoteRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aplicacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aplicacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datePaymentPromised");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datePaymentPromised"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
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
        elemField.setFieldName("notePriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notePriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noteType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "noteType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notesExpiryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notesExpiryDate"));
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
        elemField.setFieldName("reminderDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reminderDate"));
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
