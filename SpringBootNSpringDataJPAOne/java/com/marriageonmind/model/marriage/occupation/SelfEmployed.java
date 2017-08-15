package com.marriageonmind.model.marriage.occupation;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SelfEmployed extends Job  {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

	
	
}
