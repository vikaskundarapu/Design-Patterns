package behavioral.command.example1.command;

import behavioral.command.example1.receiverobjects.Dish;

public class CancelMainDish implements Command {
	private Dish dish;

	public CancelMainDish(Dish mainDish) {
		this.dish = mainDish;
	}

	@Override
	public void execute() {
		dish.cancel();
	}

}
