package creational.factory.abstractcreator.example2.client;

import creational.factory.abstractcreator.example2.creator.DrawingApplication;
import creational.factory.abstractcreator.example2.creator.PaintingApplication;
import creational.factory.abstractcreator.example2.product.Document;

public class ApplicationClient {
	public static void main(String[] args) {
		Document drawingDocument = new DrawingApplication().getDocument();
		drawingDocument.printDocument();
		Document paintingDocument = new PaintingApplication().getDocument();
		paintingDocument.printDocument();
	}
}
