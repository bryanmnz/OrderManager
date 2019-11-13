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
public interface MgwCategoriaOrdFacadeLocal {

    void create(MgwCategoriaOrd mgwCategoriaOrd);

    void edit(MgwCategoriaOrd mgwCategoriaOrd);

    void remove(MgwCategoriaOrd mgwCategoriaOrd);

    MgwCategoriaOrd find(Object id);

    List<MgwCategoriaOrd> findAll();

    List<MgwCategoriaOrd> findRange(int[] range);

    int count();
    
}
