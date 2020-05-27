package behavioral.observer.example1.subjects;

import java.util.ArrayList;
import java.util.List;

import behavioral.observer.example1.observers.Observer;

public class AddItemSubject implements Subject {

	private List<Observer> addItemObservers = new ArrayList<>();

	@Override
	public void register(Observer observer) {
		addItemObservers.add(observer);
	}

	@Override
	public void notifyObservers(String update) {
		addItemObservers.stream().forEach((Observer observer) -> observer.update(update));
	}

}
