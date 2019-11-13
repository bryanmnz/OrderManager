/**
 * GetWInfoWSLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.net.cable.Agendamiento.MGW.Servicios;

public class GetWInfoWSLocator extends org.apache.axis.client.Service implements co.net.cable.Agendamiento.MGW.Servicios.GetWInfoWS {

    public GetWInfoWSLocator() {
    }


    public GetWInfoWSLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GetWInfoWSLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for GetWInfoWSPort
    private java.lang.String GetWInfoWSPort_address = "http://192.168.18.227/MGW/MGW/Servicios/getwinfows.php";

    public java.lang.String getGetWInfoWSPortAddress() {
        return GetWInfoWSPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String GetWInfoWSPortWSDDServiceName = "GetWInfoWSPort";

    public java.lang.String getGetWInfoWSPortWSDDServiceName() {
        return GetWInfoWSPortWSDDServiceName;
    }

    public void setGetWInfoWSPortWSDDServiceName(java.lang.String name) {
        GetWInfoWSPortWSDDServiceName = name;
    }

    public co.net.cable.Agendamiento.MGW.Servicios.GetWInfoWSPortType getGetWInfoWSPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(GetWInfoWSPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getGetWInfoWSPort(endpoint);
    }

    public co.net.cable.Agendamiento.MGW.Servicios.GetWInfoWSPortType getGetWInfoWSPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            co.net.cable.Agendamiento.MGW.Servicios.GetWInfoWSBindingStub _stub = new co.net.cable.Agendamiento.MGW.Servicios.GetWInfoWSBindingStub(portAddress, this);
            _stub.setPortName(getGetWInfoWSPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setGetWInfoWSPortEndpointAddress(java.lang.String address) {
        GetWInfoWSPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (co.net.cable.Agendamiento.MGW.Servicios.GetWInfoWSPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                co.net.cable.Agendamiento.MGW.Servicios.GetWInfoWSBindingStub _stub = new co.net.cable.Agendamiento.MGW.Servicios.GetWInfoWSBindingStub(new java.net.URL(GetWInfoWSPort_address), this);
                _stub.setPortName(getGetWInfoWSPortWSDDServiceName());
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
        if ("GetWInfoWSPort".equals(inputPortName)) {
            return getGetWInfoWSPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://Agendamiento.cable.net.co/MGW/Servicios", "GetWInfoWS");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://Agendamiento.cable.net.co/MGW/Servicios", "GetWInfoWSPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("GetWInfoWSPort".equals(portName)) {
            setGetWInfoWSPortEndpointAddress(address);
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
