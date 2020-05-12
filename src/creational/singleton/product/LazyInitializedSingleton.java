package creational.singleton.product;

/**
 * Lazy Initialization : Lazy initialization method to implement Singleton
 * pattern creates the instance in the global access method. Here is the sample
 * code for creating Singleton class with this approach. The above
 * implementation works fine incase of single threaded environment but when it
 * comes to multithreaded systems, it can cause issues if multiple threads are
 * inside the if loop at the same time. It will destroy the singleton pattern
 * and both threads will get the different instances of singleton class. In next
 * section, we will see different ways to create a thread-safe singleton class.
 */

public class LazyInitializedSingleton {
	private static LazyInitializedSingleton singleton;

	private LazyInitializedSingleton() {
	}

	public static LazyInitializedSingleton getInstance() {
		if (null == singleton) {
			singleton = new LazyInitializedSingleton();
		}
		return singleton;
	}
}
