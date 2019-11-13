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
public interface MgwCapacidadesFacadeLocal {

    void create(MgwCapacidades mgwCapacidades);

    void edit(MgwCapacidades mgwCapacidades);

    void remove(MgwCapacidades mgwCapacidades);

    MgwCapacidades find(Object id);

    List<MgwCapacidades> findAll();

    List<MgwCapacidades> findRange(int[] range);

    int count();
    
}
