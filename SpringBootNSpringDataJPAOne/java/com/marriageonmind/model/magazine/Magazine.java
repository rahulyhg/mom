package com.marriageonmind.model.magazine;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Magazine implements Serializable
{
	@Id
	private Long id;
	
	@Temporal(TemporalType.DATE)
	private Date publishingYear;
	
	@OneToMany(mappedBy="magazine")
	private Collection<Page> pages;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Collection<Page> getPages() {
		return pages;
	}

	public void setPages(Collection<Page> pages) {
		this.pages = pages;
	}
	
}
