package structural.decorator.example1.pizzadecorator;

import structural.decorator.example1.pizza.Item;

public class DeepFriedPizza extends PizzaDecorator {

	public DeepFriedPizza(Item pizza) {
		super(pizza);
	}

	@Override
	public void prepare() {
		super.prepare();
		System.out.print("+ Deep fried");
	}

}
