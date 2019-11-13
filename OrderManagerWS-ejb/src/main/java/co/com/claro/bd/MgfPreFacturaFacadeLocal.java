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
public interface MgfPreFacturaFacadeLocal {

    void create(MgfPreFactura mgfPreFactura);

    void edit(MgfPreFactura mgfPreFactura);

    void remove(MgfPreFactura mgfPreFactura);

    MgfPreFactura find(Object id);

    List<MgfPreFactura> findAll();

    List<MgfPreFactura> findWithfilters(String sql, Map<String,Object> valores);
    
    List<MgfPreFactura> findRange(int[] range);

    int count();

    List<MgfPreFactura> findNativeQWithFilters(String sql, Map<String, Object> valores);
}
