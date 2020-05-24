package behavioral.mediator.example1.mediator;

import behavioral.mediator.example1.colleague.Flight;
import behavioral.mediator.example1.model.Gate;
import behavioral.mediator.example1.model.Runway;

public interface AirportTrafficController {

	public void registerGate(Gate gate);

	public void registerRunway(Runway runway);

	public boolean getLandingPermission(Flight flight);

	public boolean getTakeOffPermission(Flight flight);

	public void enterRunway(Runway runway);

	public void exitRunway(Runway runway);

	public void enterGate(Gate gate);

	public void exitGate(Gate gate);
}
