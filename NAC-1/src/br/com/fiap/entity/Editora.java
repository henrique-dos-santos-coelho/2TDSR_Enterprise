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
}
