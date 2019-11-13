/**
 * InventarioInfoVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.telmex.pcml.service;

public class InventarioInfoVO  implements java.io.Serializable {
    private java.lang.String codigoError;

    private java.lang.String cuenta;

    private net.telmex.pcml.service.InventarioVO[] items;

    private java.lang.String mensajeError;

    private java.lang.String numeroOrdenTrabajo;

    public InventarioInfoVO() {
    }

    public InventarioInfoVO(
           java.lang.String codigoError,
           java.lang.String cuenta,
           net.telmex.pcml.service.InventarioVO[] items,
           java.lang.String mensajeError,
           java.lang.String numeroOrdenTrabajo) {
           this.codigoError = codigoError;
           this.cuenta = cuenta;
           this.items = items;
           this.mensajeError = mensajeError;
           this.numeroOrdenTrabajo = numeroOrdenTrabajo;
    }


    /**
     * Gets the codigoError value for this InventarioInfoVO.
     * 
     * @return codigoError
     */
    public java.lang.String getCodigoError() {
        return codigoError;
    }


    /**
     * Sets the codigoError value for this InventarioInfoVO.
     * 
     * @param codigoError
     */
    public void setCodigoError(java.lang.String codigoError) {
        this.codigoError = codigoError;
    }


    /**
     * Gets the cuenta value for this InventarioInfoVO.
     * 
     * @return cuenta
     */
    public java.lang.String getCuenta() {
        return cuenta;
    }


    /**
     * Sets the cuenta value for this InventarioInfoVO.
     * 
     * @param cuenta
     */
    public void setCuenta(java.lang.String cuenta) {
        this.cuenta = cuenta;
    }


    /**
     * Gets the items value for this InventarioInfoVO.
     * 
     * @return items
     */
    public net.telmex.pcml.service.InventarioVO[] getItems() {
        return items;
    }


    /**
     * Sets the items value for this InventarioInfoVO.
     * 
     * @param items
     */
    public void setItems(net.telmex.pcml.service.InventarioVO[] items) {
        this.items = items;
    }

    public net.telmex.pcml.service.InventarioVO getItems(int i) {
        return this.items[i];
    }

    public void setItems(int i, net.telmex.pcml.service.InventarioVO _value) {
        this.items[i] = _value;
    }


    /**
     * Gets the mensajeError value for this InventarioInfoVO.
     * 
     * @return mensajeError
     */
    public java.lang.String getMensajeError() {
        return mensajeError;
    }


    /**
     * Sets the mensajeError value for this InventarioInfoVO.
     * 
     * @param mensajeError
     */
    public void setMensajeError(java.lang.String mensajeError) {
        this.mensajeError = mensajeError;
    }


    /**
     * Gets the numeroOrdenTrabajo value for this InventarioInfoVO.
     * 
     * @return numeroOrdenTrabajo
     */
    public java.lang.String getNumeroOrdenTrabajo() {
        return numeroOrdenTrabajo;
    }


    /**
     * Sets the numeroOrdenTrabajo value for this InventarioInfoVO.
     * 
     * @param numeroOrdenTrabajo
     */
    public void setNumeroOrdenTrabajo(java.lang.String numeroOrdenTrabajo) {
        this.numeroOrdenTrabajo = numeroOrdenTrabajo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InventarioInfoVO)) return false;
        InventarioInfoVO other = (InventarioInfoVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigoError==null && other.getCodigoError()==null) || 
             (this.codigoError!=null &&
              this.codigoError.equals(other.getCodigoError()))) &&
            ((this.cuenta==null && other.getCuenta()==null) || 
             (this.cuenta!=null &&
              this.cuenta.equals(other.getCuenta()))) &&
            ((this.items==null && other.getItems()==null) || 
             (this.items!=null &&
              java.util.Arrays.equals(this.items, other.getItems()))) &&
            ((this.mensajeError==null && other.getMensajeError()==null) || 
             (this.mensajeError!=null &&
              this.mensajeError.equals(other.getMensajeError()))) &&
            ((this.numeroOrdenTrabajo==null && other.getNumeroOrdenTrabajo()==null) || 
             (this.numeroOrdenTrabajo!=null &&
              this.numeroOrdenTrabajo.equals(other.getNumeroOrdenTrabajo())));
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
        if (getCodigoError() != null) {
            _hashCode += getCodigoError().hashCode();
        }
        if (getCuenta() != null) {
            _hashCode += getCuenta().hashCode();
        }
        if (getItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMensajeError() != null) {
            _hashCode += getMensajeError().hashCode();
        }
        if (getNumeroOrdenTrabajo() != null) {
            _hashCode += getNumeroOrdenTrabajo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InventarioInfoVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "inventarioInfoVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoError");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoError"));
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
        elemField.setFieldName("items");
        elemField.setXmlName(new javax.xml.namespace.QName("", "items"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "inventarioVO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensajeError");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mensajeError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroOrdenTrabajo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroOrdenTrabajo"));
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
