package structural.bridge.example1.client;

import structural.bridge.example1.colors.Red;
import structural.bridge.example1.colors.Yellow;
import structural.bridge.example1.shapes.Circle;
import structural.bridge.example1.shapes.Rectangle;
import structural.bridge.example1.shapes.Shape;
import structural.bridge.example1.shapes.Square;

/**
 * The Bridge pattern is an application of the old advice, "prefer composition
 * over inheritance". It becomes handy when you must subclass different times in
 * ways that are orthogonal with one another. Say you must implement a hierarchy
 * of colored shapes. You wouldn't want to subclass Shape with Rectangle and
 * Circle and then subclass Rectangle with RedRectangle, BlueRectangle, and
 * GreenRectangle and the same for Circle. You would prefer to say that each
 * Shape has a Color and to implement a hierarchy of colors, and that is the
 * Bridge Pattern.
 */
public class ColoredShapeClient {

	public static void main(String[] args) {
		Shape redRectangle = new Rectangle(new Red());
		Shape yellowRectangle = new Rectangle(new Yellow());
		Shape redSquare = new Square(new Red());
		Shape yellowCircle = new Circle(new Yellow());

		redRectangle.draw();
		yellowRectangle.draw();
		redSquare.draw();
		yellowCircle.draw();
	}

}
