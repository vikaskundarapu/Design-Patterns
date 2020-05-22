package behavioral.command.example1.receiverobjects;

public class MainDish implements Dish {

	private String name;

	public MainDish(String name) {
		super();
		this.name = name;
	}

	@Override
	public void order() {
		System.out.println("Main Dish (" + name + ") is ordered");
	}

	@Override
	public void cancel() {
		System.out.println("Main Dish (" + name + ") is cancelled");
	}

}
