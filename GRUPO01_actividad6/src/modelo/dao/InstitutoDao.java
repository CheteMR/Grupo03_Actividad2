package modelo.dao;

import java.util.List;

import modelo.javabean.Persona;

public interface InstitutoDao {

	boolean altaPersona (Persona persona);
	Persona buscarPersona (String nif);
	boolean eliminarPersona (Persona persona);
	List<Persona> buscarTodas();	
	List<Persona> buscarPersonasPorTipo (String tipoPersona);
	
	
}
