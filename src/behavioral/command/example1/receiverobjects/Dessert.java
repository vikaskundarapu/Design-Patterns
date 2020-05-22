package behavioral.command.example1.receiverobjects;

public class Dessert implements Dish {
	private String name;

	public Dessert(String name) {
		super();
		this.name = name;
	}

	@Override
	public void order() {
		System.out.println("Dessert (" + name + ") is ordered");
	}

	@Override
	public void cancel() {
		System.out.println("Dessert (" + name + ") is cancelled");
	}

}
