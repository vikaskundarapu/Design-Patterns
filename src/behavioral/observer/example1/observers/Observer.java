package behavioral.observer.example1.observers;

/**
 * Create an observer interface and its concrete implementations. These
 * observers subscribe to specific topics(subjects) so that it can display the
 * updates.
 */
public interface Observer {

	public void update(String update);

}
