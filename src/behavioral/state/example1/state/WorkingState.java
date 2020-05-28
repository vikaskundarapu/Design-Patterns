package behavioral.state.example1.state;

import behavioral.state.example1.context.Atm;

/*
 * If the amount to be withdrawn is greater than the available balance, we will
 * dispense the amount available for simplicity and print
 */
public class WorkingState implements AtmState {

	private Atm atm;

	public WorkingState(Atm atm) {
		this.atm = atm;
	}

	@Override
	public void withdrawCash(double amount) {
		double balance = atm.getBalance();

		if (amount > balance) {
			// Insufficient fund.  Dispense the available cash
			amount = balance;
			System.out.print("Partial amount ");
		}

		System.out.println(amount + "$ is dispensed");
		double newBalance = balance - amount;
		atm.setBalance(newBalance);

		if (newBalance == 0)
			atm.setCurrentState(new NoBalanceState(atm));

	}

	@Override
	public void refillCash(double amount) {
		System.out.println(amount + "$ is loaded");
		atm.setBalance(atm.getBalance() + amount);
	}

}
