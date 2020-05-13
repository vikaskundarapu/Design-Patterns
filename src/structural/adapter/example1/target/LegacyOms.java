package structural.adapter.example1.target;

import structural.adapter.example1.order.Item;
import structural.adapter.example1.order.Payment;

public interface LegacyOms {
	public void addItem(Item item);
	public void makePayment(Payment payment);
}
