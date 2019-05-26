package br.com.fiap.test;

import static org.junit.jupiter.api.Assertions.fail;

import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import br.com.fiap.dao.LivroDAO;
import br.com.fiap.dao.impl.LivroDAOImpl;
import br.com.fiap.entity.Editora;
import br.com.fiap.entity.Genero;
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
		Editora editora = new Editora();
		editora.setNome("Editora");
		Livro livro = new Livro();
		livro.setIsbn("asdasd");
		livro.setNome("teste");
		livro.setDataLancamento(Calendar.getInstance());
		livro.setGenero(Genero.AVENTURA);
		livro.setEditora(editora);
		livroDao.cadastrar(livro);
		
		
		List<Livro> listLivro = livroDao.buscarPorNomeEditora("teste");
		for(Livro c: listLivro) {
			System.out.println(c.getNome());
		}
	}
	@Test
	void test() {
		fail("Not yet implemented");
	}

}
