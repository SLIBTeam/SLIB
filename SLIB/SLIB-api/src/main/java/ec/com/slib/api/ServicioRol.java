package ec.com.slib.api;

import java.util.List;

import javax.ejb.LocalBean;

import ec.com.slib.persistencia.entidad.Rol;


/**
 * @author luish.falcones
 *
 */
@LocalBean
public interface ServicioRol {
	
	public List<Rol> buscarTodosRoles();

}
