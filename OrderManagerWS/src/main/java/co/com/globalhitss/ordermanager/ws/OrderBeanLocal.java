/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.globalhitss.ordermanager.ws;

import co.com.claro.wsorder.vo.Response;
import co.com.claro.wsorder.vo.SoftCloseRequest;
import javax.ejb.Local;

/**
 *
 * @author rodriguezjavr
 */
@Local
public interface OrderBeanLocal {
   
    

    Response softClose(SoftCloseRequest request) throws Exception;
}
