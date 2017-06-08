package com.marriageonmind.model.marriage;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Qualification implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private QualificationLevel qualificationLevel;
	private QualificationStatus qualificationStatus;
	private QualificationName qualificationName;//it should be unique
	private QualificationStream stream;
	private String speciality; /* convent educated etc */
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public QualificationLevel getQualificationLevel() {
		return qualificationLevel;
	}
	public void setQualificationLevel(QualificationLevel qualificationLevel) {
		this.qualificationLevel = qualificationLevel;
	}
	public QualificationStatus getQualificationStatus() {
		return qualificationStatus;
	}
	public void setQualificationStatus(QualificationStatus qualificationStatus) {
		this.qualificationStatus = qualificationStatus;
	}
	public QualificationName getQualificationName() {
		return qualificationName;
	}
	public void setQualificationName(QualificationName qualificationName) {
		this.qualificationName = qualificationName;
	}
	public QualificationStream getStream() {
		return stream;
	}
	public void setStream(QualificationStream stream) {
		this.stream = stream;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	

}
