package creational.factory.abstractcreator.example3.product;

public class Developer implements Interviewer {

	@Override
	public void askQuestions() {
		System.out.println("Ask questions about computer science concepts and check the coding skills");
	}

}
