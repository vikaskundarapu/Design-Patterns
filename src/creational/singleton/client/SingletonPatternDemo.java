package creational.singleton.client;

import creational.singleton.product.BillPughSingleton;
import creational.singleton.product.DoubleCheckLockingSingleton;
import creational.singleton.product.EagerlyInitializedSingleton;
import creational.singleton.product.EnumSingleton;
import creational.singleton.product.LazyInitializedSingleton;
import creational.singleton.product.SimpleSingleton;
import creational.singleton.product.SingleCheckLockingSingleton;
import creational.singleton.product.StaticBlockSingleton;

/**
 * Singleton pattern is one of the simplest design patterns in Java. This type
 * of design pattern comes under creational pattern as this pattern provides one
 * of the best ways to create an object. This pattern involves a single class
 * which is responsible to create an object while making sure that only single
 * object gets created. This class provides a way to access its only object
 * which can be accessed directly without need to instantiate the object of the
 * class.
 */

public class SingletonPatternDemo {

	public static void main(String[] args) {

		/* Use these instances and all call their respective functions */
		BillPughSingleton billPughSingleton = BillPughSingleton.getInstance();
		DoubleCheckLockingSingleton doubleCheckLockingSingleton = DoubleCheckLockingSingleton.getInstance();
		EagerlyInitializedSingleton eagerlyInitializedSingleton = EagerlyInitializedSingleton.getInstance();
		EnumSingleton.INSTANCE.doSomething();
		LazyInitializedSingleton lazyInitializedSingleton = LazyInitializedSingleton.getInstance();
		SimpleSingleton simpleSingleton = SimpleSingleton.getInstance();
		StaticBlockSingleton staticBlockSingleton = StaticBlockSingleton.getInstance();
		SingleCheckLockingSingleton singleCheckLockingSingleton = SingleCheckLockingSingleton.getInstance();

	}

}
