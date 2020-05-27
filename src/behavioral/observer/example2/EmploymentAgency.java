package behavioral.observer.example2;

import java.util.ArrayList;
import java.util.List;

import behavioral.observer.example2.observer.JobObserver;
import behavioral.observer.example2.subject.JobPost;

public class EmploymentAgency {

	private List<JobObserver> observers = new ArrayList<>();

	public void notifyObservers(JobPost jobPost) {
		observers.stream().forEach((JobObserver jobObserver) -> jobObserver.jobUpdate(jobPost));
	}

	public void addObserver(JobObserver observer) {
		observers.add(observer);
	}

	public void addNewJobPosting(JobPost jobPost) {
		notifyObservers(jobPost);
	}

}
