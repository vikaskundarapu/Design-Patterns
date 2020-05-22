package behavioral.command.example2.invoker;

import behavioral.command.example2.command.BulbCommand;

public class RemoteControl {

	public void executeCommand(BulbCommand command) {
		command.execute();
	}
}
