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
public interface MgwConfigValidacionFacadeLocal {

    void create(MgwConfigValidacion mgwConfigValidacion);

    void edit(MgwConfigValidacion mgwConfigValidacion);

    void remove(MgwConfigValidacion mgwConfigValidacion);

    MgwConfigValidacion find(Object id);

    List<MgwConfigValidacion> findAll();

    List<MgwConfigValidacion> findRange(int[] range);
    
    List<MgwConfigValidacion> findWithfilters(String sql, Map<String, Object> valores);

    int count();
    
}
