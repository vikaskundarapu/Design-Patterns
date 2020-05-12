package creational.abstractfactories.example2.products;

public class WoodenDoor implements Door {

	@Override
	public void describeDoor() {
		System.out.println("This is the wooden door. To fit this door we would need a carpenter.");
	}

}
