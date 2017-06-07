package com.marriageonmind.model.marriage;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sister implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private String name;
private String husbandName;
private Profession husbandOccupation;
private boolean housewife;
private Profession occupation;
private String professionDescription;
}
