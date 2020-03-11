package Prototype;

import java.util.Hashtable;

public class ShapeCache {

	public Hashtable<String, Shape> shapeTable = new Hashtable<String, Shape>();

	public void loadHashtable() {

		Circle circle = new Circle();
		circle.setId("1");
		shapeTable.put(circle.getId(), circle);

		Square square = new Square();
		square.setId("2");
		shapeTable.put(square.getId(), square);

		Rectangle rectangle = new Rectangle();
		rectangle.setId("3");
		shapeTable.put(rectangle.getId(), rectangle);

	}

	public Shape getShape(String shapeId){
		
		Shape cachedShape;
		cachedShape = shapeTable.get(shapeId);
		return (Shape)cachedShape.clone();
	}
	
}
