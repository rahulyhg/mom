package com.marriageonmind.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Payment implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private Long id;
	private Date paymentDate;
	private double amountPaid;
	private String paymentDescription;
	
	
	

}
