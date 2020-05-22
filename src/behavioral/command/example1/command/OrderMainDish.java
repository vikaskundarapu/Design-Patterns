package behavioral.command.example1.command;

import behavioral.command.example1.receiverobjects.Dish;

public class OrderMainDish implements Command {

	private Dish dish;

	public OrderMainDish(Dish mainDish) {
		this.dish = mainDish;
	}

	@Override
	public void execute() {
		dish.order();
	}

}
