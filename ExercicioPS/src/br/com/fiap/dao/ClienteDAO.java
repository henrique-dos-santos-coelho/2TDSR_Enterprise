package br.com.fiap.dao;

import java.util.List;

import br.com.fiap.entity.Cliente;
import br.com.fiap.exception.CodigoInvalidoException;

public interface ClienteDAO extends GenericDAO<Cliente,Integer>{
	

	public List<Cliente> buscarPorNome (String nome) throws CodigoInvalidoException;

}
