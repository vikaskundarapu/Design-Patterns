package creational.simplefactory.creator;

import creational.simplefactory.product.Door;
import creational.simplefactory.product.WoodenDoor;

public class DoorFactory {
	public static Door makeDoor(float width, float length) {
		WoodenDoor woodenDoor = new WoodenDoor(width, length);
		return woodenDoor;
	}
}
