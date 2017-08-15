package com.marriageonmind.model.marriage.occupation;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UnEmployed extends Occupation {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
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
