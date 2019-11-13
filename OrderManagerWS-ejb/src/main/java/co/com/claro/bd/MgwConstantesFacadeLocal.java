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
public interface MgwConstantesFacadeLocal {

    void create(MgwConstantes mgwConstantes);

    void edit(MgwConstantes mgwConstantes);

    void remove(MgwConstantes mgwConstantes);

    MgwConstantes find(Object id);

    List<MgwConstantes> findAll();

    List<MgwConstantes> findRange(int[] range);
    
    List<MgwConstantes> findWithfilters(String sql, Map<String,Object> valores);

    int count();
    
}
