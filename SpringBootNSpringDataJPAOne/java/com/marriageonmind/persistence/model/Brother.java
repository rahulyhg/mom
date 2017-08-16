package com.marriageonmind.persistence.model;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;




@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="BROTHER_TYPE")
public class Brother implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
private String name;

@ManyToOne
private MarriageSeeker marriageSeeker;


public MarriageSeeker getMarriageSeeker() {
	return marriageSeeker;
}
public void setMarriageSeeker(MarriageSeeker marriageSeeker) {
	this.marriageSeeker = marriageSeeker;
}
@OneToOne
private Qualification qualification;

public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}




public Qualification getQualification() {
	return qualification;
}
public void setQualification(Qualification qualification) {
	this.qualification = qualification;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}


}
