package ec.com.slib.comun.exception;

import javax.ejb.ApplicationException;

/**
 * @author luish.falcones
 *
 */
@ApplicationException(rollback=true)
public class SlibPersistException extends SlibDaoException {

	
	private static final long serialVersionUID = -4839149301563818246L;
	public static final String MSG = "Error insertando registro en la tabla %s, entidad %s.";
	
	public SlibPersistException(Object entity) {
		super(SlibDaoException.format(MSG, entity));
	}

	public SlibPersistException(Object entity, Throwable ex) {
		super(SlibDaoException.format(MSG, entity),ex);
	}
	
}
