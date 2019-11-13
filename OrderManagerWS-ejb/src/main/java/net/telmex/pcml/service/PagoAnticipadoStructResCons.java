/**
 * PagoAnticipadoStructResCons.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.telmex.pcml.service;

public class PagoAnticipadoStructResCons  extends net.telmex.pcml.service.BasicMessage  implements java.io.Serializable {
    private java.lang.String codipa;

    private java.math.BigDecimal fechapa;

    private java.math.BigDecimal horapa;

    private java.math.BigDecimal ivaequ;

    private java.math.BigDecimal pogoan;

    private java.math.BigDecimal porant;

    private java.math.BigDecimal valcuo;

    private java.math.BigDecimal valore;

    private java.math.BigDecimal valorpa;

    private java.math.BigDecimal valort;

    public PagoAnticipadoStructResCons() {
    }

    public PagoAnticipadoStructResCons(
           java.lang.String codipa,
           java.math.BigDecimal fechapa,
           java.math.BigDecimal horapa,
           java.math.BigDecimal ivaequ,
           java.math.BigDecimal pogoan,
           java.math.BigDecimal porant,
           java.math.BigDecimal valcuo,
           java.math.BigDecimal valore,
           java.math.BigDecimal valorpa,
           java.math.BigDecimal valort) {
        this.codipa = codipa;
        this.fechapa = fechapa;
        this.horapa = horapa;
        this.ivaequ = ivaequ;
        this.pogoan = pogoan;
        this.porant = porant;
        this.valcuo = valcuo;
        this.valore = valore;
        this.valorpa = valorpa;
        this.valort = valort;
    }


    /**
     * Gets the codipa value for this PagoAnticipadoStructResCons.
     * 
     * @return codipa
     */
    public java.lang.String getCodipa() {
        return codipa;
    }


    /**
     * Sets the codipa value for this PagoAnticipadoStructResCons.
     * 
     * @param codipa
     */
    public void setCodipa(java.lang.String codipa) {
        this.codipa = codipa;
    }


    /**
     * Gets the fechapa value for this PagoAnticipadoStructResCons.
     * 
     * @return fechapa
     */
    public java.math.BigDecimal getFechapa() {
        return fechapa;
    }


    /**
     * Sets the fechapa value for this PagoAnticipadoStructResCons.
     * 
     * @param fechapa
     */
    public void setFechapa(java.math.BigDecimal fechapa) {
        this.fechapa = fechapa;
    }


    /**
     * Gets the horapa value for this PagoAnticipadoStructResCons.
     * 
     * @return horapa
     */
    public java.math.BigDecimal getHorapa() {
        return horapa;
    }


    /**
     * Sets the horapa value for this PagoAnticipadoStructResCons.
     * 
     * @param horapa
     */
    public void setHorapa(java.math.BigDecimal horapa) {
        this.horapa = horapa;
    }


    /**
     * Gets the ivaequ value for this PagoAnticipadoStructResCons.
     * 
     * @return ivaequ
     */
    public java.math.BigDecimal getIvaequ() {
        return ivaequ;
    }


    /**
     * Sets the ivaequ value for this PagoAnticipadoStructResCons.
     * 
     * @param ivaequ
     */
    public void setIvaequ(java.math.BigDecimal ivaequ) {
        this.ivaequ = ivaequ;
    }


    /**
     * Gets the pogoan value for this PagoAnticipadoStructResCons.
     * 
     * @return pogoan
     */
    public java.math.BigDecimal getPogoan() {
        return pogoan;
    }


    /**
     * Sets the pogoan value for this PagoAnticipadoStructResCons.
     * 
     * @param pogoan
     */
    public void setPogoan(java.math.BigDecimal pogoan) {
        this.pogoan = pogoan;
    }


    /**
     * Gets the porant value for this PagoAnticipadoStructResCons.
     * 
     * @return porant
     */
    public java.math.BigDecimal getPorant() {
        return porant;
    }


    /**
     * Sets the porant value for this PagoAnticipadoStructResCons.
     * 
     * @param porant
     */
    public void setPorant(java.math.BigDecimal porant) {
        this.porant = porant;
    }


    /**
     * Gets the valcuo value for this PagoAnticipadoStructResCons.
     * 
     * @return valcuo
     */
    public java.math.BigDecimal getValcuo() {
        return valcuo;
    }


    /**
     * Sets the valcuo value for this PagoAnticipadoStructResCons.
     * 
     * @param valcuo
     */
    public void setValcuo(java.math.BigDecimal valcuo) {
        this.valcuo = valcuo;
    }


    /**
     * Gets the valore value for this PagoAnticipadoStructResCons.
     * 
     * @return valore
     */
    public java.math.BigDecimal getValore() {
        return valore;
    }


    /**
     * Sets the valore value for this PagoAnticipadoStructResCons.
     * 
     * @param valore
     */
    public void setValore(java.math.BigDecimal valore) {
        this.valore = valore;
    }


    /**
     * Gets the valorpa value for this PagoAnticipadoStructResCons.
     * 
     * @return valorpa
     */
    public java.math.BigDecimal getValorpa() {
        return valorpa;
    }


    /**
     * Sets the valorpa value for this PagoAnticipadoStructResCons.
     * 
     * @param valorpa
     */
    public void setValorpa(java.math.BigDecimal valorpa) {
        this.valorpa = valorpa;
    }


    /**
     * Gets the valort value for this PagoAnticipadoStructResCons.
     * 
     * @return valort
     */
    public java.math.BigDecimal getValort() {
        return valort;
    }


    /**
     * Sets the valort value for this PagoAnticipadoStructResCons.
     * 
     * @param valort
     */
    public void setValort(java.math.BigDecimal valort) {
        this.valort = valort;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PagoAnticipadoStructResCons)) return false;
        PagoAnticipadoStructResCons other = (PagoAnticipadoStructResCons) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.codipa==null && other.getCodipa()==null) || 
             (this.codipa!=null &&
              this.codipa.equals(other.getCodipa()))) &&
            ((this.fechapa==null && other.getFechapa()==null) || 
             (this.fechapa!=null &&
              this.fechapa.equals(other.getFechapa()))) &&
            ((this.horapa==null && other.getHorapa()==null) || 
             (this.horapa!=null &&
              this.horapa.equals(other.getHorapa()))) &&
            ((this.ivaequ==null && other.getIvaequ()==null) || 
             (this.ivaequ!=null &&
              this.ivaequ.equals(other.getIvaequ()))) &&
            ((this.pogoan==null && other.getPogoan()==null) || 
             (this.pogoan!=null &&
              this.pogoan.equals(other.getPogoan()))) &&
            ((this.porant==null && other.getPorant()==null) || 
             (this.porant!=null &&
              this.porant.equals(other.getPorant()))) &&
            ((this.valcuo==null && other.getValcuo()==null) || 
             (this.valcuo!=null &&
              this.valcuo.equals(other.getValcuo()))) &&
            ((this.valore==null && other.getValore()==null) || 
             (this.valore!=null &&
              this.valore.equals(other.getValore()))) &&
            ((this.valorpa==null && other.getValorpa()==null) || 
             (this.valorpa!=null &&
              this.valorpa.equals(other.getValorpa()))) &&
            ((this.valort==null && other.getValort()==null) || 
             (this.valort!=null &&
              this.valort.equals(other.getValort())));
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
        if (getCodipa() != null) {
            _hashCode += getCodipa().hashCode();
        }
        if (getFechapa() != null) {
            _hashCode += getFechapa().hashCode();
        }
        if (getHorapa() != null) {
            _hashCode += getHorapa().hashCode();
        }
        if (getIvaequ() != null) {
            _hashCode += getIvaequ().hashCode();
        }
        if (getPogoan() != null) {
            _hashCode += getPogoan().hashCode();
        }
        if (getPorant() != null) {
            _hashCode += getPorant().hashCode();
        }
        if (getValcuo() != null) {
            _hashCode += getValcuo().hashCode();
        }
        if (getValore() != null) {
            _hashCode += getValore().hashCode();
        }
        if (getValorpa() != null) {
            _hashCode += getValorpa().hashCode();
        }
        if (getValort() != null) {
            _hashCode += getValort().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PagoAnticipadoStructResCons.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "pagoAnticipadoStructResCons"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codipa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codipa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechapa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechapa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("horapa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "horapa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ivaequ");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ivaequ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pogoan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pogoan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("porant");
        elemField.setXmlName(new javax.xml.namespace.QName("", "porant"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valcuo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valcuo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valore");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorpa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valorpa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valort");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valort"));
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
