package com.marriageonmind.model.marriage.occupation;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Job extends Occupation {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

private String officeName;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getOfficeName() {
	return officeName;
}

public void setOfficeName(String officeName) {
	this.officeName = officeName;
}






}
