//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.13 at 11:05:18 AM COT 
//
package co.com.claro.wsorder.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for TypeInboundInterfaceResponseElement complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="TypeInboundInterfaceResponseElement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="user" type="{http://www.amx.com.co/SIEC/ETAdirect/WS_SIEC_ActualizarActividadesDeFacturacionMGWInbound}TypeUserElement" minOccurs="0"/>
 *         &lt;element name="head" type="{http://www.amx.com.co/SIEC/ETAdirect/WS_SIEC_ActualizarActividadesDeFacturacionMGWInbound}TypeHeadResponseElement" minOccurs="0"/>
 *         &lt;element name="data" type="{http://www.amx.com.co/SIEC/ETAdirect/WS_SIEC_ActualizarActividadesDeFacturacionMGWInbound}TypeDataResponseElement" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TypeInboundInterfaceResponseElement", propOrder = {
    "user",
    "head",
    "data"
})
public class TypeInboundInterfaceResponseElement {

    protected TypeUserElement user;
    protected TypeHeadResponseElement head;
    protected TypeDataResponseElement data;

    /**
     * Gets the value of the user property.
     *
     * @return possible object is {@link TypeUserElement }
     *
     */
    public TypeUserElement getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     *
     * @param value allowed object is {@link TypeUserElement }
     *
     */
    public void setUser(TypeUserElement value) {
        this.user = value;
    }

    /**
     * Gets the value of the head property.
     *
     * @return possible object is {@link TypeHeadResponseElement }
     *
     */
    public TypeHeadResponseElement getHead() {
        return head;
    }

    /**
     * Sets the value of the head property.
     *
     * @param value allowed object is {@link TypeHeadResponseElement }
     *
     */
    public void setHead(TypeHeadResponseElement value) {
        this.head = value;
    }

    /**
     * Gets the value of the data property.
     *
     * @return possible object is {@link TypeDataResponseElement }
     *
     */
    public TypeDataResponseElement getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     *
     * @param value allowed object is {@link TypeDataResponseElement }
     *
     */
    public void setData(TypeDataResponseElement value) {
        this.data = value;
    }

    @Override
    public String toString() {
        return "TypeInboundInterfaceResponseElement [user=" + user + ", head="
                + head + ", data=" + data + "]";
    }

}