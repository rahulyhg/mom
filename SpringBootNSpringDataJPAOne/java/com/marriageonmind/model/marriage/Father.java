package com.marriageonmind.model.marriage;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.marriageonmind.model.MobileNo;

@Entity
public class Father implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
private String fullName;
private boolean alive;
private Profession profession;
private Job job;
private MobileNo mobileNo;
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
public MobileNo getMobileNo() {
	return mobileNo;
}
public void setMobileNo(MobileNo mobileNo) {
	this.mobileNo = mobileNo;
}


}
