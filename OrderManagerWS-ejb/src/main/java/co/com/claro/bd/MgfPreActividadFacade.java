/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.claro.bd;

import java.util.List;
import java.util.Map;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

/**
 *
 * @author rodriguezjavr
 */
@Stateless
public class MgfPreActividadFacade extends AbstractFacade<MgfPreActividad> implements MgfPreActividadFacadeLocal {

    //@PersistenceContext(unitName = "GESTION")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("GESTION");
        em = emf.createEntityManager();
        return em;
    }

    public MgfPreActividadFacade() {
        super(MgfPreActividad.class);
    }
    
    @Override
    public List<MgfPreActividad> findList(String sql, Map<String,Object> valor) {
        
        return super.findWithfilters(sql, valor);
    }

    @Override
    public List<MgfPreActividad> findNativeQWithFilters(String sql, Map<String, Object> valor) {
        return super.findNativeQWithFilters(sql, valor);
    }
    
}
