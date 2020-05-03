package factory.concretecreator.example2.client;

import factory.concretecreator.example2.creator.DocumentFactory;
import factory.concretecreator.example2.product.Document;

public class ApplicationClient {

	public static void main(String[] args) {
		DocumentFactory factory = new DocumentFactory();
		Document drawingDocument = factory.getDocument("drawing");
		drawingDocument.printDocument();
		Document paintingDocument = factory.getDocument("painting");
		paintingDocument.printDocument();
	}
}
