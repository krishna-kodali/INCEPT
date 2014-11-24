package com.ccs.ems.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ccs.ems.model.User;

public class UserDAOImpl implements UserDAO{

	@Override
	public User getUserByFirstName(String userFirstName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserByLastName(String userLastName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserByID(long userID) {
		// TODO Auto-generated method stub
		Session s = DBUtil.getSession();
		String hql = "from User where user_id = :userID";
		Query q = s.createQuery(hql);
		q.setParameter("userID", userID);
		User user = (User) q.uniqueResult();
		s.close();
		return user;
	}

	@Override
	public void renameUser(String oldFirstName, String newFirstName,
			String oldLastName, String newLastName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUserByID(long userID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUserByName(String userFisrtName, String userLastName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		Session s = DBUtil.getSession();
		Transaction tx = s.beginTransaction();
		s.save(user);
		tx.commit();
		s.close();
		return user;
	}
	
	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		Session s = DBUtil.getSession();
		String hql = "from User ";
		Query q = s.createQuery(hql);
		List<User> users = (List<User>) q.list();
		s.close();
		return users;
	}

}
