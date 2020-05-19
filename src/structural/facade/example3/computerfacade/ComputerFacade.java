package structural.facade.example3.computerfacade;

import structural.facade.example3.Computer;

public class ComputerFacade {
	private final Computer computer;

	public ComputerFacade() {
		super();
		computer = new Computer();
	}

	public void switchOn() {
		computer.checkConnections();
		computer.loadProfiles();
		computer.displayWhenReady();
	}

	public void switchOff() {
		computer.closeApps();
		computer.saveData();
		computer.cutCurrentToTerminals();
	}

}
