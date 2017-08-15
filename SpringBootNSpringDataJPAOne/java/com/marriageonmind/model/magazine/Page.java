package com.marriageonmind.model.magazine;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Page implements Serializable{
	@Id
	private Long id;
	
	private int pageNumber;
	
	private String header;
	private String footer;
	
	@ManyToOne
	private Magazine magazine;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getFooter() {
		return footer;
	}

	public void setFooter(String footer) {
		this.footer = footer;
	}

	public Magazine getMagazine() {
		return magazine;
	}

	public void setMagazine(Magazine magazine) {
		this.magazine = magazine;
	}
	

}
