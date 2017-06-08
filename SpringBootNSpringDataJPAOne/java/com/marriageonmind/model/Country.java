package com.marriageonmind.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Country implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private Long id;
private Set<City> cities;
}
