package net.telmex.ws;

public class ManagementProxy implements net.telmex.ws.Management {
  private String _endpoint = null;
  private net.telmex.ws.Management management = null;
  
  public ManagementProxy() {
    _initManagementProxy();
  }
  
  public ManagementProxy(String endpoint) {
    _endpoint = endpoint;
    _initManagementProxy();
  }
  
  private void _initManagementProxy() {
    try {
      management = (new net.telmex.ws.WsServiceCallLocator()).getmanagementPort();
      if (management != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)management)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)management)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (management != null)
      ((javax.xml.rpc.Stub)management)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public net.telmex.ws.Management getManagement() {
    if (management == null)
      _initManagementProxy();
    return management;
  }
  
  public net.telmex.ws.CreateSubscriberSpecialNoteResponse acknowledgeNotePrioritySubscriberNote(net.telmex.ws.UpdateSubscriberSpecialNoteRequest request, java.lang.String verificacion) throws java.rmi.RemoteException, net.telmex.ws.Exception{
    if (management == null)
      _initManagementProxy();
    return management.acknowledgeNotePrioritySubscriberNote(request, verificacion);
  }
  
  public net.telmex.ws.SubscriberSpecialNoteResponse acknowledgeReminderDateSubscriberNote(net.telmex.ws.UpdateSubscriberSpecialNoteRequest request, java.lang.String verificacion) throws java.rmi.RemoteException, net.telmex.ws.Exception{
    if (management == null)
      _initManagementProxy();
    return management.acknowledgeReminderDateSubscriberNote(request, verificacion);
  }
  
  public net.telmex.ws.CreateServiceCallResponse createServiceCallOp(net.telmex.ws.CreateServiceCallRequest request, java.lang.String verificacion) throws java.rmi.RemoteException, net.telmex.ws.Exception{
    if (management == null)
      _initManagementProxy();
    return management.createServiceCallOp(request, verificacion);
  }
  
  public net.telmex.ws.CreateSubscriberSpecialNoteResponse createSubscriberNote(net.telmex.ws.CreateSubscriberSpecialNoteRequest request, java.lang.String verificacion) throws java.rmi.RemoteException, net.telmex.ws.Exception{
    if (management == null)
      _initManagementProxy();
    return management.createSubscriberNote(request, verificacion);
  }
  
  public net.telmex.ws.ResponseMessage dispatchServiceCall(net.telmex.ws.DispatchServiceCallRequest request, java.lang.String verificacion) throws java.rmi.RemoteException, net.telmex.ws.Exception{
    if (management == null)
      _initManagementProxy();
    return management.dispatchServiceCall(request, verificacion);
  }
  
  public net.telmex.ws.ResponseMessage printServiceCall(net.telmex.ws.PrintServiceCallRequest request, java.lang.String verificacion) throws java.rmi.RemoteException, net.telmex.ws.Exception{
    if (management == null)
      _initManagementProxy();
    return management.printServiceCall(request, verificacion);
  }
  
  public net.telmex.ws.QCompleteCancelServiceCallResponse cancelServiceCall(net.telmex.ws.QCancelServiceCallRequest request, java.lang.String verificacion) throws java.rmi.RemoteException, net.telmex.ws.Exception{
    if (management == null)
      _initManagementProxy();
    return management.cancelServiceCall(request, verificacion);
  }
  
  public net.telmex.ws.QCompleteCancelServiceCallResponse completeServiceCall(net.telmex.ws.QCompleteServiceCallRequest request, java.lang.String verificacion) throws java.rmi.RemoteException, net.telmex.ws.Exception{
    if (management == null)
      _initManagementProxy();
    return management.completeServiceCall(request, verificacion);
  }
  
  public net.telmex.ws.QueryServiceCallResponse queryServiceCallOp(net.telmex.ws.QueryServiceCallRequest request, java.lang.String verificacion) throws java.rmi.RemoteException, net.telmex.ws.InterruptedException, net.telmex.ws.Exception{
    if (management == null)
      _initManagementProxy();
    return management.queryServiceCallOp(request, verificacion);
  }
  
  public net.telmex.ws.SubscriberSpecialNoteResponse unitDirection(net.telmex.ws.UnitDirectionRequest request, java.lang.String verificacion) throws java.rmi.RemoteException, net.telmex.ws.Exception{
    if (management == null)
      _initManagementProxy();
    return management.unitDirection(request, verificacion);
  }
  
  public net.telmex.ws.SubscriberSpecialNoteResponse unitSpecialNote(net.telmex.ws.UnitSpecialNoteRequest request, java.lang.String verificacion) throws java.rmi.RemoteException, net.telmex.ws.Exception{
    if (management == null)
      _initManagementProxy();
    return management.unitSpecialNote(request, verificacion);
  }
  
  public net.telmex.ws.ResponseMessage updateServiceCall(net.telmex.ws.UpdateServiceCallRequest request, java.lang.String verificacion) throws java.rmi.RemoteException, net.telmex.ws.Exception{
    if (management == null)
      _initManagementProxy();
    return management.updateServiceCall(request, verificacion);
  }
  
  public net.telmex.ws.SubscriberSpecialNoteResponse updateSusbscriberNote(net.telmex.ws.UpdateSubscriberSpecialNoteRequest request, java.lang.String verificacion) throws java.rmi.RemoteException, net.telmex.ws.Exception{
    if (management == null)
      _initManagementProxy();
    return management.updateSusbscriberNote(request, verificacion);
  }
  
  
}