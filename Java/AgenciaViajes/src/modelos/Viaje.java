package modelos;

public class Viaje {
	
	private int id;
	private String nombre_destino;
	private int duracion_viaje;
	private double precio_persona;
	
	
	public Viaje(){
		
	}
	
	public Viaje(int id, String nombre_destino,int duracion_viaje, double precio_persona){
		this.id=id;
		this.nombre_destino=nombre_destino;
		this.duracion_viaje=duracion_viaje;
		this.precio_persona=precio_persona;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre_destino() {
		return nombre_destino;
	}

	public void setNombre_destino(String nombre_destino) {
		this.nombre_destino = nombre_destino;
	}

	public int getDuracion_viaje() {
		return duracion_viaje;
	}

	public void setDuracion_viaje(int duracion_viaje) {
		this.duracion_viaje = duracion_viaje;
	}

	public double getPrecio_persona() {
		return precio_persona;
	}

	public void setPrecio_persona(double precio_persona) {
		this.precio_persona = precio_persona;
	}
	
	@Override
	public boolean equals(Object a){
		if(a==null){
			return false;
		}
		if (!(a instanceof Viaje)){
			return false;
		}
		else{
			Viaje viaje=(Viaje)a;
			return viaje.id==id;
		}
	}
	
}
