package br.com.fipa.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.entity.Cliente;
import br.com.fiap.exception.CodigoInvalidoException;

public class ClienteDAOImpl extends GenericDAOImpl<Cliente,Integer> implements ClienteDAO{
	private EntityManager em;
	public ClienteDAOImpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Cliente> buscarPorNome(String nome) {
		return em.createQuery("from Cliente").getResultList();
	}

}
