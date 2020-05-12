package creational.singleton.product;

/**
 * Double checked locking: Above implementation works fine and provides
 * thread-safety but it reduces the performance because of cost associated with
 * the synchronized method, although we need it only for the first few threads
 * who might create the separate instances (Read: Java Synchronization). To
 * avoid this extra overhead every time, double checked locking principle is
 * used. In this approach, the synchronized block is used inside the if
 * condition with an additional check to ensure that only one instance of
 * singleton class is created.
 */
public class DoubleCheckLockingSingleton {

	private static volatile DoubleCheckLockingSingleton instance;

	private DoubleCheckLockingSingleton() {
	}

	public static synchronized DoubleCheckLockingSingleton getInstance() {
		if (instance == null) {
			synchronized (DoubleCheckLockingSingleton.class) {
				if (instance == null) {
					instance = new DoubleCheckLockingSingleton();
				}
			}
		}
		return instance;
	}
}
