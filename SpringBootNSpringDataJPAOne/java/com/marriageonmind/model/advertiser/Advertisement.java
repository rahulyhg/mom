package com.marriageonmind.model.advertiser;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
private Address address;
private Set<MobileNo> mobileNo;
private Email emailID;
private PrintSpace printSpace;
private PaymentStatus paymentStatus;


}
