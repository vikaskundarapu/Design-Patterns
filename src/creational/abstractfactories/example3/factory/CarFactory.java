package creational.abstractfactories.example3.factory;

import creational.abstractfactories.example3.product.CarEngine;
import creational.abstractfactories.example3.product.CarTyre;
import creational.abstractfactories.example3.product.Engine;
import creational.abstractfactories.example3.product.Tyre;

public class CarFactory implements VehicleFactory {

	@Override
	public Engine getEngine() {
		return new CarEngine();
	}

	@Override
	public Tyre getTyre() {
		return new CarTyre();
	}

}
