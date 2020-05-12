package creational.factory.abstractcreator.example3.creator;

import creational.factory.abstractcreator.example3.product.BusinessDevelopmentExecutive;
import creational.factory.abstractcreator.example3.product.Interviewer;

public class BusinessDevelopmentManager implements HiringManager {

	@Override
	public Interviewer getInterviewer() {
		return new BusinessDevelopmentExecutive();
	}

}
