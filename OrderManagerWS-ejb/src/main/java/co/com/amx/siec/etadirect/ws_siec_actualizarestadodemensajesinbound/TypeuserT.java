
package co.com.amx.siec.etadirect.ws_siec_actualizarestadodemensajesinbound;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Typeuser_t complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Typeuser_t"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="now" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="login" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="company" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="auth_string" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Typeuser_t", propOrder = { "now", "login", "company", "authString" })
public class TypeuserT {

    @XmlElement(required = true)
    protected String now;
    @XmlElement(required = true)
    protected String login;
    @XmlElement(required = true)
    protected String company;
    @XmlElement(name = "auth_string", required = true)
    protected String authString;

    /**
     * Gets the value of the now property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNow() {
        return now;
    }

    /**
     * Sets the value of the now property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNow(String value) {
        this.now = value;
    }

    /**
     * Gets the value of the login property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLogin() {
        return login;
    }

    /**
     * Sets the value of the login property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLogin(String value) {
        this.login = value;
    }

    /**
     * Gets the value of the company property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCompany(String value) {
        this.company = value;
    }

    /**
     * Gets the value of the authString property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAuthString() {
        return authString;
    }

    /**
     * Sets the value of the authString property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAuthString(String value) {
        this.authString = value;
    }

}
