package br.com.fiap.smartcities.domain;

import java.util.Calendar;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "tbl_cliente")

public class Cliente {
	
	 @Id
	 @SequenceGenerator(name="cliente",sequenceName="sq_tbl_cliente",allocationSize=1)
	 @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="cliente")
	 @Column(name = "id_cliente")
	 private Integer id;
	 
	 @Column(name = "nome_cliente", length = 50)
	 private String nome;
	 
	 @Column(name = "tipo_cliente", length = 50)
	 private String tipo;
	 
	 @CreationTimestamp
	 @Temporal(TemporalType.TIMESTAMP)
	 @Column(name = "dh_criacao")
	 private Calendar dataCriacao;
	 
	 
	public Cliente() {
		super();
	}

	public Cliente(Integer id, String nome, String tipo, Calendar dataCriacao) {
		super();
		this.id = id;
		this.nome = nome;
		this.tipo = tipo;
		this.dataCriacao = dataCriacao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Calendar getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Calendar dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
		 
}
