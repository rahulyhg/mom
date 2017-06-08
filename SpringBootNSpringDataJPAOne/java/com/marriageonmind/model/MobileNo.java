package com.marriageonmind.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MobileNo implements Serializable{
@Id	
private String mobileNo;
private boolean verified;
private boolean whatsAppNo;
private boolean thisFBID;

}
