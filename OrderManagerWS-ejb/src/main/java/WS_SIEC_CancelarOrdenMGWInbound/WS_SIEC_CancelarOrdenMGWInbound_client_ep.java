/**
 * WS_SIEC_CancelarOrdenMGWInbound_client_ep.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package WS_SIEC_CancelarOrdenMGWInbound;

public interface WS_SIEC_CancelarOrdenMGWInbound_client_ep extends javax.xml.rpc.Service {

/**
 * OSB Service
 */
    public java.lang.String getWS_SIEC_CancelarOrdenMGWInbound_ptAddress();

    public WS_SIEC_CancelarOrdenMGWInboundInterface getWS_SIEC_CancelarOrdenMGWInbound_pt() throws javax.xml.rpc.ServiceException;

    public WS_SIEC_CancelarOrdenMGWInboundInterface getWS_SIEC_CancelarOrdenMGWInbound_pt(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
