package factory.concretecreator.example1.creator;

import factory.concretecreator.example1.product.Circle;
import factory.concretecreator.example1.product.Rectangle;
import factory.concretecreator.example1.product.Shape;
import factory.concretecreator.example1.product.Square;

public class ShapeFactory {

	private static final String CIRCLE = "circle";
	private static final String SQUARE = "square";
	private static final String RECTANGLE = "rectangle";

	public Shape getShape(String shapeType) {
		Shape shape = null;

		switch (shapeType.toLowerCase()) {
		case CIRCLE:
			shape = new Circle();
			break;
		case SQUARE:
			shape = new Square();
			break;
		case RECTANGLE:
			shape = new Rectangle();
			break;
		}

		return shape;
	}

}
