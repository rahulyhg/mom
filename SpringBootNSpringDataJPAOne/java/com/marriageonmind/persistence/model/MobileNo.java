package com.marriageonmind.persistence.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MobileNo implements Serializable{
@Id	
private String mobileNo;// must be exact 10 digit regex must be used
private boolean verified;
private boolean whatsAppNo;
private boolean fbNo;

public String getMobileNo() {
	return mobileNo;
}
public void setMobileNo(String mobileNo) {
	this.mobileNo = mobileNo;
}
public boolean isVerified() {
	return verified;
}
public void setVerified(boolean verified) {
	this.verified = verified;
}
public boolean isWhatsAppNo() {
	return whatsAppNo;
}
public void setWhatsAppNo(boolean whatsAppNo) {
	this.whatsAppNo = whatsAppNo;
}
public boolean isFbNo() {
	return fbNo;
}
public void setFbNo(boolean fbNo) {
	this.fbNo = fbNo;
}



}
