package com.mobileappinternship.Internshipproject.model;

import java.util.Date;

public class Post {
	private Date DataPublicacao;
	private String titulo;
	private String categoria;
	private Colaborador autor;
	private String conteudo;
	

	public Date getDataPublicacao() {
		return DataPublicacao;
	}

	public void setDataPublicacao(Date dataPublicacao) {
		DataPublicacao = dataPublicacao;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Colaborador getAutor() {
		return autor;
	}

	public void setAutor(Colaborador autor) {
		this.autor = autor;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

}
