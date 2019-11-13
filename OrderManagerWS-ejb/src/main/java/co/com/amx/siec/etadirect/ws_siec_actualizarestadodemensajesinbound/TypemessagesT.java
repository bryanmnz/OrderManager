
package co.com.amx.siec.etadirect.ws_siec_actualizarestadodemensajesinbound;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Typemessages_t complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Typemessages_t"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="message" type="{http://www.amx.com.co/SIEC/ETAdirect/WS_SIEC_ActualizarEstadoDeMensajesInbound}Typemessage_t" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Typemessages_t", propOrder = { "message" })
public class TypemessagesT {

    @XmlElement(required = true)
    protected List<TypemessageT> message;

    /**
     * Gets the value of the message property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the message property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessage().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypemessageT }
     *
     *
     * @return 
     */
    public List<TypemessageT> getMessage() {
        if (message == null) {
            message = new ArrayList<>();
        }
        return this.message;
    }

}
