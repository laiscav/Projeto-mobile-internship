package com.mobileappinternship.Internshipproject.model;

public class Resposta {
	private Colaborador autor;
	private Post DataPublicacao;
	private Post conteudo;

	public Colaborador getAutor() {
		return autor;
	}

	public void setAutor(Colaborador autor) {
		this.autor = autor;
	}

	public Post getDataPublicacao() {
		return DataPublicacao;
	}

	public void setDataPublicacao(Post dataPublicacao) {
		DataPublicacao = dataPublicacao;
	}

	public Post getConteudo() {
		return conteudo;
	}

	public void setConteudo(Post conteudo) {
		this.conteudo = conteudo;
	}

}
