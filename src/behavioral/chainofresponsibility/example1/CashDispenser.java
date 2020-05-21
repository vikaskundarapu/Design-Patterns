package behavioral.chainofresponsibility.example1;

import java.util.Objects;

/**
 * Create a CashDispenser class that will take the denomination as the
 * constructor argument. This class has a reference to the next CashDispenser
 * (so that a chain of dispensers can be formed).
 */
public class CashDispenser {

	/* To hold the next cash dispenser */
	private CashDispenser next;

	private int denomination;

	public CashDispenser(int denomination) {
		super();
		this.denomination = denomination;
	}

	/* Method to Chain the dispensers */
	private void setNextDispenser(CashDispenser cashDispenser) {
		if (Objects.isNull(next)) {
			next = cashDispenser;
		} else {
			next.setNextDispenser(cashDispenser);
		}
	}

	public void dispense(int amount) {

		if (amount >= denomination) {
			int numberOfBills = amount / denomination;
			int balance = amount % denomination;
			System.out.println(numberOfBills + "*" + denomination + "$");

			if (balance > 0) {
				next.dispense(balance);
			}

		} else {
			next.dispense(amount);
		}
	}

	public static CashDispenser createChainOfDispensers() {

		CashDispenser cashDispenser = new CashDispenser(100);
		cashDispenser.setNextDispenser(new CashDispenser(50));
		cashDispenser.setNextDispenser(new CashDispenser(20));
		cashDispenser.setNextDispenser(new CashDispenser(10));
		cashDispenser.setNextDispenser(new CashDispenser(5));
		cashDispenser.setNextDispenser(new CashDispenser(2));
		cashDispenser.setNextDispenser(new CashDispenser(1));

		return cashDispenser;
	}
}
