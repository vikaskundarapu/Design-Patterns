package behavioral.templatemethod.example1;

public class CheesePizza extends Pizza {

	@Override
	public void addIngredients() {
		System.out.println("|--Added Cheese Pizza ingredients");
	}

	@Override
	public void addToppings() {
		System.out.println("|--Added Cheese Pizza toppings");
	}

	@Override
	protected void cook() {
		System.out.println("|--Cooked for 10 minutes");
	}

}
