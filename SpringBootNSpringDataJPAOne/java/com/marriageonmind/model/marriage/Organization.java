package com.marriageonmind.model.marriage;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.marriageonmind.model.Address;

@Entity
public class Organization  implements Serializable{
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
private Address address;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}


	
}
