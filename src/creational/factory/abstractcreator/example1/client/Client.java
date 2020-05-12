package creational.factory.abstractcreator.example1.client;

import creational.factory.abstractcreator.example1.creator.CircleFactory;
import creational.factory.abstractcreator.example1.creator.RectangleFactory;
import creational.factory.abstractcreator.example1.creator.SquareFactory;
import creational.factory.abstractcreator.example1.product.Shape;

public class Client {
	public static void main(String[] args) {
		
		/* Get the required shape by calling the respective factory */
		Shape square = new SquareFactory().getShape();
		square.draw();

		Shape rectangle = new RectangleFactory().getShape();
		rectangle.draw();

		Shape circle = new CircleFactory().getShape();
		circle.draw();
	}
}
