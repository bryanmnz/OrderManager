
package com.oracle.xmlns.inbound.ws_siec_actualizarestadodemensajesinbound;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * OSB Service
 *
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150616.1732
 * Generated source version: 2.2
 *
 */
@WebServiceClient(name = "WS_SIEC_ActualizarEstadoDeMensajesInbound_client_ep",
                  targetNamespace = "http://xmlns.oracle.com/Inbound/WS_SIEC_ActualizarEstadoDeMensajesInbound",
                  wsdlLocation =
                  "http://172.24.160.148:8080/TOA_CO/ProxyServices/SIECCo/Inbound/WSSIECActualizarEstadoDeMensajesInbound_PS?wsdl#%7Bhttp%3A%2F%2Fxmlns.oracle.com%2FInbound%2FWS_SIEC_ActualizarEstadoDeMensajesInbound%7DWS_SIEC_ActualizarEstadoDeMensajesInbound_client_ep")
public class WSSIECActualizarEstadoDeMensajesInboundClientEp extends Service {

    private final static URL WSSIECACTUALIZARESTADODEMENSAJESINBOUNDCLIENTEP_WSDL_LOCATION;
    private final static WebServiceException WSSIECACTUALIZARESTADODEMENSAJESINBOUNDCLIENTEP_EXCEPTION;
    private final static QName WSSIECACTUALIZARESTADODEMENSAJESINBOUNDCLIENTEP_QNAME =
        new QName("http://xmlns.oracle.com/Inbound/WS_SIEC_ActualizarEstadoDeMensajesInbound",
                  "WS_SIEC_ActualizarEstadoDeMensajesInbound_client_ep");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url =
                new URL("http://172.24.160.148:8080/TOA_CO/ProxyServices/SIECCo/Inbound/WSSIECActualizarEstadoDeMensajesInbound_PS?wsdl#%7Bhttp%3A%2F%2Fxmlns.oracle.com%2FInbound%2FWS_SIEC_ActualizarEstadoDeMensajesInbound%7DWS_SIEC_ActualizarEstadoDeMensajesInbound_client_ep");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSSIECACTUALIZARESTADODEMENSAJESINBOUNDCLIENTEP_WSDL_LOCATION = url;
        WSSIECACTUALIZARESTADODEMENSAJESINBOUNDCLIENTEP_EXCEPTION = e;
    }

    public WSSIECActualizarEstadoDeMensajesInboundClientEp() {
        super(__getWsdlLocation(), WSSIECACTUALIZARESTADODEMENSAJESINBOUNDCLIENTEP_QNAME);
    }

    public WSSIECActualizarEstadoDeMensajesInboundClientEp(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSSIECACTUALIZARESTADODEMENSAJESINBOUNDCLIENTEP_QNAME, features);
    }

    public WSSIECActualizarEstadoDeMensajesInboundClientEp(URL wsdlLocation) {
        super(wsdlLocation, WSSIECACTUALIZARESTADODEMENSAJESINBOUNDCLIENTEP_QNAME);
    }

    public WSSIECActualizarEstadoDeMensajesInboundClientEp(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSSIECACTUALIZARESTADODEMENSAJESINBOUNDCLIENTEP_QNAME, features);
    }

    public WSSIECActualizarEstadoDeMensajesInboundClientEp(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WSSIECActualizarEstadoDeMensajesInboundClientEp(URL wsdlLocation, QName serviceName,
                                                           WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns WSSIECActualizarEstadoDeMensajesInboundInterface
     */
    @WebEndpoint(name = "WS_SIEC_ActualizarEstadoDeMensajesInbound_pt")
    public WSSIECActualizarEstadoDeMensajesInboundInterface getWSSIECActualizarEstadoDeMensajesInboundPt() {
        return super.getPort(new QName("http://xmlns.oracle.com/Inbound/WS_SIEC_ActualizarEstadoDeMensajesInbound",
                                       "WS_SIEC_ActualizarEstadoDeMensajesInbound_pt"),
                             WSSIECActualizarEstadoDeMensajesInboundInterface.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WSSIECActualizarEstadoDeMensajesInboundInterface
     */
    @WebEndpoint(name = "WS_SIEC_ActualizarEstadoDeMensajesInbound_pt")
    public WSSIECActualizarEstadoDeMensajesInboundInterface getWSSIECActualizarEstadoDeMensajesInboundPt(WebServiceFeature... features) {
        return super.getPort(new QName("http://xmlns.oracle.com/Inbound/WS_SIEC_ActualizarEstadoDeMensajesInbound",
                                       "WS_SIEC_ActualizarEstadoDeMensajesInbound_pt"),
                             WSSIECActualizarEstadoDeMensajesInboundInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSSIECACTUALIZARESTADODEMENSAJESINBOUNDCLIENTEP_EXCEPTION != null) {
            throw WSSIECACTUALIZARESTADODEMENSAJESINBOUNDCLIENTEP_EXCEPTION;
        }
        return WSSIECACTUALIZARESTADODEMENSAJESINBOUNDCLIENTEP_WSDL_LOCATION;
    }

}
