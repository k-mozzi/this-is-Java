package ch6;

class Car {
	String company = "현대자동차";
	String model = "그렌저";
	String color = "black";
	int maxSpeed = 250;
	int speed;	// 초기값
}

public class carExample {

	public static void main(String[] args) {

		Car myCar = new Car();

		System.out.println("제작회사: " + myCar.company);
		System.out.println("모델명:" + myCar.model);
		System.out.println("색깔:" + myCar.color);
		System.out.println("최고속도:" + myCar.maxSpeed);
		System.out.println("현재속도:" + myCar.speed);

		myCar.speed = 60;
		System.out.println("수정된 속도: " + myCar.speed);

	}

}
