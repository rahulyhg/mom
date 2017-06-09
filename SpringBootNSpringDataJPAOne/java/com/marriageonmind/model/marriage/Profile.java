package com.marriageonmind.model.marriage;

import java.io.Serializable;
import java.util.Date;

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

private boolean complete;
private Date profileCreationDate;

public Date getProfileCreationDate() {
	return profileCreationDate;
}
public void setProfileCreationDate(Date profileCreationDate) {
	this.profileCreationDate = profileCreationDate;
}
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

public boolean isComplete() {
	return complete;
}
public void setComplete(boolean complete) {
	this.complete = complete;
}




 
}
