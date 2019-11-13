/**
 * WsServiceCallLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.telmex.ws;

public class WsServiceCallLocator extends org.apache.axis.client.Service implements net.telmex.ws.WsServiceCall {

    public WsServiceCallLocator() {
    }


    public WsServiceCallLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WsServiceCallLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for managementPort
    private java.lang.String managementPort_address = "http://192.168.18.122:38089/wsServiceCall/management";

    public java.lang.String getmanagementPortAddress() {
        return managementPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String managementPortWSDDServiceName = "managementPort";

    public java.lang.String getmanagementPortWSDDServiceName() {
        return managementPortWSDDServiceName;
    }

    public void setmanagementPortWSDDServiceName(java.lang.String name) {
        managementPortWSDDServiceName = name;
    }

    public net.telmex.ws.Management getmanagementPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(managementPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getmanagementPort(endpoint);
    }

    public net.telmex.ws.Management getmanagementPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            net.telmex.ws.ManagementPortBindingStub _stub = new net.telmex.ws.ManagementPortBindingStub(portAddress, this);
            _stub.setPortName(getmanagementPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setmanagementPortEndpointAddress(java.lang.String address) {
        managementPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (net.telmex.ws.Management.class.isAssignableFrom(serviceEndpointInterface)) {
                net.telmex.ws.ManagementPortBindingStub _stub = new net.telmex.ws.ManagementPortBindingStub(new java.net.URL(managementPort_address), this);
                _stub.setPortName(getmanagementPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("managementPort".equals(inputPortName)) {
            return getmanagementPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.telmex.net/", "wsServiceCall");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.telmex.net/", "managementPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("managementPort".equals(portName)) {
            setmanagementPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
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
