package io.natech.DIwithPrimitiveAndObject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("DIwithPrimitiveAndObject.xml");
		Employee emp = (Employee) ctx.getBean("employee");
		emp.getEmployeeDetails();
	}
}
