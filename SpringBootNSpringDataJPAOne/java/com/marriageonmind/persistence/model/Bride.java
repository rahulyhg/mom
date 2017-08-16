package com.marriageonmind.persistence.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Bride extends MarriageSeeker
{

		private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Enumerated(EnumType.STRING)
	private BrideComplexion brideComplexion;
	
	@Enumerated(EnumType.STRING)
	private BrideMaritalStatus brideMaritalStatus;
	
	@OneToOne
	private GroomPreferance groomPreferance;

	public BrideComplexion getBrideComplexion() {
		return brideComplexion;
	}

	public void setBrideComplexion(BrideComplexion brideComplexion) {
		this.brideComplexion = brideComplexion;
	}

	public BrideMaritalStatus getBrideMaritalStatus() {
		return brideMaritalStatus;
	}

	public void setBrideMaritalStatus(BrideMaritalStatus brideMaritalStatus) {
		this.brideMaritalStatus = brideMaritalStatus;
	}

	public GroomPreferance getGroomPreferance() {
		return groomPreferance;
	}

	public void setGroomPreferance(GroomPreferance groomPreferance) {
		this.groomPreferance = groomPreferance;
	}
	
}
