package factory.abstractcreator.example2.creator;

import factory.abstractcreator.example2.product.Document;
import factory.abstractcreator.example2.product.DrawingDocument;

public class DrawingApplication extends Application {

	@Override
	protected Document createDocument() {
		return new DrawingDocument();
	}

}
