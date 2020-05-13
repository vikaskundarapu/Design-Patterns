package structural.adapter.example1.client;

import structural.adapter.example1.adapter.OMSAdapter;
import structural.adapter.example1.oldsystem.LegacyOmsImpl;
import structural.adapter.example1.order.Item;
import structural.adapter.example1.order.Payment;
import structural.adapter.example1.target.LegacyOms;

/**
 * 
 * Assume that you have an e-commerce application which is serving your
 * customers for a long time. This e-commerce application is using a Legacy
 * Order Management System (OMS). Due to the high maintenance cost and degraded
 * performance of the legacy OMS software, you have decided to use a cheap and
 * efficient OMS software which is readily available in the market. However, you
 * realize that the interfaces are different in the new software and it requires
 * a lot of code change in the existing e-commerce application.
 * 
 * Adapter design pattern can be very useful in these situations. Instead of
 * modifying your e-commerce application to use the new interfaces, you can
 * write a 'wrapper' class that acts as a bridge between your e-commerce
 * application and the new OMS software. With this approach, the e-commerce
 * application can still use the old interface.
 * 
 * Adapter design pattern can be implemented in two ways. One using the
 * inheritance method (Class Adapter) and second using the composition (Object
 * Adapter). The following example depicts the implementation of Object adapter.
 * 
 */
public class AdapterClient {

	public static void previousPaymentTechnique() {
		/* Previously we used create an order and add items */

		LegacyOms oms = new LegacyOmsImpl();

		oms.addItem(new Item("Italian Pizza", 6.99));
		oms.addItem(new Item("Wine", 9.99));
		oms.addItem(new Item("Beer", 5.99));
		oms.addItem(new Item("Red Apple", 1.49));
		oms.addItem(new Item("Almonds", 11.99));

		System.out.println("---------------------------------");
		/* Create payment and make payment */
		oms.makePayment(new Payment("CASH", 20.00));
		oms.makePayment(new Payment("CREDIT", 10.00));
		oms.makePayment(new Payment("DEBIT", 10.00));
		System.out.println("---------------------------------");
	}

	public static void currentPaymentTechnique() {
		/* Previously we used create an order and add items */

		OMSAdapter oms = new OMSAdapter();

		oms.addItem(new Item("Italian Pizza", 6.99));
		oms.addItem(new Item("Wine", 9.99));
		oms.addItem(new Item("Beer", 5.99));
		oms.addItem(new Item("Red Apple", 1.49));
		oms.addItem(new Item("Almonds", 11.99));

		System.out.println("---------------------------------");
		/* Create payment and make payment */
		oms.makePayment(new Payment("CASH", 20.00));
		oms.makePayment(new Payment("CREDIT", 10.00));
		oms.makePayment(new Payment("DEBIT", 10.00));
		System.out.println("---------------------------------");
	}

	public static void main(String[] args) {
		previousPaymentTechnique();
		currentPaymentTechnique();
	}

}
