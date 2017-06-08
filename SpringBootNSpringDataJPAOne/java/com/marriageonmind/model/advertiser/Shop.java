package com.marriageonmind.model.advertiser;

import java.io.Serializable;
import java.net.URL;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.marriageonmind.model.Photo;

@Entity
public class Shop implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private Photo shopPhoto;
	private URL websiteURL;
	private String businessName;
	private Set<String> proprietors;
	private Set<Photo> ownerPhoto;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Photo getShopPhoto() {
		return shopPhoto;
	}
	public void setShopPhoto(Photo shopPhoto) {
		this.shopPhoto = shopPhoto;
	}
	public URL getWebsiteURL() {
		return websiteURL;
	}
	public void setWebsiteURL(URL websiteURL) {
		this.websiteURL = websiteURL;
	}
	public String getBusinessName() {
		return businessName;
	}
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	public Set<String> getProprietors() {
		return proprietors;
	}
	public void setProprietors(Set<String> proprietors) {
		this.proprietors = proprietors;
	}
	public Set<Photo> getOwnerPhoto() {
		return ownerPhoto;
	}
	public void setOwnerPhoto(Set<Photo> ownerPhoto) {
		this.ownerPhoto = ownerPhoto;
	}
	
}
