package structural.bridge.example3.vehicle;

import structural.bridge.example3.manufacture.Manufacture;

public class Bike extends Vehicle {

	public Bike(Manufacture produce, Manufacture assemble) {
		super(produce, assemble);
	}

	@Override
	public void manufacture() {
		System.out.print("Bike ");
		produce.manfactureVehicle();
		System.out.print("Bike ");
		assemble.manfactureVehicle();
		System.out.println("Congratulations! Bike manufacturing completed!");
	}

}
