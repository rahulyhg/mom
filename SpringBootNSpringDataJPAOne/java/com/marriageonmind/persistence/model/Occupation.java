package com.marriageonmind.persistence.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Occupation implements Serializable {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Long id;

@ManyToOne
private MarriageSeeker marriageSeeker;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}


}
