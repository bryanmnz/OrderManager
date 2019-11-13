
package co.com.amx.siec.etadirect.ws_siec_actualizarestadodemensajesinbound;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the co.com.amx.siec.etadirect.ws_siec_actualizarestadodemensajesinbound package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 *
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ActualizarEstadoMensajeRequest_QNAME =
        new QName("http://www.amx.com.co/SIEC/ETAdirect/WS_SIEC_ActualizarEstadoDeMensajesInbound",
                  "actualizarEstadoMensaje_request");
    private final static QName _ActualizarEstadoMensajeResponse_QNAME =
        new QName("http://www.amx.com.co/SIEC/ETAdirect/WS_SIEC_ActualizarEstadoDeMensajesInbound",
                  "actualizarEstadoMensaje_response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.com.amx.siec.etadirect.ws_siec_actualizarestadodemensajesinbound
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TypesetMessageStatusRequestData }
     *
     */
    public TypesetMessageStatusRequestData createTypesetMessageStatusRequestData() {
        return new TypesetMessageStatusRequestData();
    }

    /**
     * Create an instance of {@link TypesetMessageStatusResponseData }
     *
     */
    public TypesetMessageStatusResponseData createTypesetMessageStatusResponseData() {
        return new TypesetMessageStatusResponseData();
    }

    /**
     * Create an instance of {@link TypemessageT }
     *
     */
    public TypemessageT createTypemessageT() {
        return new TypemessageT();
    }

    /**
     * Create an instance of {@link TypemessagesT }
     *
     */
    public TypemessagesT createTypemessagesT() {
        return new TypemessagesT();
    }

    /**
     * Create an instance of {@link TypeuserT }
     *
     */
    public TypeuserT createTypeuserT() {
        return new TypeuserT();
    }

    /**
     * Create an instance of {@link TyperesultT }
     *
     */
    public TyperesultT createTyperesultT() {
        return new TyperesultT();
    }

    /**
     * Create an instance of {@link TypemessageResponseT }
     *
     */
    public TypemessageResponseT createTypemessageResponseT() {
        return new TypemessageResponseT();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypesetMessageStatusRequestData }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.amx.com.co/SIEC/ETAdirect/WS_SIEC_ActualizarEstadoDeMensajesInbound",
                    name = "actualizarEstadoMensaje_request")
    public JAXBElement<TypesetMessageStatusRequestData> createActualizarEstadoMensajeRequest(TypesetMessageStatusRequestData value) {
        return new JAXBElement<TypesetMessageStatusRequestData>(_ActualizarEstadoMensajeRequest_QNAME,
                                                                TypesetMessageStatusRequestData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypesetMessageStatusResponseData }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.amx.com.co/SIEC/ETAdirect/WS_SIEC_ActualizarEstadoDeMensajesInbound",
                    name = "actualizarEstadoMensaje_response")
    public JAXBElement<TypesetMessageStatusResponseData> createActualizarEstadoMensajeResponse(TypesetMessageStatusResponseData value) {
        return new JAXBElement<TypesetMessageStatusResponseData>(_ActualizarEstadoMensajeResponse_QNAME,
                                                                 TypesetMessageStatusResponseData.class, null, value);
    }

}
