/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.claro.bd;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author rodriguezjavr
 */
@Local
public interface MgwConciliacionProcesosFacadeLocal {

    void create(MgwConciliacionProcesos mgwConciliacionProcesos);

    void edit(MgwConciliacionProcesos mgwConciliacionProcesos);

    void remove(MgwConciliacionProcesos mgwConciliacionProcesos);

    MgwConciliacionProcesos find(Object id);

    List<MgwConciliacionProcesos> findAll();

    List<MgwConciliacionProcesos> findRange(int[] range);

    int count();
    
}
