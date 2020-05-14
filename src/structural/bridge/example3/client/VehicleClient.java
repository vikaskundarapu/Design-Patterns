package structural.bridge.example3.client;

import structural.bridge.example3.manufacture.Assemble;
import structural.bridge.example3.manufacture.Produce;
import structural.bridge.example3.vehicle.Bike;
import structural.bridge.example3.vehicle.Car;
import structural.bridge.example3.vehicle.Vehicle;

/**
 * In this example, we are manufacturing various vehicles. each manufacturing
 * step is broken down into 2 simple steps viz. Produce and Assemble
 */
public class VehicleClient {

	public static void main(String[] args) {
		Vehicle manufactureCar = new Car(new Produce(), new Assemble());
		Vehicle manufactureBike = new Bike(new Produce(), new Assemble());
		manufactureCar.manufacture();
		System.out.println();
		manufactureBike.manufacture();
	}
}
