package Prototype;


/**Prototype pattern refers to creating duplicate object while keeping performance in mind.
 *  This type of design pattern comes under creational pattern as this pattern provides one 
 *  of the best ways to create an object. This pattern involves implementing a prototype 
 *  interface which tells to create a clone of the current object. This pattern is used when
 *  creation of object directly is costly. For example, an object is to be created after a 
 *  costly database operation. We can cache the object, returns its clone on next request and 
 *  update the database as and when needed thus reducing database calls.*/

public class ShapePrototypeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ShapeCache shapeCache = new ShapeCache();
		shapeCache.loadHashtable();
		
		Shape circle = shapeCache.getShape("1");
		circle.draw();
		
		Shape square = shapeCache.getShape("2");
		square.draw();
		
		Shape rectangle = shapeCache.getShape("3");
		rectangle.draw();
	}

}
