package structural.decorator.example1.client;

import structural.decorator.example1.pizza.Item;
import structural.decorator.example1.pizza.Pizza;
import structural.decorator.example1.pizzadecorator.DeepFriedPizza;
import structural.decorator.example1.pizzadecorator.DoubleCheeseBurst;
import structural.decorator.example1.pizzadecorator.Spicy;

/**
 * Used to dynamically change the functionality of an object at runtime without
 * impacting the existing functionality of the objects. Used to add
 * functionalities that may be withdrawn later. Used to combine multiple
 * functionalities where it is impractical to create a subclass for every
 * possible combination. Intent is to attach additional responsibilities to an
 * object dynamically. Decorators provide a flexible alternative to sub-classing
 * for extending functionality.
 * 
 * Problem Assume that you need to prepare a pizza that may have multiple
 * combinations of toppings, cooking type, etc. Though this can be achieved by
 * Inheritance, it is not practical to create subclasses for every possible
 * combination. Alternatively, you can use Composition and add the required
 * functionalities. Since all concrete implementations conform to the same
 * interface, we can mix and match any number of classes to create a variety of
 * combinations.
 * 
 */
public class PizzaClient {

	public static void main(String[] args) {
		Item pizza = new Pizza();
		Item deepFriedPizza = new DeepFriedPizza(pizza);
		Item doubleCheeseBurstDeepFriedPizza = new DoubleCheeseBurst(new DeepFriedPizza(pizza));
		Item spicyDeepFriedPizza = new Spicy(new DeepFriedPizza(pizza));

		deepFriedPizza.prepare();
		System.out.println();
		doubleCheeseBurstDeepFriedPizza.prepare();
		System.out.println();
		spicyDeepFriedPizza.prepare();

	}

}
