/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.claro.bd;

import java.util.List;
import java.util.Map;
import javax.ejb.Local;

/**
 *
 * @author rodriguezjavr
 */
@Local
public interface WebservicesFacadeLocal {

    void create(Webservices webservices);

    void edit(Webservices webservices);

    void remove(Webservices webservices);

    Webservices find(Object id);

    List<Webservices> findAll();
    
    List<Webservices> findList(String sql, Map<String,Object> valores) ;

    List<Webservices> findRange(int[] range);

    int count();
    
}
