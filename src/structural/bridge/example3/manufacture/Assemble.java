package structural.bridge.example3.manufacture;

public class Assemble implements Manufacture {

	@Override
	public void manfactureVehicle() {
		System.out.println("Assembled");
	}

}
