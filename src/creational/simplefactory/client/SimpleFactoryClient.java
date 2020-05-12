package creational.simplefactory.client;

import creational.simplefactory.creator.DoorFactory;
import creational.simplefactory.product.Door;

/**
 * Consider, you are building a house and you need doors. You can either put on
 * your carpenter clothes, bring some wood, glue, nails and all the tools
 * required to build the door and start building it in your house or you can
 * simply call the factory and get the built door delivered to you so that you
 * don't need to learn anything about the door making or to deal with the mess
 * that comes with making it.
 * 
 * Simple factory simply generates an instance for client without exposing any
 * instantiation logic to the client
 * 
 * In object-oriented programming (OOP), a factory is an object for creating
 * other objects – formally a factory is a function or method that returns
 * objects of a varying prototype or class from some method call, which is
 * assumed to be "new".
 * 
 * 
 */
public class SimpleFactoryClient {

	public static void main(String[] args) {
		Door door = DoorFactory.makeDoor(10, 20);
		System.out.println("Width::: " + door.getWidth());
		System.out.println("Length:: " + door.getLength());
	}

}
