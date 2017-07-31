package com.marriageonmind.model.marriage.qualification;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
/*
 * as soon as the degree is selected valid streams should be shown
 */
@Entity
public class Qualification implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String degreeName;
	private String majorSubject;
	private String college;
	private String university;
	
	boolean complete;
	
	public boolean isComplete() {
		return complete;
	}

	public void setComplete(boolean complete) {
		this.complete = complete;
	}
	@Temporal(TemporalType.DATE)
	private Date startDate;//can't be after enddate
	@Temporal(TemporalType.DATE)
	private Date endDate; //can't be before startdate
	
	private QualificationLevel qualificationLevel; 
	// should be automatically selected based on the degree selected  
	
	/*
	 * non existent value should be stored in database
	 */
	public Qualification()
	{
	
	}
	
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
		
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
		

}
