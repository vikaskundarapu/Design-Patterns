package creational.abstractfactories.example3.product;

public class CarEngine implements Engine {

	@Override
	public void buildEngine() {
		System.out.println("Building a car engine");
	}

	@Override
	public void manufactureEngine() {
		System.out.println("Manufacturing a car engine");
	}

	@Override
	public void testEngine() {
		System.out.println("Testing a car engine");
	}

}
