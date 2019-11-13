/**
 * CreateSubscriberSpecialNoteResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.telmex.ws;

public class CreateSubscriberSpecialNoteResponse  extends net.telmex.ws.ResponseMessage  implements java.io.Serializable {
    private java.lang.String noteNumberAssigned;

    public CreateSubscriberSpecialNoteResponse() {
    }

    public CreateSubscriberSpecialNoteResponse(
           java.lang.String messageText,
           java.lang.String messageType,
           java.lang.String subscriberAccount,
           java.lang.String workOrderNo,
           java.lang.String noteNumberAssigned) {
        super(
            messageText,
            messageType,
            subscriberAccount,
            workOrderNo);
        this.noteNumberAssigned = noteNumberAssigned;
    }


    /**
     * Gets the noteNumberAssigned value for this CreateSubscriberSpecialNoteResponse.
     * 
     * @return noteNumberAssigned
     */
    public java.lang.String getNoteNumberAssigned() {
        return noteNumberAssigned;
    }


    /**
     * Sets the noteNumberAssigned value for this CreateSubscriberSpecialNoteResponse.
     * 
     * @param noteNumberAssigned
     */
    public void setNoteNumberAssigned(java.lang.String noteNumberAssigned) {
        this.noteNumberAssigned = noteNumberAssigned;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateSubscriberSpecialNoteResponse)) return false;
        CreateSubscriberSpecialNoteResponse other = (CreateSubscriberSpecialNoteResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.noteNumberAssigned==null && other.getNoteNumberAssigned()==null) || 
             (this.noteNumberAssigned!=null &&
              this.noteNumberAssigned.equals(other.getNoteNumberAssigned())));
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
        if (getNoteNumberAssigned() != null) {
            _hashCode += getNoteNumberAssigned().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateSubscriberSpecialNoteResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.telmex.net/", "createSubscriberSpecialNoteResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noteNumberAssigned");
        elemField.setXmlName(new javax.xml.namespace.QName("", "noteNumberAssigned"));
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
