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
public interface MgfPreActividadFacadeLocal {

    void create(MgfPreActividad mgfPreActividad);

    void edit(MgfPreActividad mgfPreActividad);

    void remove(MgfPreActividad mgfPreActividad);

    MgfPreActividad find(Object id);

    List<MgfPreActividad> findAll();

    List<MgfPreActividad> findRange(int[] range);

    int count();
    
    List<MgfPreActividad> findList(String sql, Map<String,Object> valor);
    
    
    List<MgfPreActividad> findNativeQWithFilters(String sql, Map<String,Object> valor);
    
}
