/**
 * WS_SIEC_CancelarOrdenMGWInbound_client_epLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */
package WS_SIEC_CancelarOrdenMGWInbound;

public class WS_SIEC_CancelarOrdenMGWInbound_client_epLocator extends org.apache.axis.client.Service implements WS_SIEC_CancelarOrdenMGWInbound_client_ep {

    /**
     * OSB Service
     */
    public WS_SIEC_CancelarOrdenMGWInbound_client_epLocator() {
    }

    public WS_SIEC_CancelarOrdenMGWInbound_client_epLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WS_SIEC_CancelarOrdenMGWInbound_client_epLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WS_SIEC_CancelarOrdenMGWInbound_pt
    private java.lang.String WS_SIEC_CancelarOrdenMGWInbound_pt_address = "http://172.24.160.148:8080/TOA_CO/ProxyServices/SIECCo/Inbound/WSSIECCancelarOrdenMGWInbound_PS";

    public java.lang.String getWS_SIEC_CancelarOrdenMGWInbound_ptAddress() {
        return WS_SIEC_CancelarOrdenMGWInbound_pt_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WS_SIEC_CancelarOrdenMGWInbound_ptWSDDServiceName = "WS_SIEC_CancelarOrdenMGWInbound_pt";

    public java.lang.String getWS_SIEC_CancelarOrdenMGWInbound_ptWSDDServiceName() {
        return WS_SIEC_CancelarOrdenMGWInbound_ptWSDDServiceName;
    }

    public void setWS_SIEC_CancelarOrdenMGWInbound_ptWSDDServiceName(java.lang.String name) {
        WS_SIEC_CancelarOrdenMGWInbound_ptWSDDServiceName = name;
    }

    public WS_SIEC_CancelarOrdenMGWInboundInterface getWS_SIEC_CancelarOrdenMGWInbound_pt() throws javax.xml.rpc.ServiceException {
        java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WS_SIEC_CancelarOrdenMGWInbound_pt_address);
        } catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWS_SIEC_CancelarOrdenMGWInbound_pt(endpoint);
    }

    public WS_SIEC_CancelarOrdenMGWInboundInterface getWS_SIEC_CancelarOrdenMGWInbound_pt(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            WS_SIEC_CancelarOrdenMGWInboundBindingSOAPStub _stub = new WS_SIEC_CancelarOrdenMGWInboundBindingSOAPStub(portAddress, this);
            _stub.setPortName(getWS_SIEC_CancelarOrdenMGWInbound_ptWSDDServiceName());
            return _stub;
        } catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWS_SIEC_CancelarOrdenMGWInbound_ptEndpointAddress(java.lang.String address) {
        WS_SIEC_CancelarOrdenMGWInbound_pt_address = address;
    }

    /**
     * For the given interface, get the stub implementation. If this service has
     * no port for the given interface, then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (WS_SIEC_CancelarOrdenMGWInboundInterface.class.isAssignableFrom(serviceEndpointInterface)) {
                WS_SIEC_CancelarOrdenMGWInboundBindingSOAPStub _stub = new WS_SIEC_CancelarOrdenMGWInboundBindingSOAPStub(new java.net.URL(WS_SIEC_CancelarOrdenMGWInbound_pt_address), this);
                _stub.setPortName(getWS_SIEC_CancelarOrdenMGWInbound_ptWSDDServiceName());
                return _stub;
            }
        } catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation. If this service has
     * no port for the given interface, then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("WS_SIEC_CancelarOrdenMGWInbound_pt".equals(inputPortName)) {
            return getWS_SIEC_CancelarOrdenMGWInbound_pt();
        } else {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://xmlns.oracle.com/Inbound/WS_SIEC_CancelarOrdenMGWInbound", "WS_SIEC_CancelarOrdenMGWInbound_client_ep");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://xmlns.oracle.com/Inbound/WS_SIEC_CancelarOrdenMGWInbound", "WS_SIEC_CancelarOrdenMGWInbound_pt"));
        }
        return ports.iterator();
    }

    /**
     * Set the endpoint address for the specified port name.
     */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {

        if ("WS_SIEC_CancelarOrdenMGWInbound_pt".equals(portName)) {
            setWS_SIEC_CancelarOrdenMGWInbound_ptEndpointAddress(address);
        } else { // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
     * Set the endpoint address for the specified port name.
     */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
