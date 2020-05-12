package creational.prototype.example1.cache;

import java.util.HashMap;
import java.util.Map;

import creational.prototype.example1.product.Circle;
import creational.prototype.example1.product.Rectangle;
import creational.prototype.example1.product.Shape;
import creational.prototype.example1.product.Square;

public class ShapeCache {

	private Map<String, Shape> shapeTable = new HashMap<>();

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
