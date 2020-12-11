package com.tyss.bmd.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
@Table(name = "User")
public class User {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "usr_id")
	private int userId;
	

	@Column(name = "name")
	private String name;

	
	@NotNull
	@Column(name = "email")
	private String email;


	@Column(name = "pwd")
	private String password;

//	@NotNull
	@Column(name = "ph")
	private Long phone;

	@Column(name = "role")
	private String role;

	
	@Column(name = "status")
	private String status;

	
}
