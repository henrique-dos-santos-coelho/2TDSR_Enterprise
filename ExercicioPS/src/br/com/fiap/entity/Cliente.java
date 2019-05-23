package br.com.fiap.entity;

import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="T_EXERCICIO_CLIENTE")
@SequenceGenerator(name="cliente",sequenceName="SEQ_T_EXERCICIO_CLIENTE",allocationSize=1)
public class Cliente {
	@Id
	@GeneratedValue(generator="cliente",strategy=GenerationType.SEQUENCE)
	@Column(name="cd_cliente")
	private int codigo;
	
	@Column(name="nm_cliente",nullable=false,length=200)
	private String nome;
	
	@Temporal(TemporalType.DATE)
	@Column(name="dt_nascimento")
	private Calendar nascimento;
	
	@Enumerated(EnumType.STRING)
	@Column(name="ds_sexo")
	private Sexo sexo;
	
	@OneToMany(mappedBy="cliente",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private List<Locacao> locacoes;

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

	public Calendar getNascimento() {
		return nascimento;
	}

	public void setNascimento(Calendar nascimento) {
		this.nascimento = nascimento;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public List<Locacao> getLocacoes() {
		return locacoes;
	}

	public void setLocacoes(List<Locacao> locacoes) {
		this.locacoes = locacoes;
	}

	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cliente(int codigo, String nome, Calendar nascimento, Sexo sexo, List<Locacao> locacoes) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.nascimento = nascimento;
		this.sexo = sexo;
		this.locacoes = locacoes;
	}
	
	
}
