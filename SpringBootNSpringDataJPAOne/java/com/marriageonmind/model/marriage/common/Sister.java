package com.marriageonmind.model.marriage.common;

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
@DiscriminatorColumn(name="SISTER_TYPE")
public class Sister implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private String name;


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}



}
