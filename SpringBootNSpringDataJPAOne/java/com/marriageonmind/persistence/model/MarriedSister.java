package com.marriageonmind.persistence.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MarriedSister extends Sister {
	

	private Long id;
	
	private String husbandName;
	private boolean housewife;
	
	public String getHusbandName() {
		return husbandName;
	}
	public void setHusbandName(String husbandName) {
		this.husbandName = husbandName;
	}
	public boolean isHousewife() {
		return housewife;
	}
	public void setHousewife(boolean housewife) {
		this.housewife = housewife;
	}
	
}

