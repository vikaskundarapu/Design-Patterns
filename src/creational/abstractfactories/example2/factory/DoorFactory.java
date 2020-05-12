package creational.abstractfactories.example2.factory;

import creational.abstractfactories.example2.products.Door;
import creational.abstractfactories.example2.products.DoorFittingExpert;

public interface DoorFactory {
	Door createDoor();

	DoorFittingExpert getDoorFittingExpert();
}
