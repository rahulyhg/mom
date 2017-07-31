package com.marriageonmind.model.marriage.occupation;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;


@Embeddable
public class City implements Serializable {
		
	private String name;

	@Embedded
	private Country country;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	
	
}
