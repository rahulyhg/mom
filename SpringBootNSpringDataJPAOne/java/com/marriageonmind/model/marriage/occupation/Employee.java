package com.marriageonmind.model.marriage.occupation;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Employee extends Job {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String designation;
	private double salaryPerAnnum;
	
	@Enumerated(EnumType.STRING)
	private EmployeeType employeeType;
	
	@ManyToOne
	private Organisation organisation;
	
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalaryPerAnnum() {
		return salaryPerAnnum;
	}
	public void setSalaryPerAnnum(double salaryPerAnnum) {
		this.salaryPerAnnum = salaryPerAnnum;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
}
