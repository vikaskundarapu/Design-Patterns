package behavioral.observer.example2.observer;

import behavioral.observer.example2.subject.JobPost;

public class Jobseeker implements JobObserver {
	private String name;

	public Jobseeker(String name) {
		super();
		this.name = name;
	}

	@Override
	public void jobUpdate(JobPost jobPost) {
		System.out.println("Hi " + name + "! New posting has been made for the '" + jobPost.getTitle()
				+ "' title with job id " + jobPost.getJobId());
	}

}
