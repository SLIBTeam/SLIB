package ec.com.slib.comun.exception;

import javax.ejb.ApplicationException;

/**
 * @author luish.falcones
 *
 */
@ApplicationException(rollback=true)
public class SlibNonUniqueResultException extends Exception{


	private static final long serialVersionUID = -7812155872968902873L;

	public SlibNonUniqueResultException() {
		super();
		
	}

	public SlibNonUniqueResultException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	public SlibNonUniqueResultException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public SlibNonUniqueResultException(String message) {
		super(message);
		
	}

	public SlibNonUniqueResultException(Throwable cause) {
		super(cause);
		
	}

}
