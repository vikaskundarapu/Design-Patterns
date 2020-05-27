package behavioral.observer.example1;

public class Payment {

	private final String type;
	private final double amount;

	public Payment(String type, double amount) {
		super();
		this.type = type;
		this.amount = amount;
	}

	public String getType() {
		return type;
	}

	public double getAmount() {
		return amount;
	}

}
