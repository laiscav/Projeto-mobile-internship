package com.mobileappinternship.Internshipproject.model;

public class PlanoDesenvolvimentoIndividual {
	private String publicoAlvo;
	private Colaborador nome;
	private Colaborador autor = nome;

	public String getPublicoAlvo() {
		return publicoAlvo;
	}

	public void setPublicoAlvo(String publicoAlvo) {
		this.publicoAlvo = publicoAlvo;
	}

	public Colaborador getAutor() {
		return autor;
	}

	public void setAutor(Colaborador autor) {
		this.autor = autor;
	}

}
