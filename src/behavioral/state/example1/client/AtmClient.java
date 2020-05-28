package behavioral.state.example1.client;

import behavioral.state.example1.context.Atm;

/**
 * When to use: To encapsulate varying behavior for the same object based on its
 * internal state. To have the ability to change the behavior at run time.
 * 
 * Intent: Allow an object to alter its behavior when its internal state
 * changes. The object will appear to change its class.
 * 
 * Implementation: Consider the ATM scenario. The ATM can be in various
 * states/modes like working, no cash, error, etc. When the customer interacts
 * with the ATM, it should respond based on the current state. For example, when
 * the ATM is in "No Cash" or "Error" state, the withdrawal should not be
 * allowed. Typically, conditional statements are used to implement this kind of
 * behavior. Also the same conditional statements may have to be repeated in
 * different functions to support the possible interactions. This makes the code
 * fragile and supporting a new state/operation may become difficult.
 * 
 * State pattern can be used here to simplify the design. For e.g, when a new
 * ATM state needs to be added, it can be done easily by adding a new state. The
 * other classes will remain unchanged.
 */
public class AtmClient {

	public static void main(String[] args) {
		Atm atm = new Atm();
		atm.refillCash(100);
		atm.withdrawCash(50);
		atm.withdrawCash(30);
		atm.withdrawCash(30); // overdraft
		atm.withdrawCash(20); // overdraft
		atm.refillCash(50);
		atm.withdrawCash(50);
	}

}
