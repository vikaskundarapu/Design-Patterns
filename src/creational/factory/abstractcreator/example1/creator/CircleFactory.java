package creational.factory.abstractcreator.example1.creator;

import creational.factory.abstractcreator.example1.product.Circle;
import creational.factory.abstractcreator.example1.product.Shape;

public class CircleFactory extends AbstractShapeFactory {

	@Override
	protected Shape factoryMethod() {
		return new Circle();
	}
}
