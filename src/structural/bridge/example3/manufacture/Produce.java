package structural.bridge.example3.manufacture;

public class Produce implements Manufacture {

	@Override
	public void manfactureVehicle() {
		System.out.println("Produced");
	}

}
