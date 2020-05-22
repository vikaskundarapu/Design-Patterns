package behavioral.command.example1.command;

import behavioral.command.example1.receiverobjects.Dish;

public class OrderDessert implements Command {

	private Dish dish;

	public OrderDessert(Dish dessert) {
		this.dish = dessert;
	}

	@Override
	public void execute() {
		dish.order();
	}

}
