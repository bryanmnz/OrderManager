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
public interface MgwConciliacionErroresFacadeLocal {

    void create(MgwConciliacionErrores mgwConciliacionErrores);

    void edit(MgwConciliacionErrores mgwConciliacionErrores);

    void remove(MgwConciliacionErrores mgwConciliacionErrores);

    MgwConciliacionErrores find(Object id);

    List<MgwConciliacionErrores> findAll();

    List<MgwConciliacionErrores> findRange(int[] range);
    
    List<MgwConciliacionErrores> findWithfilters(String sql, Map<String,Object> valores);

    int count();
    
}
