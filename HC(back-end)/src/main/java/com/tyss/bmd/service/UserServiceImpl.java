package com.tyss.bmd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyss.bmd.dao.UserDAO;
import com.tyss.bmd.dto.UserDTO;
import com.tyss.bmd.entity.User;
import com.tyss.bmd.exception.BookMyDoctorException;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO dao;

	@Override
	public User addUser(User user) {

		User dto = dao.addUser(user);
		if (dto != null) {
			return dto;
		} else {
			throw new BookMyDoctorException("User already exists try with your full name");
		}
	}

	@Override
	public User removeUser(int userID) {

		User dto = dao.removeUser(userID);
		if (dto != null) {
			return dto;
		} else {
			throw new BookMyDoctorException("User not found");
		}
	}

	@Override
	public User updateUser(User user) {

		User dto = dao.updateUser(user);
		if (dto != null) {
			return dto;
		} else {
			throw new BookMyDoctorException("User not found");
		}
	}

	@Override
	public List<User> getUser(String userName) {

		List<User> dto = dao.getUser(userName);
		if (dto != null) {
			return dto;
		} else {
			throw new BookMyDoctorException("User not found");
		}
	}

	@Override
	public User authenticateUser(UserDTO user) {

		User dto = dao.authenticateUser(user);
		if (dto != null) {
			return dto;
		} else {
			throw new BookMyDoctorException("User not found");
		}
	}

	
}
