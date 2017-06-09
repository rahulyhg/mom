package com.marriageonmind.model.marriage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.marriageonmind.model.MobileNo;

@Entity
public class Father implements Serializable{
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;	
	
private String firstName;
private String middleName;
private String lastName;
private boolean alive;

@OneToMany(mappedBy="father")
private Collection<MarriagePerson> MarriagePersons;

@Enumerated(EnumType.STRING)
private Profession profession;

@OneToOne
private Job job;

private Set<MobileNo> mobileNos;

public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}

public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getMiddleName() {
	return middleName;
}
public void setMiddleName(String middleName) {
	this.middleName = middleName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}

public Set<MobileNo> getMobileNos() {
	return mobileNos;
}
public void setMobileNos(Set<MobileNo> mobileNos) {
	this.mobileNos = mobileNos;
}
public boolean isAlive() {
	return alive;
}
public void setAlive(boolean alive) {
	this.alive = alive;
}
public Profession getProfession() {
	return profession;
}
public void setProfession(Profession profession) {
	this.profession = profession;
}
public Job getJob() {
	return job;
}
public void setJob(Job job) {
	this.job = job;
}

}
