package creational.builder.example2.builder;

import creational.builder.example2.product.Burger;

/**
 * Imagine you are at Hardee's and you order a specific deal, lets say, "Big
 * Hardee" and they hand it over to you without any questions; this is the
 * example of simple factory. But there are cases when the creation logic might
 * involve more steps. For example you want a customized Subway deal, you have
 * several options in how your burger is made e.g what bread do you want? what
 * types of sauces would you like? What cheese would you want? etc. In such
 * cases builder pattern comes to the rescue.
 * 
 * In plain words, it allows you to create different flavors of an object while
 * avoiding constructor pollution. Useful when there could be several flavors of
 * an object. Or when there are a lot of steps involved in creation of an
 * object.
 * 
 * The builder pattern is an object creation software design pattern with the
 * intentions of finding a solution to the telescoping constructor anti-pattern.
 * The number of constructor parameters can quickly get out of hand and it might
 * become difficult to understand the arrangement of parameters. Plus this
 * parameter list could keep on growing if you would want to add more options in
 * future. This is called telescoping constructor anti-pattern.
 * 
 * 
 * When to use?
 * 
 * When there could be several flavors of an object and to avoid the constructor
 * telescoping. The key difference from the factory pattern is that; factory
 * pattern is to be used when the creation is a one step process while builder
 * pattern is to be used when the creation is a multi step process.
 * 
 * 
 */
public class BurgerBuilder {

	private int size;

	private boolean isCheeseNeeded = false;
	private boolean isPepperoniNeeded = false;
	private boolean isTomatoNeeded = false;
	private boolean isLettuceNeeded = false;

	public BurgerBuilder(int size) {
		this.size = size;
	}

	public boolean isCheeseNeeded() {
		return isCheeseNeeded;
	}

	public boolean isPepperoniNeeded() {
		return isPepperoniNeeded;
	}

	public boolean isTomatoNeeded() {
		return isTomatoNeeded;
	}

	public boolean isLettuceNeeded() {
		return isLettuceNeeded;
	}

	public BurgerBuilder addCheese() {
		this.isCheeseNeeded = true;
		return this;
	}

	public BurgerBuilder addPepperoni() {
		this.isPepperoniNeeded = true;
		return this;
	}

	public BurgerBuilder addTomato() {
		this.isTomatoNeeded = true;
		return this;
	}

	public BurgerBuilder addLettuce() {
		this.isLettuceNeeded = true;
		return this;
	}

	public Burger build() {
		return new Burger(this);
	}
}
