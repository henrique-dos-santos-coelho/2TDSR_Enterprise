package br.com.fiap.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.LivroDAO;
import br.com.fiap.entity.Livro;

public class LivroDAOImpl extends GenericDAOImpl<Livro,String> implements LivroDAO{

	public LivroDAOImpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Livro> buscarPorNomeEditora(String editora) {
		// TODO Auto-generated method stub
		return em.createQuery("from Livro l where l.editora.nome like :n",Livro.class).setParameter("n", "%"+editora+"%").getResultList();
	}

}
