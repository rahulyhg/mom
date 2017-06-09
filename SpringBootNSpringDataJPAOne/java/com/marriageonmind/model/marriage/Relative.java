package com.marriageonmind.model.marriage;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.marriageonmind.model.Email;
import com.marriageonmind.model.MobileNo;

@Entity
public class Relative implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
private String firstName;
private String middleName;
private String lastName;

@Enumerated(EnumType.STRING)
private Profession occupation;
@Enumerated(EnumType.STRING)
private Gender gender;

@OneToMany
private Collection<MobileNo> mobileNo;

@OneToOne
private Email email;


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


public Profession getOccupation() {
	return occupation;
}
public void setOccupation(Profession occupation) {
	this.occupation = occupation;
}
public Gender getGender() {
	return gender;
}
public void setGender(Gender gender) {
	this.gender = gender;
}



}
