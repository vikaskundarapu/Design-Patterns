package behavioral.chainofresponsibility.example2.client;

import behavioral.chainofresponsibility.example2.account.Account;
import behavioral.chainofresponsibility.example2.account.Bank;
import behavioral.chainofresponsibility.example2.account.Bitcoin;
import behavioral.chainofresponsibility.example2.account.Paypal;
import behavioral.chainofresponsibility.example2.exception.InsufficientBalanceException;

/**
 * Real world example: For example, you have three payment methods (A, B and C)
 * setup in your account; each having a different amount in it. A has 100 USD, B
 * has 300 USD and C having 1000 USD and the preference for payments is chosen
 * as A then B then C. You try to purchase something that is worth 210 USD.
 * Using Chain of Responsibility, first of all account A will be checked if it
 * can make the purchase, if yes purchase will be made and the chain will be
 * broken. If not, request will move forward to account B checking for amount if
 * yes chain will be broken otherwise the request will keep forwarding till it
 * finds the suitable handler. Here A, B and C are links of the chain and the
 * whole phenomenon is Chain of Responsibility.
 * 
 * In plain words: It helps building a chain of objects. Request enters from one
 * end and keeps going from object to object till it finds the suitable handler.
 * 
 * Wikipedia says:In object-oriented design, the chain-of-responsibility pattern
 * is a design pattern consisting of a source of command objects and a series of
 * processing objects. Each processing object contains logic that defines the
 * types of command objects that it can handle; the rest are passed to the next
 * processing object in the chain.
 */
public class PaymentClient {

	public static void main(String[] args) throws InsufficientBalanceException {

		/*
		 * Let's prepare a chain like below: $bank->$paypal->$bitcoin First check
		 * priority bank. If bank can't pay then use paypal. If paypal can't pay then
		 * use bit coin. If none have the amount throw an exception
		 */

		Account bank = new Bank(200);
		Account paypal = new Paypal(300);
		Account bitcoin = new Bitcoin(1000);

		bank.setNext(paypal);
		paypal.setNext(bitcoin);

		bank.pay(5110);
	}

}
