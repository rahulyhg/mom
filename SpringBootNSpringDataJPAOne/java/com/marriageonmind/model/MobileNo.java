package com.marriageonmind.model;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class MobileNo implements Serializable{
private String mobileNo;
private boolean verified;
private boolean whatsAppNo;
private boolean thisFBID;

}
