package factory.abstractcreator.example2.creator;

import factory.abstractcreator.example2.product.Document;

public abstract class Application {

	protected abstract Document createDocument();

	public Document getDocument() {
		return createDocument();
	}
}
