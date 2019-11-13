/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.globalhitss.ordermanager.ws;

import co.com.claro.wsorder.vo.Response;
import co.com.claro.wsorder.vo.SoftCloseRequest;
import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author rodriguezjavr
 */
@WebService(serviceName = "OrderManagerWSService")
public class OrderManagerWSService {

    @EJB
    private OrderBeanLocal ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Web Service > Add Operation"

    
    @WebMethod(operationName = "softClose")
    public Response softClose(@WebParam(name = "request") SoftCloseRequest request) throws Exception {
        return ejbRef.softClose(request);
    }
    
   
    
}
