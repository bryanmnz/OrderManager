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
public interface MgwPreagendaFacadeLocal {

    void create(MgwPreagenda mgwPreagenda);

    void edit(MgwPreagenda mgwPreagenda);

    void remove(MgwPreagenda mgwPreagenda);

    MgwPreagenda find(Object id);

    List<MgwPreagenda> findAll();

    List<MgwPreagenda> findRange(int[] range);
    
    List<MgwPreagenda> findWithfilters(String sql, Map<String, Object> valores);

    int count();
    
}
