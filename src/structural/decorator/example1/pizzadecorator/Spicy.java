package structural.decorator.example1.pizzadecorator;

import structural.decorator.example1.pizza.Item;

public class Spicy extends PizzaDecorator {

	public Spicy(Item pizza) {
		super(pizza);
	}

	@Override
	public void prepare() {
		super.prepare();
		System.out.print(" + Spicy");
	}
}
