package creational.singleton.product;

/**
 * Static block initialization: Static block initialization implementation is
 * similar to eager initialization, except that instance of class is created in
 * the static block that provides option for exception handling. Both eager
 * initialization and static block initialization creates the instance even
 * before it’s being used and that is not the best practice to use.
 */

public class StaticBlockSingleton {
	private static final StaticBlockSingleton singleton;

	private StaticBlockSingleton() {
	}

	static {
		try {
			singleton = new StaticBlockSingleton();
		} catch (Exception e) {
			throw new RuntimeException("Exception occured in creating singleton instance");
		}
	}

	public static StaticBlockSingleton getInstance() {
		return singleton;
	}
}
