package creational.builder.example2.client;

import creational.builder.example2.builder.BurgerBuilder;
import creational.builder.example2.product.Burger;

public class BuilderClient {
	public static void main(String[] args) {
		Burger burger = new BurgerBuilder(10).addCheese().addLettuce().addPepperoni().build();
		System.out.println(burger);
	}
}
