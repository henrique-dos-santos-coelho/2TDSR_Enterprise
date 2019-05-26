package br.com.fiap.entity;

import java.io.Serializable;
import java.util.Calendar;

public class EmprestimoPK implements Serializable {
	private Calendar data;
	
	private String livro;
	
	private int usuario;

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public String getLivro() {
		return livro;
	}

	public void setLivro(String livro) {
		this.livro = livro;
	}

	public int getUsuario() {
		return usuario;
	}

	public void setUsuario(int usuario) {
		this.usuario = usuario;
	}

	public EmprestimoPK() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmprestimoPK(Calendar data, String livro, int usuario) {
		super();
		this.data = data;
		this.livro = livro;
		this.usuario = usuario;
	}
	
	
}
