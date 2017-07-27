package ec.com.slib.controlador;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

import ec.com.slib.api.ServicioRol;
import ec.com.slib.persistencia.entidad.Rol;


@ManagedBean
@ViewScoped
public class TestController implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4632781953215840379L;
	
	@EJB
	ServicioRol servicioRol;
	
	private String texto;
	
	@PostConstruct
	public void init(){
		List<Rol> listRol = new ArrayList<>(); 
	    listRol = servicioRol.buscarTodosRoles();
	    if(listRol.isEmpty()){
	    	texto = "hola CDTM";
	    }else{
	    	texto = "si tiene";
	    }
		
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

}
