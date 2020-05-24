package behavioral.mediator.example1.mediator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import behavioral.mediator.example1.colleague.Flight;
import behavioral.mediator.example1.model.Gate;
import behavioral.mediator.example1.model.Runway;

/*Create a mediator object which will enable communication between the participating objects.*/
public class AirportTrafficControllerImpl implements AirportTrafficController {

	private Runway runway;

	private List<Gate> gates;

	public AirportTrafficControllerImpl() {
		gates = new ArrayList<>();
	}

	@Override
	public void registerGate(Gate gate) {
		gates.add(gate);
	}

	@Override
	public void registerRunway(Runway runway) {
		this.runway = runway;
	}

	@Override
	public boolean getTakeOffPermission(Flight flight) {
		return !runway.isInUse();
	}

	@Override
	public boolean getLandingPermission(Flight flight) {
		/* Check if the runway is free */
		if (!runway.isInUse()) {
			for (Gate gate : gates) {
				/* Find an available gate */
				if (!gate.isInUse()) {

					/* reserve the gate and runway */
					flight.allocateRunway(runway);
					flight.allocateGate(gate);

					return true;
				}
			}
			System.out.println("[ATC Mediator] All gates in use");
		}

		System.out.println("[ATC Mediator] Runway in use");
		return false;
	}

	@Override
	public void enterRunway(Runway runway) {
		runway.setInUse(true);
	}

	@Override
	public void exitRunway(Runway runway) {
		runway.setInUse(false);
	}

	@Override
	public void enterGate(Gate gate) {
		gate.setInUse(true);
	}

	@Override
	public void exitGate(Gate gate) {
		gate.setInUse(false);
	}

}
