package co.net.cable.Agendamiento.MGW.Servicios;

public class GetWInfoWSPortTypeProxy implements co.net.cable.Agendamiento.MGW.Servicios.GetWInfoWSPortType {
  private String _endpoint = null;
  private co.net.cable.Agendamiento.MGW.Servicios.GetWInfoWSPortType getWInfoWSPortType = null;
  
  public GetWInfoWSPortTypeProxy() {
    _initGetWInfoWSPortTypeProxy();
  }
  
  public GetWInfoWSPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initGetWInfoWSPortTypeProxy();
  }
  
  private void _initGetWInfoWSPortTypeProxy() {
    try {
      getWInfoWSPortType = (new co.net.cable.Agendamiento.MGW.Servicios.GetWInfoWSLocator()).getGetWInfoWSPort();
      if (getWInfoWSPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)getWInfoWSPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)getWInfoWSPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (getWInfoWSPortType != null)
      ((javax.xml.rpc.Stub)getWInfoWSPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public co.net.cable.Agendamiento.MGW.Servicios.GetWInfoWSPortType getGetWInfoWSPortType() {
    if (getWInfoWSPortType == null)
      _initGetWInfoWSPortTypeProxy();
    return getWInfoWSPortType;
  }
  
  public java.lang.String[] get_w_info(java.lang.String id_Tipo_Orden, java.lang.String orden) throws java.rmi.RemoteException{
    if (getWInfoWSPortType == null)
      _initGetWInfoWSPortTypeProxy();
    return getWInfoWSPortType.get_w_info(id_Tipo_Orden, orden);
  }
  
  
}