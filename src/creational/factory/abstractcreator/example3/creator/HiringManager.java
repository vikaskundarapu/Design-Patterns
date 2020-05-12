package creational.factory.abstractcreator.example3.creator;

import creational.factory.abstractcreator.example3.product.Interviewer;

public interface HiringManager {

	public default void takeinterview() {
		Interviewer interviewer = getInterviewer();
		interviewer.askQuestions();
	}

	public Interviewer getInterviewer();
}
