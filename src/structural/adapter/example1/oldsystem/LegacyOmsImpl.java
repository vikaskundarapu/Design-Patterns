package structural.adapter.example1.oldsystem;

import java.util.ArrayList;
import java.util.List;

import structural.adapter.example1.order.Item;
import structural.adapter.example1.order.Payment;
import structural.adapter.example1.target.LegacyOms;

/**
 * The old payment was shown using xml
 */
public class LegacyOmsImpl implements LegacyOms {

	List<Item> cart = new ArrayList<>();
	List<Payment> payment = new ArrayList<>();

	@Override
	public void addItem(Item itemXml) {
		cart.add(itemXml);
	}

	@Override
	public void makePayment(Payment paymentXml) {
		payment.add(paymentXml);
		paymentXml.pay();
	}

}
