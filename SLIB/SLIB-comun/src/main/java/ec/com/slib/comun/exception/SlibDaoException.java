package ec.com.slib.comun.exception;

import java.lang.annotation.Annotation;

import javax.ejb.ApplicationException;
import javax.persistence.Table;

/**
 * @author luish.falcones
 *
 */
@ApplicationException(rollback=true)
public class SlibDaoException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SlibDaoException() {
		super();
	}

	public SlibDaoException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		
	}

	public SlibDaoException(String arg0) {
		super(arg0);
		
	}

	public SlibDaoException(Throwable arg0) {
		super(arg0);
		
	}
	
	public static String format(String fmt, Object entity) {
		Annotation[] anotaciones = entity.getClass().getDeclaredAnnotations();
		String tableName = entity.getClass().getSimpleName().toUpperCase();
		for (Annotation an : anotaciones) {
			if (an.getClass().getName().equals(Table.class.getName())) {
				Table tb = (Table) an;
				tableName = tb.name();
			}
		}
		return String.format(fmt, tableName, entity.getClass()
				.getCanonicalName());
	}

}
