package behavioral.chainofresponsibility.example1.client;

import behavioral.chainofresponsibility.example1.CashDispenser;

/**
 * Used when a request needs to be processed by multiple processors To achieve
 * loose coupling between sender and receivers Intension is to avoid coupling
 * the sender of a request to its receiver by giving more than one object a
 * chance to handle the request. Chain the receiving objects and pass the
 * request along the chain until an object handles it.
 * 
 * Assume that you want to implement an ATM Cash Dispenser which dispenses US
 * Dollar notes in all denominations (100$, 50$, 20$, 10$, 5$, 2$, 1$). This can
 * be achieved by creating dispensers for each of the denominations and linking
 * them to form a chain of dispensers. When the amount to be withdrawn is
 * entered, the requested amount is passed to the first dispenser in the
 * dispenser chain. Once the processor completes the action, the balance amount
 * is passed to the next dispenser in the chain. This process is repeated until
 * the balance becomes 0.
 */
public class CashDispenserClient {

	public static void main(String[] args) {
		CashDispenser cashDispenser = CashDispenser.createChainOfDispensers();
		cashDispenser.dispense(635);
	}
}
