package io.naztech.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import io.naztech.model.User;
import io.naztech.services.UserDAOImpl;

public class UserApp {
private static ApplicationContext ctx;

public static void main(String[] args) {
	ctx = new ClassPathXmlApplicationContext("beanXml.xml");
	
	User u = (User)ctx.getBean("user");
	//User u=new User(101, "Sekh", "msekh36@", "12345");
	UserDAOImpl  ud = new UserDAOImpl();
	ud.addUser(u);
	
}
}
