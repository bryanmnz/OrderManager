/**
 * TypeCommandResponseElement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package WS_SIEC_CancelarOrdenMGWInbound;

public class TypeCommandResponseElement  implements java.io.Serializable {
    private java.lang.String date;

    private java.lang.String type;

    private TypeAppointmentResponseElement appointment;

    public TypeCommandResponseElement() {
    }

    public TypeCommandResponseElement(
           java.lang.String date,
           java.lang.String type,
           TypeAppointmentResponseElement appointment) {
           this.date = date;
           this.type = type;
           this.appointment = appointment;
    }


    /**
     * Gets the date value for this TypeCommandResponseElement.
     * 
     * @return date
     */
    public java.lang.String getDate() {
        return date;
    }


    /**
     * Sets the date value for this TypeCommandResponseElement.
     * 
     * @param date
     */
    public void setDate(java.lang.String date) {
        this.date = date;
    }


    /**
     * Gets the type value for this TypeCommandResponseElement.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this TypeCommandResponseElement.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the appointment value for this TypeCommandResponseElement.
     * 
     * @return appointment
     */
    public TypeAppointmentResponseElement getAppointment() {
        return appointment;
    }


    /**
     * Sets the appointment value for this TypeCommandResponseElement.
     * 
     * @param appointment
     */
    public void setAppointment(TypeAppointmentResponseElement appointment) {
        this.appointment = appointment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TypeCommandResponseElement)) return false;
        TypeCommandResponseElement other = (TypeCommandResponseElement) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.appointment==null && other.getAppointment()==null) || 
             (this.appointment!=null &&
              this.appointment.equals(other.getAppointment())));
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
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getAppointment() != null) {
            _hashCode += getAppointment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TypeCommandResponseElement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.amx.com.co/SIEC/ETAdirect/WS_SIEC_CancelarOrdenMGWInbound", "TypeCommandResponseElement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appointment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appointment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.amx.com.co/SIEC/ETAdirect/WS_SIEC_CancelarOrdenMGWInbound", "TypeAppointmentResponseElement"));
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
