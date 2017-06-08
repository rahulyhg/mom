package com.marriageonmind.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Embeddable;

@Embeddable
public class Country implements Serializable{
	
private Set<City> cities;

public Set<City> getCities() {
	return cities;
}
public void setCities(Set<City> cities) {
	this.cities = cities;
}

}
