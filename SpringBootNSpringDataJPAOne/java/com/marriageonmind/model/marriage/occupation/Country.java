package com.marriageonmind.model.marriage.occupation;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Embeddable
public class Country implements Serializable{

	private String name;
	

}
