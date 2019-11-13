/**
 * PagoAnticipadoStructAntCons.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.telmex.pcml.service;

public class PagoAnticipadoStructAntCons  extends net.telmex.pcml.service.BasicMessage  implements java.io.Serializable {
    private java.lang.String codigop;

    private java.lang.String cuenta;

    private java.lang.String cuotas;

    private java.math.BigDecimal fechap;

    private java.lang.String itemcl;

    private java.lang.String manucl;

    private java.lang.String tipo;

    private java.math.BigDecimal valorp;

    public PagoAnticipadoStructAntCons() {
    }

    public PagoAnticipadoStructAntCons(
           java.lang.String codigop,
           java.lang.String cuenta,
           java.lang.String cuotas,
           java.math.BigDecimal fechap,
           java.lang.String itemcl,
           java.lang.String manucl,
           java.lang.String tipo,
           java.math.BigDecimal valorp) {
        this.codigop = codigop;
        this.cuenta = cuenta;
        this.cuotas = cuotas;
        this.fechap = fechap;
        this.itemcl = itemcl;
        this.manucl = manucl;
        this.tipo = tipo;
        this.valorp = valorp;
    }


    /**
     * Gets the codigop value for this PagoAnticipadoStructAntCons.
     * 
     * @return codigop
     */
    public java.lang.String getCodigop() {
        return codigop;
    }


    /**
     * Sets the codigop value for this PagoAnticipadoStructAntCons.
     * 
     * @param codigop
     */
    public void setCodigop(java.lang.String codigop) {
        this.codigop = codigop;
    }


    /**
     * Gets the cuenta value for this PagoAnticipadoStructAntCons.
     * 
     * @return cuenta
     */
    public java.lang.String getCuenta() {
        return cuenta;
    }


    /**
     * Sets the cuenta value for this PagoAnticipadoStructAntCons.
     * 
     * @param cuenta
     */
    public void setCuenta(java.lang.String cuenta) {
        this.cuenta = cuenta;
    }


    /**
     * Gets the cuotas value for this PagoAnticipadoStructAntCons.
     * 
     * @return cuotas
     */
    public java.lang.String getCuotas() {
        return cuotas;
    }


    /**
     * Sets the cuotas value for this PagoAnticipadoStructAntCons.
     * 
     * @param cuotas
     */
    public void setCuotas(java.lang.String cuotas) {
        this.cuotas = cuotas;
    }


    /**
     * Gets the fechap value for this PagoAnticipadoStructAntCons.
     * 
     * @return fechap
     */
    public java.math.BigDecimal getFechap() {
        return fechap;
    }


    /**
     * Sets the fechap value for this PagoAnticipadoStructAntCons.
     * 
     * @param fechap
     */
    public void setFechap(java.math.BigDecimal fechap) {
        this.fechap = fechap;
    }


    /**
     * Gets the itemcl value for this PagoAnticipadoStructAntCons.
     * 
     * @return itemcl
     */
    public java.lang.String getItemcl() {
        return itemcl;
    }


    /**
     * Sets the itemcl value for this PagoAnticipadoStructAntCons.
     * 
     * @param itemcl
     */
    public void setItemcl(java.lang.String itemcl) {
        this.itemcl = itemcl;
    }


    /**
     * Gets the manucl value for this PagoAnticipadoStructAntCons.
     * 
     * @return manucl
     */
    public java.lang.String getManucl() {
        return manucl;
    }


    /**
     * Sets the manucl value for this PagoAnticipadoStructAntCons.
     * 
     * @param manucl
     */
    public void setManucl(java.lang.String manucl) {
        this.manucl = manucl;
    }


    /**
     * Gets the tipo value for this PagoAnticipadoStructAntCons.
     * 
     * @return tipo
     */
    public java.lang.String getTipo() {
        return tipo;
    }


    /**
     * Sets the tipo value for this PagoAnticipadoStructAntCons.
     * 
     * @param tipo
     */
    public void setTipo(java.lang.String tipo) {
        this.tipo = tipo;
    }


    /**
     * Gets the valorp value for this PagoAnticipadoStructAntCons.
     * 
     * @return valorp
     */
    public java.math.BigDecimal getValorp() {
        return valorp;
    }


    /**
     * Sets the valorp value for this PagoAnticipadoStructAntCons.
     * 
     * @param valorp
     */
    public void setValorp(java.math.BigDecimal valorp) {
        this.valorp = valorp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PagoAnticipadoStructAntCons)) return false;
        PagoAnticipadoStructAntCons other = (PagoAnticipadoStructAntCons) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.codigop==null && other.getCodigop()==null) || 
             (this.codigop!=null &&
              this.codigop.equals(other.getCodigop()))) &&
            ((this.cuenta==null && other.getCuenta()==null) || 
             (this.cuenta!=null &&
              this.cuenta.equals(other.getCuenta()))) &&
            ((this.cuotas==null && other.getCuotas()==null) || 
             (this.cuotas!=null &&
              this.cuotas.equals(other.getCuotas()))) &&
            ((this.fechap==null && other.getFechap()==null) || 
             (this.fechap!=null &&
              this.fechap.equals(other.getFechap()))) &&
            ((this.itemcl==null && other.getItemcl()==null) || 
             (this.itemcl!=null &&
              this.itemcl.equals(other.getItemcl()))) &&
            ((this.manucl==null && other.getManucl()==null) || 
             (this.manucl!=null &&
              this.manucl.equals(other.getManucl()))) &&
            ((this.tipo==null && other.getTipo()==null) || 
             (this.tipo!=null &&
              this.tipo.equals(other.getTipo()))) &&
            ((this.valorp==null && other.getValorp()==null) || 
             (this.valorp!=null &&
              this.valorp.equals(other.getValorp())));
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
        if (getCodigop() != null) {
            _hashCode += getCodigop().hashCode();
        }
        if (getCuenta() != null) {
            _hashCode += getCuenta().hashCode();
        }
        if (getCuotas() != null) {
            _hashCode += getCuotas().hashCode();
        }
        if (getFechap() != null) {
            _hashCode += getFechap().hashCode();
        }
        if (getItemcl() != null) {
            _hashCode += getItemcl().hashCode();
        }
        if (getManucl() != null) {
            _hashCode += getManucl().hashCode();
        }
        if (getTipo() != null) {
            _hashCode += getTipo().hashCode();
        }
        if (getValorp() != null) {
            _hashCode += getValorp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PagoAnticipadoStructAntCons.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "pagoAnticipadoStructAntCons"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigop");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigop"));
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
        elemField.setFieldName("cuotas");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cuotas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechap");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechap"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemcl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "itemcl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manucl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "manucl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valorp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
