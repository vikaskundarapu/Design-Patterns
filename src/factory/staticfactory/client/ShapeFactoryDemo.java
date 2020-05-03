package factory.staticfactory.client;

import factory.staticfactory.creator.ShapeFactory;
import factory.staticfactory.product.Shape;

/**
 * Factory pattern is one of the most used design patterns in Java. This type of
 * design pattern comes under creational pattern as this pattern provides one of
 * the best ways to create an object. In Factory pattern, we create object
 * without exposing the creation logic to the client and refer to newly created
 * object using a common interface. This is the third variant of factory pattern
 * wherein we would not need to create and instance of concrete creator class.
 * We will create a static method which will return the object we need. The
 * whole approach remains the same as that of concrete creator but the method
 * now will be static
 */

public class ShapeFactoryDemo {

	public static void main(String[] args) {

		Shape requiredShape;
		requiredShape = ShapeFactory.getShape("circle");
		requiredShape.draw();

		requiredShape = ShapeFactory.getShape("rectangle");
		requiredShape.draw();

		requiredShape = ShapeFactory.getShape("square");
		requiredShape.draw();

	}

}
