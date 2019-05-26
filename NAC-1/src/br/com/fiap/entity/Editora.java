package br.com.fiap.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_NAC_UM_EDITORA")
@SequenceGenerator(name="editora",sequenceName="SEQ_NAC_UM_EDITORA",allocationSize=1)
public class Editora {
	@Id
	@GeneratedValue(generator="editora",strategy=GenerationType.SEQUENCE)
	@Column(name="cd_editora")
	private int codigo;
	
	@Column(name="nm_editora")
	private String nome;

	@OneToMany(mappedBy="editora")
	private List<Livro> livros;

	public Editora() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Editora(int codigo, String nome, List<Livro> livros) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.livros = livros;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}
	
	
}
