/**
 * TypeAppointmentResponseElement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package WS_SIEC_CancelarOrdenMGWInbound;

public class TypeAppointmentResponseElement  implements java.io.Serializable {
    private java.lang.String appt_number;

    private java.lang.Integer aid;

    private TypeReportMessageElement[] report;

    public TypeAppointmentResponseElement() {
    }

    public TypeAppointmentResponseElement(
           java.lang.String appt_number,
           java.lang.Integer aid,
           TypeReportMessageElement[] report) {
           this.appt_number = appt_number;
           this.aid = aid;
           this.report = report;
    }


    /**
     * Gets the appt_number value for this TypeAppointmentResponseElement.
     * 
     * @return appt_number
     */
    public java.lang.String getAppt_number() {
        return appt_number;
    }


    /**
     * Sets the appt_number value for this TypeAppointmentResponseElement.
     * 
     * @param appt_number
     */
    public void setAppt_number(java.lang.String appt_number) {
        this.appt_number = appt_number;
    }


    /**
     * Gets the aid value for this TypeAppointmentResponseElement.
     * 
     * @return aid
     */
    public java.lang.Integer getAid() {
        return aid;
    }


    /**
     * Sets the aid value for this TypeAppointmentResponseElement.
     * 
     * @param aid
     */
    public void setAid(java.lang.Integer aid) {
        this.aid = aid;
    }


    /**
     * Gets the report value for this TypeAppointmentResponseElement.
     * 
     * @return report
     */
    public TypeReportMessageElement[] getReport() {
        return report;
    }


    /**
     * Sets the report value for this TypeAppointmentResponseElement.
     * 
     * @param report
     */
    public void setReport(TypeReportMessageElement[] report) {
        this.report = report;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TypeAppointmentResponseElement)) return false;
        TypeAppointmentResponseElement other = (TypeAppointmentResponseElement) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.appt_number==null && other.getAppt_number()==null) || 
             (this.appt_number!=null &&
              this.appt_number.equals(other.getAppt_number()))) &&
            ((this.aid==null && other.getAid()==null) || 
             (this.aid!=null &&
              this.aid.equals(other.getAid()))) &&
            ((this.report==null && other.getReport()==null) || 
             (this.report!=null &&
              java.util.Arrays.equals(this.report, other.getReport())));
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
        if (getAppt_number() != null) {
            _hashCode += getAppt_number().hashCode();
        }
        if (getAid() != null) {
            _hashCode += getAid().hashCode();
        }
        if (getReport() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReport());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReport(), i);
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
        new org.apache.axis.description.TypeDesc(TypeAppointmentResponseElement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.amx.com.co/SIEC/ETAdirect/WS_SIEC_CancelarOrdenMGWInbound", "TypeAppointmentResponseElement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appt_number");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appt_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("report");
        elemField.setXmlName(new javax.xml.namespace.QName("", "report"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.amx.com.co/SIEC/ETAdirect/WS_SIEC_CancelarOrdenMGWInbound", "TypeReportMessageElement"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "message"));
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
