package com.tyss.bmd.dto;

import java.io.Serializable;

import lombok.Data;

@SuppressWarnings("serial")
@Data

public class UserDTO implements Serializable {

	private int userId;
	
	private String email;

	private String password;

	private int phone;

	private String role;

}
