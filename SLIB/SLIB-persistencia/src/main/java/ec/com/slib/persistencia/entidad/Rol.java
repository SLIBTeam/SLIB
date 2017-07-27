package ec.com.slib.persistencia.entidad;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author luish.falcones
 *
 */
@Entity
@Table(name="slib_rol")
public class Rol implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5041772693358740557L;
	
	@Id
	@SequenceGenerator(name="SEQ_ROL_COD_GENERATOR",sequenceName="rol_cod_seq",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="SEQ_ROL_COD_GENERATOR")
	@Column(name="codigo")
	private Long codigo;
	
	@Column(name="descripcion_txt")
	private String descripcionStr;
	
	@Column(name="estado_int")
	private Integer estadoInt;
	
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getDescripcionStr() {
		return descripcionStr;
	}
	public void setDescripcionStr(String descripcionStr) {
		this.descripcionStr = descripcionStr;
	}
	public Integer getEstadoInt() {
		return estadoInt;
	}
	public void setEstadoInt(Integer estadoInt) {
		this.estadoInt = estadoInt;
	}

}
