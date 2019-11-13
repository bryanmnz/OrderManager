package co.com.claro.wsorder.exceptions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Clase para manejo de excepciones en los servicios web.
 * <p>
 * Java class for BusinessExceptionFault complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="BusinessExceptionFault">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="errorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessExceptionFault", propOrder = {"errorCode",
    "errorMsg", "message"})
public class BusinessExceptionFault extends Exception {

    /**
     * Atributo que determina la constante de serializacion.
     */
    private static final long serialVersionUID = 1L;
    protected String errorCode;
    protected String errorMsg;
    protected String message;

    /**
     * Constructor de la clase.
     *
     * @param errorCode
     * @param errorMsg
     * @param message
     */
    public BusinessExceptionFault(String errorCode, String errorMsg,
            String message) {
        super();
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
        this.message = message;
    }

    /**
     * Gets the value of the errorCode property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the errorMsg property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    /**
     * Sets the value of the errorMsg property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setErrorMsg(String value) {
        this.errorMsg = value;
    }

    /**
     * Gets the value of the message property.
     *
     * @return possible object is {@link String }
     *
     */
    @Override
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setMessage(String value) {
        this.message = value;
    }

    @Override
    public String toString() {
        return "BusinessExceptionFault [errorCode=" + errorCode + ", errorMsg="
                + errorMsg + ", message=" + message + "]";
    }

}
