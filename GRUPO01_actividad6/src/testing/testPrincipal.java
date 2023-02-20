package testing;

import modelo.javabean.Administrativo;
import modelo.javabean.Alumno;
import modelo.javabean.Profesor;

public class Principal {

	public static void main(String[] args) {
		
		// Crea un objeto Profesor, un objeto Alumno y un objeto Administrativo.
		
		Profesor prof = new Profesor("11576592F", "Aurelio", "C/ Cabañas del sahara, 3", "665666326", "Historia del arte");
		
		Alumno alum = new Alumno("12354823J", "Pedro", "C/ camelia, 7", "654987321", "2º Bachillerato");
		
		Administrativo admin = new Administrativo("32398476W", "Pepa", "C/ del camello, 95", "699874152", "Hacer matrículas, controlar asistencia");
		
		// Ejecuta el método toString() sobre cada uno de ellos.
		
		System.out.println(prof.toString());
		System.out.println(prof.trabajar());
		
		System.out.println(alum.toString());
		
		System.out.println(admin.toString());
		
		
		// Ejecuta el método trabajar() sobre cada uno de ellos.
		
		
		System.out.println(alum.trabajar());
		System.out.println(admin.trabajar());
		
		 
		// Ejecuta el método llamar(Persona p) para que el alumno llame al profesor.
		
		
		// Ejecuta el método ponerNotas() del objeto Profesor.
		
		
		// Ejecuta el método hacerExamen() del objeto Alumno.
		
		
		// Ejecuta el método gestionarMatricula() del objeto Administrativo.
		
		
		
		
		
		
	}

}
