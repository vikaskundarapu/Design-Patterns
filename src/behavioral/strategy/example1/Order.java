package behavioral.strategy.example1;

import java.util.ArrayList;
import java.util.List;

import behavioral.strategy.example1.paymentstrategy.PaymentStrategy;

public class Order {

	private final List<Item> cart = new ArrayList<>();
	private final List<PaymentStrategy> payments = new ArrayList<>();

	private final String FORMAT = "%-20s %s";

	public void addItem(Item item) {
		cart.add(item);
		System.out.println(String.format(FORMAT, item.getName(), item.getPrice()));
	}

	public void totalBillAmount() {
		Double billAmount = cart.stream().map(Item::getPrice).reduce(0.0, Double::sum);
		System.out.println(String.format(FORMAT, "Total Bill", billAmount));
	}

	public void makePayment(PaymentStrategy paymentStrategy) {
		payments.add(paymentStrategy);
		paymentStrategy.pay();
	}

}
