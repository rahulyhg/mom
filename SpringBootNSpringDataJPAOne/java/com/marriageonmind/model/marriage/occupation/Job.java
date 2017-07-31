package com.marriageonmind.model.marriage.occupation;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Job extends Occupation {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

private String officeName;






}
