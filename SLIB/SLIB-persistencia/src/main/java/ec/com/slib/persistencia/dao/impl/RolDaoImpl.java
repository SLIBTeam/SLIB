package ec.com.slib.persistencia.dao.impl;

import java.io.Serializable;

import javax.ejb.Stateless;

import ec.com.slib.persistencia.dao.RolDao;
import ec.com.slib.persistencia.entidad.Rol;



/**
 * @author luish.falcones
 *
 */
@Stateless
public class RolDaoImpl extends GenericDaoImpl<Rol, Long> implements RolDao, Serializable{

	private static final long serialVersionUID = 1361496867197420045L;

}
