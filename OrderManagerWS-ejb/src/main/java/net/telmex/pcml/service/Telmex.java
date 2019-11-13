/**
 * Telmex.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.telmex.pcml.service;

public interface Telmex extends javax.xml.rpc.Service {
    public java.lang.String getPcmlServicePortAddress();

    public net.telmex.pcml.service.PcmlService getPcmlServicePort() throws javax.xml.rpc.ServiceException;

    public net.telmex.pcml.service.PcmlService getPcmlServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
