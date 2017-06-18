package com.marriageonmind.model.marriage;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Inheritance
@DiscriminatorColumn(name="PROFILE_TYPE")
public class Profile implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private Long profileID;

@Enumerated(EnumType.STRING)	
private ProfileStatus profileStatus;

private boolean complete;

@Temporal(TemporalType.DATE)
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
