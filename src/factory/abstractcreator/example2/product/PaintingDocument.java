package factory.abstractcreator.example2.product;

public class PaintingDocument implements Document {

	@Override
	public void printDocument() {
		System.out.println("Printing the PaintingDocument");
	}

}
