package aplicacao;

import dominio.pessoa;

public class Programa {

	public static void main(String[] args) {
		
		
		pessoa p1  = new pessoa(1, "Carlos da Silva", "carlos@gmail.com");
		pessoa p2  = new pessoa(2, "Joaquim Torres", "joaquim@gmail.com");
		pessoa p3  = new pessoa(3, "Ana Maria2", "ana@gmail.com");
		
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		

	}

}
