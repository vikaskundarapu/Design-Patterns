package creational.abstractfactories.example2.products;

public class Welder implements DoorFittingExpert {

	@Override
	public void describeDoorFittingExpert() {
		System.out.println("I'm a welder. I fit iron doors, and only iron doors!");
	}

}
