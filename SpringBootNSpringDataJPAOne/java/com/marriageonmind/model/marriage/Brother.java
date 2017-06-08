package com.marriageonmind.model.marriage;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Brother implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
private String fullName;
private boolean married;
private String wifeName;
private Profession profession;
private String professionDescription;
private Qualification qualification;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getFullName() {
	return fullName;
}
public void setFullName(String fullName) {
	this.fullName = fullName;
}
public boolean isMarried() {
	return married;
}
public void setMarried(boolean married) {
	this.married = married;
}
public String getWifeName() {
	return wifeName;
}
public void setWifeName(String wifeName) {
	this.wifeName = wifeName;
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


}
