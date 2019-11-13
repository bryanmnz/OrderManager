package WS_SIEC_CancelarOrdenMGWInbound;

public class WS_SIEC_CancelarOrdenMGWInboundInterfaceProxy implements WS_SIEC_CancelarOrdenMGWInboundInterface {

    private String _endpoint = null;
    private WS_SIEC_CancelarOrdenMGWInboundInterface wS_SIEC_CancelarOrdenMGWInboundInterface = null;

    public WS_SIEC_CancelarOrdenMGWInboundInterfaceProxy() {
        _initWS_SIEC_CancelarOrdenMGWInboundInterfaceProxy();
    }

    public WS_SIEC_CancelarOrdenMGWInboundInterfaceProxy(String endpoint) {
        _endpoint = endpoint;
        _initWS_SIEC_CancelarOrdenMGWInboundInterfaceProxy();
    }

    private void _initWS_SIEC_CancelarOrdenMGWInboundInterfaceProxy() {
        try {
            wS_SIEC_CancelarOrdenMGWInboundInterface = (new WS_SIEC_CancelarOrdenMGWInbound.WS_SIEC_CancelarOrdenMGWInbound_client_epLocator()).getWS_SIEC_CancelarOrdenMGWInbound_pt();
            if (wS_SIEC_CancelarOrdenMGWInboundInterface != null) {
                if (_endpoint != null) {
                    ((javax.xml.rpc.Stub) wS_SIEC_CancelarOrdenMGWInboundInterface)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
                } else {
                    _endpoint = (String) ((javax.xml.rpc.Stub) wS_SIEC_CancelarOrdenMGWInboundInterface)._getProperty("javax.xml.rpc.service.endpoint.address");
                }
            }

        } catch (javax.xml.rpc.ServiceException serviceException) {
        }
    }

    public String getEndpoint() {
        return _endpoint;
    }

    public void setEndpoint(String endpoint) {
        _endpoint = endpoint;
        if (wS_SIEC_CancelarOrdenMGWInboundInterface != null) {
            ((javax.xml.rpc.Stub) wS_SIEC_CancelarOrdenMGWInboundInterface)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        }

    }

    public WS_SIEC_CancelarOrdenMGWInboundInterface getWS_SIEC_CancelarOrdenMGWInboundInterface() {
        if (wS_SIEC_CancelarOrdenMGWInboundInterface == null) {
            _initWS_SIEC_CancelarOrdenMGWInboundInterfaceProxy();
        }
        return wS_SIEC_CancelarOrdenMGWInboundInterface;
    }

    public TypeInboundInterfaceResponseElement cancelarOrden(TypeInboundInterfaceElement body) throws java.rmi.RemoteException {
        if (wS_SIEC_CancelarOrdenMGWInboundInterface == null) {
            _initWS_SIEC_CancelarOrdenMGWInboundInterfaceProxy();
        }
        return wS_SIEC_CancelarOrdenMGWInboundInterface.cancelarOrden(body);
    }

}
