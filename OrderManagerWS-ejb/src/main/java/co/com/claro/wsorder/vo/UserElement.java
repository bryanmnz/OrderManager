
package co.com.claro.wsorder.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para user_element complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="user_element">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="now" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="login" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="company" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="auth_string" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "user_element", propOrder = {
    "now",
    "login",
    "company",
    "authString"
})
public class UserElement {

    @XmlElement(required = true)
    protected String now;
    @XmlElement(required = true)
    protected String login;
    @XmlElement(required = true)
    protected String company;
    @XmlElement(name = "auth_string", required = true)
    protected String authString;

    /**
     * Obtiene el valor de la propiedad now.
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
     * Define el valor de la propiedad now.
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
     * Obtiene el valor de la propiedad login.
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
     * Define el valor de la propiedad login.
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
     * Obtiene el valor de la propiedad company.
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
     * Define el valor de la propiedad company.
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
     * Obtiene el valor de la propiedad authString.
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
     * Define el valor de la propiedad authString.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthString(String value) {
        this.authString = value;
    }

    @Override
	public String toString() {
    	StringBuilder sb = new StringBuilder();
    	sb.append("UserElement [");
    	sb.append("now= ");
    	sb.append(now);
    	sb.append(", login= ");
    	sb.append(login);
    	sb.append(", company= ");
    	sb.append(company);
    	sb.append(", authString= ");
    	sb.append(authString);
    	sb.append("]");
		return sb.toString();
	}
}
