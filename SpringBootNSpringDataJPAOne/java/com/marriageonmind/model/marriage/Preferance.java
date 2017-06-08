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
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Set<Profession> getProfession() {
		return profession;
	}
	public void setProfession(Set<Profession> profession) {
		this.profession = profession;
	}
	public ManglikStatus getManglikStatus() {
		return manglikStatus;
	}
	public void setManglikStatus(ManglikStatus manglikStatus) {
		this.manglikStatus = manglikStatus;
	}
	public boolean isWorking() {
		return working;
	}
	public void setWorking(boolean working) {
		this.working = working;
	}
	public Set<Job> getJobs() {
		return jobs;
	}
	public void setJobs(Set<Job> jobs) {
		this.jobs = jobs;
	}
	public Set<City> getCities() {
		return cities;
	}
	public void setCities(Set<City> cities) {
		this.cities = cities;
	}
	public int getStartHeightInCm() {
		return startHeightInCm;
	}
	public void setStartHeightInCm(int startHeightInCm) {
		this.startHeightInCm = startHeightInCm;
	}
	public int getEndHeightInCm() {
		return endHeightInCm;
	}
	public void setEndHeightInCm(int endHeightInCm) {
		this.endHeightInCm = endHeightInCm;
	}
	public double getStartSalary() {
		return startSalary;
	}
	public void setStartSalary(double startSalary) {
		this.startSalary = startSalary;
	}
	public double getEndSalary() {
		return endSalary;
	}
	public void setEndSalary(double endSalary) {
		this.endSalary = endSalary;
	}
	public int getStartAge() {
		return startAge;
	}
	public void setStartAge(int startAge) {
		this.startAge = startAge;
	}
	public int getEndAge() {
		return endAge;
	}
	public void setEndAge(int endAge) {
		this.endAge = endAge;
	}
	public MaritalStatus getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(MaritalStatus maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public FoodHabit getFoodHabit() {
		return foodHabit;
	}
	public void setFoodHabit(FoodHabit foodHabit) {
		this.foodHabit = foodHabit;
	}
	public Complexion getComplexion() {
		return complexion;
	}
	public void setComplexion(Complexion complexion) {
		this.complexion = complexion;
	}
	
	
}
