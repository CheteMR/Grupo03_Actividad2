package modelo.javabean;

import java.util.Objects;

public class Oficina {
/*
*atributos privados
*/
	private int idOficina;
	private String nombre, dirección, telefono;
	
	/*
	 * Constructores
	 */
	public Oficina(int idOficina, String nombre, String dirección, String telefono) {
		super();
		this.idOficina = idOficina;
		this.nombre = nombre;
		this.dirección = dirección;
		this.telefono = telefono;
	}
	/*
	 * getter and setter
	 */
	
	public int getIdOficina() {
		return idOficina;
	}
	public void setIdOficina(int idOficina) {
		this.idOficina = idOficina;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDirección() {
		return dirección;
	}
	public void setDirección(String dirección) {
		this.dirección = dirección;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/*
	 * métodos reescritos de object
	 */
	@Override
	public String toString() {
		return "oficina [idOficina=" + idOficina + ", nombre=" + nombre + ", dirección=" + dirección + ", telefono="
				+ telefono + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(idOficina);
	}

	/*
	 * has code
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Oficina other = (Oficina) obj;
		return idOficina == other.idOficina;
	}
	
	/*
	 *
	 */
	
}
