package behavioral.observer.example1.observers;

public class PrintReceiptObserver implements Observer {

	@Override
	public void update(String update) {
		System.out.println("[PrintReceiptObserver] " + update);
	}

}
