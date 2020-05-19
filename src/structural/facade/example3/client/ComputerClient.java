package structural.facade.example3.client;

import structural.facade.example3.computerfacade.ComputerFacade;

public class ComputerClient {

	public static void main(String[] args) {
		ComputerFacade computerFacade = new ComputerFacade();
		computerFacade.switchOn();
		System.out.println("------------------------------------------------");
		computerFacade.switchOff();
	}

}
