package com.marriageonmind.persistence.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Guardian implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
private String firstName;
private String middleName;
private String lastName;

private String relationName;

@OneToMany
private Collection<MobileNo> mobileNo;

@OneToOne
private Email email;

@OneToOne
private MarriageSeeker marriageSeeker;


public MarriageSeeker getMarriageSeeker() {
	return marriageSeeker;
}
public void setMarriageSeeker(MarriageSeeker marriageSeeker) {
	this.marriageSeeker = marriageSeeker;
}
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
public String getRelationName() {
	return relationName;
}
public void setRelationName(String relationName) {
	this.relationName = relationName;
}
public Collection<MobileNo> getMobileNo() {
	return mobileNo;
}
public void setMobileNo(Collection<MobileNo> mobileNo) {
	this.mobileNo = mobileNo;
}
public Email getEmail() {
	return email;
}
public void setEmail(Email email) {
	this.email = email;
}

}
