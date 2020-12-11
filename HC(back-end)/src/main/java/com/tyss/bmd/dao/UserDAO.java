package com.tyss.bmd.dao;

import java.util.List;

import com.tyss.bmd.dto.UserDTO;
import com.tyss.bmd.entity.User;

public interface UserDAO {

	public User addUser(User user);

	public User removeUser(int userID);

	public User updateUser(User user);

	public List<User> getUser(String email);

	public User authenticateUser(UserDTO user);


}
