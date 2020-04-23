package com.mobileappinternship.Internshipproject.model;

public class Dicas {
	private String conteudo;
	Colaborador colaborador = new Colaborador();
	private Colaborador nome;
	private Colaborador autor = nome;
	private String tema;

	public Dicas() {
		
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public Colaborador getNome() {
		return nome;
	}

	public void setNome(Colaborador nome) {
		this.nome = nome;
	}

	public Colaborador getAutor() {
		return autor;
	}

	public void setAutor(Colaborador autor) {
		this.autor = autor;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

}
