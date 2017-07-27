package ec.com.slib.comun.exception;

import javax.ejb.ApplicationException;

/**
 * @author luish.falcones
 *
 */
@ApplicationException(rollback=true)
public class SlibUpdateException extends SlibDaoException{

	private static final long serialVersionUID = -4862716145242442344L;
	
	public static final String MSG = "Error actualizando registro en la tabla %s.";

	public SlibUpdateException(Object entity) {
		super(SlibDaoException.format(MSG, entity));		
	}

	public SlibUpdateException(Object entity, Throwable ex) {
		super(SlibDaoException.format(MSG, entity),ex);
	}
	
	

}
