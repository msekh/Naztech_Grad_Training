package io.naztech.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	private static ApplicationContext ctx;

	public static void main(String[] args) {
		ctx = new ClassPathXmlApplicationContext("beanXml.xml");
		// AnnotationConfigApplicationContext ctx = new
		// AnnotationConfigApplicationContext(AppConfig.class);
		HelloWorld obj = (HelloWorld) ctx.getBean("helloWorld");
		obj.getMsg();
	}
}
