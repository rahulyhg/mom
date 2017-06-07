package com.marriageonmind.model.marriage;

import java.io.Serializable;
import java.net.URL;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.marriageonmind.model.Address;
import com.marriageonmind.model.Email;
import com.marriageonmind.model.LandLineNo;
import com.marriageonmind.model.MobileNo;

@Entity
public class Groom implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String fullName;
	private Email email;
	private Set<MobileNo> mobileNos;
	private LandLineNo landLineNumber;

	private int heightFeet;
	private int heightInch;
	
	private Father father;
	private Mother mother;
	private Set<Relative> relatives;
	
	private Job job;
		
	private String AdharID;//apply constraint
	private ManglikStatus manglikStatus;
	private MaritalStatus maritalStatus;
	

	private URL video;//youtube Video URL
	
	
	private Date dateOfBirth;
	
	
	private Set<Brother> brothers;
	private Set<Sister> sisters;
	
	private Address currentAddress;
	private Address permanentAddress;
	
private Set<Qualification> qualifications;

	
	

}
