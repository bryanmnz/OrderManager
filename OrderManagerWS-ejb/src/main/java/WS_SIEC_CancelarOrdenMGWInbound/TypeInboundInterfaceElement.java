/**
 * TypeInboundInterfaceElement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package WS_SIEC_CancelarOrdenMGWInbound;

public class TypeInboundInterfaceElement  implements java.io.Serializable {
    private TypeUserElement user;

    private TypeHeadElement head;

    private TypeDataElement data;

    public TypeInboundInterfaceElement() {
    }

    public TypeInboundInterfaceElement(
           TypeUserElement user,
           TypeHeadElement head,
           TypeDataElement data) {
           this.user = user;
           this.head = head;
           this.data = data;
    }


    /**
     * Gets the user value for this TypeInboundInterfaceElement.
     * 
     * @return user
     */
    public TypeUserElement getUser() {
        return user;
    }


    /**
     * Sets the user value for this TypeInboundInterfaceElement.
     * 
     * @param user
     */
    public void setUser(TypeUserElement user) {
        this.user = user;
    }


    /**
     * Gets the head value for this TypeInboundInterfaceElement.
     * 
     * @return head
     */
    public TypeHeadElement getHead() {
        return head;
    }


    /**
     * Sets the head value for this TypeInboundInterfaceElement.
     * 
     * @param head
     */
    public void setHead(TypeHeadElement head) {
        this.head = head;
    }


    /**
     * Gets the data value for this TypeInboundInterfaceElement.
     * 
     * @return data
     */
    public TypeDataElement getData() {
        return data;
    }


    /**
     * Sets the data value for this TypeInboundInterfaceElement.
     * 
     * @param data
     */
    public void setData(TypeDataElement data) {
        this.data = data;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TypeInboundInterfaceElement)) return false;
        TypeInboundInterfaceElement other = (TypeInboundInterfaceElement) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.user==null && other.getUser()==null) || 
             (this.user!=null &&
              this.user.equals(other.getUser()))) &&
            ((this.head==null && other.getHead()==null) || 
             (this.head!=null &&
              this.head.equals(other.getHead()))) &&
            ((this.data==null && other.getData()==null) || 
             (this.data!=null &&
              this.data.equals(other.getData())));
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
        if (getUser() != null) {
            _hashCode += getUser().hashCode();
        }
        if (getHead() != null) {
            _hashCode += getHead().hashCode();
        }
        if (getData() != null) {
            _hashCode += getData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TypeInboundInterfaceElement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.amx.com.co/SIEC/ETAdirect/WS_SIEC_CancelarOrdenMGWInbound", "TypeInboundInterfaceElement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.amx.com.co/SIEC/ETAdirect/WS_SIEC_CancelarOrdenMGWInbound", "TypeUserElement"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("head");
        elemField.setXmlName(new javax.xml.namespace.QName("", "head"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.amx.com.co/SIEC/ETAdirect/WS_SIEC_CancelarOrdenMGWInbound", "TypeHeadElement"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data");
        elemField.setXmlName(new javax.xml.namespace.QName("", "data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.amx.com.co/SIEC/ETAdirect/WS_SIEC_CancelarOrdenMGWInbound", "TypeDataElement"));
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
