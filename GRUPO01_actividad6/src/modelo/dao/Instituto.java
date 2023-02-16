package modelo.dao;

import java.util.List;

import modelo.javabean.Persona;

public class Instituto implements InstitutoDao  {

	
	
	@Override
	public boolean altaPersona(Persona persona) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Persona buscarPersona(String nif) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eliminarPersona(Persona persona) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Persona> buscarTodas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Persona> buscarPersonasPorTipo(String tipoPersona) {
		// TODO Auto-generated method stub
		return null;
	}

}
