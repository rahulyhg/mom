package com.marriageonmind.persistence.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class MarriedBrother extends Brother {
	
	private Long id;
	private String wifeName;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getWifeName() {
		return wifeName;
	}
	public void setWifeName(String wifeName) {
		this.wifeName = wifeName;
	}
	
}
