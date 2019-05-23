package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="T_EXERCICIO_LOCACAO")
@SequenceGenerator(name="locacao",sequenceName="SEQ_T_EXERCICIO_LOCACAO",allocationSize=1)
public class Locacao {
	
	@Id
	@GeneratedValue(generator="locacao",strategy=GenerationType.SEQUENCE)
	@Column(name="cd_locacao")
	private int codigo;
	
	@Temporal(TemporalType.DATE)
	@Column(name="dt_inicio")
	private Calendar dtIncio;
		
	@Temporal(TemporalType.DATE)
	@Column(name="dt_fim")
	private Calendar dtFim;
	
	@ManyToOne
	@JoinColumn(name="cd_cliente")
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name="cd_apartamento")
	private Apartamento apartamento;

}
