package creational.abstractfactories.example2.factory;

import creational.abstractfactories.example2.products.Door;
import creational.abstractfactories.example2.products.DoorFittingExpert;
import creational.abstractfactories.example2.products.IronDoor;
import creational.abstractfactories.example2.products.Welder;

public class IronDoorFactory implements DoorFactory {

	@Override
	public Door createDoor() {
		return new IronDoor();
	}

	@Override
	public DoorFittingExpert getDoorFittingExpert() {
		return new Welder();
	}

}
