/**
 * TypeUserElement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package WS_SIEC_CancelarOrdenMGWInbound;

public class TypeUserElement  implements java.io.Serializable {
    private java.lang.String now;

    private java.lang.String login;

    private java.lang.String company;

    private java.lang.String auth_string;

    public TypeUserElement() {
    }

    public TypeUserElement(
           java.lang.String now,
           java.lang.String login,
           java.lang.String company,
           java.lang.String auth_string) {
           this.now = now;
           this.login = login;
           this.company = company;
           this.auth_string = auth_string;
    }


    /**
     * Gets the now value for this TypeUserElement.
     * 
     * @return now
     */
    public java.lang.String getNow() {
        return now;
    }


    /**
     * Sets the now value for this TypeUserElement.
     * 
     * @param now
     */
    public void setNow(java.lang.String now) {
        this.now = now;
    }


    /**
     * Gets the login value for this TypeUserElement.
     * 
     * @return login
     */
    public java.lang.String getLogin() {
        return login;
    }


    /**
     * Sets the login value for this TypeUserElement.
     * 
     * @param login
     */
    public void setLogin(java.lang.String login) {
        this.login = login;
    }


    /**
     * Gets the company value for this TypeUserElement.
     * 
     * @return company
     */
    public java.lang.String getCompany() {
        return company;
    }


    /**
     * Sets the company value for this TypeUserElement.
     * 
     * @param company
     */
    public void setCompany(java.lang.String company) {
        this.company = company;
    }


    /**
     * Gets the auth_string value for this TypeUserElement.
     * 
     * @return auth_string
     */
    public java.lang.String getAuth_string() {
        return auth_string;
    }


    /**
     * Sets the auth_string value for this TypeUserElement.
     * 
     * @param auth_string
     */
    public void setAuth_string(java.lang.String auth_string) {
        this.auth_string = auth_string;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TypeUserElement)) return false;
        TypeUserElement other = (TypeUserElement) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.now==null && other.getNow()==null) || 
             (this.now!=null &&
              this.now.equals(other.getNow()))) &&
            ((this.login==null && other.getLogin()==null) || 
             (this.login!=null &&
              this.login.equals(other.getLogin()))) &&
            ((this.company==null && other.getCompany()==null) || 
             (this.company!=null &&
              this.company.equals(other.getCompany()))) &&
            ((this.auth_string==null && other.getAuth_string()==null) || 
             (this.auth_string!=null &&
              this.auth_string.equals(other.getAuth_string())));
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
        if (getNow() != null) {
            _hashCode += getNow().hashCode();
        }
        if (getLogin() != null) {
            _hashCode += getLogin().hashCode();
        }
        if (getCompany() != null) {
            _hashCode += getCompany().hashCode();
        }
        if (getAuth_string() != null) {
            _hashCode += getAuth_string().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TypeUserElement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.amx.com.co/SIEC/ETAdirect/WS_SIEC_CancelarOrdenMGWInbound", "TypeUserElement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("now");
        elemField.setXmlName(new javax.xml.namespace.QName("", "now"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("login");
        elemField.setXmlName(new javax.xml.namespace.QName("", "login"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company");
        elemField.setXmlName(new javax.xml.namespace.QName("", "company"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auth_string");
        elemField.setXmlName(new javax.xml.namespace.QName("", "auth_string"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
