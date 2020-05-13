package structural.adapter.example1.target;

import structural.adapter.example1.order.Item;
import structural.adapter.example1.order.Payment;

public interface NewOms {
	public void addToBasket(Item item);

	public void proceedToPay(Payment payment);
}
