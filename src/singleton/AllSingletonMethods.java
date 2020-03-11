package singleton;

public class AllSingletonMethods {

	private static AllSingletonMethods singleton = new AllSingletonMethods();

	public static AllSingletonMethods getInstance() {
		return singleton;
	}

	private AllSingletonMethods() {
	}

	public static void main(String[] args) {

	}
}

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
class EagerInitializedSingleton {
	private final static EagerInitializedSingleton singleton = new EagerInitializedSingleton();

	public static EagerInitializedSingleton getInstance() {
		return singleton;
	}

	private EagerInitializedSingleton() {
	}
}

/**
 * Static block initialization: Static block initialization implementation is
 * similar to eager initialization, except that instance of class is created in
 * the static block that provides option for exception handling. Both eager
 * initialization and static block initialization creates the instance even
 * before it’s being used and that is not the best practice to use.
 */

class StaticBlockSingleton {
	private final static StaticBlockSingleton singleton;

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

class LazyInitializedSingleton {
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

/**
 * Thread Safe Singleton: The easier way to create a thread-safe singleton class
 * is to make the global access method synchronized, so that only one thread can
 * execute this method at a time. General implementation of this approach is
 * like the below class. This implementation works fine and provides
 * thread-safety but it reduces the performance because of cost associated with
 * the synchronized method, although we need it only for the first few threads
 * who might create the separate instances (Read: Java Synchronization).
 **/
class ThreadSafeSingleton {

	private static ThreadSafeSingleton instance;

	private ThreadSafeSingleton() {
	}

	public static synchronized ThreadSafeSingleton getInstance() {
		if (instance == null) {
			instance = new ThreadSafeSingleton();
		}
		return instance;
	}
}

/**
 * Double checked locking:
 * Above implementation works fine and provides thread-safety but it reduces the performance
 * because of cost associated with the synchronized method, although we need it only for the
 * first few threads who might create the separate instances (Read: Java Synchronization). 
 * To avoid this extra overhead every time, double checked locking principle is used. In this
 * approach, the synchronized block is used inside the if condition with an additional check
 * to ensure that only one instance of singleton class is created.
 * */
class ThreadSafeSingleton1 {

	private static volatile  ThreadSafeSingleton1 instance;

	private ThreadSafeSingleton1() {
	}

	public static synchronized ThreadSafeSingleton1 getInstance() {
		if(instance == null){
	        synchronized (ThreadSafeSingleton.class) {
	            if(instance == null){
	                instance = new ThreadSafeSingleton1();
	            }
	        }
	    }
	    return instance;
	}
}


/**
 * Bill Pugh Singleton Implementation:
 * Prior to Java 5, java memory model had a lot of issues and above approaches used to
 * fail in certain scenarios where too many threads try to get the instance of the Singleton
 * class simultaneously. So Bill Pugh came up with a different approach to create the Singleton
 * class using a inner static helper class. Notice the private inner static class that contains
 * the instance of the singleton class. When the singleton class is loaded, SingletonHelper 
 * class is not loaded into memory and only when someone calls the getInstance method,
 * this class gets loaded and creates the Singleton class instance.
 * This is the most widely used approach for Singleton class as it doesn’t require synchronization. 
 * */
class BillPughSingleton {

    private BillPughSingleton(){}
    
    private static class SingletonHelper{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }
    
    public static BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }
}

/**
 * Enum Singleton:
 * to overcome this situation with Reflection, Joshua Bloch suggests the use of Enum to implement
 * Singleton design pattern as Java ensures that any enum value is instantiated only once in a
 * Java program. Since Java Enum values are globally accessible, so is the singleton. The 
 * drawback is that the enum type is somewhat inflexible; for example, it does not allow lazy initialization.
 * */
enum EnumSingleton {

    INSTANCE;
    
    public static void doSomething(){
        //do something
    }
}

