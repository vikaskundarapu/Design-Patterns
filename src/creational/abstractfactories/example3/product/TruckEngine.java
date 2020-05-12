package creational.abstractfactories.example3.product;

public class TruckEngine implements Engine {

	@Override
	public void buildEngine() {
		System.out.println("Building a truck engine");
	}

	@Override
	public void manufactureEngine() {
		System.out.println("Manufacturing a truck engine");
	}

	@Override
	public void testEngine() {
		System.out.println("Testing a truck engine");
	}

}
