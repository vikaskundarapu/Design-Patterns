package behavioral.observer.example1.observers;

public class CashierDisplayObserver implements Observer {

	@Override
	public void update(String update) {
		System.out.println("[CashierDisplay] " + update);
	}

}
