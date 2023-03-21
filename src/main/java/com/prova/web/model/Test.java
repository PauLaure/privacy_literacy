package com.prova.web.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
/*
 * Entity che descrive un test
 */
@Entity
public class Test {

	@Id
	private int idTest;
	private String tipo;
	
	
	
	public Test() {	}

	public Test(int idTest, String tipo) {
		super();
		this.idTest = idTest;
		this.tipo = tipo;
	}


	public int getIdTest() {
		return idTest;
	}


	public void setIdTest(int idTest) {
		this.idTest = idTest;
	}
	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Test [idTest=" + idTest + ", tipologia test=" + tipo + ","+ "]";
	}


	
	
	
	

}
