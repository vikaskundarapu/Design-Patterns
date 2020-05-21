package behavioral.chainofresponsibility.example2.exception;

public class InsufficientBalanceException extends Exception {

	public InsufficientBalanceException() {
		super();
		System.out.println("Alert!!! None of the accounts have sufficient balance.");
	}

}
