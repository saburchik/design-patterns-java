package Singleton;
import java.io.Serializable;

public class Singleton implements Serializable {
	// The better way to create Singleton:
	enum MySingleton {
		INSTANCE;
		public void doJob() {
			
		}
	}
	
	private static final Singleton singleton = new Singleton();
	private Singleton() {}
	
	public static Singleton getInstance() {
		return singleton;
	}
	private Object readResolve() {
		return singleton;
	}
	public static void main(String[] args) {
		// singleton.someMethod();
		// someOtherMethod(singleton);
		Singleton.getInstance();
	}

}
