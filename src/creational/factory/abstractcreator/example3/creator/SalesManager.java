package creational.factory.abstractcreator.example3.creator;

import creational.factory.abstractcreator.example3.product.Interviewer;
import creational.factory.abstractcreator.example3.product.SalesExecutive;

public class SalesManager implements HiringManager {

	@Override
	public Interviewer getInterviewer() {
		return new SalesExecutive();
	}

}
