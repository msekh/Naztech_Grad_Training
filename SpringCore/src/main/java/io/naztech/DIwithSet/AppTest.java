package io.naztech.DIwithSet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("DIwithSet.xml");
		Department dept = (Department) ctx.getBean("deptmnt");
		dept.getemployeeDetails();

	}
}
