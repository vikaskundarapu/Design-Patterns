package structural.adapter.example1.order;

public class Payment {

	private final String type;
	private final double amount;

	public Payment(String type, double amount) {
		super();
		this.type = type;
		this.amount = amount;
	}

	public void pay() {
		System.out.println("Payment of $" + amount + " is done using " + type);
	}
}
