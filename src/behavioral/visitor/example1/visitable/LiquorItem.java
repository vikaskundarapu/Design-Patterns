package behavioral.visitor.example1.visitable;

import behavioral.visitor.example1.visitor.Visitor;

public class LiquorItem implements Visitable {

	private final String name;
	private final int id;
	private double price;

	public LiquorItem(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public void apply(Visitor visitor) {
		visitor.visit(this);
	}

}
