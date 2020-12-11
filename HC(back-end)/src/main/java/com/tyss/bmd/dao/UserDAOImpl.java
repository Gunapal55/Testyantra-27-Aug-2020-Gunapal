package com.tyss.bmd.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Repository;

import com.tyss.bmd.dto.UserDTO;
import com.tyss.bmd.entity.User;

@Repository
public class UserDAOImpl implements UserDAO {

	@PersistenceUnit
	EntityManagerFactory factory;

	@Override
	public User addUser(User user) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(user);
		manager.getTransaction().commit();
		manager.close();
		return user;
	}

	@Override
	public User removeUser(int userID) {
		EntityManager manager = factory.createEntityManager();
		User user1 = manager.find(User.class, userID);
		if (user1 != null) {
			manager.getTransaction().begin();
			manager.remove(user1);
			manager.getTransaction().commit();
			manager.close();
			return user1;
		} else {
			manager.close();
			return null;
		}
	}

	@Override
	public User updateUser(User user) {
		EntityManager manager = factory.createEntityManager();

		User user1 = manager.find(User.class, user.getEmail());
		if (user1 != null) {
			manager.getTransaction().begin();
			BeanUtils.copyProperties(user, user1);
			manager.getTransaction().commit();
			manager.close();
			return user1;
		} else {
			manager.close();
			return null;
		}
	}

	@Override
	public List<User> getUser(String userName) {
		EntityManager manager = factory.createEntityManager();
		TypedQuery<User> query = manager.createNamedQuery("FROM User U Where U.email =:value OR U.userName=:value",
				User.class);
		query.setParameter("value", "%" + userName + "%");
		List<User> userList = query.getResultList();
		if (userList.isEmpty()) {
			manager.close();
			return null;
		} else {
			manager.close();
			return userList;

		}
	}

	@Override
	public User authenticateUser(UserDTO user) {
		EntityManager manager = factory.createEntityManager();
		TypedQuery<User> query = manager.createQuery("FROM User U WHERE U.email= : mail AND U.password=:pwd",
				User.class);
		query.setParameter("mail",user.getEmail());
		query.setParameter("pwd", user.getPassword());
		User user11 = (User) query.getSingleResult();
		manager.close();
		return user11;

	}
		
}

