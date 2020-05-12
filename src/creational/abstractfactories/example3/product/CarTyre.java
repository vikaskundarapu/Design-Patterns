package creational.abstractfactories.example3.product;

public class CarTyre implements Tyre {

	@Override
	public void buildTyre() {
		System.out.println("Building a car tyre");
	}

	@Override
	public void manufactureTyre() {
		System.out.println("Manufacturing a car tyre");
	}

	@Override
	public void testTyre() {
		System.out.println("Testing a car tyre");
	}

}
