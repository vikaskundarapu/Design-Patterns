package singleton;

public class SingletonClass {
 
	private static SingletonClass onlyObject = new SingletonClass();
	
	// make the constructor private so that this class cannot be instantiated
	private SingletonClass() {
		// TODO Auto-generated constructor stub
	}
	
	public static SingletonClass getinstance(){
			return onlyObject;
	}
	
	public void display(){
		System.out.println("Only one object of this class exists");
	}
	
}
