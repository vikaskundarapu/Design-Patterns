package creational.factory.abstractcreator.example2.creator;

import creational.factory.abstractcreator.example2.product.Document;
import creational.factory.abstractcreator.example2.product.DrawingDocument;

public class DrawingApplication extends Application {

	@Override
	protected Document createDocument() {
		return new DrawingDocument();
	}

}
