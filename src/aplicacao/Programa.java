package aplicacao;

import entidades.Cliente;

public class Programa {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Fulano", "fulano@email.com");
		Cliente c2 = new Cliente("Ciclano", "ciclano@email.com");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		
		System.out.println(c1.equals(c2));
	}

}
