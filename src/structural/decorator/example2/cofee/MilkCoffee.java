package structural.decorator.example2.cofee;

public class MilkCoffee implements Coffee {

	private Coffee simpleCoffee;

	public MilkCoffee(Coffee simpleCoffee) {
		this.simpleCoffee = simpleCoffee;
	}

	@Override
	public String getDescription() {
		return simpleCoffee.getDescription() + ", Milk";
	}

	@Override
	public double getCost() {
		return simpleCoffee.getCost() + 2;
	}

}
