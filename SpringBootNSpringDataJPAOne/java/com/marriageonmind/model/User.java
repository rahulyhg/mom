package com.marriageonmind.model;


import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.marriageonmind.model.marriage.Category;



@Entity
@Table(name="USER")
public class User implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@NotNull
	@Column(name="NAME", nullable=false)
	private String name;
	private String password;
    private String passwordConfirm;
    private Email userId;//only one email id

	private MobileNo mobileNo;//only one mobile no.
	private Category category;
	private String fullName;
	private UserCategory userCategory;
	
	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getPasswordConfirm() {
		return passwordConfirm;
	}


	public void setPasswordConfirm(String passwordConfirm) {
		this.passwordConfirm = passwordConfirm;
	}


	


	@NotNull
	  private String email;
	  
	  
	  public User() { }


	  public User(Long id) {
			this.id = id;
	}


	public User(String email, String name) {
	    this.email = email;
	    this.name = name;
	  }
	
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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

}
