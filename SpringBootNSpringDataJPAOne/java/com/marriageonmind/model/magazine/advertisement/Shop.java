package com.marriageonmind.model.advertiser;

import java.io.Serializable;
import java.util.Collection;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.marriageonmind.model.Photo;

@Entity
public class Shop implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@OneToMany(mappedBy="shop")
	private Collection<Item>items;
	
	@OneToOne
	private Photo shopPhoto;
	
	private String websiteURL;
	private String businessName;
	
	@Enumerated(EnumType.STRING)
	private ShopCategory shopCategory;
	
	@ElementCollection
	private Collection<String> proprietors;
	
	@OneToMany
	private Collection<Photo> ownerPhoto;
	
	
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
	
	public String getBusinessName() {
		return businessName;
	}
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	
	public void setProprietors(Set<String> proprietors) {
		this.proprietors = proprietors;
	}
	
	public Collection<Item> getItems() {
		return items;
	}
	public void setItems(Collection<Item> items) {
		this.items = items;
	}
	public String getWebsiteURL() {
		return websiteURL;
	}
	public void setWebsiteURL(String websiteURL) {
		this.websiteURL = websiteURL;
	}
	public Collection<String> getProprietors() {
		return proprietors;
	}
	public void setProprietors(Collection<String> proprietors) {
		this.proprietors = proprietors;
	}
	public Collection<Photo> getOwnerPhoto() {
		return ownerPhoto;
	}
	public void setOwnerPhoto(Collection<Photo> ownerPhoto) {
		this.ownerPhoto = ownerPhoto;
	}
	public void setOwnerPhoto(Set<Photo> ownerPhoto) {
		this.ownerPhoto = ownerPhoto;
	}
	
}
