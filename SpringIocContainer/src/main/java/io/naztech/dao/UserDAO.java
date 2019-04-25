package io.naztech.dao;

import io.naztech.model.User;

public interface UserDAO {
	boolean addUser(User user);
	boolean updateUser(User user);
	boolean deleteUser(int uid);
	User userFindById(int uid);
}
