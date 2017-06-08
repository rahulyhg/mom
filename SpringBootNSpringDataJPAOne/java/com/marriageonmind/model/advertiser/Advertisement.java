package com.marriageonmind.model.advertiser;

import java.io.Serializable;
import java.net.URL;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.marriageonmind.model.Address;
import com.marriageonmind.model.Email;
import com.marriageonmind.model.MobileNo;
import com.marriageonmind.model.PaymentStatus;
import com.marriageonmind.model.PrintSpace;

@Entity
public class Advertisement implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private Long id;
private Address address;
private Set<MobileNo> mobileNo;
private Email emailID;
private PrintSpace printSpace;
private PaymentStatus paymentStatus;

private URL photoURL;
private URL website;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public Set<MobileNo> getMobileNo() {
	return mobileNo;
}
public void setMobileNo(Set<MobileNo> mobileNo) {
	this.mobileNo = mobileNo;
}
public Email getEmailID() {
	return emailID;
}
public void setEmailID(Email emailID) {
	this.emailID = emailID;
}
public PrintSpace getPrintSpace() {
	return printSpace;
}
public void setPrintSpace(PrintSpace printSpace) {
	this.printSpace = printSpace;
}
public PaymentStatus getPaymentStatus() {
	return paymentStatus;
}
public void setPaymentStatus(PaymentStatus paymentStatus) {
	this.paymentStatus = paymentStatus;
}
public URL getPhotoURL() {
	return photoURL;
}
public void setPhotoURL(URL photoURL) {
	this.photoURL = photoURL;
}
public URL getWebsite() {
	return website;
}
public void setWebsite(URL website) {
	this.website = website;
}


}
