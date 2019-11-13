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
public interface MgwCaracteristicasAgFacadeLocal {

    void create(MgwCaracteristicasAg mgwCaracteristicasAg);

    void edit(MgwCaracteristicasAg mgwCaracteristicasAg);

    void remove(MgwCaracteristicasAg mgwCaracteristicasAg);

    MgwCaracteristicasAg find(Object id);

    List<MgwCaracteristicasAg> findAll();

    List<MgwCaracteristicasAg> findRange(int[] range);

    int count();
    
}
