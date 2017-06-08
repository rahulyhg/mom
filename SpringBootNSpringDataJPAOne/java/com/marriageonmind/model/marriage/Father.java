package com.marriageonmind.model.marriage;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.marriageonmind.model.MobileNo;

@Embeddable
public class Father implements Serializable{
	
private String fatherName;
private boolean fatheralive;
private Profession profession;
private Job job;
private MobileNo mobileNo;

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
public Job getJob() {
	return job;
}
public void setJob(Job job) {
	this.job = job;
}
public MobileNo getMobileNo() {
	return mobileNo;
}
public void setMobileNo(MobileNo mobileNo) {
	this.mobileNo = mobileNo;
}


}
