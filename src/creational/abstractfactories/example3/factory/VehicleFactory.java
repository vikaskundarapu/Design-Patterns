package creational.abstractfactories.example3.factory;

import creational.abstractfactories.example3.product.Engine;
import creational.abstractfactories.example3.product.Tyre;

public interface VehicleFactory {
	
	public static VehicleFactory getFactory(String vehicle) {
		VehicleFactory factory;
		
		if ("car".equalsIgnoreCase(vehicle)) {
			factory = new CarFactory();
		} else if ("truck".equalsIgnoreCase(vehicle)) {
			factory = new TruckFactory();
		} else {
			throw new IllegalArgumentException("The vehice type: " + vehicle + " is ot supported");
		}

		return factory;
	}

	Engine getEngine();

	Tyre getTyre();
}
