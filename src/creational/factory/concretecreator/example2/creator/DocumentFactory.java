package creational.factory.concretecreator.example2.creator;

import creational.factory.concretecreator.example2.product.Document;
import creational.factory.concretecreator.example2.product.DrawingDocument;
import creational.factory.concretecreator.example2.product.PaintingDocument;

public class DocumentFactory {

	private static final String DRAWING_APPLICATION = "drawing";
	private static final String PAINTING_APPLICATION = "painting";

	public Document getDocument(String documentType) {
		Document document = null;

		if (documentType.equalsIgnoreCase(DRAWING_APPLICATION)) {
			document = new DrawingDocument();
		} else if (documentType.equalsIgnoreCase(PAINTING_APPLICATION)) {
			document = new PaintingDocument();
		}

		return document;
	}
}
