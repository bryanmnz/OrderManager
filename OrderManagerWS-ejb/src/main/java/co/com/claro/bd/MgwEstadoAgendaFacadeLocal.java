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
public interface MgwEstadoAgendaFacadeLocal {

    void create(MgwEstadoAgenda mgwEstadoAgenda);

    void edit(MgwEstadoAgenda mgwEstadoAgenda);

    void remove(MgwEstadoAgenda mgwEstadoAgenda);

    MgwEstadoAgenda find(Object id);

    List<MgwEstadoAgenda> findAll();

    List<MgwEstadoAgenda> findRange(int[] range);
    
    List<MgwEstadoAgenda> findList(String sql, Map<String,Object> valor);

    int count();
    
}
