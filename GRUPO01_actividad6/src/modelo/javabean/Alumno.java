package modelo.javabean;

public class Alumno extends Persona{

	// Se crea el atributo privado de la clase Alumno.
	
	private String curso;

	/*
	 * Se crea el constructor vacio y seguidamente el constructor con todos los atributos 
	 * heredados de la clase Persona.
	 */

	public Alumno() {
		super();
	}
	
	public Alumno(String nif, String nombre, String direccion, String telefono, String curso) {
		super(nif, nombre, direccion, telefono);
		this.curso = curso;
	}

	/*
	 * Se invocan los metodos heredados de la clase Persona
	 */
	
	@Override
	public String llamar(Persona p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String trabajar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "Alumno [nif=" + nif + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono
				+ "]" + ", curso: " + curso;
	}
	
	// Aqui se muestran los métodos propios de la clase Alumno.
	
	public String hacerExamen() {
		return curso;
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
