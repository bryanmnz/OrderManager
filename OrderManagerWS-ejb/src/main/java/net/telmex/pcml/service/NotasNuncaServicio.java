/**
 * NotasNuncaServicio.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.telmex.pcml.service;

public class NotasNuncaServicio  implements java.io.Serializable {
    private java.lang.String community;

    private java.lang.String homeNumber;

    private java.lang.String homeType;

    private java.lang.String nameStreet;

    private java.lang.String[] valueNotes;

    private java.lang.String valueResponseMsg;

    public NotasNuncaServicio() {
    }

    public NotasNuncaServicio(
           java.lang.String community,
           java.lang.String homeNumber,
           java.lang.String homeType,
           java.lang.String nameStreet,
           java.lang.String[] valueNotes,
           java.lang.String valueResponseMsg) {
           this.community = community;
           this.homeNumber = homeNumber;
           this.homeType = homeType;
           this.nameStreet = nameStreet;
           this.valueNotes = valueNotes;
           this.valueResponseMsg = valueResponseMsg;
    }


    /**
     * Gets the community value for this NotasNuncaServicio.
     * 
     * @return community
     */
    public java.lang.String getCommunity() {
        return community;
    }


    /**
     * Sets the community value for this NotasNuncaServicio.
     * 
     * @param community
     */
    public void setCommunity(java.lang.String community) {
        this.community = community;
    }


    /**
     * Gets the homeNumber value for this NotasNuncaServicio.
     * 
     * @return homeNumber
     */
    public java.lang.String getHomeNumber() {
        return homeNumber;
    }


    /**
     * Sets the homeNumber value for this NotasNuncaServicio.
     * 
     * @param homeNumber
     */
    public void setHomeNumber(java.lang.String homeNumber) {
        this.homeNumber = homeNumber;
    }


    /**
     * Gets the homeType value for this NotasNuncaServicio.
     * 
     * @return homeType
     */
    public java.lang.String getHomeType() {
        return homeType;
    }


    /**
     * Sets the homeType value for this NotasNuncaServicio.
     * 
     * @param homeType
     */
    public void setHomeType(java.lang.String homeType) {
        this.homeType = homeType;
    }


    /**
     * Gets the nameStreet value for this NotasNuncaServicio.
     * 
     * @return nameStreet
     */
    public java.lang.String getNameStreet() {
        return nameStreet;
    }


    /**
     * Sets the nameStreet value for this NotasNuncaServicio.
     * 
     * @param nameStreet
     */
    public void setNameStreet(java.lang.String nameStreet) {
        this.nameStreet = nameStreet;
    }


    /**
     * Gets the valueNotes value for this NotasNuncaServicio.
     * 
     * @return valueNotes
     */
    public java.lang.String[] getValueNotes() {
        return valueNotes;
    }


    /**
     * Sets the valueNotes value for this NotasNuncaServicio.
     * 
     * @param valueNotes
     */
    public void setValueNotes(java.lang.String[] valueNotes) {
        this.valueNotes = valueNotes;
    }

    public java.lang.String getValueNotes(int i) {
        return this.valueNotes[i];
    }

    public void setValueNotes(int i, java.lang.String _value) {
        this.valueNotes[i] = _value;
    }


    /**
     * Gets the valueResponseMsg value for this NotasNuncaServicio.
     * 
     * @return valueResponseMsg
     */
    public java.lang.String getValueResponseMsg() {
        return valueResponseMsg;
    }


    /**
     * Sets the valueResponseMsg value for this NotasNuncaServicio.
     * 
     * @param valueResponseMsg
     */
    public void setValueResponseMsg(java.lang.String valueResponseMsg) {
        this.valueResponseMsg = valueResponseMsg;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NotasNuncaServicio)) return false;
        NotasNuncaServicio other = (NotasNuncaServicio) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.community==null && other.getCommunity()==null) || 
             (this.community!=null &&
              this.community.equals(other.getCommunity()))) &&
            ((this.homeNumber==null && other.getHomeNumber()==null) || 
             (this.homeNumber!=null &&
              this.homeNumber.equals(other.getHomeNumber()))) &&
            ((this.homeType==null && other.getHomeType()==null) || 
             (this.homeType!=null &&
              this.homeType.equals(other.getHomeType()))) &&
            ((this.nameStreet==null && other.getNameStreet()==null) || 
             (this.nameStreet!=null &&
              this.nameStreet.equals(other.getNameStreet()))) &&
            ((this.valueNotes==null && other.getValueNotes()==null) || 
             (this.valueNotes!=null &&
              java.util.Arrays.equals(this.valueNotes, other.getValueNotes()))) &&
            ((this.valueResponseMsg==null && other.getValueResponseMsg()==null) || 
             (this.valueResponseMsg!=null &&
              this.valueResponseMsg.equals(other.getValueResponseMsg())));
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
        if (getCommunity() != null) {
            _hashCode += getCommunity().hashCode();
        }
        if (getHomeNumber() != null) {
            _hashCode += getHomeNumber().hashCode();
        }
        if (getHomeType() != null) {
            _hashCode += getHomeType().hashCode();
        }
        if (getNameStreet() != null) {
            _hashCode += getNameStreet().hashCode();
        }
        if (getValueNotes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getValueNotes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getValueNotes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getValueResponseMsg() != null) {
            _hashCode += getValueResponseMsg().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NotasNuncaServicio.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "notasNuncaServicio"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("community");
        elemField.setXmlName(new javax.xml.namespace.QName("", "community"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homeNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "homeNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homeType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "homeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameStreet");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nameStreet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueNotes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valueNotes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueResponseMsg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valueResponseMsg"));
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
