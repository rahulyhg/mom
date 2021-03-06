package com.marriageonmind.model.advertiser;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Item implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private Long id;
private String name;

@ManyToOne
private Shop shop;

public Shop getShop() {
	return shop;
}
public void setShop(Shop shop) {
	this.shop = shop;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}



}
