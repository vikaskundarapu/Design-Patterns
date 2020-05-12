package creational.factory.staticfactory.creator;

import creational.factory.staticfactory.product.Circle;
import creational.factory.staticfactory.product.Rectangle;
import creational.factory.staticfactory.product.Shape;
import creational.factory.staticfactory.product.Square;

public class ShapeFactory {

	private static final String SQUARE = "Square";
	private static final String RECTANGLE = "Rectangle";
	private static final String CIRCLE = "Circle";

	private ShapeFactory() {
	}

	public static Shape getShape(String shape) {
		if (null == shape) {
			return null;
		}

		if (shape.equalsIgnoreCase(CIRCLE))
			return new Circle();
		else if (shape.equalsIgnoreCase(RECTANGLE))
			return new Rectangle();
		else if (shape.equalsIgnoreCase(SQUARE))
			return new Square();
		return null;
	}
}
