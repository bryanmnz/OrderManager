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
public interface MgwConciliacionFacadeLocal {

    void create(MgwConciliacion mgwConciliacion);

    void edit(MgwConciliacion mgwConciliacion);

    void remove(MgwConciliacion mgwConciliacion);

    MgwConciliacion find(Object id);

    List<MgwConciliacion> findAll();

    List<MgwConciliacion> findRange(int[] range);

    int count();
    
}
