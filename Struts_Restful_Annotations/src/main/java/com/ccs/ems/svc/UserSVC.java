package com.ccs.ems.svc;

import java.util.List;

import com.ccs.ems.model.User;

public interface UserSVC {
	
	public User getUserByFirstName(String userFirstName);
	
	public User getUserByLastName(String userLastName);
	
	public User getUserByID(long userID);
	
	public void renameUser(String oldFirstName, String newFirstName, String oldLastName, String newLastName);
	
	public void deleteUserByID(long userID);
	
	public void deleteUserByName(String userFisrtName, String userLastName);
	
	public User createUser(User user);

	List<User> getAllUsers();
}
