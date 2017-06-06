package com.marriageonmind.model.marriage;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.marriageonmind.model.PaymentStatus;
import com.marriageonmind.model.PrintSpace;

@Entity
public class Profile implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private Long profileID;
private boolean settled;
private PrintSpace printSpace;
private PaymentStatus paymentStatus;
private boolean tobePublishedInMagazine;
private boolean complete;


 
}
