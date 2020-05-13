package structural.adapter.example1.newsystem;

import java.util.ArrayList;
import java.util.List;

import structural.adapter.example1.order.Item;
import structural.adapter.example1.order.Payment;
import structural.adapter.example1.target.NewOms;

/**
 * The new payment will shown using JSON. If we look closely the method calls
 * are different than the old system
 */
public class NewOmsImpl implements NewOms {

	List<Item> cart = new ArrayList<>();
	List<Payment> payment = new ArrayList<>();

	@Override
	public void addToBasket(Item itemJson) {
		cart.add(itemJson);
	}

	@Override
	public void proceedToPay(Payment paymentJson) {
		payment.add(paymentJson);
		paymentJson.pay();
	}

}
