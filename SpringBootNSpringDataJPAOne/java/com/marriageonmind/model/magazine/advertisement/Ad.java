package com.marriageonmind.model.magazine.advertisement;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.marriageonmind.model.Address;
import com.marriageonmind.model.magazine.PaymentStatus;
import com.marriageonmind.model.magazine.PrintSpace;

@Entity
public class Ad implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private Long id;

private String adMatter;
@ElementCollection	
private Set<String>businessFirmName;

private String locality;
private String city;
private String pincode;

private String mobileNo1;
private String mobileNo2;

private String emailID;



@Enumerated(EnumType.STRING)
private PaymentStatus paymentStatus;

@ElementCollection
private Set<String> ImageURL;

@ElementCollection
private Set<String> OwnerPhotoURL;


private String website;


	
	public String getAdMatter() {
	return adMatter;
}
public void setAdMatter(String adMatter) {
	this.adMatter = adMatter;
}
public Set<String> getBusinessFirmName() {
	return businessFirmName;
}
public void setBusinessFirmName(Set<String> businessFirmName) {
	this.businessFirmName = businessFirmName;
}
public String getLocality() {
	return locality;
}
public void setLocality(String locality) {
	this.locality = locality;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getPincode() {
	return pincode;
}
public void setPincode(String pincode) {
	this.pincode = pincode;
}
public String getMobileNo1() {
	return mobileNo1;
}
public void setMobileNo1(String mobileNo1) {
	this.mobileNo1 = mobileNo1;
}
public String getMobileNo2() {
	return mobileNo2;
}
public void setMobileNo2(String mobileNo2) {
	this.mobileNo2 = mobileNo2;
}
public String getEmailID() {
	return emailID;
}
public void setEmailID(String emailID) {
	this.emailID = emailID;
}
public Set<String> getImageURL() {
	return ImageURL;
}
public void setImageURL(Set<String> imageURL) {
	ImageURL = imageURL;
}
public Set<String> getOwnerPhotoURL() {
	return OwnerPhotoURL;
}
public void setOwnerPhotoURL(Set<String> ownerPhotoURL) {
	OwnerPhotoURL = ownerPhotoURL;
}
public String getWebsite() {
	return website;
}
public void setWebsite(String website) {
	this.website = website;
}


public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}



public PaymentStatus getPaymentStatus() {
	return paymentStatus;
}
public void setPaymentStatus(PaymentStatus paymentStatus) {
	this.paymentStatus = paymentStatus;
}



}
