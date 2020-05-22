package behavioral.command.example1.command;

import behavioral.command.example1.receiverobjects.Dish;

public class CancelDessert implements Command {

	private Dish dish;

	public CancelDessert(Dish dessert) {
		this.dish = dessert;
	}

	@Override
	public void execute() {
		dish.cancel();
	}
}
