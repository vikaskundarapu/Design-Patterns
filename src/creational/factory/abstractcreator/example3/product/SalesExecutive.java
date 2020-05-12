package creational.factory.abstractcreator.example3.product;

public class SalesExecutive implements Interviewer {

	@Override
	public void askQuestions() {
		System.out.println("Ask questions about improving sales");
	}

}
