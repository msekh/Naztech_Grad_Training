package io.naztech.xmlConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springXml.xml");

		Library lib = (Library) ctx.getBean("library");
		lib.getBook().getBookDetails();
		Library lib1 = (Library) ctx.getBean("library");
		
		lib1.getBook().setAuthor("Mahadi");
		lib1.getBook().getBookDetails();
		((AbstractApplicationContext) ctx).close();
	}
}
