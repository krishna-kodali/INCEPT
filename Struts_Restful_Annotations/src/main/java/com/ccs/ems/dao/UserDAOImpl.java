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
		Session s = DBUtil.getSession();
		String hql = "from User where userFirstName = :userFirstName";
		Query q = s.createQuery(hql);
		q.setParameter("userFirstName", userFirstName);
		User user = (User) q.uniqueResult();
		s.close();
		return user;
	}

	@Override
	public User getUserByLastName(String userLastName) {
		// TODO Auto-generated method stub
		Session s = DBUtil.getSession();
		String hql = "from User where userLastName = :userLastName";
		Query q = s.createQuery(hql);
		q.setParameter("userLastName", userLastName);
		User user = (User) q.uniqueResult();
		s.close();
		return user;
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
		Session s = DBUtil.getSession();
		Transaction tx = s.beginTransaction();
		String hql = "update User set userFirstName = :userNewFirstName" + ", userLastName = :userNewLastName" +
				" where userFirstName = :userOldFirstName" + " and userLastName = :userOldLastName";
		Query q = s.createQuery(hql);
		q.setParameter("userNewFirstName", newFirstName);
		q.setParameter("userNewLastName", newLastName);
		q.setParameter("userOldFirstName", oldFirstName);
		q.setParameter("userOldLastName", oldLastName);
		q.executeUpdate();
		tx.commit();
		s.close();
	}

	@Override
	public void deleteUserByID(long userID) {
		// TODO Auto-generated method stub
		Session s = DBUtil.getSession();
		Transaction ts = s.beginTransaction();
		User user = getUserByID(userID);
		s.delete(user);
		ts.commit();
		s.close();
	}

	@Override
	public void deleteUserByName(String userFirstName, String userLastName) {
		// TODO Auto-generated method stub
		Session s = DBUtil.getSession();
		Transaction ts = s.beginTransaction();
		User user1 = getUserByLastName(userLastName);
		User user2 = getUserByFirstName(userFirstName);
		if(user1.equals(user2))
		s.delete(user1);
		ts.commit();
		s.close();
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
