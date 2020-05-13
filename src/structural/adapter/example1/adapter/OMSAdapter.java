package structural.adapter.example1.adapter;

import structural.adapter.example1.newsystem.NewOmsImpl;
import structural.adapter.example1.order.Item;
import structural.adapter.example1.order.Payment;
import structural.adapter.example1.target.NewOms;

public class OMSAdapter {
	private final NewOms newOms = new NewOmsImpl();

	public void addItem(Item item) {
		newOms.addToBasket(item);
	}

	public void makePayment(Payment payment) {
		newOms.proceedToPay(payment);
	}
}
