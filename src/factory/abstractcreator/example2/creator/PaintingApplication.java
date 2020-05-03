package factory.abstractcreator.example2.creator;

import factory.abstractcreator.example2.product.Document;
import factory.abstractcreator.example2.product.PaintingDocument;

public class PaintingApplication extends Application {

	@Override
	protected Document createDocument() {
		return new PaintingDocument();
	}

}
