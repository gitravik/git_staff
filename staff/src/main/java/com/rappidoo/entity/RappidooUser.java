package com.rappidoo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class RappidooUser {

	private @GeneratedValue @Id int id;
	private String firstname;
	private String lastname;
	private String emailId;
	
}
