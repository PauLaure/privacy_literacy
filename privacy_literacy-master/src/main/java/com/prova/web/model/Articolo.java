package com.prova.web.model;

import org.springframework.boot.actuate.endpoint.web.Link;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Articolo {

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int idArticolo;
	private Link link;
	private String titolo;
	private String metaInfo;
	
	public Articolo() {}

	public Articolo(Link link, String titolo, String metaInfo) {
		this.link = link;
		this.titolo = titolo;
		this.metaInfo = metaInfo;
	}

	public int getIdArticolo() {
		return idArticolo;
	}
	
	public void setIdArticolo(int idArticolo) {
		this.idArticolo = idArticolo;
	}
	
	public Link getLink() {
		return link;
	}
	
	public void setLink(Link link) {
		this.link = link;
	}
	
	public String getTitolo() {
		return titolo;
	}
	
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	
	public String getMetaInfo() {
		return metaInfo;
	}
	
	public void setMetaInfo(String metaInfo) {
		this.metaInfo = metaInfo;
	}
	
	@Override
	public String toString() {
		return "Articolo [idArticolo=" + idArticolo + ", link=" + link + ", titolo=" + titolo + ", metaInfo=" + metaInfo
				+ "]";
	}
	
	
}
