package io.mtech.lambda;

import java.math.BigDecimal;
//import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Developer {
	private String name;
	private BigDecimal salry;
	private int age;

	public Developer(String name, BigDecimal salry, int age) {
		this.name = name;
		this.salry = salry;
		this.age = age;
	}

	// Setter getter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getSalry() {
		return salry;
	}

	public void setSalry(BigDecimal salry) {
		this.salry = salry;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Developer [name=" + name + ", salry=" + salry + ", age=" + age + "]";
	}
}

public class ComparatorExample {
	public static void main(String[] args) {

		List<Developer> listDevs = getDevelopers();

		// before java 8
		System.out.println("Before Sort: ");
		for (Developer dev : listDevs) {
			System.out.println(dev);
		}

		// Sort by Name
		Collections.sort(listDevs, new Comparator<Developer>() {
			@Override
			public int compare(Developer o1, Developer o2) {
				return o1.getName().compareToIgnoreCase(o2.getName());
			}
		});

		System.out.println("After Sort by name: ");
		for (Developer developer : listDevs) {
			System.out.println(developer);
		}

		System.out.println("============Sort by age===========");
		Collections.sort(listDevs, new Comparator<Developer>() {

			@Override
			public int compare(Developer o1, Developer o2) {
				return o1.getAge() - o2.getAge();
			}
		});
		System.out.println("After sort by age: ");
		for (Developer developer : listDevs) {
			System.out.println(developer);
		}

		System.out.println("=======sort by salary====");
		Collections.sort(listDevs, new Comparator<Developer>() {
			@Override
			public int compare(Developer o1, Developer o2) {
				return o1.getSalry().compareTo(o2.getSalry());
			}
		});

		System.out.println("After Sort by salary:");
		for (Developer developer : listDevs) {
			System.out.println(developer);
		}

		System.out.println("===============In java 8============");
		// lambda here
		listDevs.sort((o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName()));
		// java 8 only, lambda also, to print the List
		listDevs.forEach(dev -> System.out.println(dev));
	}

	public static List<Developer> getDevelopers() {

		List<Developer> result = Arrays.asList(
				new Developer("mkyong", new BigDecimal("70000"), 33),
				new Developer("alvin", new BigDecimal("80000"), 20),
				new Developer("jason", new BigDecimal("100000"), 10),
				new Developer("iris", new BigDecimal("170000"), 55));
		
//		List<Developer> result = new ArrayList<>();
//
//		result.add(new Developer("mkyong", new BigDecimal("70000"), 33));
//		result.add(new Developer("alvin", new BigDecimal("80000"), 20));
//		result.add(new Developer("jason", new BigDecimal("100000"), 10));
//		result.add(new Developer("iris", new BigDecimal("170000"), 55));

		return result;
	}
}
