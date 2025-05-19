package com.bservio.tarefator.entity;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="TAREFA")
@SuppressWarnings("serial") 
public class Tarefa extends AbstractEntity<Long> {
	
	@Column(name="nome", nullable=false, unique=true, length=60)
	private String nome;
	
	@Column( nullable=false, name="data_entrega", columnDefinition="DATE") 
	@DateTimeFormat(iso=DateTimeFormat.ISO.DATE)
	private LocalDate dataEntrega;
	
	@Column(name="responsavel", nullable=false, length=60) 
	private String responsavel;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDataEntrega() {
		return dataEntrega;
	}
	public void setDataEntrega(LocalDate dataEntrega) {
		this.dataEntrega = dataEntrega;
	}
	public String getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
	
}
