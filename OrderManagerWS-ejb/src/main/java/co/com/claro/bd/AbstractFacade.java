package co.com.claro.bd;

import co.com.claro.wsorder.util.Constantes;
import java.util.List;
import java.util.Map;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author rodriguezjavr
 * @param <T>
 */
public abstract class AbstractFacade<T> {

    private Class<T> entityClass;
    
    // Instancianci�n del logger 
    private static Logger logger = LogManager.getLogger(
            Constantes.LOGGER_PRINCIPAL.getValue());

    public AbstractFacade(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    protected abstract EntityManager getEntityManager();

    public void create(T entity) {
        try {
            getEntityManager().persist(entity);
            getEntityManager().flush();
        } catch (ConstraintViolationException e) {
            // Aqui tira los errores de constraint
            for (ConstraintViolation actual : e.getConstraintViolations()) {
                logger.error(actual);
            }
        }
    }

    public void edit(T entity) {
        getEntityManager().merge(entity);
        getEntityManager().flush();
    }

    public void remove(T entity) {
        getEntityManager().remove(getEntityManager().merge(entity));
        getEntityManager().flush();
    }

    @TransactionAttribute(TransactionAttributeType.NEVER)
    public T find(Object id) {
        return getEntityManager().find(entityClass, id);
    }

    @TransactionAttribute(TransactionAttributeType.NEVER)
    public List<T> findAll() {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        return getEntityManager().createQuery(cq).getResultList();
    }

    public List<T> findRange(int[] range) {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        javax.persistence.Query q = getEntityManager().createQuery(cq);
        q.setMaxResults(range[1] - range[0] + 1);
        q.setFirstResult(range[0]);
        return q.getResultList();
    }

    @TransactionAttribute(TransactionAttributeType.NEVER)
    public List<T> findWithfilters(String sql, Map<String, Object> valores) {
        javax.persistence.Query q = getEntityManager().createQuery(sql);
        if (valores != null && !valores.isEmpty()) {
            for (Map.Entry<String, Object> valorAux : valores.entrySet()) {
                String key = valorAux.getKey();
                Object value = valorAux.getValue();
                q.setParameter(key, value);
            }
        }
        return q.getResultList();
    }

    @TransactionAttribute(TransactionAttributeType.NEVER)
    public int count() {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        javax.persistence.criteria.Root<T> rt = cq.from(entityClass);
        cq.select(getEntityManager().getCriteriaBuilder().count(rt));
        javax.persistence.Query q = getEntityManager().createQuery(cq);
        return ((Long) q.getSingleResult()).intValue();
    }

    @TransactionAttribute(TransactionAttributeType.NEVER)
    public List<T> findNativeQWithFilters(String sql, Map<String, Object> valores) {
        javax.persistence.Query q = getEntityManager().createNativeQuery(sql);
        if (valores != null && !valores.isEmpty()) {
            for (Map.Entry<String, Object> valorAux : valores.entrySet()) {
                String key = valorAux.getKey();
                Object value = valorAux.getValue();
                q.setParameter(key, value);
            }
        }
        return q.getResultList();
    }

}
