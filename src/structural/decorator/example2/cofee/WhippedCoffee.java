package structural.decorator.example2.cofee;

public class WhippedCoffee implements Coffee {

	private Coffee simpleCoffee;

	public WhippedCoffee(Coffee simpleCoffee) {
		this.simpleCoffee = simpleCoffee;
	}


	@Override
	public String getDescription() {
		return simpleCoffee.getDescription() + ", Creamy whip";
	}

	@Override
	public double getCost() {
		return simpleCoffee.getCost() + 8;
	}

}
