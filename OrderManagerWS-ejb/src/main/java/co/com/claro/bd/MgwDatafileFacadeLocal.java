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
public interface MgwDatafileFacadeLocal {

    void create(MgwDatafile mgwDatafile);

    void edit(MgwDatafile mgwDatafile);

    void remove(MgwDatafile mgwDatafile);

    MgwDatafile find(Object id);

    List<MgwDatafile> findAll();

    List<MgwDatafile> findRange(int[] range);
    
    List<MgwDatafile> findWithfilters(String sql, Map<String,Object> valores);

    int count();
    
}
