package ec.com.slib.persistencia.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import ec.com.slib.comun.exception.SlibDeleteExcepction;
import ec.com.slib.comun.exception.SlibPersistException;
import ec.com.slib.comun.exception.SlibUpdateException;




/**
 * @author luish.falcones
 *
 */
public interface GenericDao <T, ID extends Serializable>{
	
	 public T findById(ID id);

	    public List<T> findAll();

	    public List<T> findByNamedQuery(String queryName, Object... params);

	    public List<T> findByNamedQueryAndNamedParams(String queryName, Map<String, ? extends Object> params);

	    public T update(T entity) throws SlibUpdateException;

	    public void delete(T entity) throws SlibDeleteExcepction;

	    public void delete(ID id) throws SlibDeleteExcepction;

	    public void persist(T entity) throws SlibPersistException;

}
