package behavioral.observer.example1.subjects;

import behavioral.observer.example1.observers.Observer;

/**
 * Create an interface for the subject and its concrete implementations. These
 * subjects contain lists to keep track of subscribed observers that need to be
 * notified.
 * 
 */
public interface Subject {
	public void register(Observer observer);

	public void notifyObservers(String update);
}
