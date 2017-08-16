package com.marriageonmind.persistence.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Email implements Serializable{
	@Id
private String emailID;
private boolean primaryEmail;
public boolean isPrimaryEmail() {
	return primaryEmail;
}
public void setPrimaryEmail(boolean primaryEmail) {
	this.primaryEmail = primaryEmail;
}
private boolean verified;
private boolean fBID;

public boolean isVerified() {
	return verified;
}
public void setVerified(boolean verified) {
	this.verified = verified;
}
public String getEmailID() {
	return emailID;
}
public void setEmailID(String emailID) {
	this.emailID = emailID;
}

public boolean isfBID() {
	return fBID;
}
public void setfBID(boolean fBID) {
	this.fBID = fBID;
}


}
