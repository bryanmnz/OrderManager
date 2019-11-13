/**
 * SubscriberStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.telmex.pcml.service;

public class SubscriberStruct  implements java.io.Serializable {
    private java.lang.String businessExtension;

    private java.lang.String businessPhoneNumber;

    private java.lang.String document;

    private java.lang.String documentType;

    private java.lang.String lastName;

    private java.lang.String maternalLastName;

    private java.lang.String name;

    private java.lang.String phoneNumber;

    public SubscriberStruct() {
    }

    public SubscriberStruct(
           java.lang.String businessExtension,
           java.lang.String businessPhoneNumber,
           java.lang.String document,
           java.lang.String documentType,
           java.lang.String lastName,
           java.lang.String maternalLastName,
           java.lang.String name,
           java.lang.String phoneNumber) {
           this.businessExtension = businessExtension;
           this.businessPhoneNumber = businessPhoneNumber;
           this.document = document;
           this.documentType = documentType;
           this.lastName = lastName;
           this.maternalLastName = maternalLastName;
           this.name = name;
           this.phoneNumber = phoneNumber;
    }


    /**
     * Gets the businessExtension value for this SubscriberStruct.
     * 
     * @return businessExtension
     */
    public java.lang.String getBusinessExtension() {
        return businessExtension;
    }


    /**
     * Sets the businessExtension value for this SubscriberStruct.
     * 
     * @param businessExtension
     */
    public void setBusinessExtension(java.lang.String businessExtension) {
        this.businessExtension = businessExtension;
    }


    /**
     * Gets the businessPhoneNumber value for this SubscriberStruct.
     * 
     * @return businessPhoneNumber
     */
    public java.lang.String getBusinessPhoneNumber() {
        return businessPhoneNumber;
    }


    /**
     * Sets the businessPhoneNumber value for this SubscriberStruct.
     * 
     * @param businessPhoneNumber
     */
    public void setBusinessPhoneNumber(java.lang.String businessPhoneNumber) {
        this.businessPhoneNumber = businessPhoneNumber;
    }


    /**
     * Gets the document value for this SubscriberStruct.
     * 
     * @return document
     */
    public java.lang.String getDocument() {
        return document;
    }


    /**
     * Sets the document value for this SubscriberStruct.
     * 
     * @param document
     */
    public void setDocument(java.lang.String document) {
        this.document = document;
    }


    /**
     * Gets the documentType value for this SubscriberStruct.
     * 
     * @return documentType
     */
    public java.lang.String getDocumentType() {
        return documentType;
    }


    /**
     * Sets the documentType value for this SubscriberStruct.
     * 
     * @param documentType
     */
    public void setDocumentType(java.lang.String documentType) {
        this.documentType = documentType;
    }


    /**
     * Gets the lastName value for this SubscriberStruct.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this SubscriberStruct.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the maternalLastName value for this SubscriberStruct.
     * 
     * @return maternalLastName
     */
    public java.lang.String getMaternalLastName() {
        return maternalLastName;
    }


    /**
     * Sets the maternalLastName value for this SubscriberStruct.
     * 
     * @param maternalLastName
     */
    public void setMaternalLastName(java.lang.String maternalLastName) {
        this.maternalLastName = maternalLastName;
    }


    /**
     * Gets the name value for this SubscriberStruct.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this SubscriberStruct.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the phoneNumber value for this SubscriberStruct.
     * 
     * @return phoneNumber
     */
    public java.lang.String getPhoneNumber() {
        return phoneNumber;
    }


    /**
     * Sets the phoneNumber value for this SubscriberStruct.
     * 
     * @param phoneNumber
     */
    public void setPhoneNumber(java.lang.String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubscriberStruct)) return false;
        SubscriberStruct other = (SubscriberStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.businessExtension==null && other.getBusinessExtension()==null) || 
             (this.businessExtension!=null &&
              this.businessExtension.equals(other.getBusinessExtension()))) &&
            ((this.businessPhoneNumber==null && other.getBusinessPhoneNumber()==null) || 
             (this.businessPhoneNumber!=null &&
              this.businessPhoneNumber.equals(other.getBusinessPhoneNumber()))) &&
            ((this.document==null && other.getDocument()==null) || 
             (this.document!=null &&
              this.document.equals(other.getDocument()))) &&
            ((this.documentType==null && other.getDocumentType()==null) || 
             (this.documentType!=null &&
              this.documentType.equals(other.getDocumentType()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.maternalLastName==null && other.getMaternalLastName()==null) || 
             (this.maternalLastName!=null &&
              this.maternalLastName.equals(other.getMaternalLastName()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.phoneNumber==null && other.getPhoneNumber()==null) || 
             (this.phoneNumber!=null &&
              this.phoneNumber.equals(other.getPhoneNumber())));
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
        if (getBusinessExtension() != null) {
            _hashCode += getBusinessExtension().hashCode();
        }
        if (getBusinessPhoneNumber() != null) {
            _hashCode += getBusinessPhoneNumber().hashCode();
        }
        if (getDocument() != null) {
            _hashCode += getDocument().hashCode();
        }
        if (getDocumentType() != null) {
            _hashCode += getDocumentType().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getMaternalLastName() != null) {
            _hashCode += getMaternalLastName().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getPhoneNumber() != null) {
            _hashCode += getPhoneNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubscriberStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "subscriberStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessExtension");
        elemField.setXmlName(new javax.xml.namespace.QName("", "businessExtension"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessPhoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "businessPhoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("document");
        elemField.setXmlName(new javax.xml.namespace.QName("", "document"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maternalLastName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maternalLastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phoneNumber"));
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
