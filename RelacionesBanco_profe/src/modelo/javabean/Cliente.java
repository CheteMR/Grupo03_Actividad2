package modelo.javabean;

import java.util.Objects;

public class Cliente {

	private String idCliente, nombre, apellidos, direccion, email;
	private Oficina oficina;
	
	/*
	 * constructores
	 */
	public Cliente() {
		super();
	}

	/*
	 * constructores usando campos
	 */
	
	public Cliente(String idCliente, String nombre, String apellidos, String direccion, String email, Oficina oficina) {
		super();
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.email = email;
		this.oficina = oficina;
	}

	/*
	 * getter and setter
	 */
	public String getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Oficina getOficina() {
		return oficina;
	}

	public void setOficina(Oficina oficina) {
		this.oficina = oficina;
	}

	/*
	 * tostring
	 */
	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nombre=" + nombre + ", apellidos=" + apellidos + ", direccion="
				+ direccion + ", email=" + email + ", oficina=" + oficina + "]";
	}

	/*
	 *  hashcode
	 */
	
	@Override
	public int hashCode() {
		return Objects.hash(apellidos, direccion, email, idCliente, nombre, oficina);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(apellidos, other.apellidos) && Objects.equals(direccion, other.direccion)
				&& Objects.equals(email, other.email) && Objects.equals(idCliente, other.idCliente)
				&& Objects.equals(nombre, other.nombre) && Objects.equals(oficina, other.oficina);
	}
	
	
	
	
	
	
}
