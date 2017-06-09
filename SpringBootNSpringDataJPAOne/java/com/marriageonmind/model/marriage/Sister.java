package com.marriageonmind.model.marriage;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Sister implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private String name;

@OneToOne
private Profession occupation;

private String professionDescription;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
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
