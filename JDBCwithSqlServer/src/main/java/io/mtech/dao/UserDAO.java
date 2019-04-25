package io.mtech.dao;

import java.util.List;

import io.mtech.model.User;

public interface UserDAO {
	boolean addUser(User user);
	boolean updateUser(User user);
	boolean deleteUser(int uid);
	User userFindById(int uid);
	public List<User> getAllUser();
}
