package ch6;

class Singleton {
	private static Singleton singleton = new Singleton();

	private Singleton() {
	}

	static Singleton getInstance() {
		return singleton;
	}
}

public class SingletonExample {

	public static void main(String[] args) {

		/*
		 * Singleton obj1 = new Singleton(); compile error
		 * Singleton obj2 = new Singleton(); compile error
		 */

		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();

		if (obj1 == obj2) {
			System.out.println("They are same singleton object");
		} else {
			System.out.println("They are different singleton object");
		}

	}

}
