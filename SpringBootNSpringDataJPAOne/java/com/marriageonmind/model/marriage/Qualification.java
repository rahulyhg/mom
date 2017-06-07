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

}
