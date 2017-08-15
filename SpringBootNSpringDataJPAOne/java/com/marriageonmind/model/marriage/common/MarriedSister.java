package com.marriageonmind.model.marriage.common;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MarriedSister extends Sister {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
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

