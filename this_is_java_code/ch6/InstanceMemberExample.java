package ch6;

class ThisInstance {
	String model;
	int speed;

	ThisInstance(String model) {
		this.model = model;
	}

	void setSpeed(int speed) {
		this.speed = speed;
	}

	void run() {
		for (int i = 10; i <= 50; i += 10) {
			this.setSpeed(i);
			System.out.println(this.model + " is running. (speed: " + this.speed + "km/h");
		}
	}
}

public class InstanceMemberExample {

	public static void main(String[] args) {

		ThisInstance myCar = new ThisInstance("porsche");
		ThisInstance yourCar = new ThisInstance("benz");

		myCar.run();
		yourCar.run();

	}

}
