package io.naztech.MethodRef;

import java.util.function.Function;

import io.mtech.model.Job;

public class ConstructorReference {
	public void constructorReference() {
		Function<String, Job> jobCreator = Job::new;
		// this is equivalent to
		// Function<String, Job> jobCreator2 = (jobName) -> new Job(jobName);
		System.out.println(jobCreator.apply("Create a new task"));
	}
}
