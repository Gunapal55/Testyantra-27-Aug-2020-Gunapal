package com.tyss.bmd.dto;

import java.io.Serializable;

import lombok.Data;
@Data

@SuppressWarnings("serial")
public class AdminDTO implements Serializable{
	
	private String email;
	
	private String password;

}
