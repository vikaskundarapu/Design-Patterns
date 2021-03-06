package creational.factory.abstractcreator.example1.creator;

import creational.factory.abstractcreator.example1.product.Shape;
import creational.factory.abstractcreator.example1.product.Square;

public class SquareFactory extends AbstractShapeFactory {

	@Override
	protected Shape factoryMethod() {
		return new Square();
	}

}
