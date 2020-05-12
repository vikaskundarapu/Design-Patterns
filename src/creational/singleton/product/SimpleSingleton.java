package creational.singleton.product;

public class SimpleSingleton {

	private static final SimpleSingleton singleton = new SimpleSingleton();

	public static SimpleSingleton getInstance() {
		return singleton;
	}

	private SimpleSingleton() {
	}
}