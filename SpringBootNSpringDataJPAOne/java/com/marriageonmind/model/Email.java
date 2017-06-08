package com.marriageonmind.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Email implements Serializable{
	@Id
private String emailID;
private boolean primary;
private boolean verified;
private boolean thisFBID;

public boolean isVerified() {
	return verified;
}
public void setVerified(boolean verified) {
	this.verified = verified;
}
public boolean isThisFBID() {
	return thisFBID;
}
public void setThisFBID(boolean thisFBID) {
	this.thisFBID = thisFBID;
}


}
