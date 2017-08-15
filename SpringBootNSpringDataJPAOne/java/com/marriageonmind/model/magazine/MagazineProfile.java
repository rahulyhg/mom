package com.marriageonmind.model.magazine;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;

@Entity
public class MagazineProfile implements Serializable{
	@Id
	private Long id;
	@Enumerated(EnumType.STRING)
	private PrintSpace printSpace;
	@Enumerated(EnumType.STRING)
	private PaymentStatus paymentStatus;
	
	@OneToMany(mappedBy="magazineProfile")
	@OrderBy("paymentDate")
	private List<MagazinePayment> magazinePayments;
	

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
