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
public interface MgcDatosMovilFacadeLocal {

    void create(MgcDatosMovil mgcDatosMovil);

    void edit(MgcDatosMovil mgcDatosMovil);

    void remove(MgcDatosMovil mgcDatosMovil);

    MgcDatosMovil find(Object id);

    List<MgcDatosMovil> findAll();

    List<MgcDatosMovil> findRange(int[] range);
    
    List<MgcDatosMovil> findWithfilters(String sql, Map<String,Object> valores);

    int count();
    
}
