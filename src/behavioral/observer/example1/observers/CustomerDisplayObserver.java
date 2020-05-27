package behavioral.observer.example1.observers;

public class CustomerDisplayObserver implements Observer {

	@Override
	public void update(String update) {
		System.out.println("[CustomerDisplay] " + update);
	}

}
