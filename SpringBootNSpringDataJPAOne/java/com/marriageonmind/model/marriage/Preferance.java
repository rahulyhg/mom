package com.marriageonmind.model.marriage;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.marriageonmind.model.City;

@Entity
public class Preferance implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private Set<Profession> profession;
	private ManglikStatus manglikStatus;
	private boolean working;
	private Set<Job> jobs;
	private Set<City>cities;
	private int startHeightInCm;
	private int endHeightInCm;
	private double startSalary;
	private double endSalary;
	private int startAge;
	private int endAge;
	private MaritalStatus maritalStatus;
	private FoodHabit foodHabit;
	private Complexion complexion;
	
	
}
