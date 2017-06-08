package com.marriageonmind.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Email implements Serializable{
	@Id
private String emilID;
private boolean verified;
private boolean thisFBID;

}
