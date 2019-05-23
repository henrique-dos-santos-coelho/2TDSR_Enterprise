package br.com.fiap.test;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.Test;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.entity.Cliente;
import br.com.fiap.exception.CodigoInvalidoException;
import br.com.fiap.singleton.EntityManagerFactorySingleton;
import br.com.fipa.dao.impl.ClienteDAOImpl;

class Teste {

	@Test
	void test() {
		EntityManager em = EntityManagerFactorySingleton
				.getInstance().createEntityManager();
		Cliente cliente = new Cliente();
		cliente.setNome("Henrique");
		ClienteDAO clienteDao = new ClienteDAOImpl(em);
		clienteDao.cadastrar(cliente);
		
	
		
	}

}
