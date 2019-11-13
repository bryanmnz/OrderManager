/**
 * Management.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.telmex.ws;

public interface Management extends java.rmi.Remote {
    public net.telmex.ws.CreateSubscriberSpecialNoteResponse acknowledgeNotePrioritySubscriberNote(net.telmex.ws.UpdateSubscriberSpecialNoteRequest request, java.lang.String verificacion) throws java.rmi.RemoteException, net.telmex.ws.Exception;
    public net.telmex.ws.SubscriberSpecialNoteResponse acknowledgeReminderDateSubscriberNote(net.telmex.ws.UpdateSubscriberSpecialNoteRequest request, java.lang.String verificacion) throws java.rmi.RemoteException, net.telmex.ws.Exception;
    public net.telmex.ws.CreateServiceCallResponse createServiceCallOp(net.telmex.ws.CreateServiceCallRequest request, java.lang.String verificacion) throws java.rmi.RemoteException, net.telmex.ws.Exception;
    public net.telmex.ws.CreateSubscriberSpecialNoteResponse createSubscriberNote(net.telmex.ws.CreateSubscriberSpecialNoteRequest request, java.lang.String verificacion) throws java.rmi.RemoteException, net.telmex.ws.Exception;
    public net.telmex.ws.ResponseMessage dispatchServiceCall(net.telmex.ws.DispatchServiceCallRequest request, java.lang.String verificacion) throws java.rmi.RemoteException, net.telmex.ws.Exception;
    public net.telmex.ws.ResponseMessage printServiceCall(net.telmex.ws.PrintServiceCallRequest request, java.lang.String verificacion) throws java.rmi.RemoteException, net.telmex.ws.Exception;
    public net.telmex.ws.QCompleteCancelServiceCallResponse cancelServiceCall(net.telmex.ws.QCancelServiceCallRequest request, java.lang.String verificacion) throws java.rmi.RemoteException, net.telmex.ws.Exception;
    public net.telmex.ws.QCompleteCancelServiceCallResponse completeServiceCall(net.telmex.ws.QCompleteServiceCallRequest request, java.lang.String verificacion) throws java.rmi.RemoteException, net.telmex.ws.Exception;
    public net.telmex.ws.QueryServiceCallResponse queryServiceCallOp(net.telmex.ws.QueryServiceCallRequest request, java.lang.String verificacion) throws java.rmi.RemoteException, net.telmex.ws.InterruptedException, net.telmex.ws.Exception;
    public net.telmex.ws.SubscriberSpecialNoteResponse unitDirection(net.telmex.ws.UnitDirectionRequest request, java.lang.String verificacion) throws java.rmi.RemoteException, net.telmex.ws.Exception;
    public net.telmex.ws.SubscriberSpecialNoteResponse unitSpecialNote(net.telmex.ws.UnitSpecialNoteRequest request, java.lang.String verificacion) throws java.rmi.RemoteException, net.telmex.ws.Exception;
    public net.telmex.ws.ResponseMessage updateServiceCall(net.telmex.ws.UpdateServiceCallRequest request, java.lang.String verificacion) throws java.rmi.RemoteException, net.telmex.ws.Exception;
    public net.telmex.ws.SubscriberSpecialNoteResponse updateSusbscriberNote(net.telmex.ws.UpdateSubscriberSpecialNoteRequest request, java.lang.String verificacion) throws java.rmi.RemoteException, net.telmex.ws.Exception;
}
