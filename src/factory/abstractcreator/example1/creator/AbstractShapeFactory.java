package factory.abstractcreator.example1.creator;

import factory.abstractcreator.example1.product.Shape;

/**
 * This is the abstract Creator class that creates the object
 */
public abstract class AbstractShapeFactory {
	protected abstract Shape factoryMethod();
	
	public Shape getShape() {
		return factoryMethod();
	}
}
