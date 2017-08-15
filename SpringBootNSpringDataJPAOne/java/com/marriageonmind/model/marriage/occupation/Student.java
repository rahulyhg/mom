package com.marriageonmind.model.marriage.occupation;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.marriageonmind.model.marriage.qualification.Qualification;

@Entity
public class Student extends UnEmployed {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@OneToMany // unidirectional
	private Set<Qualification> qualification;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Set<Qualification> getQualification() {
		return qualification;
	}

	public void setQualification(Set<Qualification> qualification) {
		this.qualification = qualification;
	}
	
	
}
