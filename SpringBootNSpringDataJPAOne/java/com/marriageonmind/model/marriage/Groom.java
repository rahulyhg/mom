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
import com.marriageonmind.model.City;
import com.marriageonmind.model.Email;
import com.marriageonmind.model.LandLineNo;
import com.marriageonmind.model.MobileNo;

@Entity
public class Groom implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String firstName;
	private String lasttName;
	
	private String alsoQualifiedIn;
	private Email email;
	private Set<MobileNo> mobileNos;
	private LandLineNo landLineNumber;

	private Profession profession;
	private Job job;
	
	private int heightFeet;
	private int heightInch;
	private int heightInCm;
	
	private Father father;
	private Mother mother;
	private Set<Relative> relatives;
	private Set<URL> photo;//
	private URL video;//youtube Video URL
	
	private String AdharID;//apply constraint
	private ManglikStatus manglikStatus;
	private MaritalStatus maritalStatus;
	
	private Date dateOfBirth;
	
	
	private Set<Brother> brothers;
	private Set<Sister> sisters;
	
	private City nativePlace;
	
	private Address currentAddress;
	private Address permanentAddress;
	
private Set<Qualification> qualifications;

	
	

}
