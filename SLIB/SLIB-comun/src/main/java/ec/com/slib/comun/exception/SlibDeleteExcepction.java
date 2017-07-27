package ec.com.slib.comun.exception;

import javax.ejb.ApplicationException;

/**
 * @author luish.falcones
 *
 */
@ApplicationException(rollback=true)
public class SlibDeleteExcepction extends SlibDaoException{

	
	private static final long serialVersionUID = 6404665409539422920L;
	
	public static final String MSG = "Error eliminando registro en la tabla %s, entidad: %s";

	public SlibDeleteExcepction(Object entity){
		super(SlibDaoException.format(MSG, entity));
	}
	
	public SlibDeleteExcepction(Object entity,Throwable ex){
		super(SlibDaoException.format(MSG, entity),ex);
	}
	
	
}
