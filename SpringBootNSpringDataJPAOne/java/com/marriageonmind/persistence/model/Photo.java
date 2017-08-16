package com.marriageonmind.persistence.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/*
 * there should 
 */
@Entity
public class Photo implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;

private String photoURL;
private boolean colorPhoto;
private boolean verified;
private int photoSize;
private int photoWidth;
private int photoHeight;

@ManyToOne
private MarriageSeeker marriageSeeker;


public MarriageSeeker getMarriageSeeker() {
	return marriageSeeker;
}
public void setMarriageSeeker(MarriageSeeker marriageSeeker) {
	this.marriageSeeker = marriageSeeker;
}
public boolean isGoodQuality() {
	return goodQuality;
}
public void setGoodQuality(boolean goodQuality) {
	this.goodQuality = goodQuality;
}
private boolean goodQuality;

public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getPhotoURL() {
	return photoURL;
}
public void setPhotoURL(String photoURL) {
	this.photoURL = photoURL;
}
public boolean isColorPhoto() {
	return colorPhoto;
}
public void setColorPhoto(boolean colorPhoto) {
	this.colorPhoto = colorPhoto;
}
public boolean isVerified() {
	return verified;
}
public void setVerified(boolean verified) {
	this.verified = verified;
}
public int getPhotoSize() {
	return photoSize;
}
public void setPhotoSize(int photoSize) {
	this.photoSize = photoSize;
}
public int getPhotoWidth() {
	return photoWidth;
}
public void setPhotoWidth(int photoWidth) {
	this.photoWidth = photoWidth;
}
public int getPhotoHeight() {
	return photoHeight;
}
public void setPhotoHeight(int photoHeight) {
	this.photoHeight = photoHeight;
}




}
