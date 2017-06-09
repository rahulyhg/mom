package com.marriageonmind.model.marriage;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToOne;

import com.marriageonmind.model.City;

/*
 * This class is intentionally made entity as we do not want to persist it
 * 
 */
		
public class Preferance {
	
	private Long id;
	

	private Profession profession;
	
	
	private ManglikStatus manglikStatus;
	private boolean working;
	

	private Job job;

	private City city;
	
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
