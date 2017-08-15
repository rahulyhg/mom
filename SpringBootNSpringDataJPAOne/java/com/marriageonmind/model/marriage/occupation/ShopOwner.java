package com.marriageonmind.model.marriage.occupation;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class ShopOwner extends Job {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@OneToMany(mappedBy="shopOwner")
private Set<Shop> shop;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Set<Shop> getShop() {
		return shop;
	}

	public void setShop(Set<Shop> shop) {
		this.shop = shop;
	}
	
}
