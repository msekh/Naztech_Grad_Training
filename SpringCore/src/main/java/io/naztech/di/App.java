package io.naztech.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
public static void main(String[] args) {
	ApplicationContext ctx = new ClassPathXmlApplicationContext("di.xml");
	Student st= (Student)ctx.getBean("stdnt");
	System.out.println(st);
}
}
