//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.13 at 11:11:35 AM COT 
//
package co.com.claro.wsorder.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for TypeAppointmentResponseElement complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="TypeAppointmentResponseElement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="appt_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customer_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="report" type="{http://www.amx.com.co/SIEC/ETAdirect/WS_SIEC_ActualizarOrdenMGWInbound}TypeReportElement" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TypeAppointmentResponseElement", propOrder = {
    "apptNumber",
    "name",
    "customerNumber",
    "aid",
    "report"
})
public class TypeAppointmentResponseElement {

    @XmlElement(name = "appt_number")
    protected String apptNumber;
    protected String name;
    @XmlElement(name = "customer_number")
    protected String customerNumber;
    protected Integer aid;
    protected TypeReportElement report;

    /**
     * Gets the value of the apptNumber property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getApptNumber() {
        return apptNumber;
    }

    /**
     * Sets the value of the apptNumber property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setApptNumber(String value) {
        this.apptNumber = value;
    }

    /**
     * Gets the value of the name property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the customerNumber property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getCustomerNumber() {
        return customerNumber;
    }

    /**
     * Sets the value of the customerNumber property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setCustomerNumber(String value) {
        this.customerNumber = value;
    }

    /**
     * Gets the value of the aid property.
     *
     * @return possible object is {@link Integer }
     *
     */
    public Integer getAid() {
        return aid;
    }

    /**
     * Sets the value of the aid property.
     *
     * @param value allowed object is {@link Integer }
     *
     */
    public void setAid(Integer value) {
        this.aid = value;
    }

    /**
     * Gets the value of the report property.
     *
     * @return possible object is {@link TypeReportElement }
     *
     */
    public TypeReportElement getReport() {
        return report;
    }

    /**
     * Sets the value of the report property.
     *
     * @param value allowed object is {@link TypeReportElement }
     *
     */
    public void setReport(TypeReportElement value) {
        this.report = value;
    }

    @Override
    public String toString() {
        return "TypeAppointmentResponseElement [apptNumber=" + apptNumber
                + ", name=" + name + ", customerNumber=" + customerNumber
                + ", aid=" + aid + ", report=" + report + "]";
    }

}
