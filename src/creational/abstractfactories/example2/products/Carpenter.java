package creational.abstractfactories.example2.products;

public class Carpenter implements DoorFittingExpert {

	@Override
	public void describeDoorFittingExpert() {
		System.out.println("I'm a carpenter. I fit wooden doors, and only wooden doors!");
	}

}
