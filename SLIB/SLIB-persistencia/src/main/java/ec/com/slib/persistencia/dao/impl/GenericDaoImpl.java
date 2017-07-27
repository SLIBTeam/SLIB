package ec.com.slib.persistencia.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.com.slib.comun.exception.SlibDeleteExcepction;
import ec.com.slib.comun.exception.SlibPersistException;
import ec.com.slib.comun.exception.SlibUpdateException;
import ec.com.slib.comun.resource.Constantes;
import ec.com.slib.persistencia.dao.GenericDao;




/**
 * @author luish.falcones
 *
 */
public class GenericDaoImpl <T, ID extends Serializable> implements GenericDao<T, ID>{

	private final Class<T> persistentClass;
	
	@PersistenceContext(unitName = "SLIB-ejb")
	protected EntityManager em;

	@SuppressWarnings(Constantes.UNCHECKED)
	public GenericDaoImpl() {
		this.persistentClass = (Class<T>) ((ParameterizedType) getClass()
				.getGenericSuperclass()).getActualTypeArguments()[0];
	}

	public T findById(ID id) {
		return getEntityManager().find(persistentClass, id);
	}

	@SuppressWarnings(Constantes.UNCHECKED)
	public List<T> findAll() {
		return getEntityManager().createQuery(
				"select o from " + persistentClass.getCanonicalName() + " o")
				.getResultList();
	}

	@SuppressWarnings(Constantes.UNCHECKED)
	public List<T> findByNamedQuery(String queryName, Object... params) {

		Query qry = getEntityManager().createNamedQuery(queryName);

		int index = 0;

		for (Object p : params) {
			qry.setParameter(index++, p);
		}

		return qry.getResultList();
	}

	@SuppressWarnings(Constantes.UNCHECKED)
	public List<T> findByNamedQueryAndNamedParams(String queryName,
			Map<String, ? extends Object> params) {

		Query qry = getEntityManager().createNamedQuery(queryName);

		for (String key : params.keySet()) {
			qry.setParameter(key, params.get(key));
		}

		return qry.getResultList();

	}

	public T update(T entity) throws SlibUpdateException {
		try {
			return getEntityManager().merge(entity);
		} catch (Throwable ex) {
			throw new SlibUpdateException(entity, ex);
		}
	}

	public void delete(T entity) throws SlibDeleteExcepction {
		try {
			getEntityManager().remove(getEntityManager().merge(entity));
		} catch (Throwable ex) {
			throw new SlibDeleteExcepction(entity, ex);
		}
	}

	public void delete(ID id) throws SlibDeleteExcepction {
		T obj = findById(id);
		delete(obj);
	}

	public void persist(T entity) throws SlibPersistException {
		try {
			getEntityManager().persist(entity);
		} catch (Throwable ex) {
			throw new SlibPersistException(entity, ex);
		}
	}

	public EntityManager getEntityManager() {
		return this.em;
	}
}
