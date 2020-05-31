package behavioral.templatemethod.example1;

public abstract class Pizza {

	public final void preparePizza() {
		selectCrust();
		addIngredients();
		addToppings();
		cook();
	}

	protected void cook() {
		System.out.println("|--Cooked for 5 minutes");
	}

	protected void selectCrust() {
		System.out.println("|--Selected default Crust");
	}

	public abstract void addIngredients();

	public abstract void addToppings();

}
