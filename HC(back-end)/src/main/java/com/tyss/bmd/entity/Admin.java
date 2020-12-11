package com.tyss.bmd.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name = "Admin")
public class Admin {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ad_id")
	private int adminId;
		
//		@Pattern(regexp = "(?!^[0-9]*$)(?!^[a-zA-Z]*$)^([a-zA-Z0-9]{6,15})$")
		@Column(name = "email")
		private String email;

//		@Pattern(regexp = "(?=^.{8,}$)((?=.*\\d)|(?=.*\\W+))(?![.\\n])(?=.*[A-Z])(?=.*[a-z]).*$\"\r\n" + "")
		@Column(name = "pwd")
		private String password;
		
		@OneToOne(cascade = CascadeType.ALL)
		@JoinColumn(name = "usr_id")
		private User user;
		

}
