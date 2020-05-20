package structural.flyweight.example1;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Create a vehicle class. Intrinsic and extrinsic characteristics are carefully
 * chosen.
 * 
 */
public class Vehicle {
	private String name;
	private final String task;
	private String type;
	private String color;
	private int speed;
	private boolean active;
	private int duration;

	public Vehicle(String name) {
		this.name = name;

		/* Intrinsic state of the object */
		this.task = "Obstructing the racers";
	}

	/* We should be able to set extrinsic properties */
	public void setProperties(String type, String color, int speed, int duration) {
		this.type = type;
		this.color = color;
		this.speed = speed;
		this.duration = duration;
	}

	public boolean isActive() {
		return active;
	}

	public void addToTraffic() {
		/* add the vehicle to the traffic */
		System.out.println(
				"->" + name + "-" + type + "-" + color + "-" + speed + "mph-" + duration + "seconds" + "-" + task);

		/*
		 * Create a timer task to take the vehicle out from the traffic after the
		 * duration
		 */
		new Timer().schedule(new TimerTask() {
			@Override
			public void run() {
				active = false;
				System.out.println(name + "-> is free now!");
			}
		}, duration * 100);
		active = true;
	}
}
