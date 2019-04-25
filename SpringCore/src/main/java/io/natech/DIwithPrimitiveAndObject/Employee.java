package io.natech.DIwithPrimitiveAndObject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	private String id;
	private String name;
	private String email;
	private Address address;
	
	 public void getEmployeeDetails()
	    {
	        System.out.println("**Employee Details**");
	        System.out.println("ID : "+id);
	        System.out.println("Name : "+name);
	        System.out.println("City : "+email);
	        System.out.println("Address: "+address.getStreetNo()+", "+address.getCity()+", "+address.getCountry());
	    }
}
