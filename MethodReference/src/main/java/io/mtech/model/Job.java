package io.mtech.model;

public class Job {
	private String jobName;

	public Job(String jobName) {
		this.jobName = jobName;
	}

	@Override
	public String toString() {
		return "[job: " + jobName + "]";
	}
}
