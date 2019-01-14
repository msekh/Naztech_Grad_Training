package io.mtech.appTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import io.mtech.model.Employee;
import io.naztech.MethodRef.ConstructorReference;
import io.naztech.MethodRef.StaticMethodReference;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		
		//Static method
		Comparator<Employee> ageComparator = StaticMethodReference::compareByName;
		// assertEquals();
		// Comparator<Employee> aC = (Employee e1, Employee e2) ->
		// Employee.compareByAge(e1, e2);
		// above is equivalent to below one
		// Comparator<Employee> ageComparator2 = (first, second) ->
		// MethodReferenceExample.compareByAge(first, second);
		List<Employee> employees = Arrays.asList(new Employee("Arisha", "islam", 27),
				new Employee("Ariba", "Sekh", 29), new Employee("Sekh", "Mahadi", 24));
		System.out.println(employees);
		Collections.sort(employees, ageComparator);
		// employees.sort((first, second)->first.getAge()-second.getAge());
		System.out.println(employees);
		
		
		//Constructor Reference
		ConstructorReference cr=new ConstructorReference();
		cr.constructorReference();
		
		
	}
}
