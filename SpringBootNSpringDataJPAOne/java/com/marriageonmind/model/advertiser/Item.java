package com.marriageonmind.model.advertiser;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Item implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private Long id;
private String name;



}
