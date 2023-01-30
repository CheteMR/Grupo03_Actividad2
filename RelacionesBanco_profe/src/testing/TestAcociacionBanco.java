package testing;

import modelo.javabean.Cliente;
import modelo.javabean.Cuenta;
import modelo.javabean.Oficina;

public class TestAcociacionBanco {

	public static void main(String[] args) {
		
		Oficina of1 = new Oficina(9282, "Madrid2", "calle pez 3, Madrid", "914166999");
		Cliente cliente1 = new Cliente ("677677677", "Sara", "Vega Lopez", "Sevilla", "S@ii.es", of1);
		Cuenta cuenta1 = new Cuenta(1, "ahorro", 3000, cliente1);
		Cuenta cuenta2 = new Cuenta(2, "corriente", 5000, 
				new Cliente("8889998965B", "Andres", "Molinero", "madrid", "am@i.es", of1));
		System.out.println("DATOS A SACAR");
		
		/*
		 * de cuenta2: numero de cuenta y saldo de la cuenta
		 * de cliente de la cuenta: apellido
		 * de la oficina del cliente de la cuenta: telefono
		 * 
		 */
		System.out.println
			("numero y saldo : " + cuenta2.getIdCuenta() + " - " + cuenta2.getSaldo());
		System.out.println
			("Apellido cliente cuenta : " + cuenta2.getCliente().getApellidos());
		System.out.println("telefono de la oficina del cliente de la cuenta2 : " 
				+ cuenta2.getCliente().getOficina().getTelefono());

	}
	

}
