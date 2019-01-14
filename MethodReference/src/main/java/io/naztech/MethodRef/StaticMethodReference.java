package io.naztech.MethodRef;

import io.mtech.model.Employee;

public class StaticMethodReference {

	public static int compareByAge(Employee first, Employee second) {
		return Integer.compare(first.getAge(), second.getAge());
	}
	
	public static int compareByName(Employee e1, Employee e2) {
		return e1.getFirstName().compareTo(e2.getFirstName());
	}
}
