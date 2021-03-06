package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {
	public static void main(String[] args) {
		
		// Pessoa p1 = new Pessoa(null, "Matheus Carvalho", "matheus@gmail.com");
		// Pessoa p2 = new Pessoa(null, "Maria Clara Carvalho", "mariacarvalho@gmail.com");
		// Pessoa p3 = new Pessoa(null, "Isabella Carvalho", "isa@gmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		/*
		 
		  Cria a tabela pessoas e a popula também
		 
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();
		*/
		
		/*
		
		Busca um usuário pelo Id
		
		Pessoa p = em.find(Pessoa.class, 2);
		System.out.println(p);
		*/
		
		// Exclui uma pessoa da tabela de dados
		
		Pessoa p = em.find(Pessoa.class, 3);
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		
		System.out.println("Pronto!");
		em.close();
		emf.close();
		
	}

}
