package com.tyss.bmd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.bmd.dto.ResponseDTO;
import com.tyss.bmd.dto.UserDTO;
import com.tyss.bmd.entity.User;
import com.tyss.bmd.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*")
public class UserLoginController {

	@Autowired
	private UserService service;

	@PostMapping("/register")
	public ResponseDTO addUser(@RequestBody User user) {
		ResponseDTO response = new ResponseDTO();
		response.setData(service.addUser(user));
		return response;
	}
 
	@PostMapping("/login")
	public ResponseDTO getLogin(@RequestBody UserDTO user) {
		ResponseDTO response = new ResponseDTO();
		response.setData(service.authenticateUser(user));
		return response;
	}

}
