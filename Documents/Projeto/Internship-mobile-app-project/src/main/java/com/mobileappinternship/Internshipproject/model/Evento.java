package com.mobileappinternship.Internshipproject.model;

import java.util.Date;

public class Evento extends Post {
	private Date dataEvento;
	private String tema;
	private Colaborador area;
	private PlanoDesenvolvimentoIndividual publicoAlvo;
	private String descricaoDoEvento;

	public Date getDataEvento() {
		return dataEvento;
	}

	public void setDataEvento(Date dataEvento) {
		this.dataEvento = dataEvento;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public Colaborador getArea() {
		return area;
	}

	public void setArea(Colaborador area) {
		this.area = area;
	}

	public PlanoDesenvolvimentoIndividual getPublicoAlvo() {
		return publicoAlvo;
	}

	public void setPublicoAlvo(PlanoDesenvolvimentoIndividual publicoAlvo) {
		this.publicoAlvo = publicoAlvo;
	}

	public String getDescricaoDoEvento() {
		return descricaoDoEvento;
	}

	public void setDescricaoDoEvento(String descricaoDoEvento) {
		this.descricaoDoEvento = descricaoDoEvento;
	}

}
