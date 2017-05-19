package modelos;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.SelectItem;

@ManagedBean(name="usuario")
@SessionScoped

public class Usuario {

	
	private String nombre;
	private String password;
	private String dni;
	
	
	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getNombre(){
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
	public String decideQueHacer(){
		if(nombre.equals("juan")){
		return "conocido.xhtml";
		}
		else {
			return "noconocido.xhtml";
			
		}
		
	}


	
}
