package com.mobileappinternship.Internshipproject.model;

import java.util.Date;

public class Estagiario extends Colaborador {
	private Date inicioContratoEstagio;
	private String gestor;
	private Date fimContratoEstagio;
	
	

	public Date getInicioContratoEstagio() {
		return inicioContratoEstagio;
	}

	public Estagiario setInicioContratoEstagio(Date inicioContratoEstagio) {
		this.inicioContratoEstagio = inicioContratoEstagio;
		return this;
	}

	public Estagiario() {
		setCargo("estagiário 6h");
	}

	public String getGestor() {
		return gestor;
	}

	public Estagiario setGestor(String gestor) {
		this.gestor = gestor;
		return this;
	}

	public Date getFimContratoEstagio() {
		return fimContratoEstagio;
	}

	public Estagiario setFimContratoEstagio(Date fimContratoEstagio) {
		this.fimContratoEstagio = fimContratoEstagio;
		return this;
	}

	
}
