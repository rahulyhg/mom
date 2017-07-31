package com.marriageonmind.model.magazine.advertisement;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.marriageonmind.model.Address;
import com.marriageonmind.model.magazine.PaymentStatus;
import com.marriageonmind.model.magazine.PrintSpace;

@Entity
public class Ad implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private Long id;

private String adMatter;

	
	@ElementCollection	
private Set<String>businessFirmName;

private String locality;
private String city;
private String pincode;

private String mobileNo1;
private String mobileNo2;

private String emailID;



@Enumerated(EnumType.STRING)
private PaymentStatus paymentStatus;

@ElementCollection
private Set<String> ImageURL;

@ElementCollection
private Set<String> OwnerPhotoURL;


private String website;

public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}



public PaymentStatus getPaymentStatus() {
	return paymentStatus;
}
public void setPaymentStatus(PaymentStatus paymentStatus) {
	this.paymentStatus = paymentStatus;
}



}
