package com.marriageonmind.model.marriage;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Qualification implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Enumerated(EnumType.STRING)
	private QualificationStatus qualificationStatus;
	
	
	@Enumerated(EnumType.STRING)
	private QualificationLevel qualificationLevel;
	
	@Enumerated(EnumType.STRING)
	private QualificationStream stream;
	
	@Enumerated(EnumType.STRING)
	private QualificationName qualificationName;//it should be unique
	
	
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	private String description; /* convent educated etc */
	
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
	

}
