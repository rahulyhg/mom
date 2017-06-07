package com.marriageonmind.model.marriage;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Mother implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private String fullName;
private boolean alive;
private boolean housewife;
}
