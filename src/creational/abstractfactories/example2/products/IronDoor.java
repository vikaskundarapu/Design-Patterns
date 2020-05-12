package creational.abstractfactories.example2.products;

public class IronDoor implements Door {

	@Override
	public void describeDoor() {
		System.out.println("This is an iron door. To fit this door we would need a welder.");
	}

}
