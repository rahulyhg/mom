package com.marriageonmind.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Embeddable
public class Address implements Serializable{
@Embedded	
private City city;
@Embedded
private Country country;
private String houseNo;
private String streetName;
private String locality;
private String near;
private String landmark;
private String pincode;

public City getCity() {
	return city;
}
public void setCity(City city) {
	this.city = city;
}
public Country getCountry() {
	return country;
}
public void setCountry(Country country) {
	this.country = country;
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
public String getNear() {
	return near;
}
public void setNear(String near) {
	this.near = near;
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
