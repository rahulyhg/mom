package com.marriageonmind.model.marriage;

import java.util.Date;
import java.util.Map;

import com.marriageonmind.model.Email;

public class Bride {
private String fullName;
private int heightInCm; //apply constraint
private Father father;
private Mother mother;
private Complexion complexion;
private Date dateOfBirth; //apply constraint //verify through adharid
private Map mobileNo;// apply constraint
private Email emailId;//only one emailID
private Map photo;//
private Map video;//youtube Video URL
private String AdharID;//apply constraint
private ManglikStatus manglikStatus;


}
