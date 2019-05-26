package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.EmprestimoDAO;
import br.com.fiap.entity.Emprestimo;
import br.com.fiap.entity.EmprestimoPK;
import br.com.fiap.exception.CodigoInvalidoException;
import br.com.fiap.exception.CommitException;

public class EmprestimoDAOImpl extends GenericDAOImpl<Emprestimo,EmprestimoPK> implements EmprestimoDAO{

	public EmprestimoDAOImpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

	
	

}
