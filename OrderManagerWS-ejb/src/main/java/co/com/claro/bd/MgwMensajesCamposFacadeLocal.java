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
public interface MgwMensajesCamposFacadeLocal {

    void create(MgwMensajesCampos mgwMensajesCampos);

    void edit(MgwMensajesCampos mgwMensajesCampos);

    void remove(MgwMensajesCampos mgwMensajesCampos);

    MgwMensajesCampos find(Object id);

    List<MgwMensajesCampos> findAll();

    List<MgwMensajesCampos> findRange(int[] range);

    int count();
    
}
