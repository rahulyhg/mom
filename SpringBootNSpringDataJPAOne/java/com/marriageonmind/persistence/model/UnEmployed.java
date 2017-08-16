package com.marriageonmind.persistence.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UnEmployed extends Occupation {
	
	private Long id;
private String currentActivity;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getCurrentActivity() {
	return currentActivity;
}
public void setCurrentActivity(String currentActivity) {
	this.currentActivity = currentActivity;
}

}
