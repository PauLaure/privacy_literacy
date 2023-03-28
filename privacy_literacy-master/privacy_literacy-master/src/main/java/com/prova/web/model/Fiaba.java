package com.prova.web.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "fiaba")
public class Fiaba {

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int idFiaba;
	
	private String titolo_fiaba;
	private String testo_fiaba;
	
	private String image_path;
	private String meta_info;
	
	
	public Fiaba() {}

	public Fiaba(String titolo_fiaba, String testo_fiaba, String image_path, String meta_info) {
		super();
		this.titolo_fiaba = titolo_fiaba;
		this.testo_fiaba = testo_fiaba;
		this.image_path = image_path;
		this.meta_info = meta_info;
	}

	public int getIdFiaba() {
		return idFiaba;
	}
	
	public void setIdFiaba(int idFiaba) {
		this.idFiaba = idFiaba;
	}
	
	public String getTitolo() {
		return titolo_fiaba;
	}
	
	public void setTitolo(String titolo) {
		this.titolo_fiaba = titolo_fiaba;
	}
	
	public String getTesto() {
		return testo_fiaba;
	}
	
	public void setTesto(String testo) {
		this.testo_fiaba = testo_fiaba;
	}
	
	public String getImg() {
		return image_path;
	}
	
	public void setImg(String img) {
		this.image_path = image_path;
	}
	
	public String getMetaInfo() {
		return meta_info;
	}
	
	public void setMetaInfo(String metaInfo) {
		this.meta_info = meta_info;
	}

	@Override
	public String toString() {
		return "Fiaba [idFiaba=" + idFiaba + ", titolo_fiaba=" + titolo_fiaba + ", testo_fiaba=" + testo_fiaba
				+ ", image_path=" + image_path + ", meta_info=" + meta_info + "]";
	}
	
	
	
	
}
