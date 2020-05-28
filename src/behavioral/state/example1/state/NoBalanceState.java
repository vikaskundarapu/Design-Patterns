package behavioral.state.example1.state;

import behavioral.state.example1.context.Atm;

public class NoBalanceState implements AtmState {

	private Atm atm;

	public NoBalanceState(Atm atm) {
		this.atm = atm;
	}

	@Override
	public void withdrawCash(double amount) {
		System.out.println("Out of cash");
	}

	@Override
	public void refillCash(double amount) {
		System.out.println(amount + "$ is loaded");
		atm.setCurrentState(new WorkingState(atm));
		atm.setBalance(atm.getBalance() + amount);
	}

}
