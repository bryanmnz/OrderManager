/**
 * WorkOrderInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.telmex.pcml.service;

public class WorkOrderInformation  implements java.io.Serializable {
    private net.telmex.pcml.service.WoServiceVO[] services;

    private net.telmex.pcml.service.WorkOrderVO workOrder;

    public WorkOrderInformation() {
    }

    public WorkOrderInformation(
           net.telmex.pcml.service.WoServiceVO[] services,
           net.telmex.pcml.service.WorkOrderVO workOrder) {
           this.services = services;
           this.workOrder = workOrder;
    }


    /**
     * Gets the services value for this WorkOrderInformation.
     * 
     * @return services
     */
    public net.telmex.pcml.service.WoServiceVO[] getServices() {
        return services;
    }


    /**
     * Sets the services value for this WorkOrderInformation.
     * 
     * @param services
     */
    public void setServices(net.telmex.pcml.service.WoServiceVO[] services) {
        this.services = services;
    }

    public net.telmex.pcml.service.WoServiceVO getServices(int i) {
        return this.services[i];
    }

    public void setServices(int i, net.telmex.pcml.service.WoServiceVO _value) {
        this.services[i] = _value;
    }


    /**
     * Gets the workOrder value for this WorkOrderInformation.
     * 
     * @return workOrder
     */
    public net.telmex.pcml.service.WorkOrderVO getWorkOrder() {
        return workOrder;
    }


    /**
     * Sets the workOrder value for this WorkOrderInformation.
     * 
     * @param workOrder
     */
    public void setWorkOrder(net.telmex.pcml.service.WorkOrderVO workOrder) {
        this.workOrder = workOrder;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WorkOrderInformation)) return false;
        WorkOrderInformation other = (WorkOrderInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.services==null && other.getServices()==null) || 
             (this.services!=null &&
              java.util.Arrays.equals(this.services, other.getServices()))) &&
            ((this.workOrder==null && other.getWorkOrder()==null) || 
             (this.workOrder!=null &&
              this.workOrder.equals(other.getWorkOrder())));
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
        if (getServices() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServices());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServices(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWorkOrder() != null) {
            _hashCode += getWorkOrder().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WorkOrderInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "workOrderInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("services");
        elemField.setXmlName(new javax.xml.namespace.QName("", "services"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "woServiceVO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "workOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "workOrderVO"));
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
