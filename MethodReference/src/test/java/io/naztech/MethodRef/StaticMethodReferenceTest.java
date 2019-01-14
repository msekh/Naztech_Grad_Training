package io.naztech.MethodRef;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import io.mtech.model.Employee;

public class StaticMethodReferenceTest {
private Employee emp;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		emp=new Employee();
	}
	

	@Test
	public void testStaticMethodReference() {
		Comparator<Employee> ageComparator = StaticMethodReference::compareByAge;
   // assertEquals();
	 //Comparator<Employee> aC = (Employee e1, Employee e2) -> Employee.compareByAge(e1, e2);
		// above is equivalent to below one
		// Comparator<Employee> ageComparator2 = (first, second) ->
		// MethodReferenceExample.compareByAge(first, second);
		 List<Employee> employees = Arrays.asList(new Employee("Gaurav", "Mazra", 27),
		 new Employee("Mohan", "Sharma", 29), new Employee("Gurpreet", "Singh", 24));
		 Collections.sort(employees, ageComparator);
	
	    //employees.sort((first, second)->first.getAge()-second.getAge());
		
	}

}
