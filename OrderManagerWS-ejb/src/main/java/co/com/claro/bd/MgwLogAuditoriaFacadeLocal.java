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
public interface MgwLogAuditoriaFacadeLocal {

    void create(MgwLogAuditoria mgwLogAuditoria);

    void edit(MgwLogAuditoria mgwLogAuditoria);

    void remove(MgwLogAuditoria mgwLogAuditoria);

    MgwLogAuditoria find(Object id);

    List<MgwLogAuditoria> findAll();

    List<MgwLogAuditoria> findRange(int[] range);

    int count();
    
}
