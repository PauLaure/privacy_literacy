package com.prova.web.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class MetaInfo {

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String meta_info;

	public MetaInfo() {}
	
	public MetaInfo(String meta_info) {
		this.meta_info = meta_info;

	}

	public int getIdMeta_info(){
		return id;
	}
	
	public String getMeta_info() {
		return meta_info;
	}

	public void setMeta_info(String meta_info) {
		this.meta_info = meta_info;
	}

	@Override
	public String toString() {
		return "MetaInfo [meta_info=" + meta_info + "]";
	}
	
}
