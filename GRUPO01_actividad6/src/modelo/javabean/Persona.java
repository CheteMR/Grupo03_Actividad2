package modelo.javabean;

public abstract class Persona {

	// Atributos de la clase persona, se ponen protected para que puedan ser utilizados y vistos por otra clase
	protected String nif;
	protected String nombre;
	protected String direccion;
	protected String telefono;
	
	// Se crea el constructor vacio y despues el constructor con todos los atributos
	public Persona() {
		super();
	}

	public Persona(String nif, String nombre, String direccion, String telefono) {
		super();
		this.nif = nif;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	// Se crean los Getter and setter de los atributos
	
	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	// creamos el metodo toString
	
	@Override
	public String toString() {
		return "Persona [nif=" + nif + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono
				+ "]";
	}
	
	// Aqui creamos los metodos que se nos pide: llamar() y trabajar()
	/*
	 * 
	 */
	public String llamar(Persona p) {
		
		return nombre;
	}
	
		/*
		 * el metodo trabajar () se especializa en cada subclase para devolver una cadena
		 * que indica el tipo de tarea que realiza cada perfil.
		 */
	
	public abstract String trabajar();

	
	}
	
	
	
	
	
	
	

