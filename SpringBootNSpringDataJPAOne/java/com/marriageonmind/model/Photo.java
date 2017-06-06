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




}
