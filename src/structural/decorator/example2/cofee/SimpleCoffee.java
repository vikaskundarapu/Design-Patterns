package structural.decorator.example2.cofee;

public class SimpleCoffee implements Coffee {

	@Override
	public String getDescription() {
		return "Simple coffee";
	}

	@Override
	public double getCost() {
		return 10;
	}

}
