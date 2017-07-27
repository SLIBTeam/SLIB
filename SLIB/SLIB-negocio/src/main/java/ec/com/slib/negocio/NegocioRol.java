package ec.com.slib.negocio;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.com.slib.api.ServicioRol;
import ec.com.slib.persistencia.dao.RolDao;
import ec.com.slib.persistencia.entidad.Rol;



/**
 * @author luish.falcones
 *
 */
@Stateless
public class NegocioRol implements ServicioRol{
	
	@Inject
	private RolDao rolDao;

	public List<Rol> buscarTodosRoles() {		
		return rolDao.findAll();
	}
	
	

}
