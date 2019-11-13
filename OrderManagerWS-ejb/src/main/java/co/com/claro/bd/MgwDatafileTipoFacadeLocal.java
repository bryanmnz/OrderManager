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
public interface MgwDatafileTipoFacadeLocal {

    void create(MgwDatafileTipo mgwDatafileTipo);

    void edit(MgwDatafileTipo mgwDatafileTipo);

    void remove(MgwDatafileTipo mgwDatafileTipo);

    MgwDatafileTipo find(Object id);

    List<MgwDatafileTipo> findAll();

    List<MgwDatafileTipo> findRange(int[] range);

    int count();
    
}
