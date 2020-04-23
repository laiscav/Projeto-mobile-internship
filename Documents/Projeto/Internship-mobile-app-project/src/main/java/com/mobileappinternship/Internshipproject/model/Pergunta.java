package com.mobileappinternship.Internshipproject.model;

import java.util.ArrayList;
import java.util.List;

public class Pergunta extends Post{
	private List<Resposta> respostas = new ArrayList<Resposta>();

	public List<Resposta> getRespostas() {
		return respostas;
	}

	public void setRespostas(List<Resposta> respostas) {
		this.respostas = respostas;
	}
	

}
