package com.marriageonmind.model.marriage;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student extends UnEmployedMarriagePerson {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	

}
