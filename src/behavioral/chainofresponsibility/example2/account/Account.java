package behavioral.chainofresponsibility.example2.account;

import java.util.Objects;

import behavioral.chainofresponsibility.example2.exception.InsufficientBalanceException;

public abstract class Account {
	private Account next;
	protected double balance;

	public void setNext(Account account) {
		next = account;
	}

	public void pay(double amount) throws InsufficientBalanceException {
		if (hasBalance(amount)) {
			System.out.println(String.format("Paid $%s using %s", amount, this.getClass().getSimpleName()));
		} else if (Objects.nonNull(next)) {
			System.out.println(String.format("Cannot pay $%s using %s. Checking other options...", amount, this.getClass().getSimpleName()));
			next.pay(amount);
		}else {
			throw new InsufficientBalanceException();
		}
	}

	private boolean hasBalance(double amount) {
		return this.balance >= amount;
	}
}
