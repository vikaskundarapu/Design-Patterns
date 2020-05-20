package structural.flyweight.example1.vehiclepool;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

import structural.flyweight.example1.Vehicle;

public class VehicleFactory {
	private List<Vehicle> vehicles = new ArrayList<>();

	public VehicleFactory() {
		/* Create traffic vehicles and add it to the vehicle pool */
		IntStream.range(0, 5).iterator().forEachRemaining((int i) -> vehicles.add(new Vehicle("v" + (i + 1))));
	}

	/* Retrieve a vehicle from the pool and set the properties */
	public Vehicle getVehicle(String type, String color, int speed, int duration) {

		Optional<Vehicle> vehicle = vehicles.stream().filter((Vehicle v) -> !v.isActive()).findAny();

		if (vehicle.isPresent()) {
			Vehicle availableVehicle = vehicle.get();
			availableVehicle.setProperties(type, color, speed, duration);
			return availableVehicle;
		}

		return null;
	}
}
