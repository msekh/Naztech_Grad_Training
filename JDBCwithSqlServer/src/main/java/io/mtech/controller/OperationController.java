package io.mtech.controller;

import java.util.List;

import io.mtech.model.User;
import io.mtech.service.UserDAOImpl;

public class OperationController {
public static void main(String[] args) {
	UserDAOImpl ui=new UserDAOImpl();
	List<User> list=ui.getAllUser();

	for(User u: list) {
		System.out.println(u);
	}
}
}
