package ch6;

class Car4 {
	String company = "kia";
	String model;
	String color;
	int maxSpeed;

	Car4() {

	}

	Car4(String model) {
		this(model, "silver", 250);
	}

	Car4(String model, String color) {
		this(model, color, 250);
	}

	Car4(String model, String color, int maxspeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxspeed;
	}
}

public class carExample4 {

	public static void main(String[] args) {

		Car4 car1 = new Car4();
		System.out.println("car1.company: " + car1.company);
		System.out.println("");

		Car4 car2 = new Car4("k3");
		System.out.println("car2.company: " + car2.company);
		System.out.println("car2.model: " + car2.model);
		System.out.println(car2.color);
		System.out.println("");

		Car4 car3 = new Car4("k3", "white");
		System.out.println("car3.company: " + car3.company);
		System.out.println("car3.model: " + car3.model);
		System.out.println("car3.color: " + car3.color);
		System.out.println(car3.maxSpeed);
		System.out.println("");

		Car4 car4 = new Car4("k3", "white", 200);
		System.out.println("car4.company: " + car4.company);
		System.out.println("car4.model: " + car4.model);
		System.out.println("car4.color: " + car4.color);
		System.out.println("car4.maxspeed: " + car4.maxSpeed);

	}

}
