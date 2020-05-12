package creational.abstractfactories.example2.factory;

import creational.abstractfactories.example2.products.Carpenter;
import creational.abstractfactories.example2.products.Door;
import creational.abstractfactories.example2.products.DoorFittingExpert;
import creational.abstractfactories.example2.products.WoodenDoor;

public class WoodenDoorFactory implements DoorFactory {

	@Override
	public Door createDoor() {
		return new WoodenDoor();
	}

	@Override
	public DoorFittingExpert getDoorFittingExpert() {
		return new Carpenter();
	}

}
