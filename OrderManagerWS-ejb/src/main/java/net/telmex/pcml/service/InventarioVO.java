/**
 * InventarioVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.telmex.pcml.service;

public class InventarioVO  implements java.io.Serializable {
    private java.lang.String address;

    private java.lang.String comunidad;

    private java.lang.String dealerNumber;

    private java.lang.String estado;

    private java.lang.String itemClass;

    private java.lang.String manufacturerClass;

    private java.lang.String serialNumber;

    private net.telmex.pcml.service.ServicioVO[] servicios;

    private java.lang.String ultimaOT;

    public InventarioVO() {
    }

    public InventarioVO(
           java.lang.String address,
           java.lang.String comunidad,
           java.lang.String dealerNumber,
           java.lang.String estado,
           java.lang.String itemClass,
           java.lang.String manufacturerClass,
           java.lang.String serialNumber,
           net.telmex.pcml.service.ServicioVO[] servicios,
           java.lang.String ultimaOT) {
           this.address = address;
           this.comunidad = comunidad;
           this.dealerNumber = dealerNumber;
           this.estado = estado;
           this.itemClass = itemClass;
           this.manufacturerClass = manufacturerClass;
           this.serialNumber = serialNumber;
           this.servicios = servicios;
           this.ultimaOT = ultimaOT;
    }


    /**
     * Gets the address value for this InventarioVO.
     * 
     * @return address
     */
    public java.lang.String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this InventarioVO.
     * 
     * @param address
     */
    public void setAddress(java.lang.String address) {
        this.address = address;
    }


    /**
     * Gets the comunidad value for this InventarioVO.
     * 
     * @return comunidad
     */
    public java.lang.String getComunidad() {
        return comunidad;
    }


    /**
     * Sets the comunidad value for this InventarioVO.
     * 
     * @param comunidad
     */
    public void setComunidad(java.lang.String comunidad) {
        this.comunidad = comunidad;
    }


    /**
     * Gets the dealerNumber value for this InventarioVO.
     * 
     * @return dealerNumber
     */
    public java.lang.String getDealerNumber() {
        return dealerNumber;
    }


    /**
     * Sets the dealerNumber value for this InventarioVO.
     * 
     * @param dealerNumber
     */
    public void setDealerNumber(java.lang.String dealerNumber) {
        this.dealerNumber = dealerNumber;
    }


    /**
     * Gets the estado value for this InventarioVO.
     * 
     * @return estado
     */
    public java.lang.String getEstado() {
        return estado;
    }


    /**
     * Sets the estado value for this InventarioVO.
     * 
     * @param estado
     */
    public void setEstado(java.lang.String estado) {
        this.estado = estado;
    }


    /**
     * Gets the itemClass value for this InventarioVO.
     * 
     * @return itemClass
     */
    public java.lang.String getItemClass() {
        return itemClass;
    }


    /**
     * Sets the itemClass value for this InventarioVO.
     * 
     * @param itemClass
     */
    public void setItemClass(java.lang.String itemClass) {
        this.itemClass = itemClass;
    }


    /**
     * Gets the manufacturerClass value for this InventarioVO.
     * 
     * @return manufacturerClass
     */
    public java.lang.String getManufacturerClass() {
        return manufacturerClass;
    }


    /**
     * Sets the manufacturerClass value for this InventarioVO.
     * 
     * @param manufacturerClass
     */
    public void setManufacturerClass(java.lang.String manufacturerClass) {
        this.manufacturerClass = manufacturerClass;
    }


    /**
     * Gets the serialNumber value for this InventarioVO.
     * 
     * @return serialNumber
     */
    public java.lang.String getSerialNumber() {
        return serialNumber;
    }


    /**
     * Sets the serialNumber value for this InventarioVO.
     * 
     * @param serialNumber
     */
    public void setSerialNumber(java.lang.String serialNumber) {
        this.serialNumber = serialNumber;
    }


    /**
     * Gets the servicios value for this InventarioVO.
     * 
     * @return servicios
     */
    public net.telmex.pcml.service.ServicioVO[] getServicios() {
        return servicios;
    }


    /**
     * Sets the servicios value for this InventarioVO.
     * 
     * @param servicios
     */
    public void setServicios(net.telmex.pcml.service.ServicioVO[] servicios) {
        this.servicios = servicios;
    }

    public net.telmex.pcml.service.ServicioVO getServicios(int i) {
        return this.servicios[i];
    }

    public void setServicios(int i, net.telmex.pcml.service.ServicioVO _value) {
        this.servicios[i] = _value;
    }


    /**
     * Gets the ultimaOT value for this InventarioVO.
     * 
     * @return ultimaOT
     */
    public java.lang.String getUltimaOT() {
        return ultimaOT;
    }


    /**
     * Sets the ultimaOT value for this InventarioVO.
     * 
     * @param ultimaOT
     */
    public void setUltimaOT(java.lang.String ultimaOT) {
        this.ultimaOT = ultimaOT;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InventarioVO)) return false;
        InventarioVO other = (InventarioVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.comunidad==null && other.getComunidad()==null) || 
             (this.comunidad!=null &&
              this.comunidad.equals(other.getComunidad()))) &&
            ((this.dealerNumber==null && other.getDealerNumber()==null) || 
             (this.dealerNumber!=null &&
              this.dealerNumber.equals(other.getDealerNumber()))) &&
            ((this.estado==null && other.getEstado()==null) || 
             (this.estado!=null &&
              this.estado.equals(other.getEstado()))) &&
            ((this.itemClass==null && other.getItemClass()==null) || 
             (this.itemClass!=null &&
              this.itemClass.equals(other.getItemClass()))) &&
            ((this.manufacturerClass==null && other.getManufacturerClass()==null) || 
             (this.manufacturerClass!=null &&
              this.manufacturerClass.equals(other.getManufacturerClass()))) &&
            ((this.serialNumber==null && other.getSerialNumber()==null) || 
             (this.serialNumber!=null &&
              this.serialNumber.equals(other.getSerialNumber()))) &&
            ((this.servicios==null && other.getServicios()==null) || 
             (this.servicios!=null &&
              java.util.Arrays.equals(this.servicios, other.getServicios()))) &&
            ((this.ultimaOT==null && other.getUltimaOT()==null) || 
             (this.ultimaOT!=null &&
              this.ultimaOT.equals(other.getUltimaOT())));
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
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getComunidad() != null) {
            _hashCode += getComunidad().hashCode();
        }
        if (getDealerNumber() != null) {
            _hashCode += getDealerNumber().hashCode();
        }
        if (getEstado() != null) {
            _hashCode += getEstado().hashCode();
        }
        if (getItemClass() != null) {
            _hashCode += getItemClass().hashCode();
        }
        if (getManufacturerClass() != null) {
            _hashCode += getManufacturerClass().hashCode();
        }
        if (getSerialNumber() != null) {
            _hashCode += getSerialNumber().hashCode();
        }
        if (getServicios() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServicios());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServicios(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUltimaOT() != null) {
            _hashCode += getUltimaOT().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InventarioVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "inventarioVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comunidad");
        elemField.setXmlName(new javax.xml.namespace.QName("", "comunidad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dealerNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dealerNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemClass");
        elemField.setXmlName(new javax.xml.namespace.QName("", "itemClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturerClass");
        elemField.setXmlName(new javax.xml.namespace.QName("", "manufacturerClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serialNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicios");
        elemField.setXmlName(new javax.xml.namespace.QName("", "servicios"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "servicioVO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ultimaOT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ultimaOT"));
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
