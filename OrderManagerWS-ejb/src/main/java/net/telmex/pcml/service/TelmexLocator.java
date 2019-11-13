/**
 * TelmexLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.telmex.pcml.service;

public class TelmexLocator extends org.apache.axis.client.Service implements net.telmex.pcml.service.Telmex {

    public TelmexLocator() {
    }


    public TelmexLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public TelmexLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PcmlServicePort
    private java.lang.String PcmlServicePort_address = "http://192.168.18.122:8080/telmex/PcmlService";

    public java.lang.String getPcmlServicePortAddress() {
        return PcmlServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PcmlServicePortWSDDServiceName = "PcmlServicePort";

    public java.lang.String getPcmlServicePortWSDDServiceName() {
        return PcmlServicePortWSDDServiceName;
    }

    public void setPcmlServicePortWSDDServiceName(java.lang.String name) {
        PcmlServicePortWSDDServiceName = name;
    }

    public net.telmex.pcml.service.PcmlService getPcmlServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PcmlServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPcmlServicePort(endpoint);
    }

    public net.telmex.pcml.service.PcmlService getPcmlServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            net.telmex.pcml.service.PcmlServicePortBindingStub _stub = new net.telmex.pcml.service.PcmlServicePortBindingStub(portAddress, this);
            _stub.setPortName(getPcmlServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPcmlServicePortEndpointAddress(java.lang.String address) {
        PcmlServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (net.telmex.pcml.service.PcmlService.class.isAssignableFrom(serviceEndpointInterface)) {
                net.telmex.pcml.service.PcmlServicePortBindingStub _stub = new net.telmex.pcml.service.PcmlServicePortBindingStub(new java.net.URL(PcmlServicePort_address), this);
                _stub.setPortName(getPcmlServicePortWSDDServiceName());
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
        if ("PcmlServicePort".equals(inputPortName)) {
            return getPcmlServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "telmex");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PcmlServicePort".equals(portName)) {
            setPcmlServicePortEndpointAddress(address);
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
