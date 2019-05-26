package br.com.fiap.dao.impl;

import java.lang.reflect.ParameterizedType;

import javax.persistence.EntityManager;

import br.com.fiap.dao.GenericDAO;
import br.com.fiap.exception.CodigoInvalidoException;
import br.com.fiap.exception.CommitException;

public class GenericDAOImpl<T,K> implements GenericDAO<T,K>{
	
	protected EntityManager em;
	private Class<T> clazz;
	
	@SuppressWarnings("all")
	public GenericDAOImpl(EntityManager em) {
		this.em= em;
		this.clazz=(Class<T>)((ParameterizedType)
				getClass().getGenericSuperclass())
				.getActualTypeArguments()[0];
	}

	@Override
	public void cadastrar(T entidade) {
		// TODO Auto-generated method stub
		em.persist(entidade);
		
	}

	@Override
	public void alterar(T entidade) {
		em.merge(entidade);
		
	}

	@Override
	public T buscar(K codigo) throws CodigoInvalidoException {
		
		return em.find(clazz, codigo);
	}

	@Override
	public void remover(K codigo) throws CodigoInvalidoException {
		em.remove(buscar(codigo));
	}

	@Override
	public void commit() throws CommitException {
		try {
			em.getTransaction().begin();
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
			throw new CommitException();
			// TODO: handle exception
		}
		
	}

}
