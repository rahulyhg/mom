package com.marriageonmind.model.magazine;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Page implements Serializable{
	@Id
	private Long id;
	
	private int pageNumber;
	
	private String header;
	private String footer;
	

}
