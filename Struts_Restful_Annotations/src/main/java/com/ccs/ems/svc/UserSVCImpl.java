package com.ccs.ems.svc;

import java.util.List;

import com.ccs.ems.dao.UserDAO;
import com.ccs.ems.dao.UserDAOImpl;
import com.ccs.ems.model.User;

public class UserSVCImpl implements UserSVC{

	UserDAO userDAO = new UserDAOImpl();
	User user;
	
	@Override
	public User getUserByFirstName(String userFirstName) {
		// TODO Auto-generated method stub
		return userDAO.getUserByFirstName(userFirstName);
	}

	@Override
	public User getUserByLastName(String userLastName) {
		// TODO Auto-generated method stub
		return userDAO.getUserByLastName(userLastName);
	}

	@Override
	public User getUserByID(long userID) {
		// TODO Auto-generated method stub
		user = userDAO.getUserByID(userID);
		return user;
	}

	@Override
	public void renameUser(String oldFirstName, String newFirstName,
			String oldLastName, String newLastName) {
		// TODO Auto-generated method stub
		userDAO.renameUser(oldFirstName, newFirstName, oldLastName, newLastName);
	}

	@Override
	public void deleteUserByID(long userID) {
		// TODO Auto-generated method stub
		userDAO.deleteUserByID(userID);
	}

	@Override
	public void deleteUserByName(String userFisrtName, String userLastName) {
		// TODO Auto-generated method stub
		userDAO.deleteUserByName(userFisrtName, userLastName);
	}

	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		return userDAO.createUser(user);
	}
	
	@Override
	public List<User> getAllUsers(){
		return userDAO.getAllUsers();
	}

}
