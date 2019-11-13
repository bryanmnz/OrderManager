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
public class MgwOrigenFacade extends AbstractFacade<MgwOrigen> implements MgwOrigenFacadeLocal {

   
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("GESTION");
        em = emf.createEntityManager();
        return em;
    }

    public MgwOrigenFacade() {
        super(MgwOrigen.class);
    }
    
    @Override
    public List<MgwOrigen> findWithfilters(String sql, Map<String,Object> valores){
        return super.findWithfilters(sql, valores);
    }

}
