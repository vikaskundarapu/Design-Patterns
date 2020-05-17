package structural.decorator.example1.pizzadecorator;

import structural.decorator.example1.pizza.Item;

public class DoubleCheeseBurst extends PizzaDecorator {

	public DoubleCheeseBurst(Item pizza) {
		super(pizza);
	}

	@Override
	public void prepare() {
		super.prepare();
		System.out.print(" + Double Cheese burst");
	}
}
