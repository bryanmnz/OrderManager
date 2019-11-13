/**
 * CampaniaStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.telmex.pcml.service;

public class CampaniaStruct  implements java.io.Serializable {
    private java.lang.String codCamp;

    private java.lang.String community;

    private java.lang.String deathLine;

    private java.lang.String descriptionCamp;

    private java.lang.String division;

    private java.lang.String effectiveDate;

    private java.lang.String endDate;

    private java.lang.String rate;

    private java.lang.String startDate;

    private java.lang.String typeCampaign;

    public CampaniaStruct() {
    }

    public CampaniaStruct(
           java.lang.String codCamp,
           java.lang.String community,
           java.lang.String deathLine,
           java.lang.String descriptionCamp,
           java.lang.String division,
           java.lang.String effectiveDate,
           java.lang.String endDate,
           java.lang.String rate,
           java.lang.String startDate,
           java.lang.String typeCampaign) {
           this.codCamp = codCamp;
           this.community = community;
           this.deathLine = deathLine;
           this.descriptionCamp = descriptionCamp;
           this.division = division;
           this.effectiveDate = effectiveDate;
           this.endDate = endDate;
           this.rate = rate;
           this.startDate = startDate;
           this.typeCampaign = typeCampaign;
    }


    /**
     * Gets the codCamp value for this CampaniaStruct.
     * 
     * @return codCamp
     */
    public java.lang.String getCodCamp() {
        return codCamp;
    }


    /**
     * Sets the codCamp value for this CampaniaStruct.
     * 
     * @param codCamp
     */
    public void setCodCamp(java.lang.String codCamp) {
        this.codCamp = codCamp;
    }


    /**
     * Gets the community value for this CampaniaStruct.
     * 
     * @return community
     */
    public java.lang.String getCommunity() {
        return community;
    }


    /**
     * Sets the community value for this CampaniaStruct.
     * 
     * @param community
     */
    public void setCommunity(java.lang.String community) {
        this.community = community;
    }


    /**
     * Gets the deathLine value for this CampaniaStruct.
     * 
     * @return deathLine
     */
    public java.lang.String getDeathLine() {
        return deathLine;
    }


    /**
     * Sets the deathLine value for this CampaniaStruct.
     * 
     * @param deathLine
     */
    public void setDeathLine(java.lang.String deathLine) {
        this.deathLine = deathLine;
    }


    /**
     * Gets the descriptionCamp value for this CampaniaStruct.
     * 
     * @return descriptionCamp
     */
    public java.lang.String getDescriptionCamp() {
        return descriptionCamp;
    }


    /**
     * Sets the descriptionCamp value for this CampaniaStruct.
     * 
     * @param descriptionCamp
     */
    public void setDescriptionCamp(java.lang.String descriptionCamp) {
        this.descriptionCamp = descriptionCamp;
    }


    /**
     * Gets the division value for this CampaniaStruct.
     * 
     * @return division
     */
    public java.lang.String getDivision() {
        return division;
    }


    /**
     * Sets the division value for this CampaniaStruct.
     * 
     * @param division
     */
    public void setDivision(java.lang.String division) {
        this.division = division;
    }


    /**
     * Gets the effectiveDate value for this CampaniaStruct.
     * 
     * @return effectiveDate
     */
    public java.lang.String getEffectiveDate() {
        return effectiveDate;
    }


    /**
     * Sets the effectiveDate value for this CampaniaStruct.
     * 
     * @param effectiveDate
     */
    public void setEffectiveDate(java.lang.String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }


    /**
     * Gets the endDate value for this CampaniaStruct.
     * 
     * @return endDate
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this CampaniaStruct.
     * 
     * @param endDate
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the rate value for this CampaniaStruct.
     * 
     * @return rate
     */
    public java.lang.String getRate() {
        return rate;
    }


    /**
     * Sets the rate value for this CampaniaStruct.
     * 
     * @param rate
     */
    public void setRate(java.lang.String rate) {
        this.rate = rate;
    }


    /**
     * Gets the startDate value for this CampaniaStruct.
     * 
     * @return startDate
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this CampaniaStruct.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the typeCampaign value for this CampaniaStruct.
     * 
     * @return typeCampaign
     */
    public java.lang.String getTypeCampaign() {
        return typeCampaign;
    }


    /**
     * Sets the typeCampaign value for this CampaniaStruct.
     * 
     * @param typeCampaign
     */
    public void setTypeCampaign(java.lang.String typeCampaign) {
        this.typeCampaign = typeCampaign;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CampaniaStruct)) return false;
        CampaniaStruct other = (CampaniaStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codCamp==null && other.getCodCamp()==null) || 
             (this.codCamp!=null &&
              this.codCamp.equals(other.getCodCamp()))) &&
            ((this.community==null && other.getCommunity()==null) || 
             (this.community!=null &&
              this.community.equals(other.getCommunity()))) &&
            ((this.deathLine==null && other.getDeathLine()==null) || 
             (this.deathLine!=null &&
              this.deathLine.equals(other.getDeathLine()))) &&
            ((this.descriptionCamp==null && other.getDescriptionCamp()==null) || 
             (this.descriptionCamp!=null &&
              this.descriptionCamp.equals(other.getDescriptionCamp()))) &&
            ((this.division==null && other.getDivision()==null) || 
             (this.division!=null &&
              this.division.equals(other.getDivision()))) &&
            ((this.effectiveDate==null && other.getEffectiveDate()==null) || 
             (this.effectiveDate!=null &&
              this.effectiveDate.equals(other.getEffectiveDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.rate==null && other.getRate()==null) || 
             (this.rate!=null &&
              this.rate.equals(other.getRate()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.typeCampaign==null && other.getTypeCampaign()==null) || 
             (this.typeCampaign!=null &&
              this.typeCampaign.equals(other.getTypeCampaign())));
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
        if (getCodCamp() != null) {
            _hashCode += getCodCamp().hashCode();
        }
        if (getCommunity() != null) {
            _hashCode += getCommunity().hashCode();
        }
        if (getDeathLine() != null) {
            _hashCode += getDeathLine().hashCode();
        }
        if (getDescriptionCamp() != null) {
            _hashCode += getDescriptionCamp().hashCode();
        }
        if (getDivision() != null) {
            _hashCode += getDivision().hashCode();
        }
        if (getEffectiveDate() != null) {
            _hashCode += getEffectiveDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getRate() != null) {
            _hashCode += getRate().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getTypeCampaign() != null) {
            _hashCode += getTypeCampaign().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CampaniaStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "campaniaStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codCamp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codCamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("community");
        elemField.setXmlName(new javax.xml.namespace.QName("", "community"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deathLine");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deathLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descriptionCamp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descriptionCamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("division");
        elemField.setXmlName(new javax.xml.namespace.QName("", "division"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "effectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typeCampaign");
        elemField.setXmlName(new javax.xml.namespace.QName("", "typeCampaign"));
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
