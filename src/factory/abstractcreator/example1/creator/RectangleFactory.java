package factory.abstractcreator.example1.creator;

import factory.abstractcreator.example1.product.Rectangle;
import factory.abstractcreator.example1.product.Shape;

public class RectangleFactory extends AbstractShapeFactory {

	@Override
	protected Shape factoryMethod() {
		return new Rectangle();
	}
}
