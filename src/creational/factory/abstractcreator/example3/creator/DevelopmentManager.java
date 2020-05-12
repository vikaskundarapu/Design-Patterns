package creational.factory.abstractcreator.example3.creator;

import creational.factory.abstractcreator.example3.product.Developer;
import creational.factory.abstractcreator.example3.product.Interviewer;

public class DevelopmentManager implements HiringManager {

	@Override
	public Interviewer getInterviewer() {
		return new Developer();
	}

}
