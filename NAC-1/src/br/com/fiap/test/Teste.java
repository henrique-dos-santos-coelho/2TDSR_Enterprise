package br.com.fiap.test;

import static org.junit.jupiter.api.Assertions.fail;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import br.com.fiap.dao.LivroDAO;
import br.com.fiap.dao.impl.LivroDAOImpl;
import br.com.fiap.entity.Livro;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

class Teste {
	private static LivroDAO livroDao;
	
	@BeforeAll
	public static void inicializar() {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		livroDao = new LivroDAOImpl(em);
	}
	@Test
	void teste() {
		Livro livro = new Livro();
		livro.setNome("");
		livroDao.cadastrar(livro);
	}
	@Test
	void test() {
		fail("Not yet implemented");
	}

}
