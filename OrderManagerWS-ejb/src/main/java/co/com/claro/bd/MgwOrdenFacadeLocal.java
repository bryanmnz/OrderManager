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
public interface MgwOrdenFacadeLocal {

    void create(MgwOrden mgwOrden);

    void edit(MgwOrden mgwOrden);

    void remove(MgwOrden mgwOrden);

    MgwOrden find(Object id);

    List<MgwOrden> findAll();

    List<MgwOrden> findRange(int[] range);
    
    List<MgwOrden> findList(String sql, Map<String,Object> valor);

    int count();
    
}
