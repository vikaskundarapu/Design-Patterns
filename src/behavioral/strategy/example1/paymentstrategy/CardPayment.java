package behavioral.strategy.example1.paymentstrategy;

public class CardPayment implements PaymentStrategy {

	private String cardType;
	private String issuer;
	private double amount;

	public CardPayment(String cardType, String issuer, double amount) {
		super();
		this.cardType = cardType;
		this.issuer = issuer;
		this.amount = amount;
	}

	@Override
	public void pay() {
		System.out.println(issuer + " " + cardType + " " + amount + "$");
	}

}
