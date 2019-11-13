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
public interface MgwValidacionAgendaFacadeLocal {

    void create(MgwValidacionAgenda mgwValidacionAgenda);

    void edit(MgwValidacionAgenda mgwValidacionAgenda);

    void remove(MgwValidacionAgenda mgwValidacionAgenda);

    MgwValidacionAgenda find(Object id);

    List<MgwValidacionAgenda> findAll();

    List<MgwValidacionAgenda> findRange(int[] range);

    int count();
    
}
