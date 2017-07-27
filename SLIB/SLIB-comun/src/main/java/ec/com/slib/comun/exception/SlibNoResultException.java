package ec.com.slib.comun.exception;

import javax.ejb.ApplicationException;

/**
 * @author luish.falcones
 *
 */
@ApplicationException(rollback=true)
public class SlibNoResultException extends Exception{

	private static final long serialVersionUID = 1274367385437357046L;

	public SlibNoResultException() {
		super();
	}

	public SlibNoResultException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public SlibNoResultException(String message, Throwable cause) {
		super(message, cause);
	}

	public SlibNoResultException(String message) {
		super(message);
	}

	public SlibNoResultException(Throwable cause) {
		super(cause);
	}
	
	

}
