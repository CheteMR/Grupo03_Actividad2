package modelo.javabean;

public class Administrativo extends Persona {

	private String tareas;
	
	public String gestionarMatricula() {
		return tareas;
	}

	public Administrativo() {
		super();
	}
	

	public Administrativo(String nif, String nombre, String direccion, String telefono, String tareas) {
		super(nif, nombre, direccion, telefono);
		this.tareas = tareas;
	}
	
	
/*
 * REVISAR TODO ESTO, NO ESTA BIEN
 * 
 * 
 * 
 *                               R E V I S A R 
 *                                     |
 *                                     V
 */
	// Getter and setter 
	
	public String getTareas() {
		return tareas;
	}

	public void setTareas(String tareas) {
		this.tareas = tareas;
	}

	// Implementamos los metodos heredados de la clase Persona
	
	@Override
	public String llamar(Persona p) {
		System.out.println();
		return getNombre();
	}

	@Override
	public String trabajar() {
		System.out.println("El administrativo " + getNombre() + " va a realizar estas tareas: " + getTareas());
		return getNombre();
	}

	// Implementamos el metodo toString 
	@Override
	public String toString() {
		return "Administrativo [nif=" + nif + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono="
				+ telefono + "]" + ", tareas: " + tareas ;
	}
	
	
	
}
