/**
 * ScheduleStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.telmex.pcml.service;

public class ScheduleStruct  implements java.io.Serializable {
    private java.lang.String category;

    private java.lang.String date;

    private java.lang.String expirationDate;

    private java.lang.String schedule;

    private java.lang.String scheduleName;

    private java.lang.String state;

    public ScheduleStruct() {
    }

    public ScheduleStruct(
           java.lang.String category,
           java.lang.String date,
           java.lang.String expirationDate,
           java.lang.String schedule,
           java.lang.String scheduleName,
           java.lang.String state) {
           this.category = category;
           this.date = date;
           this.expirationDate = expirationDate;
           this.schedule = schedule;
           this.scheduleName = scheduleName;
           this.state = state;
    }


    /**
     * Gets the category value for this ScheduleStruct.
     * 
     * @return category
     */
    public java.lang.String getCategory() {
        return category;
    }


    /**
     * Sets the category value for this ScheduleStruct.
     * 
     * @param category
     */
    public void setCategory(java.lang.String category) {
        this.category = category;
    }


    /**
     * Gets the date value for this ScheduleStruct.
     * 
     * @return date
     */
    public java.lang.String getDate() {
        return date;
    }


    /**
     * Sets the date value for this ScheduleStruct.
     * 
     * @param date
     */
    public void setDate(java.lang.String date) {
        this.date = date;
    }


    /**
     * Gets the expirationDate value for this ScheduleStruct.
     * 
     * @return expirationDate
     */
    public java.lang.String getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this ScheduleStruct.
     * 
     * @param expirationDate
     */
    public void setExpirationDate(java.lang.String expirationDate) {
        this.expirationDate = expirationDate;
    }


    /**
     * Gets the schedule value for this ScheduleStruct.
     * 
     * @return schedule
     */
    public java.lang.String getSchedule() {
        return schedule;
    }


    /**
     * Sets the schedule value for this ScheduleStruct.
     * 
     * @param schedule
     */
    public void setSchedule(java.lang.String schedule) {
        this.schedule = schedule;
    }


    /**
     * Gets the scheduleName value for this ScheduleStruct.
     * 
     * @return scheduleName
     */
    public java.lang.String getScheduleName() {
        return scheduleName;
    }


    /**
     * Sets the scheduleName value for this ScheduleStruct.
     * 
     * @param scheduleName
     */
    public void setScheduleName(java.lang.String scheduleName) {
        this.scheduleName = scheduleName;
    }


    /**
     * Gets the state value for this ScheduleStruct.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this ScheduleStruct.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ScheduleStruct)) return false;
        ScheduleStruct other = (ScheduleStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate()))) &&
            ((this.schedule==null && other.getSchedule()==null) || 
             (this.schedule!=null &&
              this.schedule.equals(other.getSchedule()))) &&
            ((this.scheduleName==null && other.getScheduleName()==null) || 
             (this.scheduleName!=null &&
              this.scheduleName.equals(other.getScheduleName()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState())));
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
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getExpirationDate() != null) {
            _hashCode += getExpirationDate().hashCode();
        }
        if (getSchedule() != null) {
            _hashCode += getSchedule().hashCode();
        }
        if (getScheduleName() != null) {
            _hashCode += getScheduleName().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ScheduleStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "scheduleStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("", "category"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schedule");
        elemField.setXmlName(new javax.xml.namespace.QName("", "schedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scheduleName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "state"));
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
