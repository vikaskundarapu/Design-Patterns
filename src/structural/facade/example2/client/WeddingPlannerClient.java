package structural.facade.example2.client;

import structural.facade.example2.facade.WeddingPlanner;

/**
 * 
 * Used to provide a simplified interface to the overall functionality of a
 * complex subsystem. To promote subsystem independence and portability. Intent
 * is to provide a unified interface to a set of interfaces in a subsystem.
 * Facade defines a higher-level interface that makes the subsystem easier to
 * use. Assume that we have a set of interfaces for a system that includes many
 * subsystems. The client application can use these interfaces to perform the
 * required operation. But when the complexity increases, the client application
 * will find it difficult to manage it. By using the Facade pattern, we can hide
 * the complexities of the system and provide an interface to the client using
 * which the client can access the system.
 * 
 * A typical example of the Facade pattern is the wedding planner who hides from
 * you the complexity of a large subsystem. The wedding planner orders flowers,
 * makes reservations, organizes everything for you.
 */
public class WeddingPlannerClient {

	public static void main(String[] args) {
		WeddingPlanner planner = new WeddingPlanner();
		planner.planWedding();
	}

}
