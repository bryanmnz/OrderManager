/**
 * ManagementPortBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.telmex.ws;

public class ManagementPortBindingStub extends org.apache.axis.client.Stub implements net.telmex.ws.Management {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[13];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("acknowledgeNotePrioritySubscriberNote");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.telmex.net/", "updateSubscriberSpecialNoteRequest"), net.telmex.ws.UpdateSubscriberSpecialNoteRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "verificacion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.telmex.net/", "createSubscriberSpecialNoteResponse"));
        oper.setReturnClass(net.telmex.ws.CreateSubscriberSpecialNoteResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.telmex.net/", "Exception"),
                      "net.telmex.ws.Exception",
                      new javax.xml.namespace.QName("http://ws.telmex.net/", "Exception"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("acknowledgeReminderDateSubscriberNote");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.telmex.net/", "updateSubscriberSpecialNoteRequest"), net.telmex.ws.UpdateSubscriberSpecialNoteRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "verificacion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.telmex.net/", "subscriberSpecialNoteResponse"));
        oper.setReturnClass(net.telmex.ws.SubscriberSpecialNoteResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.telmex.net/", "Exception"),
                      "net.telmex.ws.Exception",
                      new javax.xml.namespace.QName("http://ws.telmex.net/", "Exception"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createServiceCallOp");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.telmex.net/", "createServiceCallRequest"), net.telmex.ws.CreateServiceCallRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "verificacion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.telmex.net/", "createServiceCallResponse"));
        oper.setReturnClass(net.telmex.ws.CreateServiceCallResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.telmex.net/", "Exception"),
                      "net.telmex.ws.Exception",
                      new javax.xml.namespace.QName("http://ws.telmex.net/", "Exception"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createSubscriberNote");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.telmex.net/", "createSubscriberSpecialNoteRequest"), net.telmex.ws.CreateSubscriberSpecialNoteRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "verificacion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.telmex.net/", "createSubscriberSpecialNoteResponse"));
        oper.setReturnClass(net.telmex.ws.CreateSubscriberSpecialNoteResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.telmex.net/", "Exception"),
                      "net.telmex.ws.Exception",
                      new javax.xml.namespace.QName("http://ws.telmex.net/", "Exception"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("dispatchServiceCall");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.telmex.net/", "dispatchServiceCallRequest"), net.telmex.ws.DispatchServiceCallRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "verificacion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.telmex.net/", "responseMessage"));
        oper.setReturnClass(net.telmex.ws.ResponseMessage.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.telmex.net/", "Exception"),
                      "net.telmex.ws.Exception",
                      new javax.xml.namespace.QName("http://ws.telmex.net/", "Exception"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("printServiceCall");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.telmex.net/", "printServiceCallRequest"), net.telmex.ws.PrintServiceCallRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "verificacion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.telmex.net/", "responseMessage"));
        oper.setReturnClass(net.telmex.ws.ResponseMessage.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.telmex.net/", "Exception"),
                      "net.telmex.ws.Exception",
                      new javax.xml.namespace.QName("http://ws.telmex.net/", "Exception"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cancelServiceCall");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.telmex.net/", "qCancelServiceCallRequest"), net.telmex.ws.QCancelServiceCallRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "verificacion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.telmex.net/", "qCompleteCancelServiceCallResponse"));
        oper.setReturnClass(net.telmex.ws.QCompleteCancelServiceCallResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.telmex.net/", "Exception"),
                      "net.telmex.ws.Exception",
                      new javax.xml.namespace.QName("http://ws.telmex.net/", "Exception"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("completeServiceCall");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.telmex.net/", "qCompleteServiceCallRequest"), net.telmex.ws.QCompleteServiceCallRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "verificacion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.telmex.net/", "qCompleteCancelServiceCallResponse"));
        oper.setReturnClass(net.telmex.ws.QCompleteCancelServiceCallResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.telmex.net/", "Exception"),
                      "net.telmex.ws.Exception",
                      new javax.xml.namespace.QName("http://ws.telmex.net/", "Exception"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("queryServiceCallOp");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.telmex.net/", "queryServiceCallRequest"), net.telmex.ws.QueryServiceCallRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "verificacion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.telmex.net/", "queryServiceCallResponse"));
        oper.setReturnClass(net.telmex.ws.QueryServiceCallResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.telmex.net/", "InterruptedException"),
                      "net.telmex.ws.InterruptedException",
                      new javax.xml.namespace.QName("http://ws.telmex.net/", "InterruptedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.telmex.net/", "Exception"),
                      "net.telmex.ws.Exception",
                      new javax.xml.namespace.QName("http://ws.telmex.net/", "Exception"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("unitDirection");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.telmex.net/", "unitDirectionRequest"), net.telmex.ws.UnitDirectionRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "verificacion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.telmex.net/", "subscriberSpecialNoteResponse"));
        oper.setReturnClass(net.telmex.ws.SubscriberSpecialNoteResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.telmex.net/", "Exception"),
                      "net.telmex.ws.Exception",
                      new javax.xml.namespace.QName("http://ws.telmex.net/", "Exception"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("unitSpecialNote");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.telmex.net/", "unitSpecialNoteRequest"), net.telmex.ws.UnitSpecialNoteRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "verificacion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.telmex.net/", "subscriberSpecialNoteResponse"));
        oper.setReturnClass(net.telmex.ws.SubscriberSpecialNoteResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.telmex.net/", "Exception"),
                      "net.telmex.ws.Exception",
                      new javax.xml.namespace.QName("http://ws.telmex.net/", "Exception"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateServiceCall");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.telmex.net/", "updateServiceCallRequest"), net.telmex.ws.UpdateServiceCallRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "verificacion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.telmex.net/", "responseMessage"));
        oper.setReturnClass(net.telmex.ws.ResponseMessage.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.telmex.net/", "Exception"),
                      "net.telmex.ws.Exception",
                      new javax.xml.namespace.QName("http://ws.telmex.net/", "Exception"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateSusbscriberNote");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.telmex.net/", "updateSubscriberSpecialNoteRequest"), net.telmex.ws.UpdateSubscriberSpecialNoteRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "verificacion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.telmex.net/", "subscriberSpecialNoteResponse"));
        oper.setReturnClass(net.telmex.ws.SubscriberSpecialNoteResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.telmex.net/", "Exception"),
                      "net.telmex.ws.Exception",
                      new javax.xml.namespace.QName("http://ws.telmex.net/", "Exception"), 
                      true
                     ));
        _operations[12] = oper;

    }

    public ManagementPortBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ManagementPortBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ManagementPortBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://ws.telmex.net/", "basicMessage");
            cachedSerQNames.add(qName);
            cls = net.telmex.ws.BasicMessage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.telmex.net/", "basicRequest");
            cachedSerQNames.add(qName);
            cls = net.telmex.ws.BasicRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.telmex.net/", "createServiceCallRequest");
            cachedSerQNames.add(qName);
            cls = net.telmex.ws.CreateServiceCallRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.telmex.net/", "createServiceCallResponse");
            cachedSerQNames.add(qName);
            cls = net.telmex.ws.CreateServiceCallResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.telmex.net/", "createSubscriberSpecialNoteRequest");
            cachedSerQNames.add(qName);
            cls = net.telmex.ws.CreateSubscriberSpecialNoteRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.telmex.net/", "createSubscriberSpecialNoteResponse");
            cachedSerQNames.add(qName);
            cls = net.telmex.ws.CreateSubscriberSpecialNoteResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.telmex.net/", "dispatchServiceCallRequest");
            cachedSerQNames.add(qName);
            cls = net.telmex.ws.DispatchServiceCallRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.telmex.net/", "Exception");
            cachedSerQNames.add(qName);
            cls = net.telmex.ws.Exception.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.telmex.net/", "InterruptedException");
            cachedSerQNames.add(qName);
            cls = net.telmex.ws.InterruptedException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.telmex.net/", "printServiceCallRequest");
            cachedSerQNames.add(qName);
            cls = net.telmex.ws.PrintServiceCallRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.telmex.net/", "qCancelServiceCallRequest");
            cachedSerQNames.add(qName);
            cls = net.telmex.ws.QCancelServiceCallRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.telmex.net/", "qCompleteCancelServiceCallResponse");
            cachedSerQNames.add(qName);
            cls = net.telmex.ws.QCompleteCancelServiceCallResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.telmex.net/", "qCompleteServiceCallRequest");
            cachedSerQNames.add(qName);
            cls = net.telmex.ws.QCompleteServiceCallRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.telmex.net/", "queryServiceCallRequest");
            cachedSerQNames.add(qName);
            cls = net.telmex.ws.QueryServiceCallRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.telmex.net/", "queryServiceCallResponse");
            cachedSerQNames.add(qName);
            cls = net.telmex.ws.QueryServiceCallResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.telmex.net/", "responseMessage");
            cachedSerQNames.add(qName);
            cls = net.telmex.ws.ResponseMessage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.telmex.net/", "subscriberSpecialNoteResponse");
            cachedSerQNames.add(qName);
            cls = net.telmex.ws.SubscriberSpecialNoteResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.telmex.net/", "unitDirectionRequest");
            cachedSerQNames.add(qName);
            cls = net.telmex.ws.UnitDirectionRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.telmex.net/", "unitSpecialNoteRequest");
            cachedSerQNames.add(qName);
            cls = net.telmex.ws.UnitSpecialNoteRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.telmex.net/", "updateServiceCallRequest");
            cachedSerQNames.add(qName);
            cls = net.telmex.ws.UpdateServiceCallRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.telmex.net/", "updateSubscriberSpecialNoteRequest");
            cachedSerQNames.add(qName);
            cls = net.telmex.ws.UpdateSubscriberSpecialNoteRequest.class;
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

    public net.telmex.ws.CreateSubscriberSpecialNoteResponse acknowledgeNotePrioritySubscriberNote(net.telmex.ws.UpdateSubscriberSpecialNoteRequest request, java.lang.String verificacion) throws java.rmi.RemoteException, net.telmex.ws.Exception {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.telmex.net/", "acknowledgeNotePrioritySubscriberNote"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request, verificacion});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.ws.CreateSubscriberSpecialNoteResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.ws.CreateSubscriberSpecialNoteResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.ws.CreateSubscriberSpecialNoteResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.ws.Exception) {
              throw (net.telmex.ws.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.ws.SubscriberSpecialNoteResponse acknowledgeReminderDateSubscriberNote(net.telmex.ws.UpdateSubscriberSpecialNoteRequest request, java.lang.String verificacion) throws java.rmi.RemoteException, net.telmex.ws.Exception {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.telmex.net/", "acknowledgeReminderDateSubscriberNote"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request, verificacion});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.ws.SubscriberSpecialNoteResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.ws.SubscriberSpecialNoteResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.ws.SubscriberSpecialNoteResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.ws.Exception) {
              throw (net.telmex.ws.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.ws.CreateServiceCallResponse createServiceCallOp(net.telmex.ws.CreateServiceCallRequest request, java.lang.String verificacion) throws java.rmi.RemoteException, net.telmex.ws.Exception {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.telmex.net/", "createServiceCallOp"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request, verificacion});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.ws.CreateServiceCallResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.ws.CreateServiceCallResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.ws.CreateServiceCallResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.ws.Exception) {
              throw (net.telmex.ws.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.ws.CreateSubscriberSpecialNoteResponse createSubscriberNote(net.telmex.ws.CreateSubscriberSpecialNoteRequest request, java.lang.String verificacion) throws java.rmi.RemoteException, net.telmex.ws.Exception {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.telmex.net/", "createSubscriberNote"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request, verificacion});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.ws.CreateSubscriberSpecialNoteResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.ws.CreateSubscriberSpecialNoteResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.ws.CreateSubscriberSpecialNoteResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.ws.Exception) {
              throw (net.telmex.ws.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.ws.ResponseMessage dispatchServiceCall(net.telmex.ws.DispatchServiceCallRequest request, java.lang.String verificacion) throws java.rmi.RemoteException, net.telmex.ws.Exception {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.telmex.net/", "dispatchServiceCall"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request, verificacion});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.ws.ResponseMessage) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.ws.ResponseMessage) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.ws.ResponseMessage.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.ws.Exception) {
              throw (net.telmex.ws.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.ws.ResponseMessage printServiceCall(net.telmex.ws.PrintServiceCallRequest request, java.lang.String verificacion) throws java.rmi.RemoteException, net.telmex.ws.Exception {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.telmex.net/", "printServiceCall"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request, verificacion});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.ws.ResponseMessage) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.ws.ResponseMessage) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.ws.ResponseMessage.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.ws.Exception) {
              throw (net.telmex.ws.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.ws.QCompleteCancelServiceCallResponse cancelServiceCall(net.telmex.ws.QCancelServiceCallRequest request, java.lang.String verificacion) throws java.rmi.RemoteException, net.telmex.ws.Exception {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.telmex.net/", "cancelServiceCall"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request, verificacion});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.ws.QCompleteCancelServiceCallResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.ws.QCompleteCancelServiceCallResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.ws.QCompleteCancelServiceCallResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.ws.Exception) {
              throw (net.telmex.ws.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.ws.QCompleteCancelServiceCallResponse completeServiceCall(net.telmex.ws.QCompleteServiceCallRequest request, java.lang.String verificacion) throws java.rmi.RemoteException, net.telmex.ws.Exception {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.telmex.net/", "completeServiceCall"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request, verificacion});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.ws.QCompleteCancelServiceCallResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.ws.QCompleteCancelServiceCallResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.ws.QCompleteCancelServiceCallResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.ws.Exception) {
              throw (net.telmex.ws.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.ws.QueryServiceCallResponse queryServiceCallOp(net.telmex.ws.QueryServiceCallRequest request, java.lang.String verificacion) throws java.rmi.RemoteException, net.telmex.ws.InterruptedException, net.telmex.ws.Exception {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.telmex.net/", "queryServiceCallOp"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request, verificacion});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.ws.QueryServiceCallResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.ws.QueryServiceCallResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.ws.QueryServiceCallResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.ws.InterruptedException) {
              throw (net.telmex.ws.InterruptedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.ws.Exception) {
              throw (net.telmex.ws.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.ws.SubscriberSpecialNoteResponse unitDirection(net.telmex.ws.UnitDirectionRequest request, java.lang.String verificacion) throws java.rmi.RemoteException, net.telmex.ws.Exception {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.telmex.net/", "unitDirection"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request, verificacion});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.ws.SubscriberSpecialNoteResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.ws.SubscriberSpecialNoteResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.ws.SubscriberSpecialNoteResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.ws.Exception) {
              throw (net.telmex.ws.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.ws.SubscriberSpecialNoteResponse unitSpecialNote(net.telmex.ws.UnitSpecialNoteRequest request, java.lang.String verificacion) throws java.rmi.RemoteException, net.telmex.ws.Exception {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.telmex.net/", "unitSpecialNote"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request, verificacion});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.ws.SubscriberSpecialNoteResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.ws.SubscriberSpecialNoteResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.ws.SubscriberSpecialNoteResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.ws.Exception) {
              throw (net.telmex.ws.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.ws.ResponseMessage updateServiceCall(net.telmex.ws.UpdateServiceCallRequest request, java.lang.String verificacion) throws java.rmi.RemoteException, net.telmex.ws.Exception {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.telmex.net/", "updateServiceCall"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request, verificacion});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.ws.ResponseMessage) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.ws.ResponseMessage) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.ws.ResponseMessage.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.ws.Exception) {
              throw (net.telmex.ws.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public net.telmex.ws.SubscriberSpecialNoteResponse updateSusbscriberNote(net.telmex.ws.UpdateSubscriberSpecialNoteRequest request, java.lang.String verificacion) throws java.rmi.RemoteException, net.telmex.ws.Exception {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.telmex.net/", "updateSusbscriberNote"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request, verificacion});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.telmex.ws.SubscriberSpecialNoteResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.telmex.ws.SubscriberSpecialNoteResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.telmex.ws.SubscriberSpecialNoteResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof net.telmex.ws.Exception) {
              throw (net.telmex.ws.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
