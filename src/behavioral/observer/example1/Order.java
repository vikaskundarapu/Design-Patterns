package behavioral.observer.example1;

import java.util.ArrayList;
import java.util.List;

import behavioral.observer.example1.observers.CashierDisplayObserver;
import behavioral.observer.example1.observers.CustomerDisplayObserver;
import behavioral.observer.example1.observers.Observer;
import behavioral.observer.example1.observers.PrintReceiptObserver;
import behavioral.observer.example1.subjects.AddItemSubject;
import behavioral.observer.example1.subjects.AddPaymentSubject;
import behavioral.observer.example1.subjects.CompleteOrderSubject;
import behavioral.observer.example1.subjects.Subject;

/**
 * The observers subscribe to various subjects(topics) in the Order class
 * constructor.
 */
public class Order {

	private final List<Item> cart = new ArrayList<>();;
	private final List<Payment> payments = new ArrayList<>();;

	private final Subject addItemSubject;
	private final Subject addPaymentSubject;
	private final Subject completeOrderSubject;

	public Order() {
		super();

		// create subjects (events)
		addItemSubject = new AddItemSubject();
		addPaymentSubject = new AddPaymentSubject();
		completeOrderSubject = new CompleteOrderSubject();

		// create observers
		Observer customerDisplayObserver = new CustomerDisplayObserver();
		Observer cashierDisplayObserver = new CashierDisplayObserver();
		Observer printReceiptObserver = new PrintReceiptObserver();

		// Cashier display subscribed to all subjects
		addItemSubject.register(customerDisplayObserver);
		addPaymentSubject.register(customerDisplayObserver);
		completeOrderSubject.register(customerDisplayObserver);

		// Customer display subscribed to all topics
		addItemSubject.register(cashierDisplayObserver);
		addPaymentSubject.register(cashierDisplayObserver);
		completeOrderSubject.register(cashierDisplayObserver);

		// Print receipt subscribed to
		completeOrderSubject.register(printReceiptObserver);
	}

	public void addItem(Item item) {
		cart.add(item);
		String update = item.getName() + " $" + item.getPrice();
		addItemSubject.notifyObservers(update);
	}

	public void makePayment(Payment payment) {
		payments.add(payment);
		String update = payment.getType() + " $" + payment.getAmount();
		addPaymentSubject.notifyObservers(update);
	}

	public void ordercompleted() {
		String update = "Thanks for shopping with us. Order has been completed!";
		completeOrderSubject.notifyObservers(update);
	}
}
