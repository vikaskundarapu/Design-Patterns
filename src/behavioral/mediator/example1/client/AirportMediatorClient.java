package behavioral.mediator.example1.client;

import behavioral.mediator.example1.colleague.Flight;
import behavioral.mediator.example1.mediator.AirportTrafficController;
import behavioral.mediator.example1.mediator.AirportTrafficControllerImpl;
import behavioral.mediator.example1.model.Gate;
import behavioral.mediator.example1.model.Runway;

/**
 * Used to facilitate interactions between a set of objects where the
 * communications are complex and hard to maintain. To have a centralized
 * control for the object interactions. Intent is to define an object that
 * encapsulates how a set of objects interact. Mediator promotes loose coupling
 * by keeping objects from referring to each other explicitly, and it lets you
 * vary their interaction independently.
 * 
 * Pattern Components: 1) Mediator interface – an interface that defines the
 * communication rules between objects 2) Concrete mediator – a mediator object
 * which will enable communication between participating objects 3) Colleagues –
 * objects communicating with each other through mediator object Structure
 * 
 * Implementation: The mediator pattern enables the decoupling of objects by
 * introducing a layer in between so that the interaction between objects
 * happens via the layer. ATC (Air Traffic Controller) is a perfect example of
 * the mediator design pattern. A typical airport is a complex system that
 * involves complex communications between flights, airport vehicles, and other
 * airport systems. Direct communication between all these participants is
 * error-prone and practically impossible. Hence we need a system that helps in
 * communication between flights, airport vehicles, and coordinates landing,
 * take-off, etc.
 */
public class AirportMediatorClient {
	/*
	 * The client code. The client creates a mediator and all the colleagues
	 * register with the mediator. When the objects want to interact with other
	 * objects, it uses the mediator,
	 */

	public static void main(String[] args) throws InterruptedException {
		AirportTrafficController airTrafficMediator = new AirportTrafficControllerImpl();

		/* Create a runway & register with the mediator */
		airTrafficMediator.registerRunway(new Runway("RW-1", false));

		/* Create gates & register gates with the mediator */
		airTrafficMediator.registerGate(new Gate("G-1", false));
		airTrafficMediator.registerGate(new Gate("G-2", false));
		airTrafficMediator.registerGate(new Gate("G-3", false));

		/*
		 * Many flights are arriving and they want to land and take off. They just
		 * contact the mediator instead of directly communicating with individual
		 * objects.
		 */
		for (int i = 0; i < 10; i++) {
			Flight flight = new Flight(airTrafficMediator, "F-00" + (i + 1));
			flight.landAndTakeOff();
		}
	}

}
