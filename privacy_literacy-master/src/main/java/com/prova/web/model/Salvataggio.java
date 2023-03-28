package com.prova.web.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Salvataggio {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int idSalvataggio;
	private int idTest;
	private String email;
	private String risposta;
	
	public Salvataggio() {}
	public Salvataggio(int idTest, String email, String risposta) {
		super();
		this.idTest = idTest;
		this.email = email;
		this.risposta = risposta;
	}

	public int getIdSalvataggio() {
		return idSalvataggio;
	}
	
	public void setIdSalvataggio(int idSalvataggio) {
		this.idSalvataggio = idSalvataggio;
	}
	
	public int getIdTest() {
		return idTest;
	}
	
	public void setIdTest(int idTest) {
		this.idTest = idTest;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getRisposta() {
		return risposta;
	}
	
	public void setRisposta(String risposta) {
		this.risposta = risposta;
	}
	
	@Override
	public String toString() {
		return "Salvataggio [idSalvataggio=" + idSalvataggio + ", idTest=" + idTest + ", email=" + email + ", risposta="
				+ risposta + "]";
	}
	
}
