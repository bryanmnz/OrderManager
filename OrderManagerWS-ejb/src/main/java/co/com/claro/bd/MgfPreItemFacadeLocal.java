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
public interface MgfPreItemFacadeLocal {

    void create(MgfPreItem mgfPreItem);

    void edit(MgfPreItem mgfPreItem);

    void remove(MgfPreItem mgfPreItem);

    MgfPreItem find(Object id);

    List<MgfPreItem> findAll();

    List<MgfPreItem> findRange(int[] range);

    int count();
    
}
