package structural.bridge.example3.vehicle;

import structural.bridge.example3.manufacture.Manufacture;

public class Car extends Vehicle {

	public Car(Manufacture produce, Manufacture assemble) {
		super(produce, assemble);
	}

	@Override
	public void manufacture() {
		System.out.print("Car ");
		produce.manfactureVehicle();
		System.out.print("Car ");
		assemble.manfactureVehicle();
		System.out.println("Congratulations! Car manufacturing completed!");
	}

}
