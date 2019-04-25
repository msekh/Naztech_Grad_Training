package io.naztech.services;

import io.naztech.dao.UserDAO;
import io.naztech.dbUtil.DBConnection;
import io.naztech.dbUtil.DBOperation;
import io.naztech.model.User;

public class UserDAOImpl implements UserDAO {
	@Override
	public boolean addUser(User user) {
	DBOperation.insert(user);
		return true;
	}

	@Override
	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteUser(int uid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User userFindById(int uid) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
