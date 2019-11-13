/**
 * PcmlServicePortBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.telmex.pcml.service;

public class PcmlServicePortBindingStub extends org.apache.axis.client.Stub implements net.telmex.pcml.service.PcmlService {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[95];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
        _initOperationDesc6();
        _initOperationDesc7();
        _initOperationDesc8();
        _initOperationDesc9();
        _initOperationDesc10();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUnit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "unit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "unidad"));
        oper.setReturnClass(net.telmex.pcml.service.Unidad.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("reconnect");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "account"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "reconnectionData"));
        oper.setReturnClass(net.telmex.pcml.service.ReconnectionData.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getWorkOrders");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "account"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "ordenTrabajoVO"));
        oper.setReturnClass(net.telmex.pcml.service.OrdenTrabajoVO[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getServiceCalls");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "account"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "llamadaVO"));
        oper.setReturnClass(net.telmex.pcml.service.LlamadaVO[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCreditHistoryXCustomer");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "account"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dateInit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dateEnd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "creditHistory"));
        oper.setReturnClass(net.telmex.pcml.service.CreditHistory[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("changeOTInstallationDate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateDXData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg4"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg5"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("changeOTStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getNeighbors");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "street"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "home"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "apartment"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "community"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "division"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "unitType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "vecino"));
        oper.setReturnClass(net.telmex.pcml.service.Vecino[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("phoneLineMovement");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "oldAccount"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "newAccount"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "phoneNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getWorkOrderInformation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "workOrder"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "workOrderInformation"));
        oper.setReturnClass(net.telmex.pcml.service.WorkOrderInformation.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("resetUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "document"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "issueDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "message"));
        oper.setReturnClass(net.telmex.pcml.service.Message.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updatePortfolioState");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "account"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "line"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "newState"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("workOrderCompletion");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "accion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ordenTrabajo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "tipo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fabricante"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "serial"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "servicio"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cantidadServicios"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "resultadoCierreOT"));
        oper.setReturnClass(net.telmex.pcml.service.ResultadoCierreOT.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getServicesSummary");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "account"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "servicesSummary"));
        oper.setReturnClass(net.telmex.pcml.service.ServicesSummary.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "servicesSummary"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("advancePayment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ordenTrabajo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "mensajeDataCredito"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fechaVencimiento"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "message"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createInventory");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ic"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "mc"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "serial"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "estado"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "message"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateSpecialNoteSuscriber");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cuenta"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "tipoNota"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "descripcionNota"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "detalleNota"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "nombreUsuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "message"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateNoteUnit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cuenta"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "detalleNota"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "message"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateAdressTap");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cuenta"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "tapDireccionable"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "etiqueta"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "mensaje"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "message"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateAdressTapByOT");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ordenTrabajo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "tapDireccionable"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "etiqueta"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "mensaje"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "message"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findTaps");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "acountUnit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "message"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateStateField");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "workOrder"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "stateField"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "message"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findItemSale");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "workOrder"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "message"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateOTCanceled");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "workOrder"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "acount"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "date"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "time"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "message"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSuscriberInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "valor"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parameter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "suscriberVO"));
        oper.setReturnClass(net.telmex.pcml.service.SuscriberVO[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSuscriberInfo2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "valor"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parameter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "suscriberInfoVO"));
        oper.setReturnClass(net.telmex.pcml.service.SuscriberInfoVO[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "SuscriberVO2"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getOTAndServiceCallByAccount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cuenta"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "llamadaServicioStruct"));
        oper.setReturnClass(net.telmex.pcml.service.LlamadaServicioStruct.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getServiceCallByAccount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cuenta"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "llamadaVO"));
        oper.setReturnClass(net.telmex.pcml.service.LlamadaVO[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUnidad");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idUnidad"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "unidadStruct"));
        oper.setReturnClass(net.telmex.pcml.service.UnidadStruct.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getOTByAccount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cuenta"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "ordenTrabajoVO"));
        oper.setReturnClass(net.telmex.pcml.service.OrdenTrabajoVO[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAsesor2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "codAsesor"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "documento"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "asesor"));
        oper.setReturnClass(net.telmex.pcml.service.Asesor.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAsesor");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "codAsesor"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "asesor"));
        oper.setReturnClass(net.telmex.pcml.service.Asesor.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAsesorDesc");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "codAsesor"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "asesorDesc"));
        oper.setReturnClass(net.telmex.pcml.service.AsesorDesc.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getWifiMac");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cuenta"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "macCons"));
        oper.setReturnClass(net.telmex.pcml.service.MacCons.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPurchase");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cuenta"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ordenTrabajo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cuotas"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "purchaseInfoVO"));
        oper.setReturnClass(net.telmex.pcml.service.PurchaseInfoVO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "StringUtilException"),
                      "net.telmex.pcml.service.StringUtilException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "StringUtilException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUbicationInventory");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "codigo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "ubicationInventoryInfoVO"));
        oper.setReturnClass(net.telmex.pcml.service.UbicationInventoryInfoVO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "StringUtilException"),
                      "net.telmex.pcml.service.StringUtilException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "StringUtilException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getEdificio");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "codEdificio"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "edificio"));
        oper.setReturnClass(net.telmex.pcml.service.Edificio.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUnidadesByComunidad");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "calle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "casa"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "apto"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "comunidad"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "limit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "unidadStruct"));
        oper.setReturnClass(net.telmex.pcml.service.UnidadStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUnidades");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "calle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "casa"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "apto"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "comunidad"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "limit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "unidadStruct"));
        oper.setReturnClass(net.telmex.pcml.service.UnidadStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getNeighborByAddress");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "calle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "placa"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "strComPlaca"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "comunidades"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "limit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "unidadStruct"));
        oper.setReturnClass(net.telmex.pcml.service.UnidadStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getBlackListSuscriver");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "tipoDoc"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "numeroDoc"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "blackListStruct"));
        oper.setReturnClass(net.telmex.pcml.service.BlackListStruct.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateSubscriber2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "updateSubscriber"), net.telmex.pcml.service.UpdateSubscriber.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "updateSubscriber"));
        oper.setReturnClass(net.telmex.pcml.service.UpdateSubscriber.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getConstant");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "code"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "ubicationInventoryVO"));
        oper.setReturnClass(net.telmex.pcml.service.UbicationInventoryVO[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getOutlet");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "workOrder"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "outletInfo"));
        oper.setReturnClass(net.telmex.pcml.service.OutletInfo[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSchedules");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "schedule"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "schedule"), net.telmex.pcml.service.Schedule.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "scheduleStruct"));
        oper.setReturnClass(net.telmex.pcml.service.ScheduleStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSchedules2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "schedule"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "schedule2"), net.telmex.pcml.service.Schedule2.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "scheduleStruct"));
        oper.setReturnClass(net.telmex.pcml.service.ScheduleStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[46] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("applyAdjustPurchase");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cuenta"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ordenTrabajo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "adjustPurchaseInfoVO"));
        oper.setReturnClass(net.telmex.pcml.service.AdjustPurchaseInfoVO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[47] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getInventoryOT");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "account"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ot"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "inventarioInfoVO"));
        oper.setReturnClass(net.telmex.pcml.service.InventarioInfoVO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[48] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSubscriberOt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "account"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "getSuscriberOT"));
        oper.setReturnClass(net.telmex.pcml.service.GetSuscriberOT.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[49] = oper;

    }

    private static void _initOperationDesc6(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getServicesBySchedules");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "service"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "pcmService"), net.telmex.pcml.service.PcmService.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "serviceStruct"));
        oper.setReturnClass(net.telmex.pcml.service.ServiceStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[50] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCampanias");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "date"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "typeCamp"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "division"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "community"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "campaniaStruct"));
        oper.setReturnClass(net.telmex.pcml.service.CampaniaStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[51] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getServicesAmount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "pcmlServiceAmount"), net.telmex.pcml.service.PcmlServiceAmount.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "serviceStructAmount"));
        oper.setReturnClass(net.telmex.pcml.service.ServiceStructAmount[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[52] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUpdateAditionalInfoSubscriber");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "updateAditionalInfoSubscriber"), net.telmex.pcml.service.UpdateAditionalInfoSubscriber.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "updateAditionalInfoSubscriber"));
        oper.setReturnClass(net.telmex.pcml.service.UpdateAditionalInfoSubscriber.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[53] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLastWorkOrderStruct");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "acount"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"), java.math.BigDecimal.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "otType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "otState"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "workOrderStruct"));
        oper.setReturnClass(net.telmex.pcml.service.WorkOrderStruct.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[54] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPCMLUpdateDate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "updateDate"), net.telmex.pcml.service.UpdateDate.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "updateDate"));
        oper.setReturnClass(net.telmex.pcml.service.UpdateDate.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[55] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMaterial");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "tarifa"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "division"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "comunidad"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "itemClass"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "materialVO"));
        oper.setReturnClass(net.telmex.pcml.service.MaterialVO[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[56] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDateDXSubscribers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idUnidad"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "dateDXSuscriberStruct"));
        oper.setReturnClass(net.telmex.pcml.service.DateDXSuscriberStruct.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[57] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("guardarVentaMultiplay");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "custCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cuenta"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "servicio"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "vendedorCodigo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "vendedorCentroCosto"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "vendedorDocumento"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "paqueteCodigo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "planCodigo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "planNombre"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "paqueteDatosCodigo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idActivacion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "msisdnAsignado"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fechaVenta"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fechaPermanencia"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fechaOt"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "numeroOt"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "itemClass"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "manufactureClass"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "estado"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "ventaMultiplayInfoResponse"));
        oper.setReturnClass(net.telmex.pcml.service.VentaMultiplayInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[58] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDescuentosVentaPurchase");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cuenta"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "orderWp"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "info1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "info2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "descuentoVentaPurchaseVO"));
        oper.setReturnClass(net.telmex.pcml.service.DescuentoVentaPurchaseVO[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[59] = oper;

    }

    private static void _initOperationDesc7(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getEntregaDomicilios");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "zicmc"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "entregaDomicilioVO"));
        oper.setReturnClass(net.telmex.pcml.service.EntregaDomicilioVO[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[60] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("crearNota");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cuenta"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "tipoNota"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "descripcion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "accion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "nota"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "administradorNotasVO"));
        oper.setReturnClass(net.telmex.pcml.service.AdministradorNotasVO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[61] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("adicionarLineasNota");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cuenta"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "numNota"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "accion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "nota"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "administradorNotasVO"));
        oper.setReturnClass(net.telmex.pcml.service.AdministradorNotasVO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[62] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getEstratoCuenta");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cuenta"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "estrato"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[63] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTarifasCuenta");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cuenta"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "numeroOt"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "tarifasCuentaVO"));
        oper.setReturnClass(net.telmex.pcml.service.TarifasCuentaVO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[64] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPrecioYCuota");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "valorCuotasPurchase"), net.telmex.pcml.service.ValorCuotasPurchase.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "valorCuotasPurchase"));
        oper.setReturnClass(net.telmex.pcml.service.ValorCuotasPurchase.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "valorPrecioYCuota"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[65] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCategoriaJurisdiccion");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "itemClass"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "manufacturerClass"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[66] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("insertCampaigns");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "pcmlCampaign"), net.telmex.pcml.service.PcmlCampaign.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "pcmlCampaign"));
        oper.setReturnClass(net.telmex.pcml.service.PcmlCampaign.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[67] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateBillingInfoClient");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "updateBillingInfo"), net.telmex.pcml.service.UpdateBillingInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "updateBillingInfo"));
        oper.setReturnClass(net.telmex.pcml.service.UpdateBillingInfo.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[68] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateInfoSale");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "infoSale"), net.telmex.pcml.service.InfoSale.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "infoSale"));
        oper.setReturnClass(net.telmex.pcml.service.InfoSale.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[69] = oper;

    }

    private static void _initOperationDesc8(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("crearRegistroPago");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "registroPago"), net.telmex.pcml.service.RegistroPago.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "registroPago"));
        oper.setReturnClass(net.telmex.pcml.service.RegistroPago.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[70] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultaLlamadaYOrdenW");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "consultaLlamadaYOrdenTrabajo"), net.telmex.pcml.service.ConsultaLlamadaYOrdenTrabajo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "consultaLlamadaYOrdenTrabajo"));
        oper.setReturnClass(net.telmex.pcml.service.ConsultaLlamadaYOrdenTrabajo.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[71] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateSubscriberInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "subscriberInfo"), net.telmex.pcml.service.SubscriberInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "subscriberInfo"));
        oper.setReturnClass(net.telmex.pcml.service.SubscriberInfo.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[72] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSubscriberType");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "subscriberType"), net.telmex.pcml.service.SubscriberType.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "subscriberType"));
        oper.setReturnClass(net.telmex.pcml.service.SubscriberType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[73] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setTipoLinea");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "tipoLinea"), net.telmex.pcml.service.TipoLinea.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "tipoLinea"));
        oper.setReturnClass(net.telmex.pcml.service.TipoLinea.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[74] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getNotas");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "notasNuncaServicio"), net.telmex.pcml.service.NotasNuncaServicio.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "notasNuncaServicio"));
        oper.setReturnClass(net.telmex.pcml.service.NotasNuncaServicio.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[75] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultarCM");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "consultaCuentaMatriz"), net.telmex.pcml.service.ConsultaCuentaMatriz.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "consultaCuentaMatriz"));
        oper.setReturnClass(net.telmex.pcml.service.ConsultaCuentaMatriz.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[76] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("agregarServicio");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "insertarServicio"), net.telmex.pcml.service.InsertarServicio.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "insertarServicio"));
        oper.setReturnClass(net.telmex.pcml.service.InsertarServicio.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[77] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("eliminarServicio");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "quitarServicio"), net.telmex.pcml.service.QuitarServicio.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "quitarServicio"));
        oper.setReturnClass(net.telmex.pcml.service.QuitarServicio.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[78] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findVecinos");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "busquedaVecinos"), net.telmex.pcml.service.BusquedaVecinos.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "vecino"));
        oper.setReturnClass(net.telmex.pcml.service.Vecino[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[79] = oper;

    }

    private static void _initOperationDesc9(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultaUnidadConInternetUltimosXDias");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "unidad"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dias"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "unidadInternetXDias"));
        oper.setReturnClass(net.telmex.pcml.service.UnidadInternetXDias.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "unidadInternetXDias"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[80] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cambiarPassword");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "cambioPass"), net.telmex.pcml.service.CambioPass.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "cambioPass"));
        oper.setReturnClass(net.telmex.pcml.service.CambioPass.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[81] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCampaignOTTAccount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cuenta"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "campaignAccount"));
        oper.setReturnClass(net.telmex.pcml.service.CampaignAccount.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[82] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UserActive");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "userActiveStruct"));
        oper.setReturnClass(net.telmex.pcml.service.UserActiveStruct.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[83] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ejecutarOT");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "nomArchivo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "reporteSerializadosEntry"));
        oper.setReturnClass(net.telmex.pcml.service.ReporteSerializadosEntry.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "Exception"),
                      "net.telmex.pcml.service.Exception",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "Exception"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[84] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultarOT");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "nomArchivo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "reporteSerializadosEntry"));
        oper.setReturnClass(net.telmex.pcml.service.ReporteSerializadosEntry.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "Exception"),
                      "net.telmex.pcml.service.Exception",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "Exception"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[85] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateCusCodeMovil");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "UpdateCusCodeMovilRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "updateCusCodeMovilVo"), net.telmex.pcml.service.UpdateCusCodeMovilVo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "Exception"),
                      "net.telmex.pcml.service.Exception",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "Exception"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[86] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultaPagoAnticipado");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "PagoAntConsulta"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "pagoAnticipadoStructAntCons"), net.telmex.pcml.service.PagoAnticipadoStructAntCons.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "pagoAnticipadoStructResCons"));
        oper.setReturnClass(net.telmex.pcml.service.PagoAnticipadoStructResCons.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "Exception"),
                      "net.telmex.pcml.service.Exception",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "Exception"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[87] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getInfoOT");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "numeroOt"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "responseGetInfoOt"));
        oper.setReturnClass(net.telmex.pcml.service.ResponseGetInfoOt.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "Exception"),
                      "net.telmex.pcml.service.Exception",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "Exception"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[88] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getInfoAcountWTH");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cuenta"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "clminpr00"));
        oper.setReturnClass(net.telmex.pcml.service.Clminpr00.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "Exception"),
                      "net.telmex.pcml.service.Exception",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "Exception"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[89] = oper;

    }

    private static void _initOperationDesc10(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultaSaldoMultiplay");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pcustcode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "responseVentaCuotas"));
        oper.setReturnClass(net.telmex.pcml.service.ResponseVentaCuotas.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "consultaSaldoMultiplay "));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "Exception"),
                      "net.telmex.pcml.service.Exception",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "Exception"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[90] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("mtoCalificacion");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "requesCalificacion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "mantenimientoCal"), net.telmex.pcml.service.MantenimientoCal.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "mantenimientoCal"));
        oper.setReturnClass(net.telmex.pcml.service.MantenimientoCal.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "mtoCalificacion"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "Exception"),
                      "net.telmex.pcml.service.Exception",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "Exception"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[91] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("mtoClavesIVR");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "requestClIvr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "mantenimientoClavIVR"), net.telmex.pcml.service.MantenimientoClavIVR.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "mantenimientoClavIVR"));
        oper.setReturnClass(net.telmex.pcml.service.MantenimientoClavIVR.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "mtoClavesIVR"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "Exception"),
                      "net.telmex.pcml.service.Exception",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "Exception"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[92] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("validaLineaTelefonica");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "requestValidar"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "valLineaTelefonica"), net.telmex.pcml.service.ValLineaTelefonica.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "validaLineaResponse"));
        oper.setReturnClass(net.telmex.pcml.service.ValidaLineaResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "validaLineaTelefonica"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "Exception"),
                      "net.telmex.pcml.service.Exception",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "Exception"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"),
                      "net.telmex.pcml.service.PcmlException",
                      new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException"), 
                      true
                     ));
        _operations[93] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getValorRecarga");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "valorRecargaRequest"), net.telmex.pcml.service.ValorRecargaRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "valorRecargaResponse"));
        oper.setReturnClass(net.telmex.pcml.service.ValorRecargaResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "valorRecarga"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[94] = oper;

    }

    public PcmlServicePortBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public PcmlServicePortBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public PcmlServicePortBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "adjustPurchaseInfoVO");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.AdjustPurchaseInfoVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "adjustPurchaseVO");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.AdjustPurchaseVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "administradorNotasVO");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.AdministradorNotasVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "asesor");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.Asesor.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "asesorDesc");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.AsesorDesc.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "basicMessage");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.BasicMessage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "blackListStruct");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.BlackListStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "busquedaVecinos");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.BusquedaVecinos.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "cambioPass");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.CambioPass.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "campaignAccount");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.CampaignAccount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "campaniaStruct");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.CampaniaStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "clminpr00");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.Clminpr00.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "consultaCuentaMatriz");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.ConsultaCuentaMatriz.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "consultaLlamadaYOrdenTrabajo");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.ConsultaLlamadaYOrdenTrabajo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "creditHistory");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.CreditHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "dateDXSuscriberStruct");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.DateDXSuscriberStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "descuentoVentaPurchaseVO");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.DescuentoVentaPurchaseVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "edificio");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.Edificio.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "entregaDomicilioVO");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.EntregaDomicilioVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "Exception");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.Exception.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "getSuscriberOT");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.GetSuscriberOT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "infoSale");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.InfoSale.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "insertarServicio");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.InsertarServicio.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "inventarioInfoVO");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.InventarioInfoVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "inventarioVO");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.InventarioVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "llamadaServicioStruct");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.LlamadaServicioStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "llamadaVO");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.LlamadaVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "macCons");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.MacCons.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "macConsStruct");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.MacConsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "mantenimientoCal");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.MantenimientoCal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "mantenimientoClavIVR");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.MantenimientoClavIVR.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "materialVO");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.MaterialVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "message");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.Message.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "notasNuncaServicio");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.NotasNuncaServicio.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "ordenTrabajoVO");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.OrdenTrabajoVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "outletInfo");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.OutletInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "pagoAnticipadoStructAntCons");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.PagoAnticipadoStructAntCons.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "pagoAnticipadoStructResCons");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.PagoAnticipadoStructResCons.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "pcmlCampaign");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.PcmlCampaign.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "PcmlException");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.PcmlException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "pcmlServiceAmount");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.PcmlServiceAmount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "pcmService");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.PcmService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "purchaseInfoVO");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.PurchaseInfoVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "purchaseVO");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.PurchaseVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "quitarServicio");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.QuitarServicio.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "reconnectionData");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.ReconnectionData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "registroPago");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.RegistroPago.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "reporteSerializadosEntry");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.ReporteSerializadosEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "responseGetInfoOt");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.ResponseGetInfoOt.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "responseVentaCuotas");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.ResponseVentaCuotas.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "resultadoCierreOT");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.ResultadoCierreOT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "schedule");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.Schedule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "schedule2");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.Schedule2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "scheduleStruct");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.ScheduleStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "service");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.Service.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "servicesSummary");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.ServicesSummary.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "serviceStruct");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.ServiceStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "serviceStructAmount");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.ServiceStructAmount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "servicioVO");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.ServicioVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "StringUtilException");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.StringUtilException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "subscriberInfo");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.SubscriberInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "subscriberStruct");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.SubscriberStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "subscriberType");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.SubscriberType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "suscriberInfoVO");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.SuscriberInfoVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "suscriberVO");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.SuscriberVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "tarifasCuentaVO");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.TarifasCuentaVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "tipoLinea");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.TipoLinea.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "ubicationInventoryInfoVO");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.UbicationInventoryInfoVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "ubicationInventoryVO");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.UbicationInventoryVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "unidad");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.Unidad.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "unidadInternetXDias");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.UnidadInternetXDias.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "unidadStruct");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.UnidadStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "updateAditionalInfoSubscriber");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.UpdateAditionalInfoSubscriber.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "updateBillingInfo");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.UpdateBillingInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "updateCusCodeMovilVo");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.UpdateCusCodeMovilVo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "updateDate");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.UpdateDate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "updateSubscriber");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.UpdateSubscriber.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "userActiveStruct");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.UserActiveStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "validaLineaResponse");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.ValidaLineaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "valLineaTelefonica");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.ValLineaTelefonica.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "valorCuotasPurchase");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.ValorCuotasPurchase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "valorRecargaRequest");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.ValorRecargaRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "valorRecargaResponse");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.ValorRecargaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "vecino");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.Vecino.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "ventaMultiplayInfoResponse");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.VentaMultiplayInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "workOrderInformation");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.WorkOrderInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "workOrderStruct");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.WorkOrderStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "workOrderVO");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.WorkOrderVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "woServiceVO");
            cachedSerQNames.add(qName);
            cls = net.telmex.pcml.service.WoServiceVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public net.telmex.pcml.service.Unidad getUnit(java.lang.String unit) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "getUnit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {unit});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.Unidad) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.Unidad) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.Unidad.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.ReconnectionData reconnect(java.lang.String account) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "reconnect"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {account});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.ReconnectionData) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.ReconnectionData) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.ReconnectionData.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.OrdenTrabajoVO[] getWorkOrders(java.lang.String account) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "getWorkOrders"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {account});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.OrdenTrabajoVO[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.OrdenTrabajoVO[]) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.OrdenTrabajoVO[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.LlamadaVO[] getServiceCalls(java.lang.String account) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "getServiceCalls"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {account});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.LlamadaVO[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.LlamadaVO[]) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.LlamadaVO[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.CreditHistory[] getCreditHistoryXCustomer(java.lang.String account, java.lang.String dateInit, java.lang.String dateEnd) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "getCreditHistoryXCustomer"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {account, dateInit, dateEnd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.CreditHistory[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.CreditHistory[]) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.CreditHistory[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String changeOTInstallationDate(long arg0, java.lang.String arg1, java.lang.String arg2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "changeOTInstallationDate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(arg0), arg1, arg2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String updateDXData(long arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "updateDXData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(arg0), arg1, arg2, arg3, arg4, arg5});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String changeOTStatus(long arg0, java.lang.String arg1) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "changeOTStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(arg0), arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.Vecino[] getNeighbors(java.lang.String street, java.lang.String home, java.lang.String apartment, java.lang.String community, java.lang.String division, java.lang.String unitType) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "getNeighbors"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {street, home, apartment, community, division, unitType});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.Vecino[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.Vecino[]) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.Vecino[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String phoneLineMovement(long oldAccount, long newAccount, long phoneNumber) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "phoneLineMovement"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(oldAccount), new java.lang.Long(newAccount), new java.lang.Long(phoneNumber)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.WorkOrderInformation getWorkOrderInformation(long workOrder) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "getWorkOrderInformation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(workOrder)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.WorkOrderInformation) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.WorkOrderInformation) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.WorkOrderInformation.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.Message resetUser(java.lang.String user, java.lang.String document, java.lang.String issueDate) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "resetUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {user, document, issueDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.Message) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.Message) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.Message.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String updatePortfolioState(java.lang.String account, java.lang.String line, java.lang.String newState) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "updatePortfolioState"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {account, line, newState});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.ResultadoCierreOT workOrderCompletion(java.lang.String accion, java.lang.String ordenTrabajo, java.lang.String tipo, java.lang.String fabricante, java.lang.String serial, java.lang.String servicio, java.lang.String cantidadServicios) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "workOrderCompletion"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {accion, ordenTrabajo, tipo, fabricante, serial, servicio, cantidadServicios});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.ResultadoCierreOT) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.ResultadoCierreOT) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.ResultadoCierreOT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.ServicesSummary getServicesSummary(java.lang.String account) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "getServicesSummary"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {account});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.ServicesSummary) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.ServicesSummary) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.ServicesSummary.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String advancePayment(long ordenTrabajo, java.lang.String mensajeDataCredito, java.lang.String fechaVencimiento) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "advancePayment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(ordenTrabajo), mensajeDataCredito, fechaVencimiento});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String createInventory(java.lang.String ic, java.lang.String mc, java.lang.String serial, java.lang.String estado) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "createInventory"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ic, mc, serial, estado});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String updateSpecialNoteSuscriber(long cuenta, java.lang.String tipoNota, java.lang.String descripcionNota, java.lang.String[] detalleNota, java.lang.String nombreUsuario) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "updateSpecialNoteSuscriber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(cuenta), tipoNota, descripcionNota, detalleNota, nombreUsuario});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String updateNoteUnit(long cuenta, java.lang.String[] detalleNota) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "updateNoteUnit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(cuenta), detalleNota});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String updateAdressTap(long cuenta, java.lang.String tapDireccionable, java.lang.String etiqueta, java.lang.String mensaje) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "updateAdressTap"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(cuenta), tapDireccionable, etiqueta, mensaje});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String updateAdressTapByOT(java.lang.String ordenTrabajo, java.lang.String tapDireccionable, java.lang.String etiqueta, java.lang.String mensaje) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "updateAdressTapByOT"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ordenTrabajo, tapDireccionable, etiqueta, mensaje});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String[] findTaps(java.lang.String acountUnit) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "findTaps"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {acountUnit});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String updateStateField(java.lang.String workOrder, java.lang.String stateField) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "updateStateField"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {workOrder, stateField});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String[] findItemSale(java.lang.String workOrder) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "findItemSale"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {workOrder});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String updateOTCanceled(java.lang.Long workOrder, java.lang.Long acount, java.lang.Long date, java.lang.Long time) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "updateOTCanceled"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {workOrder, acount, date, time});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.SuscriberVO[] getSuscriberInfo(java.lang.String type, java.lang.String valor, java.lang.String parameter) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "getSuscriberInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {type, valor, parameter});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.SuscriberVO[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.SuscriberVO[]) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.SuscriberVO[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.SuscriberInfoVO[] getSuscriberInfo2(java.lang.String type, java.lang.String valor, java.lang.String parameter) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "getSuscriberInfo2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {type, valor, parameter});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.SuscriberInfoVO[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.SuscriberInfoVO[]) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.SuscriberInfoVO[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.LlamadaServicioStruct getOTAndServiceCallByAccount(java.lang.String cuenta) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "getOTAndServiceCallByAccount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {cuenta});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.LlamadaServicioStruct) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.LlamadaServicioStruct) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.LlamadaServicioStruct.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.LlamadaVO[] getServiceCallByAccount(java.lang.String cuenta) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "getServiceCallByAccount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {cuenta});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.LlamadaVO[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.LlamadaVO[]) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.LlamadaVO[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.UnidadStruct getUnidad(java.lang.Long idUnidad) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "getUnidad"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {idUnidad});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.UnidadStruct) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.UnidadStruct) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.UnidadStruct.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.OrdenTrabajoVO[] getOTByAccount(java.lang.String cuenta) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "getOTByAccount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {cuenta});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.OrdenTrabajoVO[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.OrdenTrabajoVO[]) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.OrdenTrabajoVO[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.Asesor getAsesor2(java.lang.String codAsesor, java.lang.String documento) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "getAsesor2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {codAsesor, documento});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.Asesor) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.Asesor) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.Asesor.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.Asesor getAsesor(java.lang.String codAsesor) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "getAsesor"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {codAsesor});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.Asesor) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.Asesor) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.Asesor.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.AsesorDesc getAsesorDesc(java.lang.String codAsesor) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "getAsesorDesc"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {codAsesor});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.AsesorDesc) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.AsesorDesc) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.AsesorDesc.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.MacCons getWifiMac(java.lang.String cuenta) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "getWifiMac"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {cuenta});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.MacCons) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.MacCons) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.MacCons.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.PurchaseInfoVO getPurchase(java.lang.String cuenta, java.lang.String ordenTrabajo, java.lang.String cuotas) throws java.rmi.RemoteException, net.telmex.pcml.service.StringUtilException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "getPurchase"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {cuenta, ordenTrabajo, cuotas});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.PurchaseInfoVO) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.PurchaseInfoVO) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.PurchaseInfoVO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.StringUtilException) {
              throw (net.telmex.pcml.service.StringUtilException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.UbicationInventoryInfoVO getUbicationInventory(java.lang.String codigo) throws java.rmi.RemoteException, net.telmex.pcml.service.StringUtilException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "getUbicationInventory"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {codigo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.UbicationInventoryInfoVO) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.UbicationInventoryInfoVO) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.UbicationInventoryInfoVO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.StringUtilException) {
              throw (net.telmex.pcml.service.StringUtilException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.Edificio getEdificio(java.lang.String codEdificio) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "getEdificio"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {codEdificio});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.Edificio) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.Edificio) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.Edificio.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.UnidadStruct[] getUnidadesByComunidad(java.lang.String calle, java.lang.String casa, java.lang.String apto, java.lang.String comunidad, int limit) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "getUnidadesByComunidad"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {calle, casa, apto, comunidad, new java.lang.Integer(limit)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.UnidadStruct[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.UnidadStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.UnidadStruct[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.UnidadStruct[] getUnidades(java.lang.String calle, java.lang.String casa, java.lang.String apto, java.lang.String[] comunidad, int limit) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "getUnidades"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {calle, casa, apto, comunidad, new java.lang.Integer(limit)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.UnidadStruct[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.UnidadStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.UnidadStruct[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.UnidadStruct[] getNeighborByAddress(java.lang.String calle, int placa, java.lang.String strComPlaca, java.lang.String[] comunidades, int limit) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "getNeighborByAddress"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {calle, new java.lang.Integer(placa), strComPlaca, comunidades, new java.lang.Integer(limit)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.UnidadStruct[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.UnidadStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.UnidadStruct[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.BlackListStruct getBlackListSuscriver(java.lang.String tipoDoc, java.lang.String numeroDoc) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "getBlackListSuscriver"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {tipoDoc, numeroDoc});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.BlackListStruct) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.BlackListStruct) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.BlackListStruct.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.UpdateSubscriber updateSubscriber2(net.telmex.pcml.service.UpdateSubscriber arg0) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "updateSubscriber2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.UpdateSubscriber) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.UpdateSubscriber) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.UpdateSubscriber.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.UbicationInventoryVO[] getConstant(java.lang.String code) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "getConstant"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {code});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.UbicationInventoryVO[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.UbicationInventoryVO[]) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.UbicationInventoryVO[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.OutletInfo[] getOutlet(java.lang.String workOrder) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "getOutlet"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {workOrder});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.OutletInfo[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.OutletInfo[]) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.OutletInfo[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.ScheduleStruct[] getSchedules(net.telmex.pcml.service.Schedule schedule) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "getSchedules"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {schedule});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.ScheduleStruct[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.ScheduleStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.ScheduleStruct[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.ScheduleStruct[] getSchedules2(net.telmex.pcml.service.Schedule2 schedule) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "getSchedules2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {schedule});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.ScheduleStruct[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.ScheduleStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.ScheduleStruct[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.AdjustPurchaseInfoVO applyAdjustPurchase(java.lang.String cuenta, java.lang.String ordenTrabajo) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[47]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "applyAdjustPurchase"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {cuenta, ordenTrabajo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.AdjustPurchaseInfoVO) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.AdjustPurchaseInfoVO) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.AdjustPurchaseInfoVO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.InventarioInfoVO getInventoryOT(java.lang.String account, java.lang.String ot) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[48]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "getInventoryOT"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {account, ot});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.InventarioInfoVO) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.InventarioInfoVO) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.InventarioInfoVO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.GetSuscriberOT getSubscriberOt(java.lang.String account) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[49]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "getSubscriberOt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {account});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.GetSuscriberOT) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.GetSuscriberOT) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.GetSuscriberOT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.ServiceStruct[] getServicesBySchedules(net.telmex.pcml.service.PcmService service) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[50]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "getServicesBySchedules"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {service});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.ServiceStruct[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.ServiceStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.ServiceStruct[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.CampaniaStruct[] getCampanias(java.lang.String date, java.lang.String typeCamp, java.lang.String division, java.lang.String community, java.lang.String rate) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[51]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "getCampanias"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {date, typeCamp, division, community, rate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.CampaniaStruct[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.CampaniaStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.CampaniaStruct[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.ServiceStructAmount[] getServicesAmount(net.telmex.pcml.service.PcmlServiceAmount parameters) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[52]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "getServicesAmount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.ServiceStructAmount[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.ServiceStructAmount[]) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.ServiceStructAmount[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.UpdateAditionalInfoSubscriber getUpdateAditionalInfoSubscriber(net.telmex.pcml.service.UpdateAditionalInfoSubscriber parameters) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[53]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "getUpdateAditionalInfoSubscriber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.UpdateAditionalInfoSubscriber) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.UpdateAditionalInfoSubscriber) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.UpdateAditionalInfoSubscriber.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.WorkOrderStruct getLastWorkOrderStruct(java.math.BigDecimal acount, java.lang.String otType, java.lang.String otState) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[54]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "getLastWorkOrderStruct"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {acount, otType, otState});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.WorkOrderStruct) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.WorkOrderStruct) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.WorkOrderStruct.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.UpdateDate getPCMLUpdateDate(net.telmex.pcml.service.UpdateDate parameters) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[55]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "getPCMLUpdateDate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.UpdateDate) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.UpdateDate) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.UpdateDate.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.MaterialVO[] getMaterial(java.lang.String tarifa, java.lang.String division, java.lang.String comunidad, java.lang.String itemClass) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[56]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "getMaterial"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {tarifa, division, comunidad, itemClass});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.MaterialVO[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.MaterialVO[]) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.MaterialVO[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.DateDXSuscriberStruct getDateDXSubscribers(java.lang.Long idUnidad) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[57]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "getDateDXSubscribers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {idUnidad});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.DateDXSuscriberStruct) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.DateDXSuscriberStruct) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.DateDXSuscriberStruct.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.VentaMultiplayInfoResponse guardarVentaMultiplay(java.lang.String custCode, java.lang.String cuenta, java.lang.String servicio, java.lang.String vendedorCodigo, java.lang.String vendedorCentroCosto, java.lang.String vendedorDocumento, java.lang.String paqueteCodigo, java.lang.String planCodigo, java.lang.String planNombre, java.lang.String paqueteDatosCodigo, java.lang.String idActivacion, java.lang.String msisdnAsignado, java.lang.String fechaVenta, java.lang.String fechaPermanencia, java.lang.String fechaOt, java.lang.String numeroOt, java.lang.String itemClass, java.lang.String manufactureClass, java.lang.String estado) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[58]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "guardarVentaMultiplay"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {custCode, cuenta, servicio, vendedorCodigo, vendedorCentroCosto, vendedorDocumento, paqueteCodigo, planCodigo, planNombre, paqueteDatosCodigo, idActivacion, msisdnAsignado, fechaVenta, fechaPermanencia, fechaOt, numeroOt, itemClass, manufactureClass, estado});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.VentaMultiplayInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.VentaMultiplayInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.VentaMultiplayInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.DescuentoVentaPurchaseVO[] getDescuentosVentaPurchase(java.lang.String cuenta, java.lang.String orderWp, java.lang.String info1, java.lang.String info2) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[59]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "getDescuentosVentaPurchase"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {cuenta, orderWp, info1, info2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.DescuentoVentaPurchaseVO[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.DescuentoVentaPurchaseVO[]) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.DescuentoVentaPurchaseVO[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.EntregaDomicilioVO[] getEntregaDomicilios(java.lang.String zicmc) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[60]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "getEntregaDomicilios"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {zicmc});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.EntregaDomicilioVO[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.EntregaDomicilioVO[]) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.EntregaDomicilioVO[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.AdministradorNotasVO crearNota(java.lang.String cuenta, java.lang.String usuario, java.lang.String tipoNota, java.lang.String descripcion, java.lang.String accion, java.lang.String nota) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[61]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "crearNota"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {cuenta, usuario, tipoNota, descripcion, accion, nota});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.AdministradorNotasVO) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.AdministradorNotasVO) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.AdministradorNotasVO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.AdministradorNotasVO adicionarLineasNota(java.lang.String cuenta, java.lang.String usuario, java.lang.String numNota, java.lang.String accion, java.lang.String nota) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[62]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "adicionarLineasNota"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {cuenta, usuario, numNota, accion, nota});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.AdministradorNotasVO) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.AdministradorNotasVO) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.AdministradorNotasVO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String getEstratoCuenta(java.lang.String cuenta) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[63]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "getEstratoCuenta"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {cuenta});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.TarifasCuentaVO getTarifasCuenta(java.lang.String cuenta, java.lang.String numeroOt) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[64]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "getTarifasCuenta"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {cuenta, numeroOt});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.TarifasCuentaVO) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.TarifasCuentaVO) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.TarifasCuentaVO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.ValorCuotasPurchase getPrecioYCuota(net.telmex.pcml.service.ValorCuotasPurchase arg0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[65]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "getPrecioYCuota"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.ValorCuotasPurchase) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.ValorCuotasPurchase) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.ValorCuotasPurchase.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String getCategoriaJurisdiccion(java.lang.String itemClass, java.lang.String manufacturerClass) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[66]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "getCategoriaJurisdiccion"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {itemClass, manufacturerClass});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.PcmlCampaign insertCampaigns(net.telmex.pcml.service.PcmlCampaign arg0) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[67]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "insertCampaigns"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.PcmlCampaign) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.PcmlCampaign) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.PcmlCampaign.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.UpdateBillingInfo updateBillingInfoClient(net.telmex.pcml.service.UpdateBillingInfo arg0) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[68]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "updateBillingInfoClient"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.UpdateBillingInfo) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.UpdateBillingInfo) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.UpdateBillingInfo.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.InfoSale updateInfoSale(net.telmex.pcml.service.InfoSale arg0) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[69]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "updateInfoSale"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.InfoSale) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.InfoSale) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.InfoSale.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.RegistroPago crearRegistroPago(net.telmex.pcml.service.RegistroPago arg0) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[70]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "crearRegistroPago"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.RegistroPago) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.RegistroPago) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.RegistroPago.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.ConsultaLlamadaYOrdenTrabajo consultaLlamadaYOrdenW(net.telmex.pcml.service.ConsultaLlamadaYOrdenTrabajo arg0) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[71]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "consultaLlamadaYOrdenW"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.ConsultaLlamadaYOrdenTrabajo) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.ConsultaLlamadaYOrdenTrabajo) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.ConsultaLlamadaYOrdenTrabajo.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.SubscriberInfo updateSubscriberInfo(net.telmex.pcml.service.SubscriberInfo arg0) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[72]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "updateSubscriberInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.SubscriberInfo) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.SubscriberInfo) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.SubscriberInfo.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.SubscriberType getSubscriberType(net.telmex.pcml.service.SubscriberType arg0) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[73]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "getSubscriberType"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.SubscriberType) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.SubscriberType) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.SubscriberType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.TipoLinea setTipoLinea(net.telmex.pcml.service.TipoLinea arg0) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[74]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "setTipoLinea"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.TipoLinea) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.TipoLinea) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.TipoLinea.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.NotasNuncaServicio getNotas(net.telmex.pcml.service.NotasNuncaServicio arg0) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[75]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "getNotas"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.NotasNuncaServicio) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.NotasNuncaServicio) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.NotasNuncaServicio.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.ConsultaCuentaMatriz consultarCM(net.telmex.pcml.service.ConsultaCuentaMatriz arg0) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[76]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "consultarCM"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.ConsultaCuentaMatriz) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.ConsultaCuentaMatriz) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.ConsultaCuentaMatriz.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.InsertarServicio agregarServicio(net.telmex.pcml.service.InsertarServicio arg0) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[77]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "agregarServicio"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.InsertarServicio) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.InsertarServicio) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.InsertarServicio.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.QuitarServicio eliminarServicio(net.telmex.pcml.service.QuitarServicio arg0) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[78]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "eliminarServicio"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.QuitarServicio) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.QuitarServicio) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.QuitarServicio.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.Vecino[] findVecinos(net.telmex.pcml.service.BusquedaVecinos arg0) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[79]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "findVecinos"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.Vecino[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.Vecino[]) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.Vecino[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.UnidadInternetXDias consultaUnidadConInternetUltimosXDias(java.lang.String unidad, java.lang.String dias) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[80]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "consultaUnidadConInternetUltimosXDias"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {unidad, dias});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.UnidadInternetXDias) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.UnidadInternetXDias) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.UnidadInternetXDias.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.CambioPass cambiarPassword(net.telmex.pcml.service.CambioPass arg0) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[81]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "cambiarPassword"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.CambioPass) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.CambioPass) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.CambioPass.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.CampaignAccount getCampaignOTTAccount(java.lang.String cuenta) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[82]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "getCampaignOTTAccount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {cuenta});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.CampaignAccount) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.CampaignAccount) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.CampaignAccount.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.UserActiveStruct userActive(java.lang.String user) throws java.rmi.RemoteException, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[83]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "UserActive"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {user});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.UserActiveStruct) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.UserActiveStruct) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.UserActiveStruct.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.ReporteSerializadosEntry ejecutarOT(java.lang.String nomArchivo) throws java.rmi.RemoteException, net.telmex.pcml.service.Exception, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[84]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "ejecutarOT"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {nomArchivo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.ReporteSerializadosEntry) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.ReporteSerializadosEntry) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.ReporteSerializadosEntry.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.Exception) {
              throw (net.telmex.pcml.service.Exception) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.ReporteSerializadosEntry consultarOT(java.lang.String nomArchivo) throws java.rmi.RemoteException, net.telmex.pcml.service.Exception, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[85]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "consultarOT"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {nomArchivo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.ReporteSerializadosEntry) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.ReporteSerializadosEntry) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.ReporteSerializadosEntry.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.Exception) {
              throw (net.telmex.pcml.service.Exception) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String updateCusCodeMovil(net.telmex.pcml.service.UpdateCusCodeMovilVo updateCusCodeMovilRequest) throws java.rmi.RemoteException, net.telmex.pcml.service.Exception, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[86]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "UpdateCusCodeMovil"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {updateCusCodeMovilRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.Exception) {
              throw (net.telmex.pcml.service.Exception) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.PagoAnticipadoStructResCons consultaPagoAnticipado(net.telmex.pcml.service.PagoAnticipadoStructAntCons pagoAntConsulta) throws java.rmi.RemoteException, net.telmex.pcml.service.Exception, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[87]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "consultaPagoAnticipado"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {pagoAntConsulta});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.PagoAnticipadoStructResCons) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.PagoAnticipadoStructResCons) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.PagoAnticipadoStructResCons.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.Exception) {
              throw (net.telmex.pcml.service.Exception) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.ResponseGetInfoOt getInfoOT(java.lang.String numeroOt) throws java.rmi.RemoteException, net.telmex.pcml.service.Exception, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[88]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "getInfoOT"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {numeroOt});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.ResponseGetInfoOt) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.ResponseGetInfoOt) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.ResponseGetInfoOt.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.Exception) {
              throw (net.telmex.pcml.service.Exception) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.Clminpr00 getInfoAcountWTH(java.lang.String cuenta) throws java.rmi.RemoteException, net.telmex.pcml.service.Exception, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[89]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "getInfoAcountWTH"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {cuenta});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.Clminpr00) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.Clminpr00) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.Clminpr00.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.Exception) {
              throw (net.telmex.pcml.service.Exception) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.ResponseVentaCuotas consultaSaldoMultiplay(java.lang.String pcustcode) throws java.rmi.RemoteException, net.telmex.pcml.service.Exception, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[90]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "consultaSaldoMultiplay"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {pcustcode});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.ResponseVentaCuotas) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.ResponseVentaCuotas) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.ResponseVentaCuotas.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.Exception) {
              throw (net.telmex.pcml.service.Exception) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.MantenimientoCal mtoCalificacion(net.telmex.pcml.service.MantenimientoCal requesCalificacion) throws java.rmi.RemoteException, net.telmex.pcml.service.Exception, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[91]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "mtoCalificacion"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requesCalificacion});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.MantenimientoCal) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.MantenimientoCal) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.MantenimientoCal.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.Exception) {
              throw (net.telmex.pcml.service.Exception) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.MantenimientoClavIVR mtoClavesIVR(net.telmex.pcml.service.MantenimientoClavIVR requestClIvr) throws java.rmi.RemoteException, net.telmex.pcml.service.Exception, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[92]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "mtoClavesIVR"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestClIvr});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.MantenimientoClavIVR) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.MantenimientoClavIVR) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.MantenimientoClavIVR.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.Exception) {
              throw (net.telmex.pcml.service.Exception) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.ValidaLineaResponse validaLineaTelefonica(net.telmex.pcml.service.ValLineaTelefonica requestValidar) throws java.rmi.RemoteException, net.telmex.pcml.service.Exception, net.telmex.pcml.service.PcmlException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[93]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "validaLineaTelefonica"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestValidar});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.ValidaLineaResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.ValidaLineaResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.ValidaLineaResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.Exception) {
              throw (net.telmex.pcml.service.Exception) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.pcml.service.PcmlException) {
              throw (net.telmex.pcml.service.PcmlException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.pcml.service.ValorRecargaResponse getValorRecarga(net.telmex.pcml.service.ValorRecargaRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[94]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "getValorRecarga"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.pcml.service.ValorRecargaResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.pcml.service.ValorRecargaResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.pcml.service.ValorRecargaResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
