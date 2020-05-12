package creational.singleton.product;

/**
 * Eager initialization: If your singleton class is not using a lot of
 * resources, this is the approach to use. But in most of the scenarios,
 * Singleton classes are created for resources such as File System, Database
 * connections etc and we should avoid the instantiation until unless client
 * calls the getInstance method. Also this method doesn’t provide any options
 * for exception handling. The JVM takes care of the static variable
 * initialization and ensures that the process is thread safe and that the
 * instance is created before the threads tries to access it
 */
public class EagerlyInitializedSingleton {
	private static final EagerlyInitializedSingleton singleton = new EagerlyInitializedSingleton();

	public static EagerlyInitializedSingleton getInstance() {
		return singleton;
	}

	private EagerlyInitializedSingleton() {
	}
}
