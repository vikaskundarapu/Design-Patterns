package creational.builder.example2.product;

import creational.builder.example2.builder.BurgerBuilder;

public class Burger {

	private int size;

	private boolean isCheeseNeeded = false;
	private boolean isPepperoniNeeded = false;
	private boolean isTomatoNeeded = false;
	private boolean isLettuceNeeded = false;

	public Burger(BurgerBuilder builder) {
		this.isCheeseNeeded = builder.isCheeseNeeded();
		this.isPepperoniNeeded = builder.isPepperoniNeeded();
		this.isTomatoNeeded = builder.isTomatoNeeded();
		this.isLettuceNeeded = builder.isLettuceNeeded();
	}

	@Override
	public String toString() {
		return "Burger [size=" + size + ", isCheeseNeeded=" + isCheeseNeeded + ", isPepperoniNeeded="
				+ isPepperoniNeeded + ", isTomatoNeeded=" + isTomatoNeeded + ", isLettuceNeeded=" + isLettuceNeeded
				+ "]";
	}

}
