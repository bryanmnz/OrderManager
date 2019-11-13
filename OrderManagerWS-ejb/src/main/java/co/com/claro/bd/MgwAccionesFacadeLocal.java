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
public interface MgwAccionesFacadeLocal {

    void create(MgwAcciones mgwAcciones);

    void edit(MgwAcciones mgwAcciones);

    void remove(MgwAcciones mgwAcciones);

    MgwAcciones find(Object id);

    List<MgwAcciones> findAll();

    List<MgwAcciones> findRange(int[] range);
    
    List<MgwAcciones> findWithfilters(String sql, Map<String,Object> valores);
    

    int count();
    
}
