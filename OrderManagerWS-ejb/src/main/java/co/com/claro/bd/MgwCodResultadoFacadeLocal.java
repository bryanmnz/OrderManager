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
public interface MgwCodResultadoFacadeLocal {

    void create(MgwCodResultado mgwCodResultado);

    void edit(MgwCodResultado mgwCodResultado);

    void remove(MgwCodResultado mgwCodResultado);

    MgwCodResultado find(Object id);

    List<MgwCodResultado> findAll();

    List<MgwCodResultado> findRange(int[] range);
    
    List<MgwCodResultado> findWithfilters(String sql, Map<String,Object> valores);

    int count();
    
}
