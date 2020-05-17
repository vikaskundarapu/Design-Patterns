package structural.decorator.example1.pizzadecorator;

import structural.decorator.example1.pizza.Item;

public abstract class PizzaDecorator implements Item {

	private Item pizza;

	public PizzaDecorator(Item pizza) {
		super();
		this.pizza = pizza;
	}

	@Override
	public void prepare() {
		pizza.prepare();
	}

}
