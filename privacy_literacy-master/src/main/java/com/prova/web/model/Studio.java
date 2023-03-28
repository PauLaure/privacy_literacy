package com.prova.web.model;

import org.springframework.boot.actuate.endpoint.web.Link;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*
 * Entity che descrive un argomento di studio
 */
@Entity
public class Studio {

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int idStudio;
	
	private String titolo;
	private String descrizione;
	private Link link_video;
	private String meta_info;
	
	public Studio() {}

	public int getIdStudio() {
		return idStudio;
	}

	public void setIdStudio(int idStudio) {
		this.idStudio = idStudio;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public Link getLink_video() {
		return link_video;
	}

	public void setLink_video(Link link_video) {
		this.link_video = link_video;
	}

	public String getMeta_info() {
		return meta_info;
	}

	public void setMeta_info(String meta_info) {
		this.meta_info = meta_info;
	}

	@Override
	public String toString() {
		return "Studio [idStudio=" + idStudio + ", titolo=" + titolo + ", descrizione=" + descrizione + ", link_video="
				+ link_video + ", meta_info=" + meta_info + "]";
	}

}

