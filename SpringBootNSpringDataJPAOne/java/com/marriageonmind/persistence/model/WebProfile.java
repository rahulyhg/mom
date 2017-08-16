package com.marriageonmind.persistence.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class WebProfile implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private Long profileID;

@Enumerated(EnumType.STRING)	
private WebProfileStatus profileStatus;

private boolean complete;

@Temporal(TemporalType.DATE)
private Date profileCreationDate;

@OneToOne
private MarriageSeeker marriageSeeker;


public MarriageSeeker getMarriageSeeker() {
	return marriageSeeker;
}
public void setMarriageSeeker(MarriageSeeker marriageSeeker) {
	this.marriageSeeker = marriageSeeker;
}
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
public WebProfileStatus getProfileStatus() {
	return profileStatus;
}
public void setProfileStatus(WebProfileStatus profileStatus) {
	this.profileStatus = profileStatus;
}

public boolean isComplete() {
	return complete;
}
public void setComplete(boolean complete) {
	this.complete = complete;
}

 
}
