package behavioral.observer.example2.subject;

public class JobPost {
	private final String title;
	private final String jobId;

	public JobPost(String title, String jobId) {
		super();
		this.title = title;
		this.jobId = jobId;
	}

	public String getJobId() {
		return jobId;
	}

	public String getTitle() {
		return title;
	}

}
