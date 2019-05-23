package br.com.fiap.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_EXERCICIO_APARTAMENTO")
@SequenceGenerator(name="apartamento", sequenceName="SEQ_T_EXERCICIO_APARTAMENTO",allocationSize=1)
public class Apartamento {
	
	@Id
	@GeneratedValue(generator="apartamento",strategy=GenerationType.SEQUENCE)
	@Column(name="cd_apartamento")
	private int codigo;
	
	@Column(name="ds_endereco",nullable=false,length=300)
	private String endereco;
	
	@Column(name="ds_detalhes",nullable=false,length=600)
	private String detalhes;
	
	@Lob
	@Column(name="bl_foto")
	private byte[] foto;
	
	@OneToMany(mappedBy="apartamento",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private List<Locacao> locacoes;
	
}
