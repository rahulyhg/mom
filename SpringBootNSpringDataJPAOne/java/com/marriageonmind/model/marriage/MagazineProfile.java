package com.marriageonmind.model.marriage;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.marriageonmind.model.PaymentStatus;
import com.marriageonmind.model.PrintSpace;

@Entity
public class MagazineProfile extends Profile {
	@Id
	private Long id;
	private PrintSpace printSpace;
	private PaymentStatus paymentStatus;
	
}
