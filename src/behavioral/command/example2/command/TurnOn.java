package behavioral.command.example2.command;

import behavioral.command.example2.receiver.Bulb;

public class TurnOn implements BulbCommand {

	private Bulb bulb;

	public TurnOn(Bulb bulb) {
		this.bulb = bulb;
	}

	@Override
	public void execute() {
		this.bulb.turnOn();
	}

	@Override
	public void undo() {
		this.bulb.turnOff();
	}

	@Override
	public void redo() {
		this.execute();
	}

}
