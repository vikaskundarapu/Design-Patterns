package factory.abstractcreator.example1.creator;

import factory.abstractcreator.example1.product.Circle;
import factory.abstractcreator.example1.product.Shape;

public class CircleFactory extends AbstractShapeFactory {

	@Override
	protected Shape factoryMethod() {
		return new Circle();
	}
}
