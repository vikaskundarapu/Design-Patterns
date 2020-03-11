package factory;
/**Factory pattern is one of the most used design patterns in Java. 
 * This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.
 * In Factory pattern, we create object without exposing the creation logic to the client and refer to newly created object using a common interface*/


public class ShapeFactoryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ShapeFactory shapeFactory = new ShapeFactory();
		
		Shape requiredShape;
		 requiredShape = shapeFactory.getShape("circle");
		 requiredShape.draw();
		 
		 requiredShape = shapeFactory.getShape("rectangle");
		 requiredShape.draw();
		 
		 requiredShape = shapeFactory.getShape("square");
		 requiredShape.draw();
		
	}

}
