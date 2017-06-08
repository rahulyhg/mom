package com.marriageonmind.model.marriage;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.marriageonmind.model.PaymentStatus;
import com.marriageonmind.model.PrintSpace;

@Entity
public class Profile implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private Long profileID;
private ProfileStatus profileStatus;
private PrintSpace printSpace;
private PaymentStatus paymentStatus;
private boolean tobePublishedInMagazine;
private boolean complete;
public Long getProfileID() {
	return profileID;
}
public void setProfileID(Long profileID) {
	this.profileID = profileID;
}
public ProfileStatus getProfileStatus() {
	return profileStatus;
}
public void setProfileStatus(ProfileStatus profileStatus) {
	this.profileStatus = profileStatus;
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
public boolean isTobePublishedInMagazine() {
	return tobePublishedInMagazine;
}
public void setTobePublishedInMagazine(boolean tobePublishedInMagazine) {
	this.tobePublishedInMagazine = tobePublishedInMagazine;
}
public boolean isComplete() {
	return complete;
}
public void setComplete(boolean complete) {
	this.complete = complete;
}




 
}
