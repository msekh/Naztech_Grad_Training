package io.naztech.DIwithList;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

		public static void main(String[] args) {
			ApplicationContext ctx = new ClassPathXmlApplicationContext("DIwithList.xml");
			
			Library lib=(Library)ctx.getBean("library");
			lib.getBookDetails();
			
			//Lets print the primitives
	        List<String> stringList = lib.getStringList();
	        System.out.println("Primitives set to List : "+stringList);
	}
}
