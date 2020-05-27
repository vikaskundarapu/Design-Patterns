package behavioral.observer.example2.client;

import behavioral.observer.example2.EmploymentAgency;
import behavioral.observer.example2.observer.Jobseeker;
import behavioral.observer.example2.subject.JobPost;

/**
 * Real world example:A good example would be the job seekers where they
 * subscribe to some job posting site and they are notified whenever there is a
 * matching job opportunity.
 * 
 * In plain words: Defines a dependency between objects so that whenever an
 * object changes its state, all its dependents are notified.
 * 
 * Wikipedia says: The observer pattern is a software design pattern in which an
 * object, called the subject, maintains a list of its dependents, called
 * observers, and notifies them automatically of any state changes, usually by
 * calling one of their methods.
 * 
 */
public class JobObseverClient {

	public static void main(String[] args) {
		Jobseeker dwightSchrute = new Jobseeker("Dwight Schrute");
		Jobseeker michaelScott = new Jobseeker("Michael Scott");

		EmploymentAgency employmentAgency = new EmploymentAgency();
		employmentAgency.addObserver(michaelScott);
		employmentAgency.addObserver(dwightSchrute);

		JobPost jobPost = new JobPost("Senior Manager", "Dunder-Miffinlin-123");
		employmentAgency.addNewJobPosting(jobPost);
	}
}
