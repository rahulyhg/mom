package com.marriageonmind.model.marriage;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Brother implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
private String name;

@ManyToOne
private MarriagePerson  marriagePerson;

@OneToOne
private Profession profession;

private String professionDescription;

@OneToOne
private Qualification qualification;

public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}



public Profession getProfession() {
	return profession;
}
public void setProfession(Profession profession) {
	this.profession = profession;
}
public String getProfessionDescription() {
	return professionDescription;
}
public void setProfessionDescription(String professionDescription) {
	this.professionDescription = professionDescription;
}
public Qualification getQualification() {
	return qualification;
}
public void setQualification(Qualification qualification) {
	this.qualification = qualification;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}


}
