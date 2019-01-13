package io.mtech.service;

import java.util.ArrayList;
import java.util.List;

import io.mtech.dao.UserDAO;
import io.mtech.model.User;

public class UserDAOImpl implements UserDAO {

	private List<User> userList=new ArrayList<User>();
	@Override
	public boolean addUser(User user) {
		userList.add(user);
		return true;
	}

	@Override
	public boolean upadateUser(User user) {
		userList.add(user);
		return true;
	}

	@Override
	public boolean deleteUser(User user) {
	userList.remove(user);
		return true;
	}

	@Override
	public List<User> listAll() {
		// TODO Auto-generated method stub
		return userList;
	}

	@Override
	public User get(int userId) {
		User user=userList.get(userId);
		return user;
	}

}
