package behavioral.observer.example1.subjects;

import java.util.ArrayList;
import java.util.List;

import behavioral.observer.example1.observers.Observer;

public class AddPaymentSubject implements Subject {

	private List<Observer> addPaymentObservers = new ArrayList<>();

	@Override
	public void register(Observer observer) {
		addPaymentObservers.add(observer);
	}

	@Override
	public void notifyObservers(String update) {
		addPaymentObservers.stream().forEach((Observer observer) -> observer.update(update));
	}

}
