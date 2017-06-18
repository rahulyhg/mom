package com.marriageonmind.model.marriage;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class University implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String name;
	
	@OneToMany(mappedBy="university")
	private Collection<College> colleges;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Collection<College> getColleges() {
		return colleges;
	}

	public void setColleges(Collection<College> colleges) {
		this.colleges = colleges;
	}
	
	
	
}
