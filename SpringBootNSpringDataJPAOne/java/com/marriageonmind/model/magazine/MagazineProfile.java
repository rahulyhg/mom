package com.marriageonmind.model.magazine;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class MagazineProfile {
	@Id
	private Long id;
	@Enumerated(EnumType.STRING)
	private PrintSpace printSpace;
	@Enumerated(EnumType.STRING)
	private PaymentStatus paymentStatus;
	
	@OneToMany
	private Set<MagazinePayment> magazinePayments;
	
	public Set<MagazinePayment> getMagazinePayments() {
		return magazinePayments;
	}
	public void setMagazinePayments(Set<MagazinePayment> magazinePayments) {
		this.magazinePayments = magazinePayments;
	}
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
