package creational.singleton.product;

/**
 * Thread Safe Singleton: The easier way to create a thread-safe singleton class
 * is to make the global access method synchronized, so that only one thread can
 * execute this method at a time. General implementation of this approach is
 * like the below class. This implementation works fine and provides
 * thread-safety but it reduces the performance because of cost associated with
 * the synchronized method, although we need it only for the first few threads
 * who might create the separate instances (Read: Java Synchronization). this is
 * called singled checked locking
 **/
public class SingleCheckLockingSingleton {

	private static SingleCheckLockingSingleton instance;

	private SingleCheckLockingSingleton() {
	}

	public static synchronized SingleCheckLockingSingleton getInstance() {
		if (instance == null) {
			instance = new SingleCheckLockingSingleton();
		}
		return instance;
	}
}
