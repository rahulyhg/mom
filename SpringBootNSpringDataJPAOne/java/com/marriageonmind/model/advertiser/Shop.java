package com.marriageonmind.model.advertiser;

import java.net.URL;
import java.util.Set;

import com.marriageonmind.model.Photo;

public class Shop {
	private Long id;
	private Photo shopPhoto;
	private URL websiteURL;
	private String businessName;
	private Set<String> proprietors;
	private Set<Photo> ownerPhoto;
}
