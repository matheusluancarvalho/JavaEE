package aplicacao;

import dominio.Pessoa;

public class Programa {
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(1, "Matheus Carvalho", "matheus@gmail.com");
		Pessoa p2 = new Pessoa(2, "Maria Clara Carvalho", "mariacarvalho@gmail.com");
		Pessoa p3 = new Pessoa(3, "Isabella Carvalho", "isa@gmail.com");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
	}

}
