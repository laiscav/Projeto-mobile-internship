package com.mobileappinternship.Internshipproject.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mobileappinternship.Internshipproject.model.Estagiario;

@RestController
public class Teste {
	
	@RequestMapping("/")
	public String TesteTeste() {
		return "teste";
		
	}
	
	@RequestMapping("/estagiario")
	public List<Estagiario> getEstagiario() {
		
		Estagiario iaguin = new Estagiario();
		iaguin.setNome("IAGUIN");
		iaguin.setArea("Preguiça");
		iaguin.setInicioContratoEstagio(new Date(2020, 6, 10));
		iaguin.setGestor("Caio");
		iaguin.setRacf("iagofor");
		iaguin.setFuncional("987317542");
		iaguin.setFimContratoEstagio(new Date(2020, 12, 10));
		
		List<Estagiario> estags = new ArrayList<>();
		estags.add(iaguin);
		estags.add(iaguin);
		estags.add(iaguin);
		
		return estags;
	}

}
