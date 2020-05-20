package structural.flyweight.example1.client;

import java.util.Objects;
import java.util.Random;

import structural.flyweight.example1.Vehicle;
import structural.flyweight.example1.vehiclepool.VehicleFactory;

/**
 * Used to improve the performance when large number of objects need to be
 * created. When most of the object attributes can be made external and shared.
 * Intent is to use sharing to support large numbers of fine-grained objects
 * efficiently. Assume that you want to create a car racing game where there
 * will be one player, few opponents, and a bunch of traffic vehicles. These
 * traffic vehicles need to appear throughout the game and there can be hundreds
 * of such vehicles appearing during the course of the race. All these traffic
 * vehicles have a common mission (that is creating traffic on the road) but the
 * type, color, size of the vehicles can vary. Creating each and every traffic
 * vehicle will increase the load on the memory. Flyweight pattern can be
 * applied here to improve the performance and reduce memory usage. It is
 * achieved by segregating object properties into two types: intrinsic and
 * extrinsic.
 * 
 * In a race, a traffic vehicle needs to appear only for a shorter time. So, it
 * is not required to create all the traffic vehicles at once. Instead, a bunch
 * of traffic vehicles can be created. These vehicles will have an intrinsic
 * state like the task and vehicle id. Other properties like the vehicle type,
 * color, size, etc. can be made extrinsic so that different types of vehicles
 * can be created based on the input. When a traffic vehicle needs to appear, it
 * is retrieved from the vehicle pool, and the extrinsic properties are applied
 * to change the appearance of the vehicle. When the traffic vehicle goes out of
 * the scene, it can be returned to the pool so that it can be reused.
 */
public class TrafficVehicleClient {

	private static Random random = new Random();
	private static String[] types = { "bus", "truck", "car" };
	private static String[] colors = { "red", "green", "blue" };
	private static int[] speeds = { 50, 30, 80 };

	public static String getRandomType() {
		return types[random.nextInt(types.length)];
	}

	public static String getRandomColor() {
		return colors[random.nextInt(colors.length)];
	}

	public static int getRandomSpeed() {
		return speeds[random.nextInt(speeds.length)];
	}

	public static void main(String[] args) throws InterruptedException {
		VehicleFactory vehicleFactory = new VehicleFactory();

		for (int i = 0; i < 20; i++) {

			Vehicle vehicle = vehicleFactory.getVehicle(getRandomType(), getRandomColor(), getRandomSpeed(),
					getRandomSpeed());

			if (Objects.nonNull(vehicle)) {
				/* free vehicle object found, add to the traffic */
				System.out.print("vehicle" + (i + 1));
				vehicle.addToTraffic();
			} else {
				/* all objects in use, wait and try again */
				Thread.sleep(1000);
			}

		}
	}

}
