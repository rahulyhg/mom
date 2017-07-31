package com.marriageonmind.model;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;



@Entity
public class User implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@NotNull
	@Column( nullable=false)
	private String firstName;
	
	private String lastName;
	
	
	private String password;
    private String passwordConfirm;
    
    @OneToOne
    private Email userId;//only one email id

    @OneToOne
	private MobileNo mobileNo;//only one mobile no.
	
	@Enumerated(EnumType.STRING)
	private Role role;
	
	
	
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
  
	  public User() { }

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
