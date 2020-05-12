package creational.abstractfactories.example2.client;

import creational.abstractfactories.example2.factory.DoorFactory;
import creational.abstractfactories.example2.factory.IronDoorFactory;
import creational.abstractfactories.example2.factory.WoodenDoorFactory;
import creational.abstractfactories.example2.products.Door;
import creational.abstractfactories.example2.products.DoorFittingExpert;

/**
 * Extending our door example from Simple Factory. Based on your needs you might
 * get a wooden door from a wooden door shop, iron door from an iron shop or a
 * PVC door from the relevant shop. Plus you might need a guy with different
 * kind of experience to fit the door, for example a carpenter for wooden door,
 * welder for iron door etc. As you can see there is a dependency between the
 * doors now, wooden door needs carpenter, iron door needs a welder etc
 * 
 * A factory of factories; a factory that groups the individual but
 * related/dependent factories together without specifying their concrete
 * classes.
 * 
 * The abstract factory pattern provides a way to encapsulate a group of
 * individual factories that have a common theme without specifying their
 * concrete classes
 * 
 * When there are interrelated dependencies with not-that-simple creation logic
 * involved use this technique
 *
 */
public class BuildDoorClient {
	public static void main(String[] args) {
		DoorFactory woodenDoorfactory = new WoodenDoorFactory();
		Door woodenDoor = woodenDoorfactory.createDoor();
		DoorFittingExpert carpenter = woodenDoorfactory.getDoorFittingExpert();
		woodenDoor.describeDoor();
		carpenter.describeDoorFittingExpert();
		
		System.out.println();
		System.out.println("**** ***** ***** ***** **** ***** ***** *****");
		System.out.println();
		
		DoorFactory ironDoorfactory = new IronDoorFactory();
		Door ironDoor = ironDoorfactory.createDoor();
		DoorFittingExpert welder = ironDoorfactory.getDoorFittingExpert();
		ironDoor.describeDoor();
		welder.describeDoorFittingExpert();
	}
}
