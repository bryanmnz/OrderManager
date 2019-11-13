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
public interface MgwOrigenFacadeLocal {

    void create(MgwOrigen mgwOrigen);

    void edit(MgwOrigen mgwOrigen);

    void remove(MgwOrigen mgwOrigen);

    MgwOrigen find(Object id);

    List<MgwOrigen> findAll();

    List<MgwOrigen> findRange(int[] range);

    int count();
    
    List<MgwOrigen> findWithfilters(String sql, Map<String,Object> valores);
    
}
