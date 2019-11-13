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
public interface MgwAgendaFacadeLocal {

    void create(MgwAgenda mgwAgenda);

    void edit(MgwAgenda mgwAgenda);

    void remove(MgwAgenda mgwAgenda);

    MgwAgenda find(Object id);

    List<MgwAgenda> findAll();

    List<MgwAgenda> findRange(int[] range);
    
    List<MgwAgenda> findWithfilters(String sql, Map<String,Object> valores);

    int count();
    
}
