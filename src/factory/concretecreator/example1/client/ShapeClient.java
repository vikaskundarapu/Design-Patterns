package factory.concretecreator.example1.client;

import factory.concretecreator.example1.creator.ShapeFactory;
import factory.concretecreator.example1.product.Shape;

/**
 * Factory pattern is one of the most used design patterns in Java. This type of
 * design pattern comes under creational pattern as this pattern provides one of
 * the best ways to create an object. In Factory pattern, we create object
 * without exposing the creation logic to the client and refer to newly created
 * object using a common interface. This is the second variant of factory
 * pattern wherein we would not need to create a new concrete creator class for
 * every product addition. We will create concrete creator class which will
 * return the object we need. We will now have a method defined in the concrete
 * creator and that takes a String parameter. Depending on the parameter passed,
 * we will return the object
 */

public class ShapeClient {
	public static void main(String[] args) {
		Shape square = new ShapeFactory().getShape("square");
		square.draw();

		Shape circle = new ShapeFactory().getShape("circle");
		circle.draw();

		Shape rectangle = new ShapeFactory().getShape("rectangle");
		rectangle.draw();
	}
}
