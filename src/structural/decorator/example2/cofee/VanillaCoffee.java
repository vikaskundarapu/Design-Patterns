package structural.decorator.example2.cofee;

public class VanillaCoffee implements Coffee {

	private Coffee simpleCoffee;

	public VanillaCoffee(Coffee simpleCoffee) {
		this.simpleCoffee = simpleCoffee;
	}

	@Override
	public String getDescription() {
		return simpleCoffee.getDescription() + ", Vanilla";
	}

	@Override
	public double getCost() {
		return simpleCoffee.getCost() + 5;
	}

}
