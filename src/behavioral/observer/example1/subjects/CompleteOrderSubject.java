package behavioral.observer.example1.subjects;

import java.util.ArrayList;
import java.util.List;

import behavioral.observer.example1.observers.Observer;

public class CompleteOrderSubject implements Subject {

	private List<Observer> completeOrderObservers = new ArrayList<>();

	@Override
	public void register(Observer observer) {
		completeOrderObservers.add(observer);
	}

	@Override
	public void notifyObservers(String update) {
		completeOrderObservers.stream().forEach((Observer observer) -> observer.update(update));
	}

}
