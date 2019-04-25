package io.naztech.DIwithSet;

import java.util.Iterator;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
	private String deptName;
	private Set<Employee> setEmployees;

	public void getemployeeDetails() {

		Set<Employee> emp = getSetEmployees();
		Iterator<Employee> it = emp.iterator();
		int flag = 1;
		while (it.hasNext()) {
			Employee e = (Employee)it.next();
			System.out.println("**Employee" + flag + " Details**");
			System.out.println("Dept name: " + e);
			flag++;
		}
	}
}
