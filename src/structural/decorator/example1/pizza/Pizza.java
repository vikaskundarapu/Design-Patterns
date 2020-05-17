package structural.decorator.example1.pizza;

public class Pizza implements Item {

	@Override
	public void prepare() {
		System.out.print("Pizza ");
	}

}
