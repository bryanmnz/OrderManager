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
public interface MgwAgendaEstadosFacadeLocal {

    void create(MgwAgendaEstados mgwAgendaEstados);

    void edit(MgwAgendaEstados mgwAgendaEstados);

    void remove(MgwAgendaEstados mgwAgendaEstados);

    MgwAgendaEstados find(Object id);

    List<MgwAgendaEstados> findAll();

    List<MgwAgendaEstados> findRange(int[] range);
    
    List<MgwAgendaEstados> findWithfilters(String sql, Map<String, Object> valores);

    int count();
    
}
