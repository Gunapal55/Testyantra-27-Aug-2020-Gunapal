package com.tyss.bmd.service;

import java.util.List;

import com.tyss.bmd.dto.UserDTO;
import com.tyss.bmd.entity.User;

public interface UserService {

	public User addUser(User user);

	public User removeUser(int userID);

	public User updateUser(User user);

	public List<User> getUser(String email);

	public User authenticateUser(UserDTO user);

}
