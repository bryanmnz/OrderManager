/**
 * VentaMultiplayInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.telmex.pcml.service;

public class VentaMultiplayInfoResponse  implements java.io.Serializable {
    private java.lang.String check;

    private java.lang.String[] detalleErrores;

    private java.lang.String numeroErrores;

    public VentaMultiplayInfoResponse() {
    }

    public VentaMultiplayInfoResponse(
           java.lang.String check,
           java.lang.String[] detalleErrores,
           java.lang.String numeroErrores) {
           this.check = check;
           this.detalleErrores = detalleErrores;
           this.numeroErrores = numeroErrores;
    }


    /**
     * Gets the check value for this VentaMultiplayInfoResponse.
     * 
     * @return check
     */
    public java.lang.String getCheck() {
        return check;
    }


    /**
     * Sets the check value for this VentaMultiplayInfoResponse.
     * 
     * @param check
     */
    public void setCheck(java.lang.String check) {
        this.check = check;
    }


    /**
     * Gets the detalleErrores value for this VentaMultiplayInfoResponse.
     * 
     * @return detalleErrores
     */
    public java.lang.String[] getDetalleErrores() {
        return detalleErrores;
    }


    /**
     * Sets the detalleErrores value for this VentaMultiplayInfoResponse.
     * 
     * @param detalleErrores
     */
    public void setDetalleErrores(java.lang.String[] detalleErrores) {
        this.detalleErrores = detalleErrores;
    }

    public java.lang.String getDetalleErrores(int i) {
        return this.detalleErrores[i];
    }

    public void setDetalleErrores(int i, java.lang.String _value) {
        this.detalleErrores[i] = _value;
    }


    /**
     * Gets the numeroErrores value for this VentaMultiplayInfoResponse.
     * 
     * @return numeroErrores
     */
    public java.lang.String getNumeroErrores() {
        return numeroErrores;
    }


    /**
     * Sets the numeroErrores value for this VentaMultiplayInfoResponse.
     * 
     * @param numeroErrores
     */
    public void setNumeroErrores(java.lang.String numeroErrores) {
        this.numeroErrores = numeroErrores;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VentaMultiplayInfoResponse)) return false;
        VentaMultiplayInfoResponse other = (VentaMultiplayInfoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.check==null && other.getCheck()==null) || 
             (this.check!=null &&
              this.check.equals(other.getCheck()))) &&
            ((this.detalleErrores==null && other.getDetalleErrores()==null) || 
             (this.detalleErrores!=null &&
              java.util.Arrays.equals(this.detalleErrores, other.getDetalleErrores()))) &&
            ((this.numeroErrores==null && other.getNumeroErrores()==null) || 
             (this.numeroErrores!=null &&
              this.numeroErrores.equals(other.getNumeroErrores())));
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
        if (getCheck() != null) {
            _hashCode += getCheck().hashCode();
        }
        if (getDetalleErrores() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDetalleErrores());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDetalleErrores(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNumeroErrores() != null) {
            _hashCode += getNumeroErrores().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VentaMultiplayInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "ventaMultiplayInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("check");
        elemField.setXmlName(new javax.xml.namespace.QName("", "check"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detalleErrores");
        elemField.setXmlName(new javax.xml.namespace.QName("", "detalleErrores"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroErrores");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroErrores"));
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
