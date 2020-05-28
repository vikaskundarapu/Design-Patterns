package behavioral.strategy.example1.client;

import behavioral.strategy.example1.Item;
import behavioral.strategy.example1.Order;
import behavioral.strategy.example1.paymentstrategy.CardPayment;
import behavioral.strategy.example1.paymentstrategy.CashPayment;

/**
 * When to use: To switch out different implementations for different
 * situations. To support different variants of the algorithm.
 * 
 * Intent: Define a family of algorithms, encapsulate each one, and make them
 * interchangeable. Strategy lets the algorithm vary independently from clients
 * that use it.
 * 
 * Implementation Assume that you want to create a shopping cart application.
 * One of the requirements is to allow different types of payments.
 */
public class PaymentStrategyClient {

	public static void main(String[] args) {
		/* Create an order and add items */
		Order order = new Order();
		order.addItem(new Item("Italian Pizza", 6.99));
		order.addItem(new Item("Wine", 9.99));
		order.addItem(new Item("Beer", 5.99));
		order.addItem(new Item("Red Apple", 1.49));
		order.addItem(new Item("Almonds", 11.99));

		System.out.println("---------------------------------");
		order.totalBillAmount();
		System.out.println("---------------------------------");
		/* Create payment strategies and make payment */
		order.makePayment(new CashPayment(20.00));
		order.makePayment(new CardPayment("CREDIT", "VISA", 10.00));
		order.makePayment(new CardPayment("DEBIT", "AMEX", 10.00));
		System.out.println("---------------------------------");
	}

}
