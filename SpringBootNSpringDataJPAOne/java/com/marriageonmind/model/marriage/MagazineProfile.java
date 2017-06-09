package com.marriageonmind.model.marriage;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

import com.marriageonmind.model.PaymentStatus;
import com.marriageonmind.model.PrintSpace;

@Entity
public class MagazineProfile extends Profile {
	@Id
	private Long id;
	@Enumerated(EnumType.STRING)
	private PrintSpace printSpace;
	@Enumerated(EnumType.STRING)
	private PaymentStatus paymentStatus;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
