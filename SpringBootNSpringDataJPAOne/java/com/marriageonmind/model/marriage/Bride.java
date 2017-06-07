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
public class Bride implements Serializable{
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String fullName;
private int heightFeet; //apply constraint
private int heightInch; //apply constraint

private JobStatus jobStatus;
private Father father;
private Mother mother;
private Set<Relative> relatives;

private Complexion complexion;
private Date dateOfBirth; //apply constraint //verify through adharid
private Set<MobileNo> mobileNos;// apply constraint
private LandLineNo landLineNumber;

private Email emailId;//only one emailID
private Set<URL> photo;//
private URL video;//youtube Video URL
private String AdharID;//apply constraint
private ManglikStatus manglikStatus;
private MaritalStatus maritalStatus;

private Job job;

private Set<Brother> brothers;
private Set<Sister> sisters;

private Address currentAddress;
private Address permanentAddress;
}
