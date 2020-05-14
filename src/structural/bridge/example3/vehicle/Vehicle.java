package structural.bridge.example3.vehicle;

import structural.bridge.example3.manufacture.Manufacture;

public abstract class Vehicle {
	protected Manufacture produce;
	protected Manufacture assemble;

	protected Vehicle(Manufacture produce, Manufacture assemble) {
		this.produce = produce;
		this.assemble = assemble;
	}

	public abstract void manufacture();

}
