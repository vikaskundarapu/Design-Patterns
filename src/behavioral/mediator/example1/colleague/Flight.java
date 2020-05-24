package behavioral.mediator.example1.colleague;

import java.util.Timer;
import java.util.TimerTask;

import behavioral.mediator.example1.mediator.AirportTrafficController;
import behavioral.mediator.example1.model.Gate;
import behavioral.mediator.example1.model.Runway;

/*Define colleagues. Colleagues keep a reference to its Mediator object.*/
public class Flight {

	private AirportTrafficController trafficController;
	private String flightNumber;
	private Runway runway;
	private Gate gate;

	public Flight(AirportTrafficController trafficController, String flightNum) {
		this.trafficController = trafficController;
		this.flightNumber = flightNum;
	}

	public void allocateRunway(Runway runway) {
		this.runway = runway;
	}

	public void allocateGate(Gate gate) {
		this.gate = gate;
	}

	public Runway getRunway() {
		return runway;
	}

	public Gate getGate() {
		return gate;
	}

	public void land() {
		trafficController.enterRunway(runway);
		System.out.println(this.flightNumber + " is landing through runway number " + runway.getRunwayNumber()
				+ " on gate " + gate.getGateNumber());

		/* Exit the runway after 1 second */
		new Timer().schedule(new TimerTask() {

			@Override
			public void run() {
				trafficController.exitRunway(runway);
				trafficController.enterGate(gate);
			}
		}, 1000);
	}

	public void takeOff() {

		/* Takeoff after 5 seconds */
		new java.util.Timer().schedule(new java.util.TimerTask() {

			@Override
			public void run() {
				System.out.println(flightNumber + " is taking off");
				trafficController.exitGate(gate);
				trafficController.enterRunway(runway);

				/* Exit the runway after 1 second */
				new java.util.Timer().schedule(new java.util.TimerTask() {
					@Override
					public void run() {
						trafficController.exitRunway(runway);
					}
				}, 1000);

			}
		}, 5000);

	}

	public void landAndTakeOff() throws InterruptedException {
		System.out.println(flightNumber + " is requesting landing permission");

		while (!trafficController.getLandingPermission(this)) {
			Thread.sleep(1000);
		}

		land();

		while (!trafficController.getTakeOffPermission(this)) {
			Thread.sleep(1000);
		}

		takeOff();
	}

}
