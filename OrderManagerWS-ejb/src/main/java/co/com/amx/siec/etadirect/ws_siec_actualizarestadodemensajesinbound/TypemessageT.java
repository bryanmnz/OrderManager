
package co.com.amx.siec.etadirect.ws_siec_actualizarestadodemensajesinbound;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Typemessage_t complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Typemessage_t"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="message_id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="XA_OrigenOrden" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Typemessage_t", propOrder = { "messageId", "status", "description", "data", "xaOrigenOrden" })
public class TypemessageT {

    @XmlElement(name = "message_id")
    protected long messageId;
    @XmlElement(required = true)
    protected String status;
    protected String description;
    protected String data;
    @XmlElement(name = "XA_OrigenOrden", required = true)
    protected String xaOrigenOrden;

    /**
     * Gets the value of the messageId property.
     *
     */
    public long getMessageId() {
        return messageId;
    }

    /**
     * Sets the value of the messageId property.
     *
     */
    public void setMessageId(long value) {
        this.messageId = value;
    }

    /**
     * Gets the value of the status property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the description property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the data property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setData(String value) {
        this.data = value;
    }

    /**
     * Gets the value of the xaOrigenOrden property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getXAOrigenOrden() {
        return xaOrigenOrden;
    }

    /**
     * Sets the value of the xaOrigenOrden property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setXAOrigenOrden(String value) {
        this.xaOrigenOrden = value;
    }

}
