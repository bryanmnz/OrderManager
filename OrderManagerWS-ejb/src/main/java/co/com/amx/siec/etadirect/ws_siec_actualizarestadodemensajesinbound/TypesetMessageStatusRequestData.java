
package co.com.amx.siec.etadirect.ws_siec_actualizarestadodemensajesinbound;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Typeset_message_status_request_data complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Typeset_message_status_request_data"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="user" type="{http://www.amx.com.co/SIEC/ETAdirect/WS_SIEC_ActualizarEstadoDeMensajesInbound}Typeuser_t"/&gt;
 *         &lt;element name="messages" type="{http://www.amx.com.co/SIEC/ETAdirect/WS_SIEC_ActualizarEstadoDeMensajesInbound}Typemessages_t"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Typeset_message_status_request_data", propOrder = { "user", "messages" })
public class TypesetMessageStatusRequestData {

    @XmlElement(required = true)
    protected TypeuserT user;
    @XmlElement(required = true)
    protected TypemessagesT messages;

    /**
     * Gets the value of the user property.
     *
     * @return
     *     possible object is
     *     {@link TypeuserT }
     *
     */
    public TypeuserT getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     *
     * @param value
     *     allowed object is
     *     {@link TypeuserT }
     *
     */
    public void setUser(TypeuserT value) {
        this.user = value;
    }

    /**
     * Gets the value of the messages property.
     *
     * @return
     *     possible object is
     *     {@link TypemessagesT }
     *
     */
    public TypemessagesT getMessages() {
        return messages;
    }

    /**
     * Sets the value of the messages property.
     *
     * @param value
     *     allowed object is
     *     {@link TypemessagesT }
     *
     */
    public void setMessages(TypemessagesT value) {
        this.messages = value;
    }

}
