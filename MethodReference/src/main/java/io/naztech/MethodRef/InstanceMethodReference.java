package io.naztech.MethodRef;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import io.mtech.model.User;
import io.mtech.model.MyComparator;
import io.mtech.model.User;

public class InstanceMethodReference {
	
	void instanceMethodReference() {
		List<User> users = Arrays.asList(new User("Arisha", "islam"),
				new User("Ariba", "Sekh"), new User("Sekh", "Mahadi"));
		System.out.println(users);
		MyComparator comparator = new MyComparator();
		System.out.println(users);
		Collections.sort(users, comparator::compareByFirstName);
		System.out.println(users);
	}
}
