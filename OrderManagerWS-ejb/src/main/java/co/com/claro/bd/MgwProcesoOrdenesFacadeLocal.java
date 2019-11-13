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
public interface MgwProcesoOrdenesFacadeLocal {

    void create(MgwProcesoOrdenes mgwProcesoOrdenes);

    void edit(MgwProcesoOrdenes mgwProcesoOrdenes);

    void remove(MgwProcesoOrdenes mgwProcesoOrdenes);

    MgwProcesoOrdenes find(Object id);

    List<MgwProcesoOrdenes> findAll();

    List<MgwProcesoOrdenes> findRange(int[] range);
    
    List<MgwProcesoOrdenes> findWithfilters(String sql, Map<String, Object> valores);

    int count();
    
}
