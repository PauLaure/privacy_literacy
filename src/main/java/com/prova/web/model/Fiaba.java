package com.prova.web.model;

import jakarta.persistence.Entity;

@Entity
public class Fiaba {

	private int idFiaba;
	private String titolo;
	private String testo;
	private String img;
	private String metaInfo;
	
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
