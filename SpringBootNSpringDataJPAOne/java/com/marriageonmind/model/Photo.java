package com.marriageonmind.model;

import java.io.Serializable;
import java.net.URL;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.marriageonmind.model.marriage.Job;

@Entity
public class Photo implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
	
private URL photoURL;
private boolean colorPhoto;
private boolean verified;
private int photoSize;
private int photoWidth;
private int photoHeight;
private PhotoQuality photoQuality;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public URL getPhotoURL() {
	return photoURL;
}
public void setPhotoURL(URL photoURL) {
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
public PhotoQuality getPhotoQuality() {
	return photoQuality;
}
public void setPhotoQuality(PhotoQuality photoQuality) {
	this.photoQuality = photoQuality;
}




}
