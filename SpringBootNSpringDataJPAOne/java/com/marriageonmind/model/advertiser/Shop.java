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
	
}
