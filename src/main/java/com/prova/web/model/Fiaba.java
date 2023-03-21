package com.prova.web.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Fiaba {

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int idFiaba;
	
	private String titolo;
	private String testo;
	
	private String img;
	private String metaInfo;
	
	
	public Fiaba() {}

	public Fiaba(String titolo, String testo, String img, String metaInfo) {
		super();
		this.titolo = titolo;
		this.testo = testo;
		this.img = img;
		this.metaInfo = metaInfo;
	}

	public int getIdFiaba() {
		return idFiaba;
	}
	
	public void setIdFiaba(int idFiaba) {
		this.idFiaba = idFiaba;
	}
	
	public String getTitolo() {
		return titolo;
	}
	
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	
	public String getTesto() {
		return testo;
	}
	
	public void setTesto(String testo) {
		this.testo = testo;
	}
	
	public String getImg() {
		return img;
	}
	
	public void setImg(String img) {
		this.img = img;
	}
	
	public String getMetaInfo() {
		return metaInfo;
	}
	
	public void setMetaInfo(String metaInfo) {
		this.metaInfo = metaInfo;
	}
	
	@Override
	public String toString() {
		return "Fiaba [idFiaba=" + idFiaba + ", titolo=" + titolo + ", testo=" + testo + ", img=" + img + ", metaInfo="
				+ metaInfo + "]";
	}
	
}
