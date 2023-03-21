package com.prova.web.model;

import jakarta.persistence.Entity;

@Entity
public class MetaInfo {

	private String meta_info;

	public MetaInfo() {}
	
	public MetaInfo(String meta_info) {
		this.meta_info = meta_info;
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
