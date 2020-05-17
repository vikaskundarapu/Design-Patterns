package structural.decorator.example2.client;

import structural.decorator.example2.cofee.Coffee;
import structural.decorator.example2.cofee.MilkCoffee;
import structural.decorator.example2.cofee.SimpleCoffee;
import structural.decorator.example2.cofee.VanillaCoffee;
import structural.decorator.example2.cofee.WhippedCoffee;

public class CoffeeClient {

	public static void main(String[] args) {
		Coffee simpleCoffee = new SimpleCoffee();
		System.out.println(simpleCoffee.getDescription());
		System.out.println(simpleCoffee.getCost());
		System.out.println();

		Coffee milkCoffee = new MilkCoffee(simpleCoffee);
		System.out.println(milkCoffee.getDescription());
		System.out.println(milkCoffee.getCost());
		System.out.println();

		Coffee whippedCoffee = new WhippedCoffee(simpleCoffee);
		System.out.println(whippedCoffee.getDescription());
		System.out.println(whippedCoffee.getCost());
		System.out.println();

		Coffee whippedVanillaCoffee = new VanillaCoffee(whippedCoffee);
		System.out.println(whippedVanillaCoffee.getDescription());
		System.out.println(whippedVanillaCoffee.getCost());
	}
}
