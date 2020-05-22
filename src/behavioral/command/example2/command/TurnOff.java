package behavioral.command.example2.command;

import behavioral.command.example2.receiver.Bulb;

public class TurnOff implements BulbCommand {

	private Bulb bulb;

	public TurnOff(Bulb bulb) {
		this.bulb = bulb;
	}

	@Override
	public void execute() {
		this.bulb.turnOff();
	}

	@Override
	public void undo() {
		this.bulb.turnOn();
	}

	@Override
	public void redo() {
		this.execute();
	}

}
