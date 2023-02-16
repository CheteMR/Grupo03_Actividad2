package modelo.javabean;

public class Profesor extends Persona {

	// En esta clase solo se añade un atributo 
	
	private String competencias;

	// Creamos el constructor vacío y seguidamente el constructor con todos los atributos
	
	public Profesor() {
		super();
	}
	
	public Profesor(String nif, String nombre, String direccion, String telefono, String competencias) {
		super(nif, nombre, direccion, telefono);
		this.competencias = competencias;
	}
	// Getter and setter
	
	public String getCompetencias() {
		return competencias;
	}

	public void setCompetencias(String competencias) {
		this.competencias = competencias;
	}
	
	/*
	 *  Se heredan los metodos de la clase padre "persona" mediante "extends Persona" en la clase
	 *  se heredan los metodos trabajar, llamar y to String
	 */
	
	
	@Override
	public String llamar(Persona p) {
		System.out.println(nombre + " llamando a " + nombre);
		return competencias;
		
	}


	@Override
	public String trabajar() {
		System.out.println("El profesor " + nombre + " va a impartir su clase " + getCompetencias());
		return competencias ;
	}

	@Override
	public String toString() {
		return "Profesor [nif=" + nif + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono
				+ "]" + ", competencias: " + competencias  ;
	}

	/*
	 * Creamos el metodo ponerNotas que es unico de la clase profesor
	 */
	
	public String ponerNotas() {
		return competencias;
	}

	
	
	

	

	
	
	
	
	

}
