package com.marriageonmind.model.advertiser;

import java.io.Serializable;
import java.net.URL;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.marriageonmind.model.Address;
import com.marriageonmind.model.Email;
import com.marriageonmind.model.MobileNo;
import com.marriageonmind.model.PaymentStatus;
import com.marriageonmind.model.PrintSpace;

@Entity
public class Advertisement implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private Long id;

	@OneToMany
private Address address;
	@OneToMany
private Collection<MobileNo> mobileNo;
@OneToOne
private Email emailID;

@Enumerated(EnumType.STRING)
private PrintSpace printSpace;
@Enumerated(EnumType.STRING)
private PaymentStatus paymentStatus;

private String photoURL;
private String website;

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
public Email getEmailID() {
	return emailID;
}
public void setEmailID(Email emailID) {
	this.emailID = emailID;
}
public PrintSpace getPrintSpace() {
	return printSpace;
}
public void setPrintSpace(PrintSpace printSpace) {
	this.printSpace = printSpace;
}
public PaymentStatus getPaymentStatus() {
	return paymentStatus;
}
public void setPaymentStatus(PaymentStatus paymentStatus) {
	this.paymentStatus = paymentStatus;
}



}
