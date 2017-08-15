package com.marriageonmind.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Address implements Serializable{

@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Long id;

public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}

@ManyToOne
private City city;

private String description;


private String houseNo;
private String streetName;
private String locality;

private String landmark;
private String pincode;



public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public City getCity() {
	return city;
}
public void setCity(City city) {
	this.city = city;
}

public String getHouseNo() {
	return houseNo;
}
public void setHouseNo(String houseNo) {
	this.houseNo = houseNo;
}
public String getStreetName() {
	return streetName;
}
public void setStreetName(String streetName) {
	this.streetName = streetName;
}
public String getLocality() {
	return locality;
}
public void setLocality(String locality) {
	this.locality = locality;
}

public String getLandmark() {
	return landmark;
}
public void setLandmark(String landmark) {
	this.landmark = landmark;
}
public String getPincode() {
	return pincode;
}
public void setPincode(String pincode) {
	this.pincode = pincode;
}


}
