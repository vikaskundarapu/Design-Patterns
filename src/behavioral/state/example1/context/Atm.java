package behavioral.state.example1.context;

import behavioral.state.example1.state.AtmState;
import behavioral.state.example1.state.NoBalanceState;

/**
 * Define a "context" class to present a single interface to the outside world.
 * Maintain a pointer to the current "state" in the "context" class. To change
 * the state of the state machine, change the current "state" pointer.
 */
public class Atm {

	private AtmState currentState;
	private double balance;
	
	public Atm(){
		currentState = new NoBalanceState(this);
	}

	public AtmState getCurrentState() {
		return currentState;
	}

	public double getBalance() {
		return balance;
	}

	public void setCurrentState(AtmState currentState) {
		this.currentState = currentState;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void withdrawCash(double amount) {
		currentState.withdrawCash(amount);
	}

	public void refillCash(double amount) {
		currentState.refillCash(amount);
	}

}
