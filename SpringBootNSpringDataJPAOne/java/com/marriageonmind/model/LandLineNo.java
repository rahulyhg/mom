package com.marriageonmind.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/*
 * here the combination of std code and number should be unique
 * combination of number and std code have to form PK
 */
 
@Entity
public class LandLineNo implements Serializable{
	@Id
	private String number;
	@Id
	private String STDCode;

	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getSTDCode() {
		return STDCode;
	}
	public void setSTDCode(String sTDCode) {
		STDCode = sTDCode;
	}
	
	

}
