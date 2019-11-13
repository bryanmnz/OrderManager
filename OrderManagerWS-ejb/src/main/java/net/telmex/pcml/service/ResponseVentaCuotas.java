/**
 * ResponseVentaCuotas.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.telmex.pcml.service;

public class ResponseVentaCuotas  implements java.io.Serializable {
    private java.lang.String pcoderr;

    private java.lang.String pconsumo;

    private java.lang.String pcustcode;

    private java.lang.String pdeserr;

    private java.lang.String pfelimpag;

    private java.lang.String preferpag;

    private java.lang.String pvlrcuotaequi;

    private java.lang.String vrServ;

    public ResponseVentaCuotas() {
    }

    public ResponseVentaCuotas(
           java.lang.String pcoderr,
           java.lang.String pconsumo,
           java.lang.String pcustcode,
           java.lang.String pdeserr,
           java.lang.String pfelimpag,
           java.lang.String preferpag,
           java.lang.String pvlrcuotaequi,
           java.lang.String vrServ) {
           this.pcoderr = pcoderr;
           this.pconsumo = pconsumo;
           this.pcustcode = pcustcode;
           this.pdeserr = pdeserr;
           this.pfelimpag = pfelimpag;
           this.preferpag = preferpag;
           this.pvlrcuotaequi = pvlrcuotaequi;
           this.vrServ = vrServ;
    }


    /**
     * Gets the pcoderr value for this ResponseVentaCuotas.
     * 
     * @return pcoderr
     */
    public java.lang.String getPcoderr() {
        return pcoderr;
    }


    /**
     * Sets the pcoderr value for this ResponseVentaCuotas.
     * 
     * @param pcoderr
     */
    public void setPcoderr(java.lang.String pcoderr) {
        this.pcoderr = pcoderr;
    }


    /**
     * Gets the pconsumo value for this ResponseVentaCuotas.
     * 
     * @return pconsumo
     */
    public java.lang.String getPconsumo() {
        return pconsumo;
    }


    /**
     * Sets the pconsumo value for this ResponseVentaCuotas.
     * 
     * @param pconsumo
     */
    public void setPconsumo(java.lang.String pconsumo) {
        this.pconsumo = pconsumo;
    }


    /**
     * Gets the pcustcode value for this ResponseVentaCuotas.
     * 
     * @return pcustcode
     */
    public java.lang.String getPcustcode() {
        return pcustcode;
    }


    /**
     * Sets the pcustcode value for this ResponseVentaCuotas.
     * 
     * @param pcustcode
     */
    public void setPcustcode(java.lang.String pcustcode) {
        this.pcustcode = pcustcode;
    }


    /**
     * Gets the pdeserr value for this ResponseVentaCuotas.
     * 
     * @return pdeserr
     */
    public java.lang.String getPdeserr() {
        return pdeserr;
    }


    /**
     * Sets the pdeserr value for this ResponseVentaCuotas.
     * 
     * @param pdeserr
     */
    public void setPdeserr(java.lang.String pdeserr) {
        this.pdeserr = pdeserr;
    }


    /**
     * Gets the pfelimpag value for this ResponseVentaCuotas.
     * 
     * @return pfelimpag
     */
    public java.lang.String getPfelimpag() {
        return pfelimpag;
    }


    /**
     * Sets the pfelimpag value for this ResponseVentaCuotas.
     * 
     * @param pfelimpag
     */
    public void setPfelimpag(java.lang.String pfelimpag) {
        this.pfelimpag = pfelimpag;
    }


    /**
     * Gets the preferpag value for this ResponseVentaCuotas.
     * 
     * @return preferpag
     */
    public java.lang.String getPreferpag() {
        return preferpag;
    }


    /**
     * Sets the preferpag value for this ResponseVentaCuotas.
     * 
     * @param preferpag
     */
    public void setPreferpag(java.lang.String preferpag) {
        this.preferpag = preferpag;
    }


    /**
     * Gets the pvlrcuotaequi value for this ResponseVentaCuotas.
     * 
     * @return pvlrcuotaequi
     */
    public java.lang.String getPvlrcuotaequi() {
        return pvlrcuotaequi;
    }


    /**
     * Sets the pvlrcuotaequi value for this ResponseVentaCuotas.
     * 
     * @param pvlrcuotaequi
     */
    public void setPvlrcuotaequi(java.lang.String pvlrcuotaequi) {
        this.pvlrcuotaequi = pvlrcuotaequi;
    }


    /**
     * Gets the vrServ value for this ResponseVentaCuotas.
     * 
     * @return vrServ
     */
    public java.lang.String getVrServ() {
        return vrServ;
    }


    /**
     * Sets the vrServ value for this ResponseVentaCuotas.
     * 
     * @param vrServ
     */
    public void setVrServ(java.lang.String vrServ) {
        this.vrServ = vrServ;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResponseVentaCuotas)) return false;
        ResponseVentaCuotas other = (ResponseVentaCuotas) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pcoderr==null && other.getPcoderr()==null) || 
             (this.pcoderr!=null &&
              this.pcoderr.equals(other.getPcoderr()))) &&
            ((this.pconsumo==null && other.getPconsumo()==null) || 
             (this.pconsumo!=null &&
              this.pconsumo.equals(other.getPconsumo()))) &&
            ((this.pcustcode==null && other.getPcustcode()==null) || 
             (this.pcustcode!=null &&
              this.pcustcode.equals(other.getPcustcode()))) &&
            ((this.pdeserr==null && other.getPdeserr()==null) || 
             (this.pdeserr!=null &&
              this.pdeserr.equals(other.getPdeserr()))) &&
            ((this.pfelimpag==null && other.getPfelimpag()==null) || 
             (this.pfelimpag!=null &&
              this.pfelimpag.equals(other.getPfelimpag()))) &&
            ((this.preferpag==null && other.getPreferpag()==null) || 
             (this.preferpag!=null &&
              this.preferpag.equals(other.getPreferpag()))) &&
            ((this.pvlrcuotaequi==null && other.getPvlrcuotaequi()==null) || 
             (this.pvlrcuotaequi!=null &&
              this.pvlrcuotaequi.equals(other.getPvlrcuotaequi()))) &&
            ((this.vrServ==null && other.getVrServ()==null) || 
             (this.vrServ!=null &&
              this.vrServ.equals(other.getVrServ())));
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
        if (getPcoderr() != null) {
            _hashCode += getPcoderr().hashCode();
        }
        if (getPconsumo() != null) {
            _hashCode += getPconsumo().hashCode();
        }
        if (getPcustcode() != null) {
            _hashCode += getPcustcode().hashCode();
        }
        if (getPdeserr() != null) {
            _hashCode += getPdeserr().hashCode();
        }
        if (getPfelimpag() != null) {
            _hashCode += getPfelimpag().hashCode();
        }
        if (getPreferpag() != null) {
            _hashCode += getPreferpag().hashCode();
        }
        if (getPvlrcuotaequi() != null) {
            _hashCode += getPvlrcuotaequi().hashCode();
        }
        if (getVrServ() != null) {
            _hashCode += getVrServ().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResponseVentaCuotas.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "responseVentaCuotas"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcoderr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pcoderr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pconsumo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pconsumo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcustcode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pcustcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pdeserr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pdeserr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pfelimpag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pfelimpag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferpag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "preferpag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pvlrcuotaequi");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pvlrcuotaequi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vrServ");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vrServ"));
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
