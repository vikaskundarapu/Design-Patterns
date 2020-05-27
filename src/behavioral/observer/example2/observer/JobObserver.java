package behavioral.observer.example2.observer;

import behavioral.observer.example2.subject.JobPost;

public interface JobObserver {

	public void jobUpdate(JobPost jobPost);

}
