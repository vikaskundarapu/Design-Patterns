package creational.abstractfactories.example3.product;

public class TruckTyre implements Tyre {

	@Override
	public void buildTyre() {
		System.out.println("Building a truck tyre");
	}

	@Override
	public void manufactureTyre() {
		System.out.println("Manufacturing a truck tyre");
	}

	@Override
	public void testTyre() {
		System.out.println("Testing a truck tyre");
	}

}
