
package co.com.amx.siec.etadirect.ws_siec_actualizarestadodemensajesinbound;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Typemessage_response_t complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Typemessage_response_t"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="message_id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="result" type="{http://www.amx.com.co/SIEC/ETAdirect/WS_SIEC_ActualizarEstadoDeMensajesInbound}Typeresult_t"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Typemessage_response_t", propOrder = { "messageId", "result" })
public class TypemessageResponseT {

    @XmlElement(name = "message_id")
    protected long messageId;
    @XmlElement(required = true)
    protected TyperesultT result;

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
     * Gets the value of the result property.
     *
     * @return
     *     possible object is
     *     {@link TyperesultT }
     *
     */
    public TyperesultT getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     *
     * @param value
     *     allowed object is
     *     {@link TyperesultT }
     *
     */
    public void setResult(TyperesultT value) {
        this.result = value;
    }

}
