package creational.abstractfactories.example3.client;

import creational.abstractfactories.example3.factory.VehicleFactory;
import creational.abstractfactories.example3.product.Engine;
import creational.abstractfactories.example3.product.Tyre;

public class BuildVehicle {

	public static void main(String[] args) {
		VehicleFactory carFactory = VehicleFactory.getFactory("car");
		Engine carEngine = carFactory.getEngine();
		Tyre carTyre = carFactory.getTyre();
		carEngine.buildEngine();
		carEngine.manufactureEngine();
		carEngine.testEngine();
		carTyre.buildTyre();
		carTyre.manufactureTyre();
		carTyre.testTyre();

		System.out.println();
		System.out.println("**** ***** ***** ***** **** ***** ***** *****");
		System.out.println();

		VehicleFactory truckFactory = VehicleFactory.getFactory("truck");
		Engine truckEngine = truckFactory.getEngine();
		Tyre truckTyre = truckFactory.getTyre();
		truckEngine.buildEngine();
		truckEngine.manufactureEngine();
		truckEngine.testEngine();
		truckTyre.buildTyre();
		truckTyre.manufactureTyre();
		truckTyre.testTyre();
	}
}
