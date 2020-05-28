package behavioral.strategy.example1.paymentstrategy;

public class CashPayment implements PaymentStrategy {
	private double amount;

	public CashPayment(double amount) {
		this.amount = amount;
	}

	@Override
	public void pay() {
		System.out.println("Cash " + amount + "$");
	}

}
