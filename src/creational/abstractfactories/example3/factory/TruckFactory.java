package creational.abstractfactories.example3.factory;

import creational.abstractfactories.example3.product.Engine;
import creational.abstractfactories.example3.product.TruckEngine;
import creational.abstractfactories.example3.product.TruckTyre;
import creational.abstractfactories.example3.product.Tyre;

public class TruckFactory implements VehicleFactory {

	@Override
	public Engine getEngine() {
		return new TruckEngine();
	}

	@Override
	public Tyre getTyre() {
		return new TruckTyre();
	}

}
