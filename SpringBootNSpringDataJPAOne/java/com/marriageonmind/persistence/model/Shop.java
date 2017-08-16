package com.marriageonmind.persistence.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Shop implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	private ShopOwner shopOwner;
	
	private String shopName;
	
	@Enumerated(EnumType.STRING)
	private ShopCategory shopCategory;
	

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public ShopCategory getShopCategory() {
		return shopCategory;
	}
	public void setShopCategory(ShopCategory shopCategory) {
		this.shopCategory = shopCategory;
	}
	
}
