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

/**
 *
 * @author rodriguezjavr
 */
@Stateless
public class MgwConstantesFacade extends AbstractFacade<MgwConstantes> implements MgwConstantesFacadeLocal {

    //@PersistenceContext(unitName = "GESTION")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("GESTION");
        em = emf.createEntityManager();
        return em;
    }

    public MgwConstantesFacade() {
        super(MgwConstantes.class);
    }
    
    /**
     * 
     * @param sql
     * @param valores
     * @return 
     */
    @Override
    public List<MgwConstantes> findWithfilters(String sql, Map<String,Object> valores){
        return super.findWithfilters(sql, valores);
    }
}
