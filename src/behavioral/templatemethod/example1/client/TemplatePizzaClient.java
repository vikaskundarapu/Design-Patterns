package behavioral.templatemethod.example1.client;

import behavioral.templatemethod.example1.CheesePizza;
import behavioral.templatemethod.example1.MeatPizza;
import behavioral.templatemethod.example1.Pizza;

/**
 * When to use: To define a skeleton of an algorithm or an operation. Allow the
 * sub-classes to re-define part of the logic.
 * 
 * Intent: Define the skeleton of an algorithm in an operation, deferring some
 * steps to subclasses. Template Method lets subclasses redefine certain steps
 * of an algorithm without changing the algorithm's structure.
 * 
 * Components: An abstract class that defines the template method (public
 * final). Concrete implementations that override the steps defined in the above
 * template method Structure
 * 
 * Implementation: Assume that you want to have a standard procedure to cook
 * pizza and you do not want the subclasses to change this procedure. This can
 * be implemented with the help of a template method that defines the skeleton
 * of the algorithm. You can create subclasses that redefine certain steps in
 * the algorithm.
 */
public class TemplatePizzaClient {

	public static void main(String[] args) {
		System.out.println("Preparing a Meat Pizza");
		Pizza meatPizza = new MeatPizza();
		meatPizza.preparePizza();
		System.out.println("");
		
		System.out.println("Preparing a Cheese Pizza");
		Pizza cheesePizza = new CheesePizza();
		cheesePizza.preparePizza();
	}

}
