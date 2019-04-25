package io.mtech.service;

import java.util.ArrayList;
import java.util.List;

import io.mtech.dao.UserDAO;
import io.mtech.dbUtil.DBConnection;
import io.mtech.dbUtil.DBOperation;
import io.mtech.model.User;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UserDAOImpl implements UserDAO {

	@Override
	public boolean addUser(User user) {
		DBOperation.insert(user);
		log.info("user created.");
		return true;
	}

	@Override
	public boolean updateUser(User user) {	
		DBOperation.updateUser(user);
		log.info("Updated.");
		return true;		

	}

	@Override
	public boolean deleteUser(int uid) {
		DBOperation.deleteUser(uid);
		log.info("user deleted");
		return true;
	}

	@Override
	public User userFindById(int uid) {
		User user = new User();
		user = DBOperation.getSingleUser(uid);
		return user;
	}

	@Override
	public List<User> getAllUser() {
		List<User> list = new ArrayList<>() ;
		try {
          list = DBOperation.fetch();
		}catch (Exception e) {
			log.info("Fetch falied.");
		}		
		return list;
	}

}
