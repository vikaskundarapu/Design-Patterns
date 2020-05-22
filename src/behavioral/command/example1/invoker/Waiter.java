package behavioral.command.example1.invoker;

import behavioral.command.example1.command.Command;

public class Waiter {

	/*
	 * Waiter does not need to know about    * the details of the command   
	 */
	public void execute(Command command) {
		command.execute();
	}

}
