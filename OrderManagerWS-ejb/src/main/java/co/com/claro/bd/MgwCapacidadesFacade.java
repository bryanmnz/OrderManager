/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.claro.bd;

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
public class MgwCapacidadesFacade extends AbstractFacade<MgwCapacidades> implements MgwCapacidadesFacadeLocal {

    //@PersistenceContext(unitName = "GESTION")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("GESTION");
        em = emf.createEntityManager();
        return em;
    }

    public MgwCapacidadesFacade() {
        super(MgwCapacidades.class);
    }
    
}
