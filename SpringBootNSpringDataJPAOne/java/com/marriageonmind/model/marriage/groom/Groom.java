package com.marriageonmind.model.marriage.groom;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.marriageonmind.model.marriage.common.MarriageSeeker;

@Entity
public class Groom extends MarriageSeeker{
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	public Groom() {
		// TODO Auto-generated constructor stub
	}
	
	@Enumerated(EnumType.STRING)
	private GroomComplexion groomComplexion;
	
	@Enumerated(EnumType.STRING)
	private GroomMaritalStatus groomMaritalStatus;
	
	@OneToOne
	private BridePreferance bridePreferance;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public GroomComplexion getGroomComplexion() {
		return groomComplexion;
	}

	public void setGroomComplexion(GroomComplexion groomComplexion) {
		this.groomComplexion = groomComplexion;
	}

	public GroomMaritalStatus getGroomMaritalStatus() {
		return groomMaritalStatus;
	}

	public void setGroomMaritalStatus(GroomMaritalStatus groomMaritalStatus) {
		this.groomMaritalStatus = groomMaritalStatus;
	}

	public BridePreferance getBridePreferance() {
		return bridePreferance;
	}

	public void setBridePreferance(BridePreferance bridePreferance) {
		this.bridePreferance = bridePreferance;
	}
	
	
}
