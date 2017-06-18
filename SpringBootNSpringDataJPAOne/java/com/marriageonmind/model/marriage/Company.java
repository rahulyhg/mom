package com.marriageonmind.model.marriage;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.marriageonmind.model.Address;

@Entity
public class Company implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String name;
	
	@OneToMany(mappedBy="company")
	private Collection<CompanyEmployeeMarriagePerson> companyEmployees;
	
	public Collection<CompanyEmployeeMarriagePerson> getCompanyEmployees() {
		return companyEmployees;
	}

	public void setCompanyEmployees(Collection<CompanyEmployeeMarriagePerson> companyEmployees) {
		this.companyEmployees = companyEmployees;
	}

	@OneToOne
	private Address address;

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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
		

}
