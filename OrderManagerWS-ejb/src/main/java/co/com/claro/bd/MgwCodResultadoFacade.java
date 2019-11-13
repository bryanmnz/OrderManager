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

/**
 *
 * @author rodriguezjavr
 */
@Stateless
public class MgwCodResultadoFacade extends AbstractFacade<MgwCodResultado> implements MgwCodResultadoFacadeLocal {

    
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("GESTION");
        em = emf.createEntityManager();
        return em;
    }

    public MgwCodResultadoFacade() {
        super(MgwCodResultado.class);
    }
    
}
