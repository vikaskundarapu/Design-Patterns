package behavioral.templatemethod.example1;

public class MeatPizza extends Pizza {

	@Override
	public void addIngredients() {
		System.out.println("|--Added Meat Pizza ingredients");
	}

	@Override
	public void addToppings() {
		System.out.println("|--Added Meat Pizza toppings");
	}

	@Override
	protected void cook() {
		System.out.println("|--Cooked for 15 minutes");
	}

}
