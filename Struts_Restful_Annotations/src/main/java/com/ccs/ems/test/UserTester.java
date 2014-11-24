package com.ccs.ems.test;

import com.ccs.ems.dao.UserDAO;
import com.ccs.ems.dao.UserDAOImpl;
import com.ccs.ems.model.User;

public class UserTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDAO user = new UserDAOImpl();
		
		User user1 = user.getUserByID(1);
		
		System.out.println(user1.getUserFirstName());
		System.out.println(user1.getUserLastName());
		
	}

}
