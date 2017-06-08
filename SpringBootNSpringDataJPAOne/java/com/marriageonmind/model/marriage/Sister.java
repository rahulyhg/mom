package com.marriageonmind.model.marriage;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sister implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private String name;
private boolean married;
private String husbandName;
private Profession husbandOccupation;
private boolean housewife;
private Profession occupation;
private String professionDescription;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public boolean isMarried() {
	return married;
}
public void setMarried(boolean married) {
	this.married = married;
}
public String getHusbandName() {
	return husbandName;
}
public void setHusbandName(String husbandName) {
	this.husbandName = husbandName;
}
public Profession getHusbandOccupation() {
	return husbandOccupation;
}
public void setHusbandOccupation(Profession husbandOccupation) {
	this.husbandOccupation = husbandOccupation;
}
public boolean isHousewife() {
	return housewife;
}
public void setHousewife(boolean housewife) {
	this.housewife = housewife;
}
public Profession getOccupation() {
	return occupation;
}
public void setOccupation(Profession occupation) {
	this.occupation = occupation;
}
public String getProfessionDescription() {
	return professionDescription;
}
public void setProfessionDescription(String professionDescription) {
	this.professionDescription = professionDescription;
}

}
