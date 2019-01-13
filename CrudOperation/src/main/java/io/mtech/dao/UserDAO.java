package io.mtech.dao;

import java.util.List;

import io.mtech.model.User;

public interface UserDAO {
	
boolean addUser(User user);
boolean upadateUser(User user);
boolean deleteUser(User user);
User get(int userId);
List<User> listAll();

}
