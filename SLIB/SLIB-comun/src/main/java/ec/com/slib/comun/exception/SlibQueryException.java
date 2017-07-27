/**
 * 
 */
package ec.com.slib.comun.exception;

import javax.ejb.ApplicationException;

/**
 * @author luish.falcones
 *
 */
@ApplicationException(rollback=true)
public class SlibQueryException extends SlibDaoException{

	private static final long serialVersionUID = 8980845946346785316L;
	
	public static final String MSG = "Error al realizar la consulta";

	public SlibQueryException() {
		super(MSG);
	}
	
	public SlibQueryException(Throwable ex) {
		super(MSG,ex);
		
	}
	
	

}
